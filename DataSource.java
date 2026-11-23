package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DataSource {

    private String hostname;
    private int porta;
    private String database;
    private String username;
    private String password;
    
    // Variável de conexão
    private Connection connection;
    
    // Construtor que abre a conexão
    public DataSource() {
        // Credenciais do banco (Servidor Externo)
        this.hostname = "192.168.20.5"; 
        this.porta = 3306;
        this.database = "balanca_mas_nao_cai";
        this.username = "root";
        this.password = "12345";
        
        // String de conexão atualizada com characterEncoding=UTF-8 para suportar acentos
        String url = "jdbc:mysql://" + hostname + ":" + porta + "/" + database 
                   + "?userTimezone=true&serverTimezone=UTC&connectTimeout=5000&characterEncoding=UTF-8";
        
        try {
            // Garante que o driver do MySQL 8 seja carregado antes da conexão
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Faz a conexão
            this.connection = DriverManager.getConnection(url, username, password);
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO: Driver JDBC do MySQL não encontrado:\n" + ex.getMessage(), "Erro de Driver", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            ex.printStackTrace();
            // A mensagem abaixo exibirá o motivo exato caso o servidor externo bloqueie o acesso
            JOptionPane.showMessageDialog(null, "ERRO na conexão com o banco:\n" + ex.getMessage(), "Erro de BD", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método estático para ser chamado pelas outras telas (ex: DataSource.conectar())
    public static Connection conectar() {
        DataSource banco = new DataSource();
        return banco.getConnection();
    }

    // Pega a conexão ativa
    public Connection getConnection() {
        return this.connection;
    }
    
    // Fecha a conexão
    public void closeDataSource() {
        if (this.connection != null) {
            try {
                this.connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "ERRO ao desconectar:\n" + ex.getMessage());
            }
        }
    }
}