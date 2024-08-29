package Livros;

import ClassesEspeciais.Conexao;
import ClassesEspeciais.DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LivrosDAO implements DAO {

    @Override
    public void insert(Object o) {
        Livros l = (Livros) o;
        String sql = "insert into livros(Titulo,Autor,ISBN,Editora,AnoPub,Genero,NumPag,Idioma,LocBiblioteca)"
                + "values(?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, l.getTitulo());
            ps.setString(2, l.getAutor());
            ps.setLong(3, l.getISBN());
            ps.setString(4, l.getEditora());
            ps.setString(5, l.getAnoPub());
            ps.setString(6, l.getGenero());
            ps.setInt(7, l.getNumPag());
            ps.setString(8, l.getIdioma());
            ps.setString(9, l.getLocBiblioteca());
            int Atual = ps.executeUpdate();
                if (Atual > 0) {
                    JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso!");
                }else{
                    JOptionPane.showMessageDialog(null,"Erro de inserção!");
                }
            ps.close();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void update(Object o) {
        Livros l = (Livros) o;
        String sql = "update livros set Titulo=?, Autor=?, ISBN=?, Editora=?, AnoPub=?, Genero=?, NumPag=?, Idioma=?,"
                + "LocBiblioteca=? where CodLivros=?";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, l.getTitulo());
            ps.setString(2, l.getAutor());
            ps.setLong(3, l.getISBN());
            ps.setString(4, l.getEditora());
            ps.setString(5, l.getAnoPub());
            ps.setString(6, l.getGenero());
            ps.setInt(7, l.getNumPag());
            ps.setString(8, l.getIdioma());
            ps.setString(9, l.getLocBiblioteca());
            ps.setInt(10, l.getCodLivros());
            int Atual = ps.executeUpdate();
                if (Atual > 0){
                    JOptionPane.showMessageDialog(null,"Dados atualizados com sucesso.");
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
        String sql = "delete from livros where CodLivros=?";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, cod);
            int Atual = ps.executeUpdate();
                if (Atual > 0){
                    JOptionPane.showMessageDialog(null,"Excluido com sucesso!");
                }else{
                    JOptionPane.showMessageDialog(null,"Não houve exclusão.");
                }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public ArrayList<Livros> SelectAll(){
        ArrayList<Livros> ArrayLivros = new ArrayList<>();
        String sql = "select * from livros";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Livros l = new Livros();
                l.setCodLivros(rs.getInt("CodLivros"));
                l.setTitulo(rs.getString("Titulo"));
                l.setAutor(rs.getString("Autor"));
                l.setISBN(rs.getInt("ISBN"));
                l.setEditora(rs.getString("Editora"));
                l.setAnoPub(rs.getString("AnoPub"));
                l.setGenero(rs.getString("Genero"));
                l.setNumPag(rs.getInt("NumPag"));
                l.setIdioma(rs.getString("Idioma"));
                l.setLocBiblioteca(rs.getString("LocBiblioteca"));
                ArrayLivros.add(l);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
        }
        return ArrayLivros;
    }
    
}