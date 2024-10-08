/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Fornecedor;

import javax.swing.JOptionPane;

/**
 *
 * @author Senac
 */
public class FormFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form FormFornecedor
     */
    public FormFornecedor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LbNomeEmpresa = new javax.swing.JLabel();
        TxtfNomeEmpresa = new javax.swing.JTextField();
        LbCNPJ = new javax.swing.JLabel();
        TxtfCNPJ = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TxtfEndereco = new javax.swing.JTextField();
        LbTelefone = new javax.swing.JLabel();
        TxtfTelefone = new javax.swing.JTextField();
        LbEmail = new javax.swing.JLabel();
        TxtfEmail = new javax.swing.JTextField();
        LbNomeContato = new javax.swing.JLabel();
        TxtfNomeContato = new javax.swing.JTextField();
        LbTipo = new javax.swing.JLabel();
        TxtfTipo = new javax.swing.JTextField();
        LbCondPag = new javax.swing.JLabel();
        TxtfCondPag = new javax.swing.JTextField();
        LbPrazoEntrega = new javax.swing.JLabel();
        TxtfPrazoEntrega = new javax.swing.JTextField();
        BtnLimpar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        lbCodigoForn = new javax.swing.JLabel();
        txtfCodigoForn = new javax.swing.JTextField();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMRelatorio = new javax.swing.JMenu();
        jmiDados = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        LbNomeEmpresa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LbNomeEmpresa.setText("Nome Empresa:");

        LbCNPJ.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LbCNPJ.setText("CNPJ:");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Endereço:");

        LbTelefone.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LbTelefone.setText("Telefone:");

        LbEmail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LbEmail.setText("Email:");

        LbNomeContato.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LbNomeContato.setText("Contato:");

        LbTipo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LbTipo.setText("Tipo de Produto/Serviço:");

        LbCondPag.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LbCondPag.setText("Condições Pagamento:");

        LbPrazoEntrega.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LbPrazoEntrega.setText("Prazo Entrega:");

        BtnLimpar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BtnLimpar.setText("LIMPAR");
        BtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparActionPerformed(evt);
            }
        });

        btnMostrar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnMostrar.setText("MOSTRAR");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnGravar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnGravar.setText("GRAVAR");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        lbCodigoForn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbCodigoForn.setText("Código:");

        btnAtualizar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnAtualizar.setText("ATUALIZAR");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LbPrazoEntrega)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtfPrazoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAtualizar)
                        .addGap(35, 35, 35)
                        .addComponent(btnGravar)
                        .addGap(35, 35, 35)
                        .addComponent(btnMostrar)
                        .addGap(35, 35, 35)
                        .addComponent(BtnLimpar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LbCondPag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtfCondPag))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LbTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtfTipo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LbEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtfEmail))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtfEndereco))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LbNomeEmpresa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtfNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LbNomeContato)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtfNomeContato))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LbCNPJ)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtfCNPJ))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LbTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtfTelefone))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbCodigoForn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfCodigoForn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExcluir)
                .addGap(188, 188, 188))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigoForn)
                    .addComponent(txtfCodigoForn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbNomeEmpresa)
                    .addComponent(TxtfNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbCNPJ)
                    .addComponent(TxtfCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbTelefone)
                    .addComponent(TxtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbEmail)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LbNomeContato)
                        .addComponent(TxtfNomeContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbTipo)
                    .addComponent(TxtfTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbCondPag)
                    .addComponent(TxtfCondPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbPrazoEntrega)
                    .addComponent(TxtfPrazoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnLimpar)
                    .addComponent(btnMostrar)
                    .addComponent(btnGravar)
                    .addComponent(btnAtualizar))
                .addGap(18, 18, 18)
                .addComponent(btnExcluir)
                .addGap(20, 20, 20))
        );

        jMRelatorio.setText("Relatório");

        jmiDados.setText("Dados");
        jmiDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDadosActionPerformed(evt);
            }
        });
        jMRelatorio.add(jmiDados);

        jMenuBar1.add(jMRelatorio);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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
    }// </editor-fold>//GEN-END:initComponents

    private void BtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparActionPerformed
        Limpar();
    }//GEN-LAST:event_BtnLimparActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        Fornecedor f = this.MontarFornecedor();
        JOptionPane.showMessageDialog(null,"Nome empresa: "+f.getNomeEmpresa()+"\nCNPJ: "+f.getCNPJ()+
                "\nEndereço: "+f.getEndereco()+"\nTelefone: "+f.getTelefone()+"\nEmail: "+f.getEmail()+
                "\nNome contato: "+f.getNomeContato()+"\nTipo de Produto/Serviço: "+f.getTipo()+
                "\nCondição de pagamento: "+f.getCondPagamento()+"\nPrazo de entrega: "+f.getPrazoEntrega());
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        Fornecedor f = this.MontarFornecedor();
        if (f != null){
            FornecedorCtrl fc = new FornecedorCtrl();
            fc.insert(f);
        }else{
            JOptionPane.showMessageDialog(null,"Favor preencher todos os campos.");
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        Fornecedor f = this.MontarFornecedor();
        if (f != null && !txtfCodigoForn.getText().trim().isEmpty()){
            f.setCodFornecedor(Integer.parseInt(txtfCodigoForn.getText()));
            FornecedorCtrl fc = new FornecedorCtrl();
            fc.update(f);
        }else{
            JOptionPane.showMessageDialog(null,"Favor preencher todos os campos.");
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        FornecedorCtrl fc = new FornecedorCtrl();
        if (!txtfCodigoForn.getText().trim().isEmpty()){
            int cod = Integer.parseInt(txtfCodigoForn.getText());
            fc.delete(cod);
        }else{
            JOptionPane.showMessageDialog(null,"Preencha o cmapo.");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jmiDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDadosActionPerformed
        FornecedorCtrl fc = new FornecedorCtrl();
        fc.SelectAll();
    }//GEN-LAST:event_jmiDadosActionPerformed
    /**
     * @param args the command line arguments
     */
    public void CadastroForncedor() {
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
            java.util.logging.Logger.getLogger(FormFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormFornecedor().setVisible(true);
            }
        });
    }
    
    public Fornecedor MontarFornecedor(){
        if (TxtfNomeEmpresa.getText().trim().isEmpty() || TxtfCNPJ.getText().trim().isEmpty()
                || TxtfEndereco.getText().trim().isEmpty() || TxtfTelefone.getText().trim().isEmpty()
                || TxtfEmail.getText().trim().isEmpty() || TxtfNomeContato.getText().trim().isEmpty()
                || TxtfTipo.getText().trim().isEmpty() || TxtfCondPag.getText().trim().isEmpty()
                || TxtfPrazoEntrega.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null,"Favor preencher todos os campos.");
            return null;
        }
        try{
            Fornecedor f = new Fornecedor();
            f.setNomeEmpresa(TxtfNomeEmpresa.getText());
            f.setCNPJ(Long.parseLong(TxtfCNPJ.getText()));
            f.setEndereco(TxtfEndereco.getText());
            f.setTelefone(Long.parseLong(TxtfTelefone.getText()));
            f.setEmail(TxtfEmail.getText());
            f.setNomeContato(TxtfNomeContato.getText());
            f.setTipo(TxtfTipo.getText());
            f.setCondPagamento(TxtfCondPag.getText());
            f.setPrazoEntrega(TxtfPrazoEntrega.getText());
            return f;
        }catch(NumberFormatException n){
            JOptionPane.showMessageDialog(null,n,"Error",JOptionPane.ERROR_MESSAGE);
            return null;
        }    
    }
    
    public void Limpar(){
       txtfCodigoForn.setText("");
       TxtfCNPJ.setText("");
       TxtfCondPag.setText("");
       TxtfEmail.setText("");
       TxtfEndereco.setText("");
       TxtfNomeContato.setText("");
       TxtfNomeEmpresa.setText("");
       TxtfPrazoEntrega.setText("");
       TxtfTelefone.setText("");
       TxtfTipo.setText("");       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLimpar;
    private javax.swing.JLabel LbCNPJ;
    private javax.swing.JLabel LbCondPag;
    private javax.swing.JLabel LbEmail;
    private javax.swing.JLabel LbNomeContato;
    private javax.swing.JLabel LbNomeEmpresa;
    private javax.swing.JLabel LbPrazoEntrega;
    private javax.swing.JLabel LbTelefone;
    private javax.swing.JLabel LbTipo;
    private javax.swing.JTextField TxtfCNPJ;
    private javax.swing.JTextField TxtfCondPag;
    private javax.swing.JTextField TxtfEmail;
    private javax.swing.JTextField TxtfEndereco;
    private javax.swing.JTextField TxtfNomeContato;
    private javax.swing.JTextField TxtfNomeEmpresa;
    private javax.swing.JTextField TxtfPrazoEntrega;
    private javax.swing.JTextField TxtfTelefone;
    private javax.swing.JTextField TxtfTipo;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMRelatorio;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem jmiDados;
    private javax.swing.JLabel lbCodigoForn;
    private javax.swing.JTextField txtfCodigoForn;
    // End of variables declaration//GEN-END:variables
}
