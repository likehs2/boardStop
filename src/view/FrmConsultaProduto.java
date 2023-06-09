/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import model.ModeloTabela;
import util.ConectaBanco;

/**
 *
 * @author Lucas Moraes Camacho
 */
public class FrmConsultaProduto extends javax.swing.JDialog {
    
    ConectaBanco conn = new ConectaBanco();
    
    private String idProduto, nomeProduto;
    protected String idMarca;
    protected String idCategoria;
    protected String idSubCategoria;
    protected String saldoProduto;
    protected String custoProduto;
    protected String margemProduto;
    protected String vendaVendaProduto;
    protected String saldoRealProduto;
    

    /**
     * Creates new form FrmConsultaProduto
     */
    public FrmConsultaProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocation(200,150);
        
    }

    FrmConsultaProduto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProduto = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jComboBoxTipoFiltro = new javax.swing.JComboBox<>();
        jTextFieldCampoFiltro = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCodigoClicado = new javax.swing.JTextField();
        jTextFieldProdutoClicada = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CONSULTA DE CATEGORIA");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProduto);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jComboBoxTipoFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tudo", "Nome", "Contem", "Código" }));
        jComboBoxTipoFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoFiltroActionPerformed(evt);
            }
        });

        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/magnify.png"))); // NOI18N
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jButtonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/check.png"))); // NOI18N
        jButtonAdd.setEnabled(false);
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCampoFiltro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldCampoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Código");

        jTextFieldCodigoClicado.setEnabled(false);

        jTextFieldProdutoClicada.setEnabled(false);

        jLabel2.setText("Produto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCodigoClicado, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldProdutoClicada, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCodigoClicado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldProdutoClicada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        jTextFieldCodigoClicado.setText("");
        jTextFieldProdutoClicada.setText("");
        
        if(jComboBoxTipoFiltro.getSelectedItem().equals("Nome")){
            if(jTextFieldCampoFiltro.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Informe uma produto");
            }else{
                preencherTabelaProduto("select *from tblproduto where descricaoProduto = '"+jTextFieldCampoFiltro.getText()+"'");   
            }           
        }else if(jComboBoxTipoFiltro.getSelectedItem().equals("Contem")){
            if(jTextFieldCampoFiltro.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Informe uma produto");
            }else{
                preencherTabelaProduto("select *from tblproduto where descricaoProduto like '%"+jTextFieldCampoFiltro.getText()+"%'"); 
            }             
        }else if (jComboBoxTipoFiltro.getSelectedItem().equals("Código")){
            if(jTextFieldCampoFiltro.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Informe o código de uma produto");
            }else{
                preencherTabelaProduto("select *from tblproduto where idProduto = '"+jTextFieldCampoFiltro.getText()+"'"); 
            }            
        }else if(jComboBoxTipoFiltro.getSelectedItem().equals("Tudo")){
           preencherTabelaProduto("select * from tblproduto"); 
        }
        
        jButtonAdd.setEnabled(!true);
        
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jTableProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutoMouseClicked
        int linha_selecionada = jTableProduto.getSelectedRow();
        setIdProduto(jTableProduto.getValueAt(linha_selecionada, 0).toString());
        setNomeProduto(jTableProduto.getValueAt(linha_selecionada, 1).toString());
        setIdMarca(jTableProduto.getValueAt(linha_selecionada, 2).toString());
        setIdCategoria(jTableProduto.getValueAt(linha_selecionada, 3).toString());
        setIdSubCategoria(jTableProduto.getValueAt(linha_selecionada, 4).toString());
        setCustoProduto(jTableProduto.getValueAt(linha_selecionada, 5).toString());
        setMargemProduto(jTableProduto.getValueAt(linha_selecionada, 6).toString());
        setVendaVendaProduto(jTableProduto.getValueAt(linha_selecionada, 7).toString());
        setSaldoProduto(jTableProduto.getValueAt(linha_selecionada, 8).toString());
        setSaldoRealProduto(jTableProduto.getValueAt(linha_selecionada, 9).toString());
        
                
        String UnidadeID = "" + jTableProduto.getValueAt(jTableProduto.getSelectedRow(), 0);
        jTextFieldCodigoClicado.setText(UnidadeID);
        
        String SiglaUnidade = "" + jTableProduto.getValueAt(jTableProduto.getSelectedRow(), 1);
        jTextFieldProdutoClicada.setText(SiglaUnidade);
        
        jButtonAdd.setEnabled(true);
    }//GEN-LAST:event_jTableProdutoMouseClicked

    private void jComboBoxTipoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoFiltroActionPerformed

    public void preencherTabelaProduto(String sql){
        ArrayList dados = new ArrayList();
        
        String[] Colunas = new String[]{"ID","Produto", "Marca","Categoria","SubCategoria","custoPraticadoProduto","margemProduto","vendaVendaProduto","saldoMinimoProduto","saldoProduto"};
        conn.conexao();
        conn.executaSQL(sql);
        try{
            conn.rs.first();
            do{
                dados.add(new Object[]{ conn.rs.getString("idProduto") ,  conn.rs.getString("descricaoProduto"), conn.rs.getString("marcaProduto"), conn.rs.getString("categoriaProduto"), conn.rs.getString("subCategoriaProduto"), conn.rs.getString("custoPraticadoProduto"), conn.rs.getString("margemProduto"), conn.rs.getString("vendaVendaProduto"), conn.rs.getString("saldoMinimoProduto"), conn.rs.getString("saldoProduto")});
                
            }while (conn.rs.next());
        }catch (SQLException ex){
            //JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList!\nERRO:" + ex);
         //catch(NumberFormatException erro){
                JOptionPane.showMessageDialog(null, "Produto não encontrada");
        }
        
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTableProduto.setModel(modelo);
        jTableProduto.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTableProduto.getColumnModel().getColumn(0).setResizable(false);
        jTableProduto.getColumnModel().getColumn(1).setPreferredWidth(300);
        jTableProduto.getColumnModel().getColumn(1).setResizable(false);
        jTableProduto.getTableHeader().setReorderingAllowed(false);
        jTableProduto.setAutoResizeMode(jTableProduto.AUTO_RESIZE_OFF);
        jTableProduto.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmConsultaProduto dialog = new FrmConsultaProduto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JComboBox<String> jComboBoxTipoFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProduto;
    private javax.swing.JTextField jTextFieldCampoFiltro;
    private javax.swing.JTextField jTextFieldCodigoClicado;
    private javax.swing.JTextField jTextFieldProdutoClicada;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the idProduto
     */
    public String getIdProduto() {
        return idProduto;
    }

    /**
     * @param idProduto the idProduto to set
     */
    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    /**
     * @return the nomeProduto
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * @param nomeProduto the nomeProduto to set
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    /**
     * @return the idMarca
     */
    public String getIdMarca() {
        return idMarca;
    }

    /**
     * @param idMarca the idMarca to set
     */
    public void setIdMarca(String idMarca) {
        this.idMarca = idMarca;
    }

    /**
     * @return the idCategoria
     */
    public String getIdCategoria() {
        return idCategoria;
    }

    /**
     * @param idCategoria the idCategoria to set
     */
    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    /**
     * @return the idSubCategoria
     */
    public String getIdSubCategoria() {
        return idSubCategoria;
    }

    /**
     * @param idSubCategoria the idSubCategoria to set
     */
    public void setIdSubCategoria(String idSubCategoria) {
        this.idSubCategoria = idSubCategoria;
    }

    /**
     * @return the saldoProduto
     */
    public String getSaldoProduto() {
        return saldoProduto;
    }

    /**
     * @param saldoProduto the saldoProduto to set
     */
    public void setSaldoProduto(String saldoProduto) {
        this.saldoProduto = saldoProduto;
    }

    /**
     * @return the custoProduto
     */
    public String getCustoProduto() {
        return custoProduto;
    }

    /**
     * @param custoProduto the custoProduto to set
     */
    public void setCustoProduto(String custoProduto) {
        this.custoProduto = custoProduto;
    }

    /**
     * @return the margemProduto
     */
    public String getMargemProduto() {
        return margemProduto;
    }

    /**
     * @param margemProduto the margemProduto to set
     */
    public void setMargemProduto(String margemProduto) {
        this.margemProduto = margemProduto;
    }

    /**
     * @return the vendaVendaProduto
     */
    public String getVendaVendaProduto() {
        return vendaVendaProduto;
    }

    /**
     * @param vendaVendaProduto the vendaVendaProduto to set
     */
    public void setVendaVendaProduto(String vendaVendaProduto) {
        this.vendaVendaProduto = vendaVendaProduto;
    }

    /**
     * @return the saldoRealProduto
     */
    public String getSaldoRealProduto() {
        return saldoRealProduto;
    }

    /**
     * @param saldoRealProduto the saldoRealProduto to set
     */
    public void setSaldoRealProduto(String saldoRealProduto) {
        this.saldoRealProduto = saldoRealProduto;
    }
}
