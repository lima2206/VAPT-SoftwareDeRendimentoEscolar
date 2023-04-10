/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import javax.swing.JDesktopPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
/**
 *
 * @author joice
 */
public class AtividadeDadosAlunosPendentes extends javax.swing.JInternalFrame {

    /**
     * Creates new form AtividadeDadosAlunosPendentes
     */
     javax.swing.JDesktopPane jDesktopPanel;
    public AtividadeDadosAlunosPendentes() {
        initComponents();
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
    }

    AtividadeDadosAlunosPendentes(JDesktopPane jDesktopPanel) {
          this.jDesktopPanel = jDesktopPanel;
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        recebDataEntrega = new javax.swing.JFormattedTextField();
        recebDataSolicitacao1 = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        editAlunosPendesntes = new javax.swing.JButton();
        ativNum = new javax.swing.JTextField();
        turma = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nomeEscola = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 730));

        jPanel3.setBackground(new java.awt.Color(217, 217, 217));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(236, 236, 236));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Data da Entrega:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Data da Solicitação:");

        try {
            recebDataEntrega.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        recebDataEntrega.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        recebDataEntrega.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        try {
            recebDataSolicitacao1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        recebDataSolicitacao1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        recebDataSolicitacao1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        recebDataSolicitacao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recebDataSolicitacao1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendário (2).png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendário (2).png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(236, 236, 236));

        jTable2.setBackground(new java.awt.Color(236, 236, 236));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                ""
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
        );

        editAlunosPendesntes.setBackground(new java.awt.Color(236, 236, 236));
        editAlunosPendesntes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnEditar.png"))); // NOI18N
        editAlunosPendesntes.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(recebDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(recebDataSolicitacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                                .addComponent(editAlunosPendesntes, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(recebDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(recebDataSolicitacao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(editAlunosPendesntes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 200, 850, 450));

        ativNum.setBackground(new java.awt.Color(217, 217, 217));
        ativNum.setFont(new java.awt.Font("Segoe UI", 1, 46)); // NOI18N
        ativNum.setForeground(new java.awt.Color(4, 210, 130));
        ativNum.setText("Atividade 5");
        ativNum.setBorder(null);
        ativNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ativNumActionPerformed(evt);
            }
        });
        jPanel3.add(ativNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        turma.setBackground(new java.awt.Color(217, 217, 217));
        turma.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        turma.setForeground(new java.awt.Color(239, 131, 84));
        turma.setText("Turma 5ºA");
        turma.setBorder(null);
        jPanel3.add(turma, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jLabel1.setBackground(new java.awt.Color(217, 217, 217));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel1.setText("Escola:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, -1, -1));

        nomeEscola.setBackground(new java.awt.Color(217, 217, 217));
        nomeEscola.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        nomeEscola.setText("Ana Herondina");
        nomeEscola.setBorder(null);
        nomeEscola.setMinimumSize(new java.awt.Dimension(46, 22));
        nomeEscola.setPreferredSize(new java.awt.Dimension(46, 22));
        nomeEscola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeEscolaActionPerformed(evt);
            }
        });
        jPanel3.add(nomeEscola, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 300, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escola.png"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 120, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ativNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ativNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ativNumActionPerformed

    private void recebDataSolicitacao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recebDataSolicitacao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recebDataSolicitacao1ActionPerformed

    private void nomeEscolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeEscolaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeEscolaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ativNum;
    private javax.swing.JButton editAlunosPendesntes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField nomeEscola;
    private javax.swing.JFormattedTextField recebDataEntrega;
    private javax.swing.JFormattedTextField recebDataSolicitacao1;
    private javax.swing.JTextField turma;
    // End of variables declaration//GEN-END:variables
}
