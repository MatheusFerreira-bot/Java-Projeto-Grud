/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veiculo;

import Produtos.Produtos;
import Produtos.ProdutosDAO;
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
public class TabelaVeiculo {
    public static VeiculoDAO vdao = new VeiculoDAO();
    
    public void ExibirVeiculo() {
        ArrayList<Veiculo> ArrayVeiculo = new ArrayList<>();
        
        ArrayVeiculo = vdao.SelectAll();
        
        JFrame Frame = new JFrame();
        Frame.setBounds(380,120,500,300);
        Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        DefaultTableModel Model = new DefaultTableModel();
        
        JPanel Painel = new JPanel();
        Painel.setLayout(new FlowLayout());
        
        Model.addColumn("Código");
        Model.addColumn("Placa Veiculo");
        Model.addColumn("Marca");
        Model.addColumn("Modelo");
        Model.addColumn("Ano Fabricação");
        Model.addColumn("Cor");
        Model.addColumn("Tipo Combustivel");
        Model.addColumn("Número Chassi");
        Model.addColumn("Quilometragem");
        Model.addColumn(("Data Revisão"));
        
        boolean Parar = true;
        int i = 0;
        
        while(Parar){
            if(i<ArrayVeiculo.size()){
                Model.addRow(new Object[]{ArrayVeiculo.get(i).getCodVeiculo(),ArrayVeiculo.get(i).getPlacaVeiculo(),
                ArrayVeiculo.get(i).getMarca(),ArrayVeiculo.get(i).getModelo(),ArrayVeiculo.get(i).getAnoFabricacao(),
                ArrayVeiculo.get(i).getCor(),ArrayVeiculo.get(i).getTipoCombustivel(),ArrayVeiculo.get(i).getNumeroChassi(),
                ArrayVeiculo.get(i).getQuilometragem(),ArrayVeiculo.get(i).getDataRevisao()});
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
