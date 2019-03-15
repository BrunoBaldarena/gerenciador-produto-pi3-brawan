/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.pi3.brawan.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
Abrir conexão com banco de dados MySQL

 */
public class Conexao {
    
    public Statement stm;// Responsavel por preparar e realizar pesquisas no banco de dados
    public ResultSet rs;// Responsavel por armazenar o resultado de uma pesquisa para o Statement
    private static final String URL_MYSQL = "jdbc:mysql://localhost/produtobd";// Responsavel por identificar o servico do banco de dados
    private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";	
    private static final String USER = "root";
    private static final String PASS = "";
    public Connection conn;// Responsavel por realizar a conexao com o banco de dados
    
    /*
    //Metodo realizado para realizar a conexao com o banco de dados
    public void conexao(){
        try {
            System.setProperty("jdbc.drivers", DRIVER_CLASS);
            conn = DriverManager.getConnection(URL_MYSQL, USER, PASS);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexao! \n Erro: "+ ex.getMessage());
        }
    }
    
    
    public void desconecta(){
        try {
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Desconectado com Sucesso! ");
        }
    }
*/
	public static Connection getConnection() {
		System.out.println("Conectando ao Banco de Dados");
		try {
			Class.forName(DRIVER_CLASS);
			return DriverManager.getConnection(URL_MYSQL, USER, PASS);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return null;
	}

}