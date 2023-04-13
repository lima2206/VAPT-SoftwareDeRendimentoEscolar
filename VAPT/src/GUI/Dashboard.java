/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import GUI.telasInternas.AtividadeDadosAlunosPendentes;
import GUI.telasInternas.Editar;
import GUI.telasInternas.TelaHome;
import GUI.telasInternas.TiposDeCadastro;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author isaqu
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
 
    Color DefaultColor, ClickColor;
    
    
    public Dashboard() {
        initComponents();
        DefaultColor= new Color(13,36,70);
        ClickColor = new Color(220,141,77);
        jDesktopPanel.removeAll();
        jDesktopPanel.add(new TelaHome()).setVisible(true);
        

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
        jPanel5 = new javax.swing.JPanel();
        homeBut = new javax.swing.JPanel();
        homeTxt = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        editaBut = new javax.swing.JPanel();
        homeTxt2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        buscaBut = new javax.swing.JPanel();
        homeTxt3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cadastrarBut = new javax.swing.JPanel();
        homeTxt4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jDesktopPanel = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VAPT!");

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(2, 31, 54));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeBut.setBackground(new java.awt.Color(2, 31, 54));
        homeBut.setToolTipText("Home");
        homeBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeButMouseExited(evt);
            }
        });

        homeTxt.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        homeTxt.setForeground(new java.awt.Color(255, 255, 255));
        homeTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeTxt.setText("Home");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home2.png"))); // NOI18N

        javax.swing.GroupLayout homeButLayout = new javax.swing.GroupLayout(homeBut);
        homeBut.setLayout(homeButLayout);
        homeButLayout.setHorizontalGroup(
            homeButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeButLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(homeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        homeButLayout.setVerticalGroup(
            homeButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeButLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(homeButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeTxt))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel5.add(homeBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 300, 60));

        editaBut.setBackground(new java.awt.Color(2, 31, 54));
        editaBut.setToolTipText("Home");
        editaBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editaBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editaButMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editaButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editaButMouseExited(evt);
            }
        });

        homeTxt2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        homeTxt2.setForeground(new java.awt.Color(255, 255, 255));
        homeTxt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeTxt2.setText("Editar");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N

        javax.swing.GroupLayout editaButLayout = new javax.swing.GroupLayout(editaBut);
        editaBut.setLayout(editaButLayout);
        editaButLayout.setHorizontalGroup(
            editaButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editaButLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        editaButLayout.setVerticalGroup(
            editaButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editaButLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(editaButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(homeTxt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel5.add(editaBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 300, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bem-Vindo!");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        buscaBut.setBackground(new java.awt.Color(2, 31, 54));
        buscaBut.setToolTipText("Home");
        buscaBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscaBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscaButMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscaButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscaButMouseExited(evt);
            }
        });

        homeTxt3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        homeTxt3.setForeground(new java.awt.Color(255, 255, 255));
        homeTxt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeTxt3.setText("Buscar");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisa.png"))); // NOI18N

        javax.swing.GroupLayout buscaButLayout = new javax.swing.GroupLayout(buscaBut);
        buscaBut.setLayout(buscaButLayout);
        buscaButLayout.setHorizontalGroup(
            buscaButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscaButLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(homeTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        buscaButLayout.setVerticalGroup(
            buscaButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscaButLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(buscaButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeTxt3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.add(buscaBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 300, -1));

        cadastrarBut.setBackground(new java.awt.Color(2, 31, 54));
        cadastrarBut.setToolTipText("Home");
        cadastrarBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrarBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarButMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cadastrarButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cadastrarButMouseExited(evt);
            }
        });

        homeTxt4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        homeTxt4.setForeground(new java.awt.Color(255, 255, 255));
        homeTxt4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeTxt4.setText("Cadastrar");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cadastrar.png"))); // NOI18N

        javax.swing.GroupLayout cadastrarButLayout = new javax.swing.GroupLayout(cadastrarBut);
        cadastrarBut.setLayout(cadastrarButLayout);
        cadastrarButLayout.setHorizontalGroup(
            cadastrarButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastrarButLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(homeTxt4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        cadastrarButLayout.setVerticalGroup(
            cadastrarButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastrarButLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(cadastrarButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeTxt4))
                .addGap(15, 15, 15))
        );

        jPanel5.add(cadastrarBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 300, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 730));

        jDesktopPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jDesktopPanelLayout = new javax.swing.GroupLayout(jDesktopPanel);
        jDesktopPanel.setLayout(jDesktopPanelLayout);
        jDesktopPanelLayout.setHorizontalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        jDesktopPanelLayout.setVerticalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );

        jPanel3.add(jDesktopPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 1100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void editaButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editaButMouseClicked
        Editar editaBut = new Editar(jDesktopPanel);
        jDesktopPanel.removeAll();
        jDesktopPanel.add(editaBut).setVisible(true);
    }//GEN-LAST:event_editaButMouseClicked

    private void editaButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editaButMouseEntered
        editaBut.setBackground(new java.awt.Color(2,65,75));
    }//GEN-LAST:event_editaButMouseEntered

    private void editaButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editaButMouseExited
        editaBut.setBackground(new java.awt.Color(2,31,54));
    }//GEN-LAST:event_editaButMouseExited

    private void homeButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButMouseExited
        homeBut.setBackground(new java.awt.Color(2,31,54));
    }//GEN-LAST:event_homeButMouseExited

    private void homeButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButMouseEntered
        homeBut.setBackground(new java.awt.Color(2,65,75));
    }//GEN-LAST:event_homeButMouseEntered

    private void homeButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButMouseClicked
        AtividadeDadosAlunosPendentes ativDadosAlunosPendentes = new AtividadeDadosAlunosPendentes(jDesktopPanel);
        jDesktopPanel.removeAll();
        jDesktopPanel.add(ativDadosAlunosPendentes).setVisible(true);
    }//GEN-LAST:event_homeButMouseClicked

    private void buscaButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscaButMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buscaButMouseClicked

    private void buscaButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscaButMouseEntered
        buscaBut.setBackground(new java.awt.Color(2,65,75));
    }//GEN-LAST:event_buscaButMouseEntered

    private void buscaButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscaButMouseExited
        buscaBut.setBackground(new java.awt.Color(2,31,54));
    }//GEN-LAST:event_buscaButMouseExited

    private void cadastrarButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarButMouseClicked
        TiposDeCadastro tipoDeCadastro = new TiposDeCadastro(jDesktopPanel);
        jDesktopPanel.removeAll();
        jDesktopPanel.add(tipoDeCadastro).setVisible(true);
    }//GEN-LAST:event_cadastrarButMouseClicked

    private void cadastrarButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarButMouseEntered
        cadastrarBut.setBackground(new java.awt.Color(2,65,75));
    }//GEN-LAST:event_cadastrarButMouseEntered

    private void cadastrarButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarButMouseExited
        cadastrarBut.setBackground(new java.awt.Color(2,31,54));
    }//GEN-LAST:event_cadastrarButMouseExited

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buscaBut;
    private javax.swing.JPanel cadastrarBut;
    private javax.swing.JPanel editaBut;
    private javax.swing.JPanel homeBut;
    private javax.swing.JLabel homeTxt;
    private javax.swing.JLabel homeTxt2;
    private javax.swing.JLabel homeTxt3;
    private javax.swing.JLabel homeTxt4;
    private javax.swing.JDesktopPane jDesktopPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
