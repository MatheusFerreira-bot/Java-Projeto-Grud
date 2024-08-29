package Funcionario;

import ClassesEspeciais.Conexao;
import ClassesEspeciais.DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FuncionarioDAO implements DAO{

    @Override
    public void insert(Object o) {
        Funcionario f = (Funcionario) o;
        String sql = "insert into funcionario(NomeCompleto,CPF,Endereco,Telefone,Email,DataAdmissao,Cargo,Salario,Departamento) values"
                + "(?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, f.getNomeCompleto());
            ps.setLong(2, f.getCPF());
            ps.setString(3, f.getEndereco());
            ps.setLong(4, f.getTelefone());
            ps.setString(5, f.getEmail());
            ps.setString(6, f.getDataAdmissao());
            ps.setString(7, f.getCargo());
            ps.setFloat(8, f.getSalario());
            ps.setString(9, f.getDepartamento());
            int Atual = ps.executeUpdate();
                if (Atual > 0) {
                    JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso!");
                }else{
                    JOptionPane.showMessageDialog(null,"Erro de inserção!");
                }
            ps.close();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void update(Object o) {
        Funcionario f = (Funcionario) o;
        String sql = "update funcionario set NomeCompleto=?, CPF=?, Endereco=?, Telefone=?, Email=?, DataAdmissao=?, Cargo=?,"
                + "Salario=?, Departamento=? where CodFuncionario=?";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, f.getNomeCompleto());
            ps.setLong(2, f.getCPF());
            ps.setString(3, f.getEndereco());
            ps.setLong(4, f.getTelefone());
            ps.setString(5, f.getEmail());
            ps.setString(6, f.getDataAdmissao());
            ps.setString(7, f.getCargo());
            ps.setFloat(8, f.getSalario());
            ps.setString(9, f.getDepartamento());
            ps.setInt(10, f.getCodFuncionario());
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
        String sql = "delete from funcionario where CodFuncionario=?";
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

    public ArrayList<Funcionario> SelectAll(){
        ArrayList<Funcionario> ArrayFunc = new ArrayList<>();
        String sql = "select * from funcionario";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Funcionario f = new Funcionario();
                f.setCodFuncionario(rs.getInt("CodFuncionario"));
                f.setNomeCompleto(rs.getString("NomeCompleto"));
                f.setCPF(rs.getLong("CPF"));
                f.setEndereco(rs.getString("Endereco"));
                f.setTelefone(rs.getInt("Telefone"));
                f.setEmail(rs.getString("Email"));
                f.setDataAdmissao(rs.getString("DataAdmissao"));
                f.setCargo(rs.getString("Cargo"));
                f.setSalario(rs.getFloat("Salario"));
                f.setDepartamento(rs.getString("Departamento"));
                ArrayFunc.add(f);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
        }
        return ArrayFunc;
    }
    
}