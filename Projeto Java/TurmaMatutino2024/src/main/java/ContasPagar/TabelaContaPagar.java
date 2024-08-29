/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContasPagar;

import Cliente.Cliente;
import Cliente.ClienteDAO;
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
public class TabelaContaPagar {
    public static ContaPagarDAO cpdao = new ContaPagarDAO();
    
    public void ExibirConta() {
        ArrayList<ContaPagar> ArrayConta = new ArrayList<>();
        
        ArrayConta = cpdao.SelectAll();
        
        JFrame Frame = new JFrame();
        Frame.setBounds(380,120,500,300);
        Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        DefaultTableModel Model = new DefaultTableModel();
        
        JPanel Painel = new JPanel();
        Painel.setLayout(new FlowLayout());
        
        Model.addColumn("Código");
        Model.addColumn("Descrição Conta");
        Model.addColumn("Preço");
        Model.addColumn("Data Vencimento");
        Model.addColumn("Data Pagamento");
        Model.addColumn("Fornecedor");
        Model.addColumn("Categoria");
        Model.addColumn("Status Pagamento");
        Model.addColumn("Método Pagamento");
        Model.addColumn(("Observação"));
        
        boolean Parar = true;
        int i = 0;
        
        while(Parar){
            if(i<ArrayConta.size()){
                Model.addRow(new Object[]{ArrayConta.get(i).getCodContaPagar(),ArrayConta.get(i).getDescricaoConta(),
                ArrayConta.get(i).getPreco(),ArrayConta.get(i).getDataVencimento(),ArrayConta.get(i).getDataPagamento(),
                ArrayConta.get(i).getFornecedor(),ArrayConta.get(i).getCategoria(),ArrayConta.get(i).getStatusPag(),
                ArrayConta.get(i).getMetodoPag(),ArrayConta.get(i).getObservacao()});
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
    