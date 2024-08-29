package Cliente;

import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TabelaCliente {
    public static ClienteDAO cd = new ClienteDAO();
    
    public void ExibirCliente() {
        ArrayList<Cliente> ArrayCliente = new ArrayList<>();
        
        ArrayCliente = cd.SelectAll();
        
        JFrame Frame = new JFrame();
        Frame.setBounds(380,120,500,300);
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
        Model.addColumn("Sexo");
        Model.addColumn("Estado Civil");
        Model.addColumn(("Profissão"));
        
        boolean Parar = true;
        int i = 0;
        
        while(Parar){
            if(i<ArrayCliente.size()){
                Model.addRow(new Object[]{ArrayCliente.get(i).getCodCliente(),ArrayCliente.get(i).getNome(),
                ArrayCliente.get(i).getCPF(),ArrayCliente.get(i).getEndereco(),ArrayCliente.get(i).getTelefone(),
                ArrayCliente.get(i).getEmail(),ArrayCliente.get(i).getDataNascimento(),ArrayCliente.get(i).getSexo(),
                ArrayCliente.get(i).getEstadoCivil(),ArrayCliente.get(i).getProfissao()});
                i++;
            }else{
                Parar = false;
            }
        }
        
        JTable Tabela = new JTable(Model);
        JScrollPane Scroll = new JScrollPane(Tabela);
        Painel.add(Scroll);
        Frame.add(Painel);
        Frame.setVisible(true);
        
    }
}
