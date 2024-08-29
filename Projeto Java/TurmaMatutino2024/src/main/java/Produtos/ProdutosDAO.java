package Produtos;

import ClassesEspeciais.Conexao;
import ClassesEspeciais.DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProdutosDAO implements DAO{

    @Override
    public void insert(Object o) {
        Produtos p = (Produtos) o;
        String sql = "insert into produtos(NomeProduto,CodigoProduto,Descricao,Preco,QuantidadeEstoque,Categoria,DataValidade"
                + ",Fornecedor,LocEstoque) values(?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, p.getNomeProduto());
            ps.setString(2, p.getCodigoProduto());
            ps.setString(3, p.getDescricao());
            ps.setFloat(4, p.getPreco());
            ps.setFloat(5, p.getQuantidadeEstoque());
            ps.setString(6, p.getCategoria());
            ps.setString(7, p.getDataValidade());
            ps.setString(8, p.getFornecedor());
            ps.setString(9, p.getLocEstoque());
            int Atual = ps.executeUpdate();
                if (Atual > 0) {
                    JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso!");
                }else{
                    JOptionPane.showMessageDialog(null,"Erro de inserção!");
                }
            ps.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void update(Object o) {
        Produtos p = (Produtos) o;
                String sql = "update produtos set NomeProduto=?, CodigoProduto=?, Descricao=?, Preco=?, QuantidadeEstoque=?,"
                        + "Categoria=?, DataValidade=?, Fornecedor=?, LocEstoque=? where CodProduto=?";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, p.getNomeProduto());
            ps.setString(2, p.getCodigoProduto());
            ps.setString(3, p.getDescricao());
            ps.setFloat(4, p.getPreco());
            ps.setFloat(5, p.getQuantidadeEstoque());
            ps.setString(6, p.getCategoria());
            ps.setString(7, p.getDataValidade());
            ps.setString(8, p.getFornecedor());
            ps.setString(9, p.getLocEstoque());        
            ps.setInt(10, p.getCodProduto());
            int Atual = ps.executeUpdate();
                if (Atual > 0) {
                    JOptionPane.showMessageDialog(null,"Dados atualizados com sucesso.");
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
        String sql = "delete from produtos where CodProduto=?";
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
    
    public ArrayList<Produtos> SelectAll(){
        ArrayList<Produtos> ArrayProd = new ArrayList<>();
        String sql = "select * from produtos";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Produtos p = new Produtos();
                p.setCodProduto(rs.getInt("CodProduto"));
                p.setNomeProduto(rs.getString("NomeProduto"));
                p.setCodigoProduto(rs.getString("CodigoProduto"));
                p.setDescricao(rs.getString("Descricao"));
                p.setPreco(rs.getFloat("Preco"));
                p.setQuantidadeEstoque(rs.getInt("QuantidadeEstoque"));
                p.setCategoria(rs.getString("Categoria"));
                p.setDataValidade(rs.getString("DataValidade"));
                p.setFornecedor(rs.getString("Fornecedor"));
                p.setLocEstoque(rs.getString("LocEstoque"));
                ArrayProd.add(p);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
        }
        return ArrayProd;
    }
    
}
