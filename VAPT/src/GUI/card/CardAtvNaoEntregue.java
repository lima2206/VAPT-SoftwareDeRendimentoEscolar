/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.card;

import GUI.swing.ScrollBarCustom;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JScrollBar;
import modelo.Aluno_Atividade;
import java.text.SimpleDateFormat;

/**
 *
 * @author Fatec
 */
public class CardAtvNaoEntregue extends javax.swing.JPanel {
    
    private Aluno_Atividade aluno_atividade = new Aluno_Atividade();
    private int id;

    /**
     * Creates new form CardAtvNaoEntregue
     */
    public CardAtvNaoEntregue(Aluno_Atividade atvNaoEntregue, int id) {
        initComponents();
        setOpaque(false);

        this.aluno_atividade = atvNaoEntregue;
        preecherCardaNEntregue(id);
        
        ScrollBarCustom sp = new ScrollBarCustom();
        sp.setUnitIncrement(20);
        sp.setForeground(new Color(4, 210, 130));
        ScrollBarCustom spHorizontal = new ScrollBarCustom();
        spHorizontal.setOrientation(JScrollBar.HORIZONTAL);
        spHorizontal.setUnitIncrement(20);
        spHorizontal.setForeground(new Color(4, 210, 130));
        jScrollPane2.setVerticalScrollBar(sp);
        jScrollPane2.setHorizontalScrollBar(spHorizontal);
        
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private void preecherCardaNEntregue(int id){
        AtvNomeNum.setText("Atividade "+id);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        dataQEntregou.setText(sdf.format(this.aluno_atividade.getAtividade().getData_fim()));
       

    }
    
    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 =(Graphics2D)grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        super.paintChildren(grphcs);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AtvNomeNum = new javax.swing.JLabel();
        dataEntrega = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        checkBoxCustom1 = new GUI.swing.CheckBoxCustom();

        setBackground(new java.awt.Color(252, 252, 252));
        setPreferredSize(new java.awt.Dimension(170, 180));

        AtvNomeNum.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        AtvNomeNum.setForeground(new java.awt.Color(73, 93, 117));
        AtvNomeNum.setText("Atividade 04");

        dataEntrega.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        dataEntrega.setText("Data da Entrega:");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendário (2).png"))); // NOI18N

        descrAtv.setColumns(20);
        descrAtv.setRows(5);
        jScrollPane2.setViewportView(descrAtv);

        dataEntrega.setBackground(new java.awt.Color(252, 252, 252));
        dataEntrega.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        dataEntrega.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dataEntrega)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap(9, Short.MAX_VALUE)
                        .addComponent(AtvNomeNum)
                        .addGap(18, 18, 18)
                        .addComponent(checkBoxCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataQEntregou)
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AtvNomeNum)
                    .addComponent(checkBoxCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dataEntrega)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataQEntregou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AtvNomeNum;
    private GUI.swing.CheckBoxCustom checkBoxCustom1;
    private javax.swing.JLabel dataEntrega;
    private javax.swing.JFormattedTextField dataQEntregou;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
