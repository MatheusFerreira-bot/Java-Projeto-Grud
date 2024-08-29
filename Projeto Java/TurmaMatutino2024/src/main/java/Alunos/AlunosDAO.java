/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alunos;

import ClassesEspeciais.Conexao;
import ClassesEspeciais.DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Senac
 */
public class AlunosDAO implements DAO{

    @Override
    public void insert(Object o) {
        Alunos a = (Alunos) o;
        String sql = "insert into alunos(Nome,CPF,Endereco,Telefone,Email,DataNasc,SerieAno,NomeResponsavel,EscolaOrigem)"
                + "values(?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, a.getNome());
            ps.setLong(2, a.getCPF());
            ps.setString(3, a.getEndereco());
            ps.setLong(4, a.getTelefone());
            ps.setString(5, a.getEmail());
            ps.setString(6, a.getDataNasc());
            ps.setInt(7, a.getSerieAno());
            ps.setString(8, a.getNomeResponsavel());
            ps.setString(9, a.getEscolaOrigem());
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
        Alunos a = (Alunos) o;
        String sql = "update alunos set Nome=?, CPF=?, Endereco=?, Telefone=?, Email=?, DataNasc=?, SerieAno=?, "
                + "NomeResponsavel=?, EscolaOrigem=? where CodAlunos=?";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, a.getNome());
            ps.setLong(2, a.getCPF());
            ps.setString(3, a.getEndereco());
            ps.setLong(4, a.getTelefone());
            ps.setString(5, a.getEmail());
            ps.setString(6, a.getDataNasc());
            ps.setInt(7, a.getSerieAno());
            ps.setString(8, a.getNomeResponsavel());
            ps.setString(9, a.getEscolaOrigem()); 
            ps.setInt(10, a.getCodAlunos());
            int Atual = ps.executeUpdate();
                if(Atual > 0){
                    JOptionPane.showMessageDialog(null,"Dados atualizados com sucesso!");
                }else{
                    JOptionPane.showMessageDialog(null,"Erro de atualização!");
                }
            ps.close();
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void delete(int cod) {
        String sql = "delete from alunos where CodAlunos=?";
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
    
    public ArrayList<Alunos> SelectAll() {
        ArrayList<Alunos> ArrayA = new ArrayList<>();
        String sql = "select * from alunos";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Alunos a = new Alunos();
                a.setCodAlunos(rs.getInt("CodAlunos"));
                a.setNome(rs.getString("Nome"));
                a.setEndereco(rs.getString("Endereco"));
                a.setTelefone(rs.getLong("Telefone"));
                a.setEmail(rs.getString("Email"));
                a.setDataNasc(rs.getString("DataNasc"));
                a.setSerieAno(rs.getInt("SerieAno"));
                a.setNomeResponsavel(rs.getString("NomeResponsavel"));
                a.setEscolaOrigem(rs.getString("EscolaOrigem"));
                ArrayA.add(a);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
        }
        return ArrayA;
    }
    
}