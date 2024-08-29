/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alunos;

import ClassesEspeciais.DAO;
import java.util.ArrayList;

/**
 *
 * @author Senac
 */

public class AlunosCtrl implements DAO{

    @Override
    public void insert(Object o) {
        AlunosDAO ad = new AlunosDAO();
        ad.insert(o);
    }

    @Override
    public void update(Object o) {
        AlunosDAO ad = new AlunosDAO();
        ad.update(o);
    }

    @Override
    public void delete(int cod) {
        AlunosDAO ad = new AlunosDAO();
        ad.delete(cod);
    }
    
    public void SelectAll(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaAlunos().ExibirTabelaAluno();
            }
        });
    }
    
}
