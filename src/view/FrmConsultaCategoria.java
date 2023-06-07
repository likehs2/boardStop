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
public class FrmConsultaCategoria extends javax.swing.JDialog {
    
    ConectaBanco conn = new ConectaBanco();
    
    private String idCategoria, nomeCategoria;

    /**
     * Creates new form FrmConsultaCategoria
     */
    public FrmConsultaCategoria(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocation(200,150);
        
    }

    FrmConsultaCategoria() {
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
        jTableCategoria = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jComboBoxTipoFiltro = new javax.swing.JComboBox<>();
        jTextFieldCampoFiltro = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCodigoClicado = new javax.swing.JTextField();
        jTextFieldCategoriaClicada = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CONSULTA DE CATEGORIA");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCategoriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCategoria);

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

        jTextFieldCategoriaClicada.setEnabled(false);

        jLabel2.setText("Categoria");

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
                            .addComponent(jTextFieldCategoriaClicada, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jTextFieldCategoriaClicada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        jTextFieldCodigoClicado.setText("");
        jTextFieldCategoriaClicada.setText("");
        
        if(jComboBoxTipoFiltro.getSelectedItem().equals("Nome")){
            if(jTextFieldCampoFiltro.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Informe uma categoria");
            }else{
                preencherTabelaCategoria("select *from tblcategoria where nomeCategoria = '"+jTextFieldCampoFiltro.getText()+"'");   
            }           
        }else if(jComboBoxTipoFiltro.getSelectedItem().equals("Contem")){
            if(jTextFieldCampoFiltro.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Informe uma categoria");
            }else{
                preencherTabelaCategoria("select *from tblcategoria where nomeCategoria like '%"+jTextFieldCampoFiltro.getText()+"'"); 
            }             
        }else if (jComboBoxTipoFiltro.getSelectedItem().equals("Código")){
            if(jTextFieldCampoFiltro.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Informe o código de uma categoria");
            }else{
                preencherTabelaCategoria("select *from tblcategoria where idCategoria = '"+jTextFieldCampoFiltro.getText()+"'"); 
            }            
        }else if(jComboBoxTipoFiltro.getSelectedItem().equals("Tudo")){
           preencherTabelaCategoria("select *from tblcategoria"); 
        }
        
        jButtonAdd.setEnabled(!true);
        
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jTableCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCategoriaMouseClicked
        int linha_selecionada = jTableCategoria.getSelectedRow();
        setIdCategoria(jTableCategoria.getValueAt(linha_selecionada, 0).toString());
        setNomeCategoria(jTableCategoria.getValueAt(linha_selecionada, 1).toString());
                
        String UnidadeID = "" + jTableCategoria.getValueAt(jTableCategoria.getSelectedRow(), 0);
        jTextFieldCodigoClicado.setText(UnidadeID);
        
        String SiglaUnidade = "" + jTableCategoria.getValueAt(jTableCategoria.getSelectedRow(), 1);
        jTextFieldCategoriaClicada.setText(SiglaUnidade);
        
        jButtonAdd.setEnabled(true);
    }//GEN-LAST:event_jTableCategoriaMouseClicked

    public void preencherTabelaCategoria(String sql){
        ArrayList dados = new ArrayList();
        
        String[] Colunas = new String[]{"ID","Categoria"};
        conn.conexao();
        conn.executaSQL(sql);
        try{
            conn.rs.first();
            do{
                dados.add(new Object[]{ conn.rs.getString("idCategoria") ,  conn.rs.getString("nomeCategoria")});
                
            }while (conn.rs.next());
        }catch (SQLException ex){
            //JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList!\nERRO:" + ex);
         //catch(NumberFormatException erro){
                JOptionPane.showMessageDialog(null, "Categoria não encontrada");
        }
        
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTableCategoria.setModel(modelo);
        jTableCategoria.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTableCategoria.getColumnModel().getColumn(0).setResizable(false);
        jTableCategoria.getColumnModel().getColumn(1).setPreferredWidth(300);
        jTableCategoria.getColumnModel().getColumn(1).setResizable(false);
        jTableCategoria.getTableHeader().setReorderingAllowed(false);
        jTableCategoria.setAutoResizeMode(jTableCategoria.AUTO_RESIZE_OFF);
        jTableCategoria.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
            java.util.logging.Logger.getLogger(FrmConsultaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConsultaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConsultaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConsultaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmConsultaCategoria dialog = new FrmConsultaCategoria(new javax.swing.JFrame(), true);
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
    private javax.swing.JTable jTableCategoria;
    private javax.swing.JTextField jTextFieldCampoFiltro;
    private javax.swing.JTextField jTextFieldCategoriaClicada;
    private javax.swing.JTextField jTextFieldCodigoClicado;
    // End of variables declaration//GEN-END:variables

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
}
