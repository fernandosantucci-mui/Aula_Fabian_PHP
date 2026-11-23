package View;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import dao.DataSource;


public class Inicio extends javax.swing.JFrame {

    private Connection conn;

    public Inicio() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEntrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Senha = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));

        btnEntrar.setBackground(new java.awt.Color(179, 0, 0));
        btnEntrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Entrar no Sistema");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(212, 175, 55));
        jLabel1.setText("Pinel de Acesso");

        jLabel2.setForeground(new java.awt.Color(212, 175, 55));
        jLabel2.setText("Email");

        jLabel3.setForeground(new java.awt.Color(212, 175, 55));
        jLabel3.setText("Senha");

        jButton1.setBackground(new java.awt.Color(179, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sair do Programa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(83, 83, 83))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrar)
                    .addComponent(jButton1))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
String emailTexto = Email.getText();
        String senhaTexto = Senha.getText();

        if (validarLogin(emailTexto, senhaTexto)) {
            // Se tiver sucesso
            JOptionPane.showMessageDialog(this, "Login bem sucedido!");
            
            try {
                // 1. Instancia a nova tela (carrega para a memória)
                View.MenuPrincipal telaMenu = new View.MenuPrincipal();
                
                // 2. Oculta a janela de login atual para não ficar aberta no fundo.
                // (Usamos setVisible(false) em vez de dispose() para evitar que o Java feche o programa)
                this.setVisible(false); 
                
                // 3. Torna a tela Menu visível
                telaMenu.setVisible(true);
                
            } catch (Exception e) {
                // Se o Menu quebrar (ex: erro no construtor), mostra o erro e volta a mostrar o login
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Erro ao abrir o Menu:\n" + e.getMessage());
                this.setVisible(true);
            }
            
        } else {
            // Se falhar (já avisa dentro da validação caso seja erro de DB)
            // JOptionPane.showMessageDialog(this, "E-mail ou senha incorretos!"); // Opcional, descomente se quiser duplo aviso
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
    
private boolean validarLogin(String email, String senha) {
    
    // 1. Abre a conexão usando a nossa classe DataSource corrigida
    Connection conexao = DataSource.conectar();
    
    // 2. Verifica se a ligação falhou
    if (conexao == null) {
        // Se falhou, a própria classe DataSource já vai mostrar o erro real na tela.
        JOptionPane.showMessageDialog(null, "Erro: Não foi possível conectar ao banco.");
        return false;
    }

    // 3. Tenta fazer a consulta
    String sql = "SELECT * FROM usuarios WHERE email = ? AND senha = ?";

    try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
        stmt.setString(1, email);
        stmt.setString(2, senha);

        try (ResultSet rs = stmt.executeQuery()) {
            return rs.next(); // Retorna true se encontrou o usuário
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erro ao consultar usuário:\n" + e.getMessage());
    } finally {
        // É importante fechar a conexão depois de validar o login
        try {
            if (conexao != null) conexao.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    return false;
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Senha;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
