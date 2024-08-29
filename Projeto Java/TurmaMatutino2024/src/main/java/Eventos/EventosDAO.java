package Eventos;

import ClassesEspeciais.Conexao;
import ClassesEspeciais.DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EventosDAO implements DAO{

    @Override
    public void insert(Object o) {
        Eventos e = (Eventos) o;
        String sql = "insert into eventos(NomeEvento,DataEvento,HorarioInicio,HorarioTermino,LocalEvento,Descricao,Publico,CapacidadeMax,Organizador)"
                + "values(?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, e.getNomeEvento());
            ps.setString(2, e.getDataEvento());
            ps.setString(3, e.getHorarioInicio());
            ps.setString(4, e.getHorarioTermino());
            ps.setString(5, e.getLocalEvento());
            ps.setString(6, e.getDescricao());
            ps.setString(7, e.getPublico());
            ps.setInt(8, e.getCapacidadeMax());
            ps.setString(9, e.getOrganizador());
            int Atual = ps.executeUpdate();
                if (Atual > 0) {
                    JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso!");
                }else{
                    JOptionPane.showMessageDialog(null,"Erro de inserção!");
                }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void update(Object o) {
        Eventos e = (Eventos) o;
        String sql = "update eventos set NomeEvento=?, DataEvento=?, HorarioInicio=?, HorarioTermino=?, LocalEvento=?, Descricao=?,"
                + "Publico=?, CapacidadeMax=?, Organizador=? where CodEventos=?";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, e.getNomeEvento());
            ps.setString(2, e.getDataEvento());
            ps.setString(3, e.getHorarioInicio());
            ps.setString(4, e.getHorarioTermino());
            ps.setString(5, e.getLocalEvento());
            ps.setString(6, e.getDescricao());
            ps.setString(7, e.getPublico());
            ps.setInt(8, e.getCapacidadeMax());
            ps.setString(9, e.getOrganizador());
            ps.setInt(10, e.getCodEventos());
            int Atual = ps.executeUpdate();
                if (Atual > 0){
                    JOptionPane.showMessageDialog(null,"Dados atualizados com sucesso!");
                }else{
                    JOptionPane.showMessageDialog(null,"Erro de atualização!");
                }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void delete(int cod) {
        String sql = "delete from eventos where CodEventos=?";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, cod);
            int Atual = ps.executeUpdate();
                if (Atual > 0){
                    JOptionPane.showMessageDialog(null,"Excluido com sucesso!");
                }else{
                    JOptionPane.showMessageDialog(null,"Não houve exclusão.");
                }
            ps.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    public ArrayList<Eventos> SelectAll(){
        ArrayList<Eventos> ArrayEventos = new ArrayList<>();
        String sql = "select * from eventos";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Eventos e = new Eventos();
                e.setCodEventos(rs.getInt("CodEventos"));
                e.setNomeEvento(rs.getString("NomeEvento"));
                e.setDataEvento(rs.getString("DataEvento"));
                e.setHorarioInicio(rs.getString("HorarioInicio"));
                e.setHorarioTermino(rs.getString("HorarioTermino"));
                e.setLocalEvento(rs.getString("LocalEvento"));
                e.setDescricao(rs.getString("Descricao"));
                e.setPublico(rs.getString("Publico"));
                e.setCapacidadeMax(rs.getInt("CapacidadeMax"));
                e.setOrganizador(rs.getString("Organizador"));
                ArrayEventos.add(e);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex,"Error",JOptionPane.ERROR_MESSAGE);
        }
        return ArrayEventos;
    }
    
}
