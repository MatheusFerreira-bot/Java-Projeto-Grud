/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContasPagar;

import ClassesEspeciais.DAO;
import java.util.ArrayList;

/**
 *
 * @author Senac
 */
public class ContaPagarCtrl implements DAO {

    @Override
    public void insert(Object o) {
        ContaPagarDAO cpd = new ContaPagarDAO();
        cpd.insert(o);
    }

    @Override
    public void update(Object o) {
        ContaPagarDAO cpd = new ContaPagarDAO();
        cpd.update(o);
    }

    @Override
    public void delete(int cod) {
        ContaPagarDAO cpd = new ContaPagarDAO();
        cpd.delete(cod);
    }

    public void SelectAll(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaContaPagar().ExibirConta();            }
        });
    }
}
