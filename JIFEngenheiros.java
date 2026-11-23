package View;

import dao.DaoEngenheiros;
import dao.DataSource;
import model.Engenheiros;
import javax.swing.JOptionPane;


public class JIFEngenheiros extends javax.swing.JInternalFrame {

    public JIFEngenheiros() {
        initComponents();
        leTable();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        INCLUIR1 = new javax.swing.JButton();
        ALTERAR1 = new javax.swing.JButton();
        Nome = new javax.swing.JTextField();
        EXCLUIR1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Crea = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Admicao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        IdEngenheiros = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome do Engenheiro", "CREA", "dtAdmição", "IdEngenheiros"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(212, 175, 55));
        jLabel1.setText("Engenheiros");

        jButton2.setBackground(new java.awt.Color(212, 175, 55));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

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

        jLabel2.setText("Nome do Engenheiro");

        jLabel3.setText("Crea");

        jLabel4.setText("Admição");

        jLabel5.setText("Id engenheiro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(Crea, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(IdEngenheiros, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(Admicao))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ALTERAR1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(EXCLUIR1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(INCLUIR1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(INCLUIR1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(Admicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ALTERAR1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(Crea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(IdEngenheiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(EXCLUIR1))
                .addGap(51, 51, 51))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(75, 75, 75))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void INCLUIR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INCLUIR1ActionPerformed
try {
        if (Nome.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe o Nome do Engenheiro!");
            Nome.requestFocus();
            return;
        }

        Engenheiros eng = new Engenheiros();
        eng.setDsNome(Nome.getText().trim());
        eng.setNrCREA(Crea.getText().trim());
        eng.setDtAdmissao(Admicao.getText().trim());

        DataSource dataSource = new DataSource();
        DaoEngenheiros engDao = new DaoEngenheiros(dataSource);
        engDao.incluir(eng);

        // Atualiza a tabela e limpa os campos imediatamente após incluir
        leTable();
        limparCampos();

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Erro ao incluir engenheiro: " + ex.getMessage());
    }
    }//GEN-LAST:event_INCLUIR1ActionPerformed

    private void ALTERAR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALTERAR1ActionPerformed
try {
        if (IdEngenheiros.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Selecione um engenheiro na tabela antes de alterar!");
            return;
        }

        Engenheiros eng = new Engenheiros();
        eng.setIdEngenheiro(Integer.parseInt(IdEngenheiros.getText().trim()));
        eng.setDsNome(Nome.getText().trim());
        eng.setNrCREA(Crea.getText().trim());
        eng.setDtAdmissao(Admicao.getText().trim());

        DataSource dataSource = new DataSource();
        DaoEngenheiros engDao = new DaoEngenheiros(dataSource);
        engDao.alterar(eng);

        // Atualiza a tabela e limpa os campos imediatamente após alterar
        leTable();
        limparCampos();

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "ID do Engenheiro inválido!");
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Erro ao alterar engenheiro: " + ex.getMessage());
    }
    }//GEN-LAST:event_ALTERAR1ActionPerformed

    private void EXCLUIR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXCLUIR1ActionPerformed
try {
        if (IdEngenheiros.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Selecione um engenheiro na tabela para excluir!");
            return;
        }

        int idEngenheiro = Integer.parseInt(IdEngenheiros.getText().trim());

        int confirmacao = JOptionPane.showConfirmDialog(
            this,
            "Tem certeza que deseja excluir o engenheiro nº " + idEngenheiro + "?",
            "Confirmar Exclusão",
            JOptionPane.YES_NO_OPTION
        );

        if (confirmacao == JOptionPane.YES_OPTION) {
            Engenheiros eng = new Engenheiros();
            eng.setIdEngenheiro(idEngenheiro);

            DataSource dataSource = new DataSource();
            DaoEngenheiros engDao = new DaoEngenheiros(dataSource);
            engDao.excluir(eng); // Passa o objeto Engenheiros para o DAO

            // Atualiza a tabela e limpa os campos imediatamente após excluir
            leTable();
            limparCampos();
        }

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "ID do Engenheiro inválido!");
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Erro ao excluir engenheiro: " + ex.getMessage());
    }
    }//GEN-LAST:event_EXCLUIR1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
int linha = jTable1.getSelectedRow();
    if (linha != -1) {
        Nome.setText(jTable1.getValueAt(linha, 0).toString());
        Crea.setText(jTable1.getValueAt(linha, 1).toString());
        Admicao.setText(jTable1.getValueAt(linha, 2).toString());
        IdEngenheiros.setText(jTable1.getValueAt(linha, 3).toString());
    }
    }//GEN-LAST:event_jTable1MouseClicked

    public void leTable() {
javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) jTable1.getModel();
    modelo.setNumRows(0); // Limpa as linhas em branco da tabela

    DataSource dataSource = new DataSource();
    DaoEngenheiros engDao = new DaoEngenheiros(dataSource);

    java.util.ArrayList<Engenheiros> lista = engDao.consulta();

    if (lista != null) {
        for (Engenheiros eng : lista) {
            modelo.addRow(new Object[]{
                eng.getDsNome(),        // Coluna 1: Nome do Engenheiro
                eng.getNrCREA(),        // Coluna 2: CREA
                eng.getDtAdmissao(),    // Coluna 3: dtAdmissão
                eng.getIdEngenheiro()   // Coluna 4: IdEngenheiros
            });
        }
        
        // Força a interface a redesenhar a tabela imediatamente
        jTable1.revalidate();
        jTable1.repaint();
    }
}
     public void limparCampos() {
    IdEngenheiros.setText("");
    Nome.setText("");
    Crea.setText("");
    Admicao.setText("");
    Nome.requestFocus();
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ALTERAR1;
    private javax.swing.JTextField Admicao;
    private javax.swing.JTextField Crea;
    private javax.swing.JButton EXCLUIR1;
    private javax.swing.JButton INCLUIR1;
    private javax.swing.JTextField IdEngenheiros;
    private javax.swing.JTextField Nome;
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
