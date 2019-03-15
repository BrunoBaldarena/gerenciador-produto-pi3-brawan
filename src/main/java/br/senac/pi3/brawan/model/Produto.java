/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.pi3.brawan.model;

import java.sql.Timestamp;

/**
 *
 * @author Bruno Baldarena
 */
public class Produto {
    
    
    private String nome; 
    private String desc;
    private int qtd;
    private int id;
    private float valorCompra;
    private float valorVenda;
    private int idCategoria;
    private String nomeCategoria;
    private Timestamp data;
    
    
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return the qtd
     */
    public int getQtd() {
        return qtd;
    }

    /**
     * @param qtd the qtd to set
     */
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the valorCompra
     */
    public float getValorCompra() {
        return valorCompra;
    }

    /**
     * @param valorCompra the valorCompra to set
     */
    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    /**
     * @return the valorVenda
     */
    public float getValorVenda() {
        return valorVenda;
    }

    /**
     * @param valorVenda the valorVenda to set
     */
    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

   
    /**
     * @return the idCategoria
     */
    public int getIdCategoria() {
        return idCategoria;
    }

    /**
     * @param idCategoria the idCategoria to set
     */
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    /**
     * @return the nomeCategoria
     */
    public String getNomeCategoria() {
        return nomeCategoria;
    }

    /**
     * @param nomeCategoria the nomeCategoria to set
     */
    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    @Override
    public String toString() {
        return getNomeCategoria(); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @param data the data to set
     */
    public void setData(Timestamp data) {
        this.data = data;
    }

    /**
     * @return the data
     */
    public Timestamp getData() {
        return data;
    }

    


    
}
