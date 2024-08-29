package Veiculo;

import ClassesEspeciais.DAO;
import java.util.ArrayList;

public class VeiculoCtrl implements DAO {

    @Override
    public void insert(Object o) {
        VeiculoDAO vd = new VeiculoDAO();
        vd.insert(o);
    }

    @Override
    public void update(Object o) {
        VeiculoDAO vd = new VeiculoDAO();
        vd.update(o);
    }

    @Override
    public void delete(int cod) {
        VeiculoDAO vd = new VeiculoDAO();
        vd.delete(cod);
    }
    
    public void SelectAll(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaVeiculo().ExibirVeiculo();
            }
        });
    }
}
