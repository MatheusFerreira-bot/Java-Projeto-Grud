package Fornecedor;

import ClassesEspeciais.DAO;
import java.util.ArrayList;

public class FornecedorCtrl implements DAO {

    @Override
    public void insert(Object o) {
        FornecedorDAO fd = new FornecedorDAO();
        fd.insert(o);
    }

    @Override
    public void update(Object o) {
        FornecedorDAO fd = new FornecedorDAO();
        fd.update(o);
    }

    @Override
    public void delete(int cod) {
        FornecedorDAO fd = new FornecedorDAO();
        fd.delete(cod);
    }
    
    public void SelectAll(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaFornecedor().ExibirFornecedor();
            }
        });
    }

}
