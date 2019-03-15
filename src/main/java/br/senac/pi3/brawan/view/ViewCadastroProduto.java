/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.pi3.brawan.view;



import br.senac.pi3.brawan.DAO.ProdutoDAO;
import br.senac.pi3.brawan.data.Conexao;
import br.senac.pi3.brawan.model.Produto;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author bruno.sbaldarena
 */
public class ViewCadastroProduto extends javax.swing.JFrame {

    /**
     * Creates new form ViewCadastroProduto
     */
    
    public ViewCadastroProduto() {
 
        initComponents();
        Conexao.getConnection();
        DefaultTableModel modelo = (DefaultTableModel) jTProduto.getModel();
        jTProduto.setRowSorter(new TableRowSorter(modelo));
        readJTable();
        
  
        
        
        
        ProdutoDAO produto = new ProdutoDAO();
        
        for(Produto p: produto.readCategoria()){
            
            categoriaText.addItem(p);
        }
        
        
    }
    
    
    
    public void readJTable(){
        DefaultTableModel modelo = (DefaultTableModel) jTProduto.getModel();
        ProdutoDAO produto = new ProdutoDAO();
        modelo.setNumRows(0);
        for(Produto p: produto.read()){
            
            modelo.addRow(new Object[]{
                
                p.getId(),
                p.getNome(),
                p.getDesc(),
                p.getValorCompra(),
                p.getValorVenda(),
                p.getQtd(),
                p.getData()
                    
        });
            
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        disponivelGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nomeText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        categoriaText = new javax.swing.JComboBox<>();
        dataText = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        compraText = new javax.swing.JTextField();
        vendaText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        quantidadeText = new javax.swing.JTextField();
        bntSalvar = new javax.swing.JButton();
        bntCancela = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        descricaoText = new javax.swing.JTextField();
        bntNovo = new javax.swing.JButton();
        idText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        comboStatus = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProduto = new javax.swing.JTable();
        bntEditar = new javax.swing.JButton();
        dntExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(211, 211, 211));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 10))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Descrição:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Data:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Preço de compra:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Preço de Venda:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Quantidade:");

        quantidadeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantidadeTextActionPerformed(evt);
            }
        });

        bntSalvar.setBackground(new java.awt.Color(255, 255, 255));
        bntSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bntSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salvar.png"))); // NOI18N
        bntSalvar.setToolTipText("Salvar produto");
        bntSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSalvarActionPerformed(evt);
            }
        });

        bntCancela.setBackground(new java.awt.Color(255, 255, 255));
        bntCancela.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bntCancela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancelar.png"))); // NOI18N
        bntCancela.setText("Cancelar");
        bntCancela.setToolTipText("Cancelar");
        bntCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCancelaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Categoria:");

        bntNovo.setBackground(new java.awt.Color(255, 255, 255));
        bntNovo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bntNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/novo.png"))); // NOI18N
        bntNovo.setText("Novo");
        bntNovo.setToolTipText("Cadastrar novo produto");
        bntNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNovoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Status:");

        comboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desabilitado", "Habilitado" }));

        jTProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "DESCRIÇÃO", "PREÇO COMPRA", "PREÇO VENDA", "QUANTIDADE", "DATA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTProdutoMouseClicked(evt);
            }
        });
        jTProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTProdutoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTProduto);

        bntEditar.setBackground(new java.awt.Color(255, 255, 255));
        bntEditar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bntEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alterar.png"))); // NOI18N
        bntEditar.setText("Editar");
        bntEditar.setToolTipText("Editar Produto");
        bntEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEditarActionPerformed(evt);
            }
        });

        dntExcluir.setBackground(new java.awt.Color(255, 255, 255));
        dntExcluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dntExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deletar.png"))); // NOI18N
        dntExcluir.setText("Excluir");
        dntExcluir.setToolTipText("Excluir produto");
        dntExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dntExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel9)))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(vendaText, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(compraText, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(categoriaText, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(descricaoText, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(quantidadeText, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataText, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bntNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntCancela)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dntExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntEditar)
                        .addGap(199, 199, 199)
                        .addComponent(bntSalvar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(dataText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(categoriaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(quantidadeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(descricaoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(vendaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(compraText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntNovo)
                    .addComponent(bntCancela)
                    .addComponent(dntExcluir)
                    .addComponent(bntEditar)
                    .addComponent(bntSalvar)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bntCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelaActionPerformed
        
        idText.setText("");
        nomeText.setText("");
        descricaoText.setText("");
        quantidadeText.setText("");
        compraText.setText("");
        vendaText.setText("");
        categoriaText.setEditable(false);
        comboStatus.setEditable(false);
        idText.setEditable(false);
        nomeText.setEditable(false);
        quantidadeText.setEditable(false);
        descricaoText.setEditable(false);
        compraText.setEditable(false);
        vendaText.setEditable(false);
        categoriaText.setEditable(false);
        comboStatus.setEditable(false);
        dataText.setEditable(false);
    }//GEN-LAST:event_bntCancelaActionPerformed

    private void bntNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNovoActionPerformed
    
        nomeText.setEditable(true);
        quantidadeText.setEditable(true);
        descricaoText.setEditable(true);
        compraText.setEditable(true);
        vendaText.setEditable(true);
        categoriaText.setEditable(true);
        comboStatus.setEditable(true);
      
        
    }//GEN-LAST:event_bntNovoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        ;
        Date dataSistema = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY"); 
        dataText.setText(formato.format(dataSistema));
        dataText.setEditable(false);
        idText.setEditable(false);
        nomeText.setEditable(false);
        quantidadeText.setEditable(false);
        descricaoText.setEditable(false);
        compraText.setEditable(false);
        vendaText.setEditable(false);
        categoriaText.setEditable(false);
        comboStatus.setEditable(false);
        
    }//GEN-LAST:event_formWindowOpened

    private void bntSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalvarActionPerformed

        //Chamando a classe com os GET e SET dos produtos
        Produto produto = new Produto();
        produto.setNome(nomeText.getText()); //Setando os valores dos campos nas variaveis
        produto.setDesc(descricaoText.getText());
        produto.setQtd(Integer.parseInt(quantidadeText.getText()));
        produto.setValorCompra(Float.parseFloat(compraText.getText()));
        produto.setValorVenda(Float.parseFloat(vendaText.getText()));
        
        
        ProdutoDAO.cadastrar(produto);
        readJTable();
        
        idText.setText("");
        nomeText.setText("");
        descricaoText.setText("");
        quantidadeText.setText("");
        compraText.setText("");
        vendaText.setText("");
            
        categoriaText.setEditable(false);
        comboStatus.setEditable(false);
        idText.setEditable(false);
        nomeText.setEditable(false);
        quantidadeText.setEditable(false);
        descricaoText.setEditable(false);
        compraText.setEditable(false);
        vendaText.setEditable(false);
        categoriaText.setEditable(false);
        comboStatus.setEditable(false);
        dataText.setEditable(false);
        
    }//GEN-LAST:event_bntSalvarActionPerformed

    private void quantidadeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantidadeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantidadeTextActionPerformed

    private void jTProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTProdutoKeyReleased
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_jTProdutoKeyReleased

    private void bntEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEditarActionPerformed
        // TODO add your handling code here:
        if(jTProduto.getSelectedRow() != -1){
            
        Produto produto = new Produto();
        produto.setNome(nomeText.getText()); //Setando os valores dos campos nas variaveis
        produto.setDesc(descricaoText.getText());
        produto.setQtd(Integer.parseInt(quantidadeText.getText()));
        produto.setValorCompra(Float.parseFloat(compraText.getText()));
        produto.setValorVenda(Float.parseFloat(vendaText.getText()));
        produto.setId((int) jTProduto.getValueAt(jTProduto.getSelectedRow(), 0));
        
        
        ProdutoDAO.update(produto);
        
        idText.setText("");
        nomeText.setText("");
        descricaoText.setText("");
        quantidadeText.setText("");
        compraText.setText("");
        vendaText.setText("");
        
        categoriaText.setEditable(false);
        comboStatus.setEditable(false);
        idText.setEditable(false);
        nomeText.setEditable(false);
        quantidadeText.setEditable(false);
        descricaoText.setEditable(false);
        compraText.setEditable(false);
        vendaText.setEditable(false);
        categoriaText.setEditable(false);
        comboStatus.setEditable(false);
        dataText.setEditable(false);
        
        readJTable();
            
        
        }
    }//GEN-LAST:event_bntEditarActionPerformed

    private void dntExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dntExcluirActionPerformed

        
        
        
        if(jTProduto.getSelectedRow() != -1){
       
        Produto produto = new Produto();
        
        produto.setId((int) jTProduto.getValueAt(jTProduto.getSelectedRow(), 0));
        
        ProdutoDAO.delete(produto);
        
        idText.setText("");
        nomeText.setText("");
        descricaoText.setText("");
        quantidadeText.setText("");
        compraText.setText("");
        vendaText.setText("");
        
        categoriaText.setEditable(false);
        comboStatus.setEditable(false);
        idText.setEditable(false);
        nomeText.setEditable(false);
        quantidadeText.setEditable(false);
        descricaoText.setEditable(false);
        compraText.setEditable(false);
        vendaText.setEditable(false);
        categoriaText.setEditable(false);
        comboStatus.setEditable(false);
        dataText.setEditable(false);
            
        readJTable();
        
        }
    }//GEN-LAST:event_dntExcluirActionPerformed

    private void jTProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTProdutoMouseClicked
        // TODO add your handling code here:
        
        if(jTProduto.getSelectedRow() != -1){
            
        idText.setEditable(false);
        nomeText.setEditable(true);
        quantidadeText.setEditable(true);
        descricaoText.setEditable(true);
        compraText.setEditable(true);
        vendaText.setEditable(true);
        categoriaText.setEditable(true);
        comboStatus.setEditable(true);
            
            idText.setText(jTProduto.getValueAt(jTProduto.getSelectedRow(), 0).toString());
            nomeText.setText(jTProduto.getValueAt(jTProduto.getSelectedRow(), 1).toString());
            descricaoText.setText(jTProduto.getValueAt(jTProduto.getSelectedRow(), 2).toString());
            compraText.setText(jTProduto.getValueAt(jTProduto.getSelectedRow(), 3).toString());
            vendaText.setText(jTProduto.getValueAt(jTProduto.getSelectedRow(), 4).toString());
            quantidadeText.setText(jTProduto.getValueAt(jTProduto.getSelectedRow(), 5).toString());
            
            
            
        }
        
    }//GEN-LAST:event_jTProdutoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCadastroProduto().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCancela;
    private javax.swing.JButton bntEditar;
    private javax.swing.JButton bntNovo;
    private javax.swing.JButton bntSalvar;
    private javax.swing.JComboBox<Object> categoriaText;
    private javax.swing.JComboBox<String> comboStatus;
    private javax.swing.JTextField compraText;
    private javax.swing.JFormattedTextField dataText;
    private javax.swing.JTextField descricaoText;
    private javax.swing.ButtonGroup disponivelGroup;
    private javax.swing.JButton dntExcluir;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTProduto;
    private javax.swing.JTextField nomeText;
    private javax.swing.JTextField quantidadeText;
    private javax.swing.JTextField vendaText;
    // End of variables declaration//GEN-END:variables
}
