/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import util.FormataCampos;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Lucas Moraes Camacho
 */
public class FrmParticipante extends javax.swing.JInternalFrame {
    
    private String dataAtual;
    
    
    /**
     * Creates new form FrmCliente
     */
    public FrmParticipante() {
        initComponents();
        
        this.setLocation(340,35);
        this.setSize(700,544);          
        setClosable(true);        
        //add(new JLabel("Internal Frame Test"));        
        setVisible(true);
        
        disableMenus();
        disableCampos();
        
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTextField2 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxUF = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldDataCadastro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jCheckBoxAtivo = new javax.swing.JCheckBox();
        jCheckBoxCliente = new javax.swing.JCheckBox();
        jCheckBoxVendedor = new javax.swing.JCheckBox();
        jCheckBoxFornecedor = new javax.swing.JCheckBox();
        jCheckBoxTransportadora = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldTelefone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCelular = new javax.swing.JTextField();
        jTextFieldCelular2 = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldIeRG = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldCPFCNPJ = new javax.swing.JFormattedTextField();
        jButtonPesquisarCidade = new javax.swing.JButton();
        jTextFieldCidade = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuNovo = new javax.swing.JMenu();
        jMenuSalvar = new javax.swing.JMenu();
        jMenuEditar = new javax.swing.JMenu();
        jMenuExcluir = new javax.swing.JMenu();
        jMenuCancelar = new javax.swing.JMenu();

        jTextField2.setText("jTextField2");

        jTextField13.setText("jTextField13");

        setIconifiable(true);
        setTitle("CADASTRO DE PARTICIPANTE");
        setPreferredSize(new java.awt.Dimension(700, 544));

        jLabel4.setText("N°");

        jLabel5.setText("Bairro");

        jLabel6.setText("UF");

        jComboBoxUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel7.setText("Cidade");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel8.setText("Cadastro");

        jTextFieldDataCadastro.setEnabled(false);

        jLabel9.setText("Alteração");

        jTextField7.setEnabled(false);

        jTextField8.setEnabled(false);

        jTextField9.setEnabled(false);

        jLabel10.setText("Usuário");

        jLabel11.setText("Usuário");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel12.setText("Código");

        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/account-search.png"))); // NOI18N

        jLabel13.setText("Nome");

        jLabel14.setText("CPF/CNPJ");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jCheckBoxAtivo.setText("Ativo");

        jCheckBoxCliente.setText("Cliente");

        jCheckBoxVendedor.setText("Vendedor");

        jCheckBoxFornecedor.setText("Fornecedor");

        jCheckBoxTransportadora.setText("Transport.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBoxAtivo)
                .addGap(10, 10, 10)
                .addComponent(jCheckBoxCliente)
                .addGap(10, 10, 10)
                .addComponent(jCheckBoxVendedor)
                .addGap(10, 10, 10)
                .addComponent(jCheckBoxFornecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jCheckBoxTransportadora)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxAtivo)
                    .addComponent(jCheckBoxCliente)
                    .addComponent(jCheckBoxVendedor)
                    .addComponent(jCheckBoxFornecedor)
                    .addComponent(jCheckBoxTransportadora))
                .addContainerGap())
        );

        jLabel1.setText("Endereço");

        jLabel2.setText("Telefone");

        jLabel3.setText("Celular");

        jLabel15.setText("Celular");

        jLabel16.setText("E-mail");

        jLabel17.setText("I.E/RG");

        jTextFieldCPFCNPJ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldCPFCNPJFocusLost(evt);
            }
        });

        jButtonPesquisarCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/magnify.png"))); // NOI18N

        jTextFieldCidade.setEnabled(false);

        jMenuNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/account-plus.png"))); // NOI18N
        jMenuNovo.setText("NOVO");
        jMenuNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuNovoMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuNovo);

        jMenuSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/content-save.png"))); // NOI18N
        jMenuSalvar.setText("SALVAR");
        jMenuSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSalvarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSalvar);

        jMenuEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/account-edit.png"))); // NOI18N
        jMenuEditar.setText("EDITAR");
        jMenuBar1.add(jMenuEditar);

        jMenuExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
        jMenuExcluir.setText("EXCLUIR");
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonPesquisar)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jTextFieldCPFCNPJ))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldEndereco)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel7))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addComponent(jComboBoxUF, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldIeRG, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonPesquisarCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(74, 74, 74)
                                        .addComponent(jLabel3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCelular2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextFieldEmail))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCPFCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonPesquisarCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldIeRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldCidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCelular2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(191, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCancelarMouseClicked
        disableMenus();
        disableCampos();
        limparCampos();
        jMenuNovo.setEnabled(true);
        jTextFieldCodigo.setEnabled(true);
        jButtonPesquisar.setEnabled(true);
        
        //JOptionPane.showMessageDialog(null, "Tem certeza que deseja excluir");
    }//GEN-LAST:event_jMenuCancelarMouseClicked

    private void jMenuNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuNovoMouseClicked
        habiliteCampos();
        dataAtual();
        jTextFieldDataCadastro.setText(dataAtual);
        jMenuNovo.setEnabled(false);
        jMenuSalvar.setEnabled(true);
        jMenuCancelar.setEnabled(true);
        jTextFieldCodigo.setEnabled(false);
        jButtonPesquisar.setEnabled(false);
    }//GEN-LAST:event_jMenuNovoMouseClicked

    private void jTextFieldCPFCNPJFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCPFCNPJFocusLost
        FormataCampos format = new FormataCampos();        
        //jFormattedTextField2.setText(format.getCpfCnpjFormatado(jFormattedTextField2.getText()));
       //format.getCpfCnpjFormatado(jFormattedTextField2.getText());
       jTextFieldCPFCNPJ.setText(format.getCpfCnpjFormatado(jTextFieldCPFCNPJ.getText()));
        
    }//GEN-LAST:event_jTextFieldCPFCNPJFocusLost

    private void jMenuSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSalvarMouseClicked
        
    }//GEN-LAST:event_jMenuSalvarMouseClicked

    public void disableMenus (){
        jMenuSalvar.setEnabled(false);
        jMenuEditar.setEnabled(false);
        jMenuExcluir.setEnabled(false);
        jMenuCancelar.setEnabled(false);
    }
    
    public void disableCampos(){
        jTextFieldNome.setEnabled(false);
        jTextFieldCPFCNPJ.setEnabled(false);
        jTextFieldEndereco.setEnabled(false);
        jTextFieldNumero.setEnabled(false);
        jTextFieldBairro.setEnabled(false);
        jComboBoxUF.setEnabled(false);
        jTextFieldIeRG.setEnabled(false);
        jTextFieldTelefone.setEnabled(false);
        jTextFieldCelular.setEnabled(false);
        jTextFieldCelular2.setEnabled(false);
        jTextFieldEmail.setEnabled(false);  
        
        jCheckBoxAtivo.setEnabled(false);  
        jCheckBoxCliente.setEnabled(false);  
        jCheckBoxVendedor.setEnabled(false);  
        jCheckBoxFornecedor.setEnabled(false);  
        jCheckBoxTransportadora.setEnabled(false);
        
        jButtonPesquisarCidade.setEnabled(false);
    }
    
    public void habiliteCampos(){
        jTextFieldNome.setEnabled(true);
        jTextFieldCPFCNPJ.setEnabled(true);
        jTextFieldEndereco.setEnabled(true);
        jTextFieldNumero.setEnabled(true);
        jTextFieldBairro.setEnabled(true);
        jComboBoxUF.setEnabled(true);
        jTextFieldIeRG.setEnabled(true);
        jTextFieldTelefone.setEnabled(true);
        jTextFieldCelular.setEnabled(true);
        jTextFieldCelular2.setEnabled(true);
        jTextFieldEmail.setEnabled(true);  
        
        jCheckBoxAtivo.setEnabled(true);  
        jCheckBoxCliente.setEnabled(true);  
        jCheckBoxVendedor.setEnabled(true);  
        jCheckBoxFornecedor.setEnabled(true);  
        jCheckBoxTransportadora.setEnabled(true);
        
        jButtonPesquisarCidade.setEnabled(true);
    }
    
    public void limparCampos(){
        
        jTextFieldNome.setText("");
        jTextFieldCPFCNPJ.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldNumero.setText("");
        jTextFieldBairro.setText("");
        jTextFieldCidade.setText("");
        //jComboBoxUF.setText("");
        jTextFieldIeRG.setText("");
        jTextFieldTelefone.setText("");
        jTextFieldCelular.setText("");
        jTextFieldCelular2.setText("");
        jTextFieldEmail.setText("");  
        jTextFieldDataCadastro.setText(""); 
        
        jCheckBoxAtivo.setSelected(false);
        jCheckBoxCliente.setSelected(false);  
        jCheckBoxVendedor.setSelected(false);
        jCheckBoxFornecedor.setSelected(false);  
        jCheckBoxTransportadora.setSelected(false);
    }
    
    public void dataAtual(){
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date hoje = new Date();
        dataAtual = df.format(hoje);
    }
    
    

        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonPesquisarCidade;
    private javax.swing.JCheckBox jCheckBoxAtivo;
    private javax.swing.JCheckBox jCheckBoxCliente;
    private javax.swing.JCheckBox jCheckBoxFornecedor;
    private javax.swing.JCheckBox jCheckBoxTransportadora;
    private javax.swing.JCheckBox jCheckBoxVendedor;
    private javax.swing.JComboBox<String> jComboBoxUF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCancelar;
    private javax.swing.JMenu jMenuEditar;
    private javax.swing.JMenu jMenuExcluir;
    private javax.swing.JMenu jMenuNovo;
    private javax.swing.JMenu jMenuSalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JFormattedTextField jTextFieldCPFCNPJ;
    private javax.swing.JTextField jTextFieldCelular;
    private javax.swing.JTextField jTextFieldCelular2;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldDataCadastro;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldIeRG;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables
}