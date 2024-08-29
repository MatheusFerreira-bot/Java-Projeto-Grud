package Login;

import ClassesEspeciais.Conexao;
import ClassesEspeciais.DAO;
import Principal.Principal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Senac
 */
public class LoginDAO implements DAO{

    @Override
    public void insert(Object o) {
        Login l = (Login) o;
        String sql = "insert into login(usuario,senha,status) values(?,?,?)";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, l.getUsuario());
            ps.setString(2, l.getSenha());
            ps.setString(3, l.getStatus());
            int Atual = ps.executeUpdate();
                if(Atual>0){
                    JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!");
                }else{
                    JOptionPane.showMessageDialog(null,"Erro de cadastro.");
                }
            ps.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void update(Object o) {
        Login l = (Login) o;
        String sql = "update login set usuario=?, senha=?, status=? where CodLogin=?";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, l.getUsuario());
            ps.setString(2, l.getSenha());
            ps.setString(3, l.getStatus());
            ps.setInt(4, l.getCodLogin());
            int Atual = ps.executeUpdate();
                if(Atual>0){
                    JOptionPane.showMessageDialog(null,"Atualizado com sucesso!");
                }else{
                    JOptionPane.showMessageDialog(null,"Erro de atualização.");
                }
            ps.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void delete(int cod) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void Logar(Login user){
        Login l = (Login) user;
        String sql = "select usuario, senha from login where usuario=? and senha=?";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, l.getUsuario());
            ps.setString(2, l.getSenha());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                Principal p = new Principal();
                p.MenuPrincipal();
            }else{
                JOptionPane.showMessageDialog(null,"Dados inválidos.");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
