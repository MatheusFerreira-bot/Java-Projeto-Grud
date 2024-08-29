/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

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
public class ClienteDAO implements DAO{

    @Override
    public void insert(Object o) {
        Cliente c = (Cliente) o;
        String sql = "insert into cliente(Nome,CPF,Endereco,Telefone,Email,DataNascimento,Sexo,EstadoCivil,Profissao)"
            + "values(?,?,?,?,?,?,?,?,?);";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, c.getNome());
            ps.setLong(2,c.getCPF());
            ps.setString(3, c.getEndereco());
            ps.setLong(4, c.getTelefone());
            ps.setString(5, c.getEmail());
            ps.setString(6, c.getDataNascimento());
            ps.setString(7, c.getSexo());
            ps.setString(8, c.getEstadoCivil());
            ps.setString(9, c.getProfissao());
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
        Cliente c = (Cliente) o;
        String sql = "update cliente set Nome=?, CPF=?, Endereco=?, Telefone=?, Email=?, DataNascimento=?, Sexo=?,"
                + "EstadoCivil=?, Profissao=? where CodCliente=?";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, c.getNome());
            ps.setLong(2,c.getCPF());
            ps.setString(3, c.getEndereco());
            ps.setLong(4, c.getTelefone());
            ps.setString(5, c.getEmail());
            ps.setString(6, c.getDataNascimento());
            ps.setString(7, c.getSexo());
            ps.setString(8, c.getEstadoCivil());
            ps.setString(9, c.getProfissao());
            ps.setInt(10, c.getCodCliente());
            int Atual = ps.executeUpdate();
                if (Atual > 0){
                    JOptionPane.showMessageDialog(null,"Dados atualizados com sucesso!");
                }else{
                    JOptionPane.showMessageDialog(null,"Erro de atualização!");
                }
            ps.close();    
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void delete(int cod) {
        String sql = "delete from cliente where CodCliente=?";
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

    public ArrayList<Cliente> SelectAll(){
        ArrayList<Cliente> ArrayCliente = new ArrayList<>();
        String sql = "select * from cliente";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Cliente c = new Cliente();
                c.setCodCliente(rs.getInt("CodCliente"));
                c.setNome(rs.getString("Nome"));
                c.setCPF(rs.getLong("CPF"));
                c.setEndereco(rs.getString("Endereco"));
                c.setTelefone(rs.getLong("Telefone"));
                c.setEmail(rs.getString("Email"));
                c.setDataNascimento(rs.getString("DataNascimento"));
                c.setSexo(rs.getString("Sexo"));
                c.setEstadoCivil(rs.getString("EstadoCivil"));
                c.setProfissao(rs.getString("Profissao"));
                ArrayCliente.add(c);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
        }
        return ArrayCliente;
    }
    
}