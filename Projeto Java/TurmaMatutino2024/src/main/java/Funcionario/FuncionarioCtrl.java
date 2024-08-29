package Funcionario;

import ClassesEspeciais.DAO;
import java.util.ArrayList;

public class FuncionarioCtrl implements DAO {

    @Override
    public void insert(Object o) {
        FuncionarioDAO fd = new FuncionarioDAO();
        fd.insert(o);
    }

    @Override
    public void update(Object o) {
        FuncionarioDAO fd = new FuncionarioDAO();
        fd.update(o);
    }

    @Override
    public void delete(int cod) {
        FuncionarioDAO fd = new FuncionarioDAO();
        fd.delete(cod);
    }
    
    public void SelectAll(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaFuncionario().ExibirFuncionario();
            }
        });
    }
}
