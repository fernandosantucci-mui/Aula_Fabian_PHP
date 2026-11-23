package View;

import model.Obrasfases;
import dao.DaoObrasfases;
import dao.DataSource;
import javax.swing.JOptionPane;


public class JIFObrasfases extends javax.swing.JInternalFrame {

    private Object Crea;

    public JIFObrasfases() {
        initComponents();
        leTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        INCLUIR1 = new javax.swing.JButton();
        idFase = new javax.swing.JTextField();
        idObra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Inicio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Fim = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ALTERAR1 = new javax.swing.JButton();
        EXCLUIR1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(212, 175, 55));
        jLabel1.setText("Gestão de Obras");

        jButton2.setBackground(new java.awt.Color(212, 175, 55));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "idObra", "idFase", "dtInicio", "dtFim"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        INCLUIR1.setBackground(new java.awt.Color(179, 0, 0));
        INCLUIR1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        INCLUIR1.setForeground(new java.awt.Color(255, 255, 255));
        INCLUIR1.setText("Incluir");
        INCLUIR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INCLUIR1ActionPerformed(evt);
            }
        });

        jLabel2.setText("idObra");

        jLabel3.setText("Inicio");

        jLabel4.setText("Fim");

        jLabel5.setText("idFase");

        ALTERAR1.setBackground(new java.awt.Color(179, 0, 0));
        ALTERAR1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ALTERAR1.setForeground(new java.awt.Color(255, 255, 255));
        ALTERAR1.setText("Alterar");
        ALTERAR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALTERAR1ActionPerformed(evt);
            }
        });

        EXCLUIR1.setBackground(new java.awt.Color(179, 0, 0));
        EXCLUIR1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EXCLUIR1.setForeground(new java.awt.Color(255, 255, 255));
        EXCLUIR1.setText("Excluir");
        EXCLUIR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXCLUIR1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EXCLUIR1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(idObra, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idFase, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(ALTERAR1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Fim, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(INCLUIR1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(Fim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(INCLUIR1))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idFase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(ALTERAR1))
                .addGap(18, 18, 18)
                .addComponent(EXCLUIR1)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(212, 175, 55));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salvar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(31, 31, 31))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(326, 326, 326))
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void INCLUIR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INCLUIR1ActionPerformed
try {
    DataSource dataSource = new DataSource();
    Obrasfases eng = new Obrasfases();
    DaoObrasfases engDao = new DaoObrasfases(dataSource);

    // ATENÇÃO: Como o modelo pede INT, precisamos converter o texto para número.
    // Estou assumindo que você digitará o ID da Obra e o ID da Fase nestes campos.
    eng.setIdObra(Integer.parseInt(idObra.getText())); 
    eng.setIdFase(Integer.parseInt(idFase.getText())); 
    eng.setDtInicioFase(Inicio.getText());
    eng.setDtTerminoFase(Fim.getText());
    
    engDao.incluir(eng);

    limpacampos();
    leTable(); // Descomentado para atualizar a tabela

} catch (NumberFormatException ex) {
    // Este erro ocorre se o usuário digitar letras onde deveria ser o ID numérico
    javax.swing.JOptionPane.showMessageDialog(null, "Os campos de ID da Obra e Fase devem ser números inteiros!");
} catch (Exception ex) {
    javax.swing.JOptionPane.showMessageDialog(null, "Erro ao incluir!\n" + ex);
}
    }//GEN-LAST:event_INCLUIR1ActionPerformed

    private void ALTERAR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALTERAR1ActionPerformed
if (Fim.getText().trim().isEmpty() || Inicio.getText().trim().isEmpty() || idObra.getText().trim().isEmpty()|| idFase.getText().trim().isEmpty()) {
    javax.swing.JOptionPane.showMessageDialog(null, "Preencha todos os campos antes de alterar!");
    return;
}

try {
    DataSource dataSource = new DataSource();
    Obrasfases eng = new Obrasfases();
    DaoObrasfases engDao = new DaoObrasfases(dataSource);

    eng.setIdObra(Integer.parseInt(idObra.getText())); 
    eng.setIdFase(Integer.parseInt(idFase.getText())); 
    eng.setDtInicioFase(Inicio.getText());
    eng.setDtTerminoFase(Fim.getText());
    
    engDao.alterar(eng);

    limpacampos(); // Usando o seu método limpacampos para limpar a tela
    leTable();

} catch (NumberFormatException ex) {
    javax.swing.JOptionPane.showMessageDialog(null, "Os campos de ID da Obra e Fase devem ser números inteiros!");
} catch (Exception ex) {
    javax.swing.JOptionPane.showMessageDialog(null, "Erro ao alterar!\n" + ex);
}
    }//GEN-LAST:event_ALTERAR1ActionPerformed

    private void EXCLUIR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXCLUIR1ActionPerformed
int confirmacao = javax.swing.JOptionPane.showConfirmDialog(
        null, 
        "Tem certeza que deseja excluir este engenheiro?", 
        "Confirmar Exclusão", 
        javax.swing.JOptionPane.YES_NO_OPTION
    );

    if (confirmacao == javax.swing.JOptionPane.YES_OPTION) {
        try {
            DataSource dataSource = new DataSource();
            DaoObrasfases engDao = new DaoObrasfases(dataSource);

//            engDao.excluir(Crea.getText());

            limpacampos();
            // leTable();

        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Erro ao excluir!\n" + ex);
        }
    }
    }//GEN-LAST:event_EXCLUIR1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
             int linha = jTable1.getSelectedRow();
    
    if (linha != -1) {
        idFase.setText(jTable1.getValueAt(linha, 0).toString());
        Fim.setText(jTable1.getValueAt(linha, 1).toString());
        Inicio.setText(jTable1.getValueAt(linha, 2).toString());
        idObra.setText(jTable1.getValueAt(linha, 2).toString());
        
        // Se souber o nome exato do campo "Id engenheiro", descomente a linha abaixo e ajuste o nome:
        // IdEngenheiro.setText(jTable1.getValueAt(linha, 3).toString());
    }
    }//GEN-LAST:event_jTable1MouseClicked

public void leTable() {
    javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) jTable1.getModel();
    modelo.setNumRows(0); // Limpa a tabela

    DataSource dataSource = new DataSource();
    DaoObrasfases engDao = new DaoObrasfases(dataSource);

    java.util.ArrayList<Obrasfases> lista = engDao.consulta();

    if (lista != null) {
        System.out.println("Foram encontradas " + lista.size() + " obras.");
        for (Obrasfases eng : lista) {
            modelo.addRow(new Object[]{
                eng.getIdObra(),           // Coluna 1
                eng.getIdFase(),         // Coluna 2
                eng.getDtInicioFase(), // Coluna 3
                eng.getDtTerminoFase()      // Coluna 4
            });
        }
    } else {
        System.out.println("A lista retornou null. Verifique a ligação à base de dados.");
    }
}
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ALTERAR1;
    private javax.swing.JButton EXCLUIR1;
    private javax.swing.JTextField Fim;
    private javax.swing.JButton INCLUIR1;
    private javax.swing.JTextField Inicio;
    private javax.swing.JTextField idFase;
    private javax.swing.JTextField idObra;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void limpacampos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
