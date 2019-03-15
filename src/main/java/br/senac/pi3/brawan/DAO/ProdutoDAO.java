/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.pi3.brawan.DAO;

import br.senac.pi3.brawan.data.Conexao;
import br.senac.pi3.brawan.model.Produto;
import br.senac.pi3.brawan.model.Validador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*Métodos de CRUD do banco de dados*/
public class ProdutoDAO {

    //Método para cadastrar
    public static void cadastrar(Produto produto) throws Exception {
        Connection connection = Conexao.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement("INSERT INTO produto(nome, descricao,quantidade,preco_compra,preco_venda) VALUES(?,?,?,?,?)");

            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getDesc());
            stmt.setInt(3, produto.getQtd());
            stmt.setFloat(4, produto.getValorCompra());
            stmt.setFloat(5, produto.getValorVenda());

            if (Validador.Validar(produto) == true) {

                stmt.execute();
                JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
                stmt.close();

            }

        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!! " + u);
        } finally {
            Conexao.closeConnection(connection, stmt);
        }

    }

    //Método para preencher a jTable
    public List<Produto> read() {

        Connection connection = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            stmt = connection.prepareStatement("SELECT * FROM produto");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto produto = new Produto();
                produto.setId(rs.getInt("ID"));
                produto.setNome(rs.getString("NOME"));
                produto.setDesc(rs.getString("DESCRICAO"));
                produto.setValorCompra(rs.getFloat("PRECO_COMPRA"));
                produto.setValorVenda(rs.getFloat("PRECO_VENDA"));
                produto.setQtd(rs.getInt("QUANTIDADE"));
                produto.setData(rs.getTimestamp("DT_CADASTRO"));
                produtos.add(produto);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO" + ex);
        } finally {
            Conexao.closeConnection(connection, stmt);

            return produtos;
        }
    }

    //Método para atualizar os dados da lista
    public static void update(Produto produto) {
        Connection connection = Conexao.getConnection();
        PreparedStatement stmt = null;

        try {

            stmt = connection.prepareStatement("UPDATE produto SET nome = ? ,descricao = ? ,quantidade = ? ,preco_compra = ? ,preco_venda= ? WHERE ID = ?");

            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getDesc());
            stmt.setInt(3, produto.getQtd());
            stmt.setFloat(4, produto.getValorCompra());
            stmt.setFloat(5, produto.getValorVenda());
            stmt.setInt(6, produto.getId());

            if (Validador.Validar(produto) == true) {
                stmt.execute();

                JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso!");

            }
            
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar o produto!! " + u);
        } finally {
            Conexao.closeConnection(connection, stmt);
        }
    }

    //Método para excluir da lista
    public static void delete(Produto produto) {
        Connection connection = Conexao.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement("DELETE FROM PRODUTO WHERE ID =?");

            stmt.setInt(1, produto.getId());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Produto excluido com sucesso!");
            stmt.close();
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir o produto!! " + u);
        } finally {
            Conexao.closeConnection(connection, stmt);
        }

    }

    public List<Produto> readCategoria() {

        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM categoria ORDER BY id ASC");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Produto produto = new Produto();

                produto.setIdCategoria(rs.getInt("id"));
                produto.setNomeCategoria(rs.getString("nome"));

                produtos.add(produto);

            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(con, stmt, rs);
        }

        return produtos;

    }

}
