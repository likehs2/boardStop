/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControleCategoria;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ModeloCategoria;
import util.AtualizaSistema;
import util.CriarTabelas;

/**
 *
 * @author Lucas Moraes Camacho
 */
public class FrmCategoria extends javax.swing.JInternalFrame {
    
    ModeloCategoria modCategoria = new ModeloCategoria();
    ControleCategoria controlCategoria = new ControleCategoria();
    
    private int flag;

    /**
     * Creates new form FrmCategoria
     */
    public FrmCategoria() {
        initComponents();
        
        this.setLocation(450,100);
        
        InativarMenus();
        
        //Método não encerrar a tela sem fechar
        setClosable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldCodigo = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCategoria = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuNovo = new javax.swing.JMenu();
        jMenuSalvar = new javax.swing.JMenu();
        jMenuEditar = new javax.swing.JMenu();
        jMenuExcluir = new javax.swing.JMenu();
        jMenuCancelar = new javax.swing.JMenu();

        setIconifiable(true);
        setTitle("CADASTRO DE CATEGORIA");

        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/magnify.png"))); // NOI18N
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jLabel12.setText("Código");

        jLabel1.setText("Categoria");

        jMenuNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/file-document-box-plus-outline.png"))); // NOI18N
        jMenuNovo.setText("NOVO");
        jMenuNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuNovoMouseClicked(evt);
            }
        });
        jMenuNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNovoActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuNovo);

        jMenuSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/content-save.png"))); // NOI18N
        jMenuSalvar.setText("SALVAR");
        jMenuSalvar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenuSalvarItemStateChanged(evt);
            }
        });
        jMenuSalvar.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenuSalvarMenuSelected(evt);
            }
        });
        jMenuSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSalvarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuSalvarMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuSalvarMousePressed(evt);
            }
        });
        jMenuSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalvarActionPerformed(evt);
            }
        });
        jMenuSalvar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuSalvarKeyPressed(evt);
            }
        });
        jMenuBar1.add(jMenuSalvar);

        jMenuEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/square-edit-outline.png"))); // NOI18N
        jMenuEditar.setText("EDITAR");
        jMenuEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuEditarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuEditar);

        jMenuExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
        jMenuExcluir.setText("EXCLUIR");
        jMenuExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuExcluirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuExcluir);

        jMenuCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/file-cancel.png"))); // NOI18N
        jMenuCancelar.setText("CANCELAR");
        jMenuCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCancelarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuCancelar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPesquisar))
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuNovoMouseClicked
       if(jMenuNovo.isEnabled()){
            flag = 1;
           
            //Chama caso botão esteja habilitado
            jMenuSalvar.setEnabled(true);
            jMenuCancelar.setEnabled(true);
            jMenuNovo.setEnabled(false);
            jMenuExcluir.setEnabled(false);
            jMenuEditar.setEnabled(false);
            
            jTextFieldCodigo.setEnabled(false);
            jButtonPesquisar.setEnabled(false); 
            jTextFieldCategoria.setEnabled(true); 

            jTextFieldCodigo.setText("");
            jTextFieldCategoria.setText("");
        }else{
            //Chama caso botão esteja não habilitado
        }
    }//GEN-LAST:event_jMenuNovoMouseClicked

    private void jMenuCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCancelarMouseClicked
        if(jMenuCancelar.isEnabled()){            
            jMenuNovo.setEnabled(true);
            jMenuSalvar.setEnabled(false);
            jMenuEditar.setEnabled(false);
            jMenuExcluir.setEnabled(false);
            jMenuCancelar.setEnabled(false);
            
            jTextFieldCodigo.setEnabled(true);
            jButtonPesquisar .setEnabled(true);

            jTextFieldCategoria.setEnabled(false); 
            
            jTextFieldCodigo.setText("");
            jTextFieldCategoria.setText("");
        }
    }//GEN-LAST:event_jMenuCancelarMouseClicked

    private void jMenuSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSalvarMouseClicked
        if(jMenuSalvar.isEnabled()){
            if(flag == 1){
                modCategoria.setNomeCategoria(jTextFieldCategoria.getText());
                controlCategoria.SalvarCategoria(modCategoria);

                jMenuNovo.setEnabled(true);
                jMenuSalvar.setEnabled(false);
                jMenuEditar.setEnabled(true);        
                jMenuExcluir.setEnabled(true);
                jMenuCancelar.setEnabled(false);        
                jTextFieldCategoria.setEnabled(false);

                buscarUltimaInsercao();
            }else{
                modCategoria.setNomeCategoria(jTextFieldCategoria.getText());
                modCategoria.setIdCategoria(Integer.parseInt(jTextFieldCodigo.getText()));
                controlCategoria.EditarCategoria(modCategoria);
                
                jMenuNovo.setEnabled(true);
                jMenuSalvar.setEnabled(false);
                jMenuEditar.setEnabled(true);        
                jMenuExcluir.setEnabled(true);
                jMenuCancelar.setEnabled(false);        
                jTextFieldCategoria.setEnabled(false);
            }            
        }
    }//GEN-LAST:event_jMenuSalvarMouseClicked

    private void jMenuSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSalvarMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuSalvarMouseEntered

    private void jMenuSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalvarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuSalvarActionPerformed

    private void jMenuSalvarMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenuSalvarMenuSelected
        
    }//GEN-LAST:event_jMenuSalvarMenuSelected

    private void jMenuSalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuSalvarKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuSalvarKeyPressed

    private void jMenuSalvarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenuSalvarItemStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuSalvarItemStateChanged

    private void jMenuSalvarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSalvarMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuSalvarMousePressed

    private void jMenuNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNovoActionPerformed
        
    }//GEN-LAST:event_jMenuNovoActionPerformed

    private void jMenuEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuEditarMouseClicked
        if(jMenuEditar.isEnabled()){
            flag = 2;
            
            jMenuNovo.setEnabled(false);
            jMenuSalvar.setEnabled(true);
            jMenuEditar.setEnabled(false);
            jMenuExcluir.setEnabled(false);
            jMenuCancelar.setEnabled(true);

            jTextFieldCodigo.setEnabled(false);
            jButtonPesquisar.setEnabled(false);

            jTextFieldCategoria.setEnabled(true);
        }        
    }//GEN-LAST:event_jMenuEditarMouseClicked

    private void jMenuExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuExcluirMouseClicked
        if(jMenuExcluir.isEnabled()){
            modCategoria.setIdCategoria(Integer.parseInt(jTextFieldCodigo.getText()));
            controlCategoria.ExcluirCategoria(modCategoria);

            jMenuNovo.setEnabled(true);
            jMenuSalvar.setEnabled(false);
            jMenuEditar.setEnabled(false);
            jMenuExcluir.setEnabled(false);
            jMenuCancelar.setEnabled(false);
            jTextFieldCodigo.setEnabled(true);
            jButtonPesquisar.setEnabled(true);

            jTextFieldCategoria.setEnabled(false);

            jTextFieldCodigo.setText("");
            jTextFieldCategoria.setText("");
        }
    }//GEN-LAST:event_jMenuExcluirMouseClicked

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        if(jTextFieldCodigo.getText().equals("")){
            FrmConsultaCategoria frmConsulta = new FrmConsultaCategoria(null,true);
            frmConsulta.setVisible(true);
            
            String idCategoria = frmConsulta.getIdCategoria();
            String nomeCategoria = frmConsulta.getNomeCategoria();
            
            jTextFieldCodigo.setText(idCategoria);
            jTextFieldCategoria.setText(nomeCategoria); 
            
        }else{
            
        }
        
            if(!jTextFieldCodigo.getText().equals("")){
                jMenuSalvar.setEnabled(false);
                jMenuEditar.setEnabled(true);        
                jMenuExcluir.setEnabled(true);
                jMenuCancelar.setEnabled(false);
            }
            jMenuNovo.setEnabled(true);
            jButtonPesquisar.setEnabled(true);
               
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    public void InativarMenus(){
        jMenuSalvar.setEnabled(false);
        jMenuEditar.setEnabled(false);        
        jMenuExcluir.setEnabled(false);
        jMenuCancelar.setEnabled(false); 
        
        jTextFieldCategoria.setEnabled(false); 
    }
    
    public void buscarUltimaInsercao(){
        try{                                              
                modCategoria.setNomeCategoria(jTextFieldCategoria.getText());
                modCategoria = controlCategoria.UltimaInsercao(modCategoria);         
                
                jTextFieldCodigo.setText(String.valueOf(modCategoria.getIdCategoria()));
                
            }catch(NumberFormatException erro){
                JOptionPane.showMessageDialog(null, "Digite um código válido");
            }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCancelar;
    private javax.swing.JMenu jMenuEditar;
    private javax.swing.JMenu jMenuExcluir;
    private javax.swing.JMenu jMenuNovo;
    private javax.swing.JMenu jMenuSalvar;
    private javax.swing.JTextField jTextFieldCategoria;
    private javax.swing.JTextField jTextFieldCodigo;
    // End of variables declaration//GEN-END:variables
}