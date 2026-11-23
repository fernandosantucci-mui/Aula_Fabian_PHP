package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Obrasfases;

public class DaoObrasfases {
    
    private DataSource dataSource;
    
    public DaoObrasfases(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public ArrayList<Obrasfases> consulta() {
        PreparedStatement ps = null;
        
        try {
            String SQL = "SELECT * FROM obras_fases";
            
            ps = dataSource.getConnection().prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            
            ArrayList<Obrasfases> lista = new ArrayList<Obrasfases>();
            
            while (rs.next()) {
                Obrasfases obraFase = new Obrasfases();
                
                obraFase.setIdObra(rs.getInt("idObra"));
                obraFase.setIdFase(rs.getInt("idFase"));
                obraFase.setDtInicioFase(rs.getString("dtIniciofase"));
                obraFase.setDtTerminoFase(rs.getString("dtTerminoFase"));
                
                lista.add(obraFase);
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

    // Alterado para buscar pelas fases de uma Obra específica através do ID
    public ArrayList<Obrasfases> selecionaPorObra(int idObra) {
        PreparedStatement ps = null;
        
        try {
            String SQL = "SELECT * FROM obras_fases WHERE idObra = ?";
            
            ps = dataSource.getConnection().prepareStatement(SQL);
            ps.setInt(1, idObra);
            
            ResultSet rs = ps.executeQuery();
            ArrayList<Obrasfases> lista = new ArrayList<Obrasfases>();
            
            while (rs.next()) {
                Obrasfases obraFase = new Obrasfases();
                
                obraFase.setIdObra(rs.getInt("idObra"));
                obraFase.setIdFase(rs.getInt("idFase"));
                obraFase.setDtInicioFase(rs.getString("dtIniciofase"));
                obraFase.setDtTerminoFase(rs.getString("dtTerminoFase"));
                
                lista.add(obraFase);
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

    public void incluir(Obrasfases obraFase) {
        Connection con = dataSource.getConnection();
        PreparedStatement ps = null;
        
        try {
            String SQL = "INSERT INTO obras_fases (idObra, idFase, dtIniciofase, dtTerminoFase) VALUES (?,?,?,?)";
            
            ps = con.prepareStatement(SQL);
            ps.setInt(1, obraFase.getIdObra());
            ps.setInt(2, obraFase.getIdFase());
            ps.setString(3, obraFase.getDtInicioFase());
            ps.setString(4, obraFase.getDtTerminoFase());
            
            ps.executeUpdate();
            ps.close();
            
            JOptionPane.showMessageDialog(null, "Fase da obra vinculada com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao vincular fase!\n" + ex);
        } finally {
            dataSource.closeDataSource();
        }
    }

    public void alterar(Obrasfases obraFase) {
        Connection con = dataSource.getConnection();
        PreparedStatement ps = null;
        
        try {
            // Atualiza usando as DUAS chaves primárias
            String SQL = "UPDATE obras_fases SET dtIniciofase=?, dtTerminoFase=? WHERE idObra=? AND idFase=?";
            
            ps = con.prepareStatement(SQL);
            ps.setString(1, obraFase.getDtInicioFase());
            ps.setString(2, obraFase.getDtTerminoFase());
            ps.setInt(3, obraFase.getIdObra());
            ps.setInt(4, obraFase.getIdFase());
            
            ps.executeUpdate();
            ps.close();
            
            JOptionPane.showMessageDialog(null, "Fase da obra alterada com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar fase!\n" + ex);
        } finally {
            dataSource.closeDataSource();
        }
    }

    // Exclui precisando dos dois IDs (Obra e Fase) devido à chave primária composta
    public void excluir(int idObra, int idFase) {
        Connection con = dataSource.getConnection();
        PreparedStatement ps = null;
        
        try {
            String SQL = "DELETE FROM obras_fases WHERE idObra=? AND idFase=?";
            
            ps = con.prepareStatement(SQL);
            ps.setInt(1, idObra);
            ps.setInt(2, idFase);
            
            ps.executeUpdate();
            ps.close();
            
            JOptionPane.showMessageDialog(null, "Fase da obra excluída com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir fase!\n" + ex);
        } finally {
            dataSource.closeDataSource();
        }
    }
}