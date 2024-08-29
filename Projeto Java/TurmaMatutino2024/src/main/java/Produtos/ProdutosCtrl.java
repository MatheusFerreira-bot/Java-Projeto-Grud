package Produtos;

import ClassesEspeciais.DAO;
import java.util.ArrayList;

public class ProdutosCtrl implements DAO{

    @Override
    public void insert(Object o) {
        ProdutosDAO pd = new ProdutosDAO();
        pd.insert(o);
    }

    @Override
    public void update(Object o) {
        ProdutosDAO pd = new ProdutosDAO();
        pd.update(o);        
    }

    @Override
    public void delete(int cod) {
        ProdutosDAO pd = new ProdutosDAO();
        pd.delete(cod);
    }
    
    public void SelectAll(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaProdutos().ExibirProduto();
            }
        });
    }
    
}
