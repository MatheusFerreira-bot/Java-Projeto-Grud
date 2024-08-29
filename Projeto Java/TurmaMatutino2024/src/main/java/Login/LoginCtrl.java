/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

import ClassesEspeciais.DAO;

/**
 *
 * @author Senac
 */
public class LoginCtrl implements DAO {

    @Override
    public void insert(Object o) {
        LoginDAO ld = new LoginDAO();
        ld.insert(o);
    }

    @Override
    public void update(Object o) {
        LoginDAO ld = new LoginDAO();
        ld.update(o);
    }

    @Override
    public void delete(int cod) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void Logar(Login user){
        LoginDAO ld = new LoginDAO();
        ld.Logar(user);
    }
    
}
