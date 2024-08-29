package ClassesEspeciais;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {
    public static final String URL = "jdbc:mysql://localhost:3306/objetos";
    public static final String USER = "root";
    public static final String PASSWORD = "";
    public static final String CLASS_FOR_NAME = "com.mysql.cj.jdbc.Driver";
    public static Connection Conexao;
    
    public static Connection getConexao(){
        try{
            Class.forName(CLASS_FOR_NAME);
            Conexao = DriverManager.getConnection(URL,USER,PASSWORD);
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex,"Error",JOptionPane.ERROR_MESSAGE);
        }
    return Conexao;    
    }
    
    public static void FecharConexao(){
        if (Conexao == null) {
            try{
                Conexao.close();
            }catch (SQLException e){
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }
}