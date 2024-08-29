package Alunos;

import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TabelaAlunos {
    public static AlunosDAO ad = new AlunosDAO();
    
        
    
    public void ExibirTabelaAluno() {
        ArrayList<Alunos> ArrayA = new ArrayList<>();
        
        ArrayA = ad.SelectAll();
        
        JFrame Frame = new JFrame();
        Frame.setBounds(380,120,500,500);
        Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        DefaultTableModel Model = new DefaultTableModel();
        
        JPanel Painel = new JPanel();
        Painel.setLayout(new FlowLayout());
        
        Model.addColumn("Código");
        Model.addColumn("Nome");
        Model.addColumn("CPF");
        Model.addColumn("Endereço");
        Model.addColumn("Telefone");
        Model.addColumn("Email");
        Model.addColumn("Data Nascimento");
        Model.addColumn("Série/Ano");
        Model.addColumn("Nome Responsável");
        Model.addColumn("Escola Origem");
        
        boolean Parar = true;
        int i = 0;
        
        while(Parar){
            if(i<ArrayA.size()){
                Alunos a = new Alunos();
                Model.addRow(new Object[]{ArrayA.get(i).getCodAlunos(),ArrayA.get(i).getNome(),
                ArrayA.get(i).getCPF(),ArrayA.get(i).getEndereco(),ArrayA.get(i).getTelefone(),
                ArrayA.get(i).getEmail(),ArrayA.get(i).getDataNasc(),ArrayA.get(i).getSerieAno(),
                ArrayA.get(i).getNomeResponsavel(),ArrayA.get(i).getEscolaOrigem()});
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
