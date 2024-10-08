/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Alunos;

import Alunos.Alunos;
import ClassesEspeciais.Conexao;
import javax.swing.JOptionPane;

/**
 *
 * @author Senac
 */
public class FormAlunos extends javax.swing.JFrame {
    
    
    
    public FormAlunos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LbNome = new javax.swing.JLabel();
        TxtfNome = new javax.swing.JTextField();
        LbCPF = new javax.swing.JLabel();
        TxtfCPF = new javax.swing.JTextField();
        LbEndereco = new javax.swing.JLabel();
        TxtfEndereco = new javax.swing.JTextField();
        LbTelefone = new javax.swing.JLabel();
        TxtfTelefone = new javax.swing.JTextField();
        LbEmail = new javax.swing.JLabel();
        TxtfEmail = new javax.swing.JTextField();
        LbDataNasc = new javax.swing.JLabel();
        TxtfDataNasc = new javax.swing.JTextField();
        LbSerie = new javax.swing.JLabel();
        TxtfSerie = new javax.swing.JTextField();
        LbNomeResp = new javax.swing.JLabel();
        TxtfNomeResp = new javax.swing.JTextField();
        LbEscolaOrigem = new javax.swing.JLabel();
        TxtfEscolaOrigem = new javax.swing.JTextField();
        BtnLimpar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        lbCodigoAlunos = new javax.swing.JLabel();
        txtfCodigoAlunos = new javax.swing.JTextField();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuRelatorio = new javax.swing.JMenu();
        jSubMDados = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        LbNome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LbNome.setText("Nome:");

        LbCPF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LbCPF.setText("CPF:");

        LbEndereco.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LbEndereco.setText("Endereço:");

        LbTelefone.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LbTelefone.setText("Telefone:");

        LbEmail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LbEmail.setText("Email:");

        LbDataNasc.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LbDataNasc.setText("Data Nascimento:");

        LbSerie.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LbSerie.setText("Série/Ano:");

        LbNomeResp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LbNomeResp.setText("Nome Responsável:");

        LbEscolaOrigem.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LbEscolaOrigem.setText("Escola Origem:");

        TxtfEscolaOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtfEscolaOrigemActionPerformed(evt);
            }
        });

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

        lbCodigoAlunos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbCodigoAlunos.setText("Código");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btnAtualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGravar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbCodigoAlunos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfCodigoAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(LbTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LbEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtfEmail))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(LbNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LbCPF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtfCPF))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(LbEndereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtfEndereco))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(LbDataNasc)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtfDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(LbEscolaOrigem)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtfEscolaOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(LbSerie)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtfSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LbNomeResp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtfNomeResp, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigoAlunos)
                    .addComponent(txtfCodigoAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbNome)
                    .addComponent(TxtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbCPF)
                    .addComponent(TxtfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbEndereco)
                    .addComponent(TxtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbTelefone)
                    .addComponent(TxtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbEmail)
                    .addComponent(TxtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbDataNasc)
                    .addComponent(TxtfDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbSerie)
                    .addComponent(TxtfSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbNomeResp)
                    .addComponent(TxtfNomeResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbEscolaOrigem)
                    .addComponent(TxtfEscolaOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnLimpar)
                    .addComponent(btnMostrar)
                    .addComponent(btnGravar)
                    .addComponent(btnAtualizar)
                    .addComponent(btnExcluir))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenuRelatorio.setText("Relatório");

        jSubMDados.setText("Dados");
        jSubMDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubMDadosActionPerformed(evt);
            }
        });
        jMenuRelatorio.add(jSubMDados);

        jMenuBar1.add(jMenuRelatorio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtfEscolaOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtfEscolaOrigemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtfEscolaOrigemActionPerformed

    private void BtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparActionPerformed
        Limpar();
    }//GEN-LAST:event_BtnLimparActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        Alunos a = this.MontarAluno();
        JOptionPane.showMessageDialog(null,"Nome: "+a.getNome()+"\nCPF: "+a.getCPF()+"\nEndereço: "+a.getEndereco()+
                "\nTelefone: "+a.getTelefone()+"\nEmail: "+a.getEmail()+"\nData Nascimento: "+a.getDataNasc()+
                "\nSérie/Ano: "+a.getSerieAno()+"\nNome responsável: "+a.getNomeResponsavel()+"\nEscola origem: "+a.getEscolaOrigem());
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
       Alunos a = this.MontarAluno();
        if (a != null) {
          AlunosCtrl ac = new AlunosCtrl();
          ac.insert(a);
        } else {
           JOptionPane.showMessageDialog(null, "Preencha todos os campos corretamente.", "Erro", JOptionPane.ERROR_MESSAGE);
        }        
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        Alunos a = this.MontarAluno();
          if (a != null && !txtfCodigoAlunos.getText().trim().isEmpty()) {
            a.setCodAlunos(Integer.parseInt(txtfCodigoAlunos.getText()));
            AlunosCtrl ac = new AlunosCtrl();
            ac.update(a);
        } else {
          JOptionPane.showMessageDialog(null, "Preencha todos os campos corretamente.", "Erro", JOptionPane.ERROR_MESSAGE);  
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        AlunosCtrl ac = new AlunosCtrl();
        if(!txtfCodigoAlunos.getText().trim().isEmpty()){
            int cod = Integer.parseInt(txtfCodigoAlunos.getText());
            ac.delete(cod);
        }else{
            JOptionPane.showMessageDialog(null,"Preencha o campo.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jSubMDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubMDadosActionPerformed
        AlunosCtrl ac = new AlunosCtrl();
        ac.SelectAll();
    }//GEN-LAST:event_jSubMDadosActionPerformed

    /**
     * @param args the command line arguments
     */
    public void CadastroAluno() {
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
            java.util.logging.Logger.getLogger(FormAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAlunos().setVisible(true);
            }
        });
    }
    
    public Alunos MontarAluno() {
    // Verifica se os campos de texto não estão vazios
    if (TxtfCPF.getText().trim().isEmpty() || TxtfDataNasc.getText().trim().isEmpty() || TxtfEmail.getText().trim().isEmpty()
            || TxtfEndereco.getText().trim().isEmpty() || TxtfEscolaOrigem.getText().trim().isEmpty() 
            || TxtfNome.getText().trim().isEmpty() || TxtfNomeResp.getText().trim().isEmpty() 
            || TxtfSerie.getText().trim().isEmpty() || TxtfTelefone.getText().trim().isEmpty()){
        // Exibe uma mensagem de erro
        JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
        return null; // ou pode lançar uma exceção
    }
    // Caso os campos estejam preenchidos, monta o objeto Fornecedor
    try {
        Alunos a = new Alunos();
        a.setCPF(Long.parseLong(TxtfCPF.getText()));
        a.setDataNasc(TxtfDataNasc.getText());
        a.setEmail(TxtfEmail.getText());
        a.setEndereco(TxtfEndereco.getText());
        a.setEscolaOrigem(TxtfEscolaOrigem.getText());
        a.setNome(TxtfNome.getText());
        a.setNomeResponsavel(TxtfNomeResp.getText());
        a.setSerieAno(Integer.parseInt(TxtfSerie.getText()));
        a.setTelefone(Long.parseLong(TxtfTelefone.getText()));
        return a;
    } catch (NumberFormatException n) {
        JOptionPane.showMessageDialog(null, "Deve ser um número.", "Erro", JOptionPane.ERROR_MESSAGE);
        return null; // ou pode lançar uma exceção
    }
}
    
    public void Limpar(){
        txtfCodigoAlunos.setText("");
        TxtfCPF.setText("");
        TxtfDataNasc.setText("");
        TxtfEmail.setText("");
        TxtfEndereco.setText("");
        TxtfEscolaOrigem.setText("");
        TxtfNome.setText("");
        TxtfNomeResp.setText("");
        TxtfSerie.setText("");
        TxtfTelefone.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLimpar;
    private javax.swing.JLabel LbCPF;
    private javax.swing.JLabel LbDataNasc;
    private javax.swing.JLabel LbEmail;
    private javax.swing.JLabel LbEndereco;
    private javax.swing.JLabel LbEscolaOrigem;
    private javax.swing.JLabel LbNome;
    private javax.swing.JLabel LbNomeResp;
    private javax.swing.JLabel LbSerie;
    private javax.swing.JLabel LbTelefone;
    private javax.swing.JTextField TxtfCPF;
    private javax.swing.JTextField TxtfDataNasc;
    private javax.swing.JTextField TxtfEmail;
    private javax.swing.JTextField TxtfEndereco;
    private javax.swing.JTextField TxtfEscolaOrigem;
    private javax.swing.JTextField TxtfNome;
    private javax.swing.JTextField TxtfNomeResp;
    private javax.swing.JTextField TxtfSerie;
    private javax.swing.JTextField TxtfTelefone;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuRelatorio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem jSubMDados;
    private javax.swing.JLabel lbCodigoAlunos;
    private javax.swing.JTextField txtfCodigoAlunos;
    // End of variables declaration//GEN-END:variables
}
