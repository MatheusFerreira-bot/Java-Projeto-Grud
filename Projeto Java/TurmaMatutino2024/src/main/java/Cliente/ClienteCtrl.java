package Cliente;

import ClassesEspeciais.DAO;
import java.util.ArrayList;

public class ClienteCtrl implements DAO{

    @Override
    public void insert(Object o) {
        ClienteDAO cd = new ClienteDAO();
        cd.insert(o);        
    }

    @Override
    public void update(Object o) {
        ClienteDAO cd = new ClienteDAO();
        cd.update(o);
    }

    @Override
    public void delete(int cod) {
        ClienteDAO cd = new ClienteDAO();
        cd.delete(cod);
    }
    
    public void SelectAll(){
      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaCliente().ExibirCliente();
            }
        });  
    }
}
