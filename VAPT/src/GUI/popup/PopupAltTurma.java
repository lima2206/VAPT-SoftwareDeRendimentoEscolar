/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.popup;

import GUI.telasInternas.Editar;
import GUI.telasInternas.EditarTurma;
import dao.Dia_SemanaDao;
import dao.TurmaDao;
import modelo.Dia_Semana;
import modelo.Turma;

/**
 *
 * @author Alicea
 */
public class PopupAltTurma extends javax.swing.JFrame {

    /**
     * Creates new form PopupAltTurma
     */

    private Turma turma;
    private EditarTurma editarTurma;

    public PopupAltTurma() {
        initComponents();
    }

    public PopupAltTurma(Turma turma, EditarTurma editarTurma) {
        this.turma = turma;
        this.editarTurma = editarTurma;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        texto1 = new javax.swing.JLabel();
        texto3 = new javax.swing.JLabel();
        nomeTurma = new javax.swing.JTextField();
        texto2 = new javax.swing.JLabel();
        botaoSalvar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(217, 217, 217));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(217, 217, 217));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 93, 117), 2, true));

        texto1.setBackground(new java.awt.Color(217, 217, 217));
        texto1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        texto1.setText("Tem certeza que deseja salvar alterações em");

        texto3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        texto3.setText("\"? ");

        nomeTurma.setBackground(new java.awt.Color(217, 217, 217));
        nomeTurma.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nomeTurma.setText("Turma 6 A");

        texto2.setBackground(new java.awt.Color(217, 217, 217));
        texto2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        texto2.setText("\"");

        botaoSalvar.setBackground(new java.awt.Color(236, 131, 84));
        botaoSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoSalvar.setForeground(new java.awt.Color(1, 30, 54));
        botaoSalvar.setText("Salvar");
        botaoSalvar.setMaximumSize(new java.awt.Dimension(95, 27));
        botaoSalvar.setMinimumSize(new java.awt.Dimension(95, 27));
        botaoSalvar.setPreferredSize(new java.awt.Dimension(95, 27));
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoCancelar.setForeground(new java.awt.Color(1, 30, 54));
        botaoCancelar.setText("Cancelar");
        botaoCancelar.setMaximumSize(new java.awt.Dimension(95, 27));
        botaoCancelar.setMinimumSize(new java.awt.Dimension(95, 27));
        botaoCancelar.setPreferredSize(new java.awt.Dimension(95, 27));
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(68, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel1Layout.createSequentialGroup()
                                                        .addComponent(texto1)
                                                        .addGap(67, 67, 67))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                .createSequentialGroup()
                                                .addComponent(texto2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nomeTurma, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(texto3)
                                                .addGap(143, 143, 143))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(texto1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(texto3)
                                        .addComponent(nomeTurma, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(texto2))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(28, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoSalvarActionPerformed
        // TODO add your handling code here:
        TurmaDao turmaDao = new TurmaDao();
        turmaDao.alterar(turma);

        Dia_SemanaDao dia_SemanaDao = new Dia_SemanaDao();
        dia_SemanaDao.deletarDia_semanaTurma(turma.getId_turma());
        if (editarTurma.getSegundaCheck().isSelected()) {
            Dia_Semana dia_Semana = new Dia_Semana();
            dia_Semana.setTurma_id_turma(turma.getId_turma());
            dia_Semana.setDia("Segunda");
            dia_Semana.setHora_inicio(editarTurma.getSegIni().getText());
            dia_Semana.setHora_fim(editarTurma.getSegFim().getText());
            dia_SemanaDao.adicionar(dia_Semana);
        }
        if (editarTurma.getTercaCheck().isSelected()) {
            Dia_Semana dia_Semana = new Dia_Semana();
            dia_Semana.setTurma_id_turma(turma.getId_turma());
            dia_Semana.setDia("Terça");
            dia_Semana.setHora_inicio(editarTurma.getTerIni().getText());
            dia_Semana.setHora_fim(editarTurma.getTerFim().getText());
            dia_SemanaDao.adicionar(dia_Semana);
        }
        if (editarTurma.getQuartaCheck().isSelected()) {
            Dia_Semana dia_Semana = new Dia_Semana();
            dia_Semana.setTurma_id_turma(turma.getId_turma());
            dia_Semana.setDia("Quarta");
            dia_Semana.setHora_inicio(editarTurma.getQuaIni().getText());
            dia_Semana.setHora_fim(editarTurma.getQuaFim().getText());
            dia_SemanaDao.adicionar(dia_Semana);
        }
        if (editarTurma.getQuintaCheck().isSelected()) {
            Dia_Semana dia_Semana = new Dia_Semana();
            dia_Semana.setTurma_id_turma(turma.getId_turma());
            dia_Semana.setDia("Quinta");
            dia_Semana.setHora_inicio(editarTurma.getQuiIni().getText());
            dia_Semana.setHora_fim(editarTurma.getQuiFim().getText());
            dia_SemanaDao.adicionar(dia_Semana);
        }
        if (editarTurma.getSextaCheck().isSelected()) {
            Dia_Semana dia_Semana = new Dia_Semana();
            dia_Semana.setTurma_id_turma(turma.getId_turma());
            dia_Semana.setDia("Sexta");
            dia_Semana.setHora_inicio(editarTurma.getSexIni().getText());
            dia_Semana.setHora_fim(editarTurma.getSexFim().getText());
            dia_SemanaDao.adicionar(dia_Semana);
        }
        editarTurma.preencherDiaSemana();
        this.dispose();
    }// GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }// GEN-LAST:event_botaoCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PopupAltTurma.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopupAltTurma.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopupAltTurma.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopupAltTurma.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PopupAltTurma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nomeTurma;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto3;
    // End of variables declaration//GEN-END:variables
}
