package View;

public class Lixo extends javax.swing.JInternalFrame {

    /**
     * Creates new form Menu
     */
    public Lixo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pinel = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        GestaoObras = new javax.swing.JMenuItem();
        Engenheiros = new javax.swing.JMenuItem();
        Orcamento = new javax.swing.JMenuItem();
        ManutencaoFases = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        Pinel.setForeground(new java.awt.Color(212, 175, 55));

        javax.swing.GroupLayout PinelLayout = new javax.swing.GroupLayout(Pinel);
        Pinel.setLayout(PinelLayout);
        PinelLayout.setHorizontalGroup(
            PinelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 696, Short.MAX_VALUE)
        );
        PinelLayout.setVerticalGroup(
            PinelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );

        jMenu1.setText("Opacoes");

        GestaoObras.setText("Gestao de obras");
        GestaoObras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestaoObrasActionPerformed(evt);
            }
        });
        jMenu1.add(GestaoObras);

        Engenheiros.setText("Engenheiros");
        Engenheiros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EngenheirosActionPerformed(evt);
            }
        });
        jMenu1.add(Engenheiros);

        Orcamento.setText("Orcamentos");
        Orcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrcamentoActionPerformed(evt);
            }
        });
        jMenu1.add(Orcamento);

        ManutencaoFases.setText("Manutencao fases");
        ManutencaoFases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManutencaoFasesActionPerformed(evt);
            }
        });
        jMenu1.add(ManutencaoFases);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sair");

        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pinel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pinel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GestaoObrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestaoObrasActionPerformed
        JIFObrasfases janela = new JIFObrasfases();
        Pinel.add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_GestaoObrasActionPerformed

    private void EngenheirosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EngenheirosActionPerformed
        JIFEngenheiros janela = new JIFEngenheiros();
        Pinel.add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_EngenheirosActionPerformed

    private void OrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrcamentoActionPerformed
        JIFOrcamentos janela = new JIFOrcamentos();
        Pinel.add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_OrcamentoActionPerformed

    private void ManutencaoFasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManutencaoFasesActionPerformed
        JIFManutencaodefases janela = new JIFManutencaodefases();
        Pinel.add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_ManutencaoFasesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Engenheiros;
    private javax.swing.JMenuItem GestaoObras;
    private javax.swing.JMenuItem ManutencaoFases;
    private javax.swing.JMenuItem Orcamento;
    private javax.swing.JDesktopPane Pinel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
