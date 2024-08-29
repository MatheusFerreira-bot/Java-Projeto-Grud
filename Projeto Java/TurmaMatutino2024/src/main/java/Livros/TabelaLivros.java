package Livros;

import Funcionario.Funcionario;
import Funcionario.FuncionarioDAO;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TabelaLivros {
    public static LivrosDAO ldao = new LivrosDAO();
    
    public void ExibirLivros() {
        ArrayList<Livros> ArrayLivros = new ArrayList<>();
        
        ArrayLivros = ldao.SelectAll();
        
        JFrame Frame = new JFrame();
        Frame.setBounds(380,120,500,300);
        Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        DefaultTableModel Model = new DefaultTableModel();
        
        JPanel Painel = new JPanel();
        Painel.setLayout(new FlowLayout());
        
        Model.addColumn("Código");
        Model.addColumn("Título");
        Model.addColumn("Autor");
        Model.addColumn("ISBN");
        Model.addColumn("Editora");
        Model.addColumn("Ano de Publicação");
        Model.addColumn("Gênero");
        Model.addColumn("Número de Página");
        Model.addColumn("Idioma");
        Model.addColumn(("Local Biblioteca"));
        
        boolean Parar = true;
        int i = 0;
        
        while(Parar){
            if(i<ArrayLivros.size()){
                Model.addRow(new Object[]{ArrayLivros.get(i).getCodLivros(),ArrayLivros.get(i).getTitulo(),
                ArrayLivros.get(i).getAutor(),ArrayLivros.get(i).getISBN(),ArrayLivros.get(i).getEditora(),
                ArrayLivros.get(i).getAnoPub(),ArrayLivros.get(i).getGenero(),ArrayLivros.get(i).getNumPag(),
                ArrayLivros.get(i).getIdioma(),ArrayLivros.get(i).getLocBiblioteca()});
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