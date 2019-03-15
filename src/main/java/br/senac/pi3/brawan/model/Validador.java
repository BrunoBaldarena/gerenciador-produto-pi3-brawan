/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.pi3.brawan.model;

import javax.swing.JOptionPane;

/**
 *
 * @author Bruno Baldarena
 */
public class Validador {

    public static boolean Validar(Produto produto) {
        if (produto.getDesc().isEmpty() || produto.getDesc() == null) {
            JOptionPane.showMessageDialog(null, "Inserir descrição do produto!");
            return false;
        }
        if (produto.getNome().isEmpty() || produto.getNome() == null) {
            JOptionPane.showMessageDialog(null, "Inserir nome do produto!");
            return false;
        }
        if (produto.getQtd() <= 0) {
            JOptionPane.showMessageDialog(null, "A quantidade inserida deve ser maior que zero! ");
            return false;
        }
        if (produto.getValorCompra() <= 0) {
            JOptionPane.showMessageDialog(null, "O valor de compra deve ser maior que zero! ");
            return false;
        }
        if (produto.getValorVenda() <= 0) {
            JOptionPane.showMessageDialog(null, "O valor de venda deve ser maior que zero! ");
            return false;
        }

        return true;
    }
}
