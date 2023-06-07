/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import static java.lang.Thread.sleep;
import util.ConectaBanco;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static org.apache.axis.management.ServiceAdmin.start;
import view.FrmPrincipal;

/**
 *
 * @author Lucas Moraes Camacho
 */
public class FrmLogin extends javax.swing.JFrame {
    ConectaBanco conex = new ConectaBanco();
    String senha;
    
    
    /**
     * Creates new form FrmLogin
     */
    public FrmLogin() {
        initComponents();
        this.setLocation(500, 100);
        conex.conexao();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jTextFieldNome = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonAddUser = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabelInformacaoCarregamento = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonLogin1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login do Sistema");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNomeKeyReleased(evt);
            }
        });
        getContentPane().add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 152, -1));

        jPasswordFieldSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(jPasswordFieldSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 152, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setText("Usuário:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 50, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("Senha:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 50, 20));

        jButtonAddUser.setText("Cadastrar Usuário");
        jButtonAddUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAddUserMouseClicked(evt);
            }
        });
        jButtonAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddUserActionPerformed(evt);
            }
        });
        jButtonAddUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonAddUserKeyPressed(evt);
            }
        });
        getContentPane().add(jButtonAddUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 180, -1));

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 410, 20));
        getContentPane().add(jLabelInformacaoCarregamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 200, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login.png"))); // NOI18N
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 200, 200));

        jButtonLogin1.setText("Logar");
        jButtonLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogin1ActionPerformed(evt);
            }
        });
        jButtonLogin1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonLogin1KeyPressed(evt);
            }
        });
        getContentPane().add(jButtonLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 90, -1));

        setSize(new java.awt.Dimension(440, 283));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddUserActionPerformed
        
        FrmUsuario form = null;
        form = new FrmUsuario();
        form.setVisible(true);
        
        
    }//GEN-LAST:event_jButtonAddUserActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAddUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonAddUserKeyPressed
        // TODO add your handling code here:
        jButtonAddUserActionPerformed(null);
    }//GEN-LAST:event_jButtonAddUserKeyPressed

    private void jPasswordFieldSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
           LoginVerifica();
       }
    
    }//GEN-LAST:event_jPasswordFieldSenhaKeyPressed

    private void jTextFieldNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeKeyReleased
       
    }//GEN-LAST:event_jTextFieldNomeKeyReleased

    private void jButtonLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogin1ActionPerformed
        LoginVerifica();
    }//GEN-LAST:event_jButtonLogin1ActionPerformed

    private void jButtonLogin1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonLogin1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLogin1KeyPressed

    private void jButtonAddUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddUserMouseClicked
        FrmUsuario.getFrmUsuario().setVisible(true); // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jButtonAddUserMouseClicked

    public void LoginVerifica(){
        try {
            conex.executaSQL("select * from tblusuario where loginUsuario = '"+jTextFieldNome.getText()+"'");
            conex.rs.first();            
            senha = conex.rs.getString("senhaUsuario");
           
            if(jPasswordFieldSenha.getText().equals(senha)){                
                new Thread(){
                    public void run(){
                        for (int i=0; i < 101;i++){
                            try{
                                sleep(100);
                                jProgressBar1.setValue(i);
                                
                                if(jProgressBar1.getValue() <= 25){
                                    jLabelInformacaoCarregamento.setText("Carregando Sistema...");
                                }else if (jProgressBar1.getValue() <= 50){
                                    jLabelInformacaoCarregamento.setText("Carregando Banco de Dados...");
                                }else if (jProgressBar1.getValue() <=75){
                                    jLabelInformacaoCarregamento.setText("Abrindo Tabelas...");
                                }else{
                                    jLabelInformacaoCarregamento.setText("O sistema está sendo Iniciado");
                                }
                            }catch (InterruptedException ex){
                            }
                        }
                    FrmPrincipal frm = new FrmPrincipal();
                    frm.setVisible(true);
                    dispose();
                    
                    }
                }.start();
            }else{
            //JOptionPane.showMessageDialog(null, "Senha e/ou Usuário não correspondem...");
        }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Senha e/ou Usuário não correspondem");
        }
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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddUser;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonLogin1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelInformacaoCarregamento;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JProgressBar jProgressBar1;
    public static javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}