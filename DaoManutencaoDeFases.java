package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ManutencaoDeFases;

public class DaoManutencaoDeFases {
    
    private DataSource dataSource;
    
    public DaoManutencaoDeFases(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public ArrayList<ManutencaoDeFases> consulta() {
        PreparedStatement ps = null;
        
        try {
            // ATENÇÃO: Confirme o nome exato da tabela no seu banco (sem cedilha, ex: MANUTENCAO_FASES)
            String SQL = "SELECT * FROM MANUTENCAO_FASES";
            
            ps = dataSource.getConnection().prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            
            ArrayList<ManutencaoDeFases> lista = new ArrayList<ManutencaoDeFases>();
            
            while (rs.next()) {
                ManutencaoDeFases fase = new ManutencaoDeFases();
                
                // Confirme se os nomes entre aspas são idênticos às colunas do seu banco
                fase.setIdFase(rs.getInt("id_fase"));
                fase.setIdObra(rs.getInt("id_obra"));
                fase.setNomeFase(rs.getString("nome_fase"));
                fase.setDescricao(rs.getString("descricao"));
                fase.setDataInicio(rs.getString("data_inicio"));
                fase.setDataFim(rs.getString("data_fim"));
                fase.setStatusFase(rs.getString("status_fase"));
                
                lista.add(fase);
            }
            
            ps.close();
            dataSource.closeDataSource();
            
            return lista;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO na conexão: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO geral: " + ex.getMessage());
        }
        return null;
    }

    public ArrayList<ManutencaoDeFases> seleciona(String nomeFase) {
        PreparedStatement ps = null;
        
        try {
            String SQL = "SELECT * FROM MANUTENCAO_FASES WHERE (nome_fase LIKE ?)";
            
            ps = dataSource.getConnection().prepareStatement(SQL);
            ps.setString(1, "%" + nomeFase + "%");
            
            ResultSet rs = ps.executeQuery();
            ArrayList<ManutencaoDeFases> lista = new ArrayList<ManutencaoDeFases>();
            
            while (rs.next()) {
                ManutencaoDeFases fase = new ManutencaoDeFases();
                
                fase.setIdFase(rs.getInt("id_fase"));
                fase.setIdObra(rs.getInt("id_obra"));
                fase.setNomeFase(rs.getString("nome_fase"));
                fase.setDescricao(rs.getString("descricao"));
                fase.setDataInicio(rs.getString("data_inicio"));
                fase.setDataFim(rs.getString("data_fim"));
                fase.setStatusFase(rs.getString("status_fase"));
                
                lista.add(fase);
            }
            
            ps.close();
            dataSource.closeDataSource();
            
            return lista;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO na conexão: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO geral: " + ex.getMessage());
        }
        return null;
    }

    public void incluir(ManutencaoDeFases fase) {
        Connection con = dataSource.getConnection();
        PreparedStatement ps = null;
        
        try {
            // Assumindo que id_fase é AUTO_INCREMENT no banco, não o colocamos no INSERT
            String SQL = "INSERT INTO MANUTENCAO_FASES "
                       + "(id_obra, nome_fase, descricao, data_inicio, data_fim, status_fase) "
                       + "VALUES (?,?,?,?,?,?)";
            
            ps = con.prepareStatement(SQL);
            ps.setInt(1, fase.getIdObra());
            ps.setString(2, fase.getNomeFase());
            ps.setString(3, fase.getDescricao());
            ps.setString(4, fase.getDataInicio());
            ps.setString(5, fase.getDataFim());
            ps.setString(6, fase.getStatusFase());
            
            ps.executeUpdate();
            ps.close();
            
            JOptionPane.showMessageDialog(null, "Fase salva com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar fase!\n" + ex);
        } finally {
            dataSource.closeDataSource();
        }
    }

    public void alterar(ManutencaoDeFases fase) {
        Connection con = dataSource.getConnection();
        PreparedStatement ps = null;
        
        try {
            String SQL = "UPDATE MANUTENCAO_FASES "
                       + "SET id_obra=?, nome_fase=?, descricao=?, data_inicio=?, data_fim=?, status_fase=? "
                       + "WHERE id_fase=?";
            
            ps = con.prepareStatement(SQL);
            ps.setInt(1, fase.getIdObra());
            ps.setString(2, fase.getNomeFase());
            ps.setString(3, fase.getDescricao());
            ps.setString(4, fase.getDataInicio());
            ps.setString(5, fase.getDataFim());
            ps.setString(6, fase.getStatusFase());
            ps.setInt(7, fase.getIdFase());
            
            ps.executeUpdate();
            ps.close();
            
            JOptionPane.showMessageDialog(null, "Fase alterada com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar fase!\n" + ex);
        } finally {
            dataSource.closeDataSource();
        }
    }

    public void excluir(int idFase) {
        Connection con = dataSource.getConnection();
        PreparedStatement ps = null;
        
        try {
            String SQL = "DELETE FROM MANUTENCAO_FASES WHERE (id_fase=?)";
            
            ps = con.prepareStatement(SQL);
            ps.setInt(1, idFase);
            
            ps.executeUpdate();
            ps.close();
            
            JOptionPane.showMessageDialog(null, "Fase excluída com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir fase!\n" + ex);
        } finally {
            dataSource.closeDataSource();
        }
    }
}