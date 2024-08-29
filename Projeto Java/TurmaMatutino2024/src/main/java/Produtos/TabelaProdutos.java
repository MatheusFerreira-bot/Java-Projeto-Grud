package Produtos;

import Livros.Livros;
import Livros.LivrosDAO;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TabelaProdutos {
    public static ProdutosDAO pdao = new ProdutosDAO();
    
    public void ExibirProduto() {
        ArrayList<Produtos> ArrayProd = new ArrayList<>();
        
        ArrayProd = pdao.SelectAll();
        
        JFrame Frame = new JFrame();
        Frame.setBounds(380,120,500,300);
        Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        DefaultTableModel Model = new DefaultTableModel();
        
        JPanel Painel = new JPanel();
        Painel.setLayout(new FlowLayout());
        
        Model.addColumn("Código");
        Model.addColumn("Nome Produto");
        Model.addColumn("Codigo Produto");
        Model.addColumn("Descrição");
        Model.addColumn("Preço");
        Model.addColumn("Quantidade em Estoque");
        Model.addColumn("Categoria");
        Model.addColumn("Data Validade");
        Model.addColumn("Fornecedor");
        Model.addColumn(("Localizão no Estoque"));
        
        boolean Parar = true;
        int i = 0;
        
        while(Parar){
            if(i<ArrayProd.size()){
                Model.addRow(new Object[]{ArrayProd.get(i).getCodProduto(),ArrayProd.get(i).getNomeProduto(),
                ArrayProd.get(i).getCodigoProduto(),ArrayProd.get(i).getDescricao(),ArrayProd.get(i).getPreco(),
                ArrayProd.get(i).getQuantidadeEstoque(),ArrayProd.get(i).getCategoria(),ArrayProd.get(i).getDataValidade(),
                ArrayProd.get(i).getFornecedor(),ArrayProd.get(i).getLocEstoque()});
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