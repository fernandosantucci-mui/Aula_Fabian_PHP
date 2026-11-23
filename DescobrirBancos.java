package dao; // Use o pacote onde criar o ficheiro

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DescobrirBancos {
    public static void main(String[] args) {
        // Repare que NÃO colocamos o nome da base de dados no final da URL
        String url = "jdbc:mysql://192.168.20.5:3306/?userTimezone=true&serverTimezone=UTC";
        
        try {
            // Faz a ligação genérica ao servidor
            Connection conn = DriverManager.getConnection(url, "root", "12345");
            Statement stmt = conn.createStatement();
            
            // Pergunta ao MySQL quais as bases de dados existentes
            ResultSet rs = stmt.executeQuery("SHOW DATABASES;");
            
            System.out.println("=== BASES DE DADOS NO SERVIDOR 192.168.20.5 ===");
            while (rs.next()) {
                System.out.println("-> " + rs.getString(1));
            }
            System.out.println("===============================================");
            
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}