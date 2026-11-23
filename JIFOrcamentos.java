package View;

import model.Orcamentos;
import dao.DaoOrcamentos;
import dao.DataSource;
import javax.swing.JOptionPane;
import java.time.LocalDate;

public class JIFOrcamentos extends javax.swing.JInternalFrame {

  
    public JIFOrcamentos() {
        initComponents();
        leTable();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        Aprovado = new javax.swing.JTextField();
        INCLUIR1 = new javax.swing.JButton();
        ALTERAR1 = new javax.swing.JButton();
        Responsavel = new javax.swing.JTextField();
        EXCLUIR1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Orcamento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Pendente = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(212, 175, 55));
        jLabel1.setText("Orçamentos");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Responsavel pela Elaboração", "Aprovado", "Pendente", "dtAprovação"
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

        jLabel2.setText("Responsavel");

        jLabel3.setText("Orçamento");

        jLabel4.setText("Pendente");

        jLabel5.setText("Aprovado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(Responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(Orcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pendente, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ALTERAR1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(INCLUIR1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EXCLUIR1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Aprovado, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(INCLUIR1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(Pendente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Orcamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(Aprovado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(ALTERAR1)
                        .addGap(31, 31, 31)
                        .addComponent(EXCLUIR1)))
                .addGap(21, 21, 21))
        );

        jButton2.setBackground(new java.awt.Color(212, 175, 55));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

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
                        .addGap(299, 299, 299)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(55, 55, 55))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void INCLUIR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INCLUIR1ActionPerformed
try {
        Orcamentos orc = new Orcamentos();
        
        if (Responsavel.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe o ID do Engenheiro Responsável!");
            Responsavel.requestFocus();
            return;
        }
        orc.setIdEngenheiroResponsavel(Integer.parseInt(Responsavel.getText().trim()));
        
        if (!Aprovado.getText().trim().isEmpty()) {
            orc.setDtAprovacao(LocalDate.now());
        } else if (!Pendente.getText().trim().isEmpty()) {
            orc.setDtAprovacao(null);
        } else {
            JOptionPane.showMessageDialog(this, "Preencha se o orçamento está Aprovado ou Pendente!");
            return;
        }
        
        DataSource dataSource = new DataSource();
        DaoOrcamentos dao = new DaoOrcamentos(dataSource);
        dao.incluir(orc);
        
        // Atualiza a tabela e limpa os campos imediatamente após incluir
        leTable();
        limparCampos();
        
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "O ID do Responsável deve ser um número inteiro válido!");
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Erro ao incluir: " + ex.getMessage());
    }
    }//GEN-LAST:event_INCLUIR1ActionPerformed

    private void ALTERAR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALTERAR1ActionPerformed
try {
        if (Orcamento.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe ou selecione o ID do Orçamento para alterar!");
            Orcamento.requestFocus();
            return;
        }
        
        if (Responsavel.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe o ID do Engenheiro Responsável!");
            Responsavel.requestFocus();
            return;
        }
        
        Orcamentos orc = new Orcamentos();
        orc.setIdOrcamento(Integer.parseInt(Orcamento.getText().trim()));
        orc.setIdEngenheiroResponsavel(Integer.parseInt(Responsavel.getText().trim()));
        
        if (!Aprovado.getText().trim().isEmpty()) {
            orc.setDtAprovacao(LocalDate.now());
        } else if (!Pendente.getText().trim().isEmpty()) {
            orc.setDtAprovacao(null);
        } else {
            JOptionPane.showMessageDialog(this, "Preencha se o orçamento está Aprovado ou Pendente!");
            return;
        }
        
        DataSource dataSource = new DataSource();
        DaoOrcamentos dao = new DaoOrcamentos(dataSource);
        dao.alterar(orc);
        
        // Atualiza a tabela e limpa os campos imediatamente após alterar
        leTable();
        limparCampos();
        
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Verifique se os campos Orçamento e Responsável contêm números válidos!");
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Erro ao alterar: " + ex.getMessage());
    }
    }//GEN-LAST:event_ALTERAR1ActionPerformed

    private void EXCLUIR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXCLUIR1ActionPerformed
try {
        if (Orcamento.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe ou selecione o ID do Orçamento para excluir!");
            Orcamento.requestFocus();
            return;
        }
        
        int idOrcamento = Integer.parseInt(Orcamento.getText().trim());
        
        int confirmacao = JOptionPane.showConfirmDialog(
            this, 
            "Tem certeza que deseja excluir o orçamento nº " + idOrcamento + "?", 
            "Confirmar Exclusão", 
            JOptionPane.YES_NO_OPTION
        );
        
        if (confirmacao == JOptionPane.YES_OPTION) {
            DataSource dataSource = new DataSource();
            DaoOrcamentos dao = new DaoOrcamentos(dataSource);
            dao.excluir(idOrcamento);
            
            // Atualiza a tabela e limpa os campos imediatamente após excluir
            leTable();
            limparCampos();
        }
        
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "O ID do Orçamento deve ser um número válido!");
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Erro ao excluir: " + ex.getMessage());
    }
    }//GEN-LAST:event_EXCLUIR1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int linha = jTable1.getSelectedRow();
    if (linha != -1) {
        Orcamento.setText(jTable1.getValueAt(linha, 0).toString());
        
        String statusData = jTable1.getValueAt(linha, 1).toString();
        if (statusData.equals("Pendente")) {
            Pendente.setText("Sim");
            Aprovado.setText("");
        } else {
            Aprovado.setText(statusData);
            Pendente.setText("");
        }
        
        Responsavel.setText(jTable1.getValueAt(linha, 2).toString());
    }
    }//GEN-LAST:event_jTable1MouseClicked
public void leTable() {
    javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) jTable1.getModel();
    modelo.setNumRows(0); // Limpa a tabela

    DataSource dataSource = new DataSource();
    DaoOrcamentos orcDao = new DaoOrcamentos(dataSource);

    java.util.ArrayList<model.Orcamentos> lista = orcDao.consulta();

    java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy");

    if (lista != null) {
        System.out.println("Foram encontrados " + lista.size() + " orçamentos.");
        for (model.Orcamentos orc : lista) {
            String dataFormatada = (orc.getDtAprovacao() != null) 
                                   ? orc.getDtAprovacao().format(formatter) 
                                   : "Pendente";

            modelo.addRow(new Object[]{
                orc.getIdOrcamento(),             // Coluna 1
                dataFormatada,                    // Coluna 2
                orc.getIdEngenheiroResponsavel()  // Coluna 3
            });
        }
        
        // Força a interface gráfica a redesenhar a tabela imediatamente
        jTable1.revalidate();
        jTable1.repaint();
    } else {
        System.out.println("A lista retornou null. Verifique a ligação à base de dados.");
    }
}

public void limparCampos() {
    Orcamento.setText("");
    Responsavel.setText("");
    Aprovado.setText("");
    Pendente.setText("");
    Responsavel.requestFocus();
}

    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ALTERAR1;
    private javax.swing.JTextField Aprovado;
    private javax.swing.JButton EXCLUIR1;
    private javax.swing.JButton INCLUIR1;
    private javax.swing.JTextField Orcamento;
    private javax.swing.JTextField Pendente;
    private javax.swing.JTextField Responsavel;
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
}
