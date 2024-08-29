/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionario;

import Fornecedor.Fornecedor;
import Fornecedor.FornecedorDAO;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Matheus
 */
public class TabelaFuncionario {
    public static FuncionarioDAO fdao = new FuncionarioDAO();
    
    public void ExibirFuncionario() {
        ArrayList<Funcionario> ArrayFunc = new ArrayList<>();
        
        ArrayFunc = fdao.SelectAll();
        
        JFrame Frame = new JFrame();
        Frame.setBounds(380,120,500,300);
        Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        DefaultTableModel Model = new DefaultTableModel();
        
        JPanel Painel = new JPanel();
        Painel.setLayout(new FlowLayout());
        
        Model.addColumn("Código");
        Model.addColumn("Nome Completo");
        Model.addColumn("CPF");
        Model.addColumn("Endereço");
        Model.addColumn("Telefone");
        Model.addColumn("Email");
        Model.addColumn("Data Admissão");
        Model.addColumn("Cargo");
        Model.addColumn("Salário");
        Model.addColumn(("Departamento"));
        
        boolean Parar = true;
        int i = 0;
        
        while(Parar){
            if(i<ArrayFunc.size()){
                Model.addRow(new Object[]{ArrayFunc.get(i).getCodFuncionario(),ArrayFunc.get(i).getNomeCompleto(),
                ArrayFunc.get(i).getCPF(),ArrayFunc.get(i).getEndereco(),ArrayFunc.get(i).getTelefone(),
                ArrayFunc.get(i).getEmail(),ArrayFunc.get(i).getDataAdmissao(),ArrayFunc.get(i).getCargo(),
                ArrayFunc.get(i).getSalario(),ArrayFunc.get(i).getDepartamento()});
                i++;
            }else{
                Parar = false;
            }
        }
        
        JTable Tabela = new JTable(Model);
        Tabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane Scroll = new JScrollPane(Tabela);
        Painel.add(Scroll);
        Frame.add(Painel);
        Frame.setVisible(true);
        
    }
}