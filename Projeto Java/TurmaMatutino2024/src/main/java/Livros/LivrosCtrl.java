package Livros;

import ClassesEspeciais.DAO;
import java.util.ArrayList;

public class LivrosCtrl implements DAO{

    @Override
    public void insert(Object o) {
        LivrosDAO ld = new LivrosDAO();
        ld.insert(o);
    }

    @Override
    public void update(Object o) {
        LivrosDAO ld = new LivrosDAO();
        ld.update(o);
    }

    @Override
    public void delete(int cod) {
        LivrosDAO ld = new LivrosDAO();
        ld.delete(cod);
    }
    
    public void SelectAll(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaLivros().ExibirLivros();
            }
        });
    }
    
}
