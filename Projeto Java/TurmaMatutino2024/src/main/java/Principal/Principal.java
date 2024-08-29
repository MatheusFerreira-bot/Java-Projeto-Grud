/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Principal;

import Alunos.FormAlunos;
import Cliente.FormCliente;
import ContasPagar.FormContasPagar;
import Eventos.FormEvento;
import Fornecedor.FormFornecedor;
import Funcionario.FormFuncionario;
import Livros.FormLivros;
import Produtos.FormProduto;
import Veiculo.FormVeiculo;

/**
 *
 * @author Senac
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        btnAlunos = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        btnContaPagar = new javax.swing.JButton();
        btnEventos = new javax.swing.JButton();
        btnFornecedor = new javax.swing.JButton();
        btnFuncionario = new javax.swing.JButton();
        btnLivros = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();
        btnVeiculo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        btnAlunos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnAlunos.setText("Cadastro de Alunos");
        btnAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlunosActionPerformed(evt);
            }
        });

        btnCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnCliente.setText("Cadastro de Clientes");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnContaPagar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnContaPagar.setText("Contas a Pagar");
        btnContaPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContaPagarActionPerformed(evt);
            }
        });

        btnEventos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnEventos.setText("Cadastro de Eventos");
        btnEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEventosActionPerformed(evt);
            }
        });

        btnFornecedor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnFornecedor.setText("Cadastro de Fornecedor");
        btnFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFornecedorActionPerformed(evt);
            }
        });

        btnFuncionario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnFuncionario.setText("Cadastro de Funcionário");
        btnFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionarioActionPerformed(evt);
            }
        });

        btnLivros.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnLivros.setText("Cadastro de Livros");
        btnLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLivrosActionPerformed(evt);
            }
        });

        btnProdutos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnProdutos.setText("Cadastro de Produtos");
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });

        btnVeiculo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnVeiculo.setText("Cadastro de Veiculos");
        btnVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeiculoActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setText("FECHAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Central de Cadastros");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnContaPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEventos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLivros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(btnAlunos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnContaPagar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEventos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFornecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLivros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVeiculo)
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addGap(18, 18, 18))
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
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlunosActionPerformed
        FormAlunos fa = new FormAlunos();
        fa.CadastroAluno();
    }//GEN-LAST:event_btnAlunosActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        FormCliente fc = new FormCliente();
        fc.CadastroCliente();
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnContaPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContaPagarActionPerformed
        FormContasPagar fcp = new FormContasPagar();
        fcp.CadastroContasPagar();
    }//GEN-LAST:event_btnContaPagarActionPerformed

    private void btnEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEventosActionPerformed
        FormEvento fe = new FormEvento();
        fe.CadastroEventos();
    }//GEN-LAST:event_btnEventosActionPerformed

    private void btnFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFornecedorActionPerformed
        FormFornecedor ff = new FormFornecedor();
        ff.CadastroForncedor();
    }//GEN-LAST:event_btnFornecedorActionPerformed

    private void btnFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionarioActionPerformed
        FormFuncionario ffunc = new FormFuncionario();
        ffunc.CadastroFuncionario();
    }//GEN-LAST:event_btnFuncionarioActionPerformed

    private void btnLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLivrosActionPerformed
        FormLivros fl = new FormLivros();
        fl.CadastroLivros();
    }//GEN-LAST:event_btnLivrosActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        FormProduto fp = new FormProduto();
        fp.CadastroProduto();
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeiculoActionPerformed
        FormVeiculo fv = new FormVeiculo();
        fv.CadastroVeiculo();
    }//GEN-LAST:event_btnVeiculoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void MenuPrincipal() {
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlunos;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnContaPagar;
    private javax.swing.JButton btnEventos;
    private javax.swing.JButton btnFornecedor;
    private javax.swing.JButton btnFuncionario;
    private javax.swing.JButton btnLivros;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnVeiculo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
