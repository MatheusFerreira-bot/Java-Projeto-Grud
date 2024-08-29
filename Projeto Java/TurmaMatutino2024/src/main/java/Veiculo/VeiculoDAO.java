/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veiculo;

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
public class VeiculoDAO implements DAO {

    @Override 
    public void insert(Object o) {
        Veiculo v = (Veiculo) o;
        String sql = "insert into veiculo(PlacaVeiculo,Marca,Modelo,AnoFabricacao,Cor,TipoCombustivel,NumeroChassi,Quilometragem,DataRevisao)"
                + "values(?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, v.getPlacaVeiculo());
            ps.setString(2, v.getMarca());
            ps.setString(3, v.getModelo());
            ps.setInt(4, v.getAnoFabricacao());
            ps.setString(5, v.getCor());
            ps.setString(6, v.getTipoCombustivel());
            ps.setObject(7, v.getNumeroChassi());
            ps.setFloat(8, v.getQuilometragem());
            ps.setString(9, v.getDataRevisao());
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
        Veiculo v = (Veiculo) o;
        String sql = "update veiculo set PlacaVeiculo=?, Marca=?, Modelo=?, AnoFabricacao=?, Cor=?, TipoCombustivel=?,"
                + "NumeroChassi=?, Quilometragem=?, DataRevisao=? where CodVeiculo=?";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, v.getPlacaVeiculo());
            ps.setString(2, v.getMarca());
            ps.setString(3, v.getModelo());
            ps.setInt(4, v.getAnoFabricacao());
            ps.setString(5, v.getCor());
            ps.setString(6, v.getTipoCombustivel());
            ps.setObject(7, v.getNumeroChassi());
            ps.setFloat(8, v.getQuilometragem());
            ps.setString(9, v.getDataRevisao());
            ps.setInt(10, v.getCodVeiculo());
            int Atual = ps.executeUpdate();
                if (Atual > 0) {
                    JOptionPane.showMessageDialog(null,"Dados atualizados com sucesso!");
                }else{
                    JOptionPane.showMessageDialog(null,"Erro de atualização!");
                }
            ps.close();
            }catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void delete(int cod) {
        String sql = "delete from veiculo where CodVeiculo=?";
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
    
    public ArrayList<Veiculo> SelectAll(){
        ArrayList<Veiculo> ArrayVeiculo = new ArrayList<>();
        String sql = "select * from veiculo";
        try{
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Veiculo v = new Veiculo();
                v.setCodVeiculo(rs.getInt("CodVeiculo"));
                v.setPlacaVeiculo(rs.getString("PlacaVeiculo"));
                v.setMarca(rs.getString("Marca"));
                v.setModelo(rs.getString("Modelo"));
                v.setAnoFabricacao(rs.getInt("AnoFabricacao"));
                v.setCor(rs.getString("Cor"));
                v.setTipoCombustivel(rs.getString("TipoCombustivel"));
                v.setNumeroChassi(rs.getInt("NumeroChassi"));
                v.setQuilometragem(rs.getInt("Quilometragem"));
                v.setDataRevisao(rs.getString("DataRevisao"));
                ArrayVeiculo.add(v);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.ERROR_MESSAGE);
        }
        return ArrayVeiculo;
    }
    
}
