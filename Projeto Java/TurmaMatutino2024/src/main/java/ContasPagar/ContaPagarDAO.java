package ContasPagar;

import ClassesEspeciais.Conexao;
import ClassesEspeciais.DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ContaPagarDAO implements DAO {

    @Override
    public void insert(Object o) {
        ContaPagar cp = (ContaPagar) o;
        String sql = "insert into contapagar(DescricaoConta,Preco,DataVencimento,DataPagamento,Fornecedor,Categoria,StatusPag,MetodoPag,Observacao)"
                + "values(?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, cp.getDescricaoConta());
            ps.setFloat(2, cp.getPreco());
            ps.setString(3, cp.getDataVencimento());
            ps.setString(4, cp.getDataPagamento());
            ps.setString(5, cp.getFornecedor());
            ps.setString(6, cp.getCategoria());
            ps.setString(7, cp.getStatusPag());
            ps.setString(8, cp.getMetodoPag());
            ps.setString(9, cp.getObservacao());
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
        ContaPagar cp = (ContaPagar) o;
        String sql = "update contapagar set DescricaoConta=?, Preco=?, DataVencimento=?, DataPagamento=?, Fornecedor=?,"
                + "Categoria=?, StatusPag=?, MetodoPag=?, Observacao=? where CodContaPagar=?";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, cp.getDescricaoConta());
            ps.setFloat(2, cp.getPreco());
            ps.setString(3, cp.getDataVencimento());
            ps.setString(4, cp.getDataPagamento());
            ps.setString(5, cp.getFornecedor());
            ps.setString(6, cp.getCategoria());
            ps.setString(7, cp.getStatusPag());
            ps.setString(8, cp.getMetodoPag());
            ps.setString(9, cp.getObservacao());
            ps.setInt(10, cp.getCodContaPagar());
            int Atual = ps.executeUpdate();
                if (Atual > 0) {
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
        String sql = "delete from contapagar where CodContaPagar=?";
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
    
    public ArrayList<ContaPagar> SelectAll(){
        ArrayList<ContaPagar> ArrayConta = new ArrayList<>();
        String sql = "select * from contapagar";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ContaPagar cp = new ContaPagar();
                cp.setCodContaPagar(rs.getInt("CodContaPagar"));
                cp.setDescricaoConta(rs.getString("DescricaoConta"));
                cp.setPreco(rs.getFloat("Preco"));
                cp.setDataVencimento(rs.getString("DataVencimento"));
                cp.setDataPagamento(rs.getString("DataPagamento"));
                cp.setFornecedor(rs.getString("Fornecedor"));
                cp.setCategoria(rs.getString("Categoria"));
                cp.setStatusPag(rs.getString("StatusPag"));
                cp.setMetodoPag(rs.getString("MetodoPag"));
                cp.setObservacao(rs.getString("Observacao"));
                ArrayConta.add(cp);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
        }
        return ArrayConta;
    }
    
}
