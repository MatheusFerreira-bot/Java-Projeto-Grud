package Fornecedor;

import ClassesEspeciais.Conexao;
import ClassesEspeciais.DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FornecedorDAO implements DAO {

    @Override
    public void insert(Object o) {
        Fornecedor f = (Fornecedor) o;
        String sql = "insert into fornecedor(NomeEmpresa,CNPJ,Endereco,Telefone,Email,NomeContato,Tipo,CondPagamento,PrazoEntrega) values"
                + "(?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, f.getNomeEmpresa());
            ps.setLong(2, f.getCNPJ());
            ps.setString(3, f.getEndereco());
            ps.setLong(4, f.getTelefone());
            ps.setString(5, f.getEmail());
            ps.setString(6, f.getNomeContato());
            ps.setString(7, f.getTipo());
            ps.setString(8, f.getCondPagamento());
            ps.setString(9, f.getPrazoEntrega());
            int Atual = ps.executeUpdate();
                if (Atual > 0) {
                    JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso!");
                }else{
                    JOptionPane.showMessageDialog(null,"Erro na inserção!");
                }
            ps.close();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void update(Object o) {
        Fornecedor f = (Fornecedor) o;
        String sql = "update fornecedor set NomeEmpresa=?, CNPJ=?, Endereco=?, Telefone=?, Email=?, NomeContato=?,"
                + "Tipo=?, CondPagamento=?, PrazoEntrega=? where CodFornecedor=?";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, f.getNomeEmpresa());
            ps.setLong(2, f.getCNPJ());
            ps.setString(3, f.getEndereco());
            ps.setLong(4, f.getTelefone());
            ps.setString(5, f.getEmail());
            ps.setString(6, f.getNomeContato());
            ps.setString(7, f.getTipo());
            ps.setString(8, f.getCondPagamento());
            ps.setString(9, f.getPrazoEntrega());
            ps.setInt(10, f.getCodFornecedor());
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
        String sql = "delete from fornecedor where CodFornecedor=?";
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
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    public ArrayList<Fornecedor> SelectAll(){
        ArrayList<Fornecedor> ArrayForn = new ArrayList<>();
        String sql = "select * from fornecedor";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Fornecedor f = new Fornecedor();
                f.setCodFornecedor(rs.getInt("CodFornecedor"));
                f.setNomeEmpresa(rs.getString("NomeEmpresa"));
                f.setCNPJ(rs.getLong("CNPJ"));
                f.setEndereco(rs.getString("Endereco"));
                f.setTelefone(rs.getInt("Telefone"));
                f.setEmail(rs.getString("Email"));
                f.setNomeContato(rs.getString("NomeContato"));
                f.setTipo(rs.getString("Tipo"));
                f.setCondPagamento(rs.getString("CondPagamento"));
                f.setPrazoEntrega(rs.getString("PrazoEntrega"));
                ArrayForn.add(f);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
        }
        return ArrayForn;
    }
    
}
