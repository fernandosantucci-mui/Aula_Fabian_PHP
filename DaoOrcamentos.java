package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Orcamentos;

public class DaoOrcamentos {
    
    private DataSource dataSource;
    
    public DaoOrcamentos(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public ArrayList<Orcamentos> consulta() {
        PreparedStatement ps = null;
        
        try {
            String SQL = "SELECT * FROM orcamentos";
            
            ps = dataSource.getConnection().prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            
            ArrayList<Orcamentos> lista = new ArrayList<>();
            
            while (rs.next()) {
                Orcamentos orc = new Orcamentos();
                
                orc.setIdOrcamento(rs.getInt("idOrcamento"));
                
                Date dtAprovacao = rs.getDate("dtAprovacao");
                if (dtAprovacao != null) {
                    orc.setDtAprovacao(dtAprovacao.toLocalDate());
                }
                
                orc.setIdEngenheiroResponsavel(rs.getInt("idEngenheiroResponsavel"));
                
                lista.add(orc);
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

    // Como não há mais coluna de descrição, a busca foi adaptada para filtrar pelo ID do Engenheiro Responsável
    public ArrayList<Orcamentos> selecionaPorEngenheiro(int idEngenheiro) {
        PreparedStatement ps = null;
        
        try {
            String SQL = "SELECT * FROM orcamentos WHERE idEngenheiroResponsavel = ?";
            
            ps = dataSource.getConnection().prepareStatement(SQL);
            ps.setInt(1, idEngenheiro);
            
            ResultSet rs = ps.executeQuery();
            ArrayList<Orcamentos> lista = new ArrayList<>();
            
            while (rs.next()) {
                Orcamentos orc = new Orcamentos();
                
                orc.setIdOrcamento(rs.getInt("idOrcamento"));
                
                Date dtAprovacao = rs.getDate("dtAprovacao");
                if (dtAprovacao != null) {
                    orc.setDtAprovacao(dtAprovacao.toLocalDate());
                }
                
                orc.setIdEngenheiroResponsavel(rs.getInt("idEngenheiroResponsavel"));
                
                lista.add(orc);
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

    public void incluir(Orcamentos orc) {
        Connection con = dataSource.getConnection();
        PreparedStatement ps = null;
        
        try {
            String SQL = "INSERT INTO orcamentos (dtAprovacao, idEngenheiroResponsavel) VALUES (?, ?)";
            
            ps = con.prepareStatement(SQL);
            
            // Trata o campo dtAprovacao caso ele venha nulo do objeto
            if (orc.getDtAprovacao() != null) {
                ps.setDate(1, Date.valueOf(orc.getDtAprovacao()));
            } else {
                ps.setNull(1, java.sql.Types.DATE);
            }
            
            ps.setInt(2, orc.getIdEngenheiroResponsavel());
            
            ps.executeUpdate();
            ps.close();
            
            JOptionPane.showMessageDialog(null, "Orçamento salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar orçamento!\n" + ex.getMessage());
        } finally {
            dataSource.closeDataSource();
        }
    }

    public void alterar(Orcamentos orc) {
        Connection con = dataSource.getConnection();
        PreparedStatement ps = null;
        
        try {
            String SQL = "UPDATE orcamentos SET dtAprovacao = ?, idEngenheiroResponsavel = ? WHERE idOrcamento = ?";
            
            ps = con.prepareStatement(SQL);
            
            if (orc.getDtAprovacao() != null) {
                ps.setDate(1, Date.valueOf(orc.getDtAprovacao()));
            } else {
                ps.setNull(1, java.sql.Types.DATE);
            }
            
            ps.setInt(2, orc.getIdEngenheiroResponsavel());
            ps.setInt(3, orc.getIdOrcamento());
            
            ps.executeUpdate();
            ps.close();
            
            JOptionPane.showMessageDialog(null, "Orçamento alterado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar orçamento!\n" + ex.getMessage());
        } finally {
            dataSource.closeDataSource();
        }
    }

    public void excluir(int idOrcamento) {
        Connection con = dataSource.getConnection();
        PreparedStatement ps = null;
        
        try {
            String SQL = "DELETE FROM orcamentos WHERE idOrcamento = ?";
            
            ps = con.prepareStatement(SQL);
            ps.setInt(1, idOrcamento);
            
            ps.executeUpdate();
            ps.close();
            
            JOptionPane.showMessageDialog(null, "Orçamento excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir orçamento!\n" + ex.getMessage());
        } finally {
            dataSource.closeDataSource();
        }
    }
}