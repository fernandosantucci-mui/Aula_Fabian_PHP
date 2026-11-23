package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Engenheiros;

public class DaoEngenheiros {
    
    private DataSource dataSource;
    
    public DaoEngenheiros(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    // Método auxiliar para converter data digitada (dd/MM/yyyy ou yyyy-MM-dd) para java.sql.Date
    private java.sql.Date converterData(String dataTexto) throws Exception {
        if (dataTexto.contains("/")) {
            java.util.Date dataUtil = new SimpleDateFormat("dd/MM/yyyy").parse(dataTexto);
            return new java.sql.Date(dataUtil.getTime());
        } else {
            return java.sql.Date.valueOf(dataTexto); // Formato yyyy-MM-dd
        }
    }

    public ArrayList<Engenheiros> consulta() {
        PreparedStatement ps = null;
        
        try {
            String SQL = "SELECT * FROM engenheiros";
            
            ps = dataSource.getConnection().prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            
            ArrayList<Engenheiros> lista = new ArrayList<Engenheiros>();
            
            while (rs.next()) {
                Engenheiros eng = new Engenheiros();
                
                eng.setIdEngenheiro(rs.getInt("idEngenheiro"));
                eng.setDsNome(rs.getString("dsNome"));
                eng.setNrCREA(rs.getString("nrCREA"));
                
                if (rs.getDate("dtAdmissao") != null) {
                    eng.setDtAdmissao(new SimpleDateFormat("dd/MM/yyyy").format(rs.getDate("dtAdmissao")));
                }
                
                lista.add(eng);
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

    public ArrayList<Engenheiros> seleciona(String nome) {
        PreparedStatement ps = null;
        
        try {
            String SQL = "SELECT * FROM engenheiros WHERE (dsNome LIKE ?)";
            
            ps = dataSource.getConnection().prepareStatement(SQL);
            ps.setString(1, "%" + nome + "%");
            
            ResultSet rs = ps.executeQuery();
            ArrayList<Engenheiros> lista = new ArrayList<Engenheiros>();
            
            while (rs.next()) {
                Engenheiros eng = new Engenheiros();
                
                eng.setIdEngenheiro(rs.getInt("idEngenheiro"));
                eng.setDsNome(rs.getString("dsNome"));
                eng.setNrCREA(rs.getString("nrCREA"));
                
                if (rs.getDate("dtAdmissao") != null) {
                    eng.setDtAdmissao(new SimpleDateFormat("dd/MM/yyyy").format(rs.getDate("dtAdmissao")));
                }
                
                lista.add(eng);
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

    public void incluir(Engenheiros eng) {
        Connection con = dataSource.getConnection();
        PreparedStatement ps = null;
        
        try {
            String SQL = "INSERT INTO engenheiros (dsNome, nrCREA, dtAdmissao) VALUES (?,?,?)";
            
            ps = con.prepareStatement(SQL);
            ps.setString(1, eng.getDsNome());
            ps.setString(2, eng.getNrCREA());
            ps.setDate(3, converterData(eng.getDtAdmissao()));
            
            ps.executeUpdate();
            ps.close();
            
            JOptionPane.showMessageDialog(null, "Engenheiro salvo com sucesso!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar! Verifique se a data está no formato DD/MM/AAAA.\n" + ex);
        } finally {
            dataSource.closeDataSource();
        }
    }

    public void alterar(Engenheiros eng) {
        Connection con = dataSource.getConnection();
        PreparedStatement ps = null;
        
        try {
            String SQL = "UPDATE engenheiros SET dsNome=?, dtAdmissao=? WHERE nrCREA=?";
            
            ps = con.prepareStatement(SQL);
            ps.setString(1, eng.getDsNome());
            ps.setDate(2, converterData(eng.getDtAdmissao()));
            ps.setString(3, eng.getNrCREA());
            
            ps.executeUpdate();
            ps.close();
            
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar! Verifique se a data está no formato DD/MM/AAAA.\n" + ex);
        } finally {
            dataSource.closeDataSource();
        }
    }

    public void excluir(String nrCREA) {
        Connection con = dataSource.getConnection();
        PreparedStatement ps = null;
        
        try {
            String SQL = "DELETE FROM engenheiros WHERE (nrCREA=?)";
            
            ps = con.prepareStatement(SQL);
            ps.setString(1, nrCREA);
            
            ps.executeUpdate();
            ps.close();
            
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!\n" + ex);
        } finally {
            dataSource.closeDataSource();
        }
    }

    public void excluir(Engenheiros eng) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}