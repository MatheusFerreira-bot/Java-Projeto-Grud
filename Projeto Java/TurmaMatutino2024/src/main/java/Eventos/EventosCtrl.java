package Eventos;

import ClassesEspeciais.DAO;
import java.util.ArrayList;

public class EventosCtrl implements DAO {

    @Override
    public void insert(Object o) {
        EventosDAO ed = new EventosDAO();
        ed.insert(o);
    }

    @Override
    public void update(Object o) {
        EventosDAO ed = new EventosDAO();
        ed.update(o);
    }

    @Override
    public void delete(int cod) {
        EventosDAO ed = new EventosDAO();
        ed.delete(cod);
    }

    public void SelectAll(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaEventos().ExibirEventos();
            }
        });
    }
}
