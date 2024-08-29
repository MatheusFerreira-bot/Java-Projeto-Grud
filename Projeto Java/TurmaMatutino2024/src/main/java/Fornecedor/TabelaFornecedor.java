/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fornecedor;

import Eventos.Eventos;
import Eventos.EventosDAO;
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
public class TabelaFornecedor {
    public static FornecedorDAO fdao = new FornecedorDAO();
    
    public void ExibirFornecedor() {
        ArrayList<Fornecedor> ArrayForn = new ArrayList<>();
        
        ArrayForn = fdao.SelectAll();
        
        JFrame Frame = new JFrame();
        Frame.setBounds(380,120,500,300);
        Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        DefaultTableModel Model = new DefaultTableModel();
        
        JPanel Painel = new JPanel();
        Painel.setLayout(new FlowLayout());
        
        Model.addColumn("Código");
        Model.addColumn("Nome Empresa");
        Model.addColumn("CNPJ");
        Model.addColumn("Endereço");
        Model.addColumn("Telefone");
        Model.addColumn("Email");
        Model.addColumn("Nome Contato");
        Model.addColumn("Tipo de Serviço");
        Model.addColumn("Condição Pagamento");
        Model.addColumn(("Prazo Entrega"));
        
        boolean Parar = true;
        int i = 0;
        
        while(Parar){
            if(i<ArrayForn.size()){
                Model.addRow(new Object[]{ArrayForn.get(i).getCodFornecedor(),ArrayForn.get(i).getNomeEmpresa(),
                ArrayForn.get(i).getCNPJ(),ArrayForn.get(i).getEndereco(),ArrayForn.get(i).getTelefone(),
                ArrayForn.get(i).getEmail(),ArrayForn.get(i).getNomeContato(),ArrayForn.get(i).getTipo(),
                ArrayForn.get(i).getCondPagamento(),ArrayForn.get(i).getPrazoEntrega()});
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