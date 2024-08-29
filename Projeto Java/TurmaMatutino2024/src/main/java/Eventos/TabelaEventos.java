/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eventos;

import ContasPagar.ContaPagar;
import ContasPagar.ContaPagarDAO;
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
public class TabelaEventos {
     public static EventosDAO edao = new EventosDAO();
    
    public void ExibirEventos() {
        ArrayList<Eventos> ArrayEventos = new ArrayList<>();
        
        ArrayEventos = edao.SelectAll();
        
        JFrame Frame = new JFrame();
        Frame.setBounds(380,120,500,300);
        Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        DefaultTableModel Model = new DefaultTableModel();
        
        JPanel Painel = new JPanel();
        Painel.setLayout(new FlowLayout());
        
        Model.addColumn("Código");
        Model.addColumn("Nome Evento");
        Model.addColumn("Data Evento");
        Model.addColumn("Horario Inicio");
        Model.addColumn("Horario Termino");
        Model.addColumn("Local Evento");
        Model.addColumn("Descrição");
        Model.addColumn("Público Alvo");
        Model.addColumn("Capacidade Máxima");
        Model.addColumn(("Organizador"));
        
        boolean Parar = true;
        int i = 0;
        
        while(Parar){
            if(i<ArrayEventos.size()){
                Model.addRow(new Object[]{ArrayEventos.get(i).getCodEventos(),ArrayEventos.get(i).getNomeEvento(),
                ArrayEventos.get(i).getDataEvento(),ArrayEventos.get(i).getHorarioInicio(),ArrayEventos.get(i).getHorarioTermino(),
                ArrayEventos.get(i).getLocalEvento(),ArrayEventos.get(i).getDescricao(),ArrayEventos.get(i).getPublico(),
                ArrayEventos.get(i).getCapacidadeMax(),ArrayEventos.get(i).getOrganizador()});
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