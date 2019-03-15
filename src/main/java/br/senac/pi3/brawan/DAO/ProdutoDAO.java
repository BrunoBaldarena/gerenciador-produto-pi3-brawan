/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.pi3.brawan.DAO;

import br.senac.pi3.brawan.data.Conexao;
import br.senac.pi3.brawan.model.Produto;
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
    public static void cadastrar(Produto produto){ 
        Connection connection = Conexao.getConnection();
        String sql = "INSERT INTO produto(nome, descricao,quantidade,preco_compra,preco_venda) VALUES(?,?,?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
                    
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getDesc());
            stmt.setInt(3, produto.getQtd());
            //stmt.setInt(4, produto.getId());
            stmt.setFloat(4, produto.getValorCompra());
            stmt.setFloat(5, produto.getValorVenda());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
            stmt.close();
        } 
        catch (SQLException u) { 
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR!! "+ u);
        } 
        
    } 
    
    //Método para preencher a jTable
    public List<Produto> read(){
        
        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM produto");
            rs = stmt.executeQuery();
            
            while (rs.next()) {                
                Produto produto = new Produto();
                produto.setId(rs.getInt("ID"));
                produto.setNome(rs.getString("NOME"));
                produto.setDesc(rs.getString("DESCRICAO"));
                produto.setValorCompra(rs.getFloat("PRECO_COMPRA"));
                produto.setValorVenda(rs.getFloat("PRECO_VENDA"));
                produto.setQtd(rs.getInt("QUANTIDADE"));
                produtos.add(produto);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO" +ex);
        }
           
        
        return produtos;
    }
    
    public static void update(Produto produto){ 
        Connection connection = Conexao.getConnection();
        PreparedStatement stmt = null;
        String sql = "UPDATE produto SET nome = ? ,descricao = ? ,quantidade = ? ,preco_compra = ? ,preco_venda= ? WHERE ID = ?";
        
        
        try { 
           
                    
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getDesc());
            stmt.setInt(3, produto.getQtd());
            stmt.setFloat(4, produto.getValorCompra());
            stmt.setFloat(5, produto.getValorVenda());
            stmt.setInt(6, produto.getId());
            stmt.execute();
            
            JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso!");
            stmt.close();
        } 
        catch (SQLException u) { 
            JOptionPane.showMessageDialog(null, "ERRO AO ATUALIZAR!! "+ u);
        } 
        
    } 
    
}


