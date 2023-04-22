/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI.telasInternas;

import GUI.componentes.CheckBoxContainer;
import GUI.swing.ScrollBarCustom;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLayeredPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import modelo.Aluno_Atividade;

/**
 *
 * @author Lima
 */
public class AtribuirAtividadeEntregue extends javax.swing.JInternalFrame {

    private ArrayList<Aluno_Atividade> aluno;
    
    public void preencherlinhas(){
        for(Aluno_Atividade b:aluno){
            if(!b.getAluno_Ativadade_entrega()){
            CheckBoxContainer c = new CheckBoxContainer(b.getAluno(), b.getAtividade().getId_atividade());
            jLayeredPane1.add(c);
            }
        }
    }
    public AtribuirAtividadeEntregue(ArrayList<Aluno_Atividade> a) {
        initComponents();
        this.aluno = a;
        preencherlinhas();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(-10,0,-10,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        ScrollBarCustom sp = new ScrollBarCustom();
        sp.setUnitIncrement(20);
        sp.setForeground(new Color(4, 210, 130));
        jScrollPane1.setVerticalScrollBar(sp);

            
        }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        myButton1 = new GUI.swing.MyButton();

        jLayeredPane1.setLayout(new java.awt.GridLayout(0, 1, 5, 5));
        jScrollPane1.setViewportView(jLayeredPane1);

        myButton1.setBackground(new java.awt.Color(255, 129, 76));
        myButton1.setBorder(null);
        myButton1.setText("Salvar");
        myButton1.setToolTipText("");
        myButton1.setAlignmentY(0.0F);
        myButton1.setBorderColor(new java.awt.Color(0, 0, 0));
        myButton1.setColor(new java.awt.Color(255, 129, 76));
        myButton1.setColorClicked(new java.awt.Color(255, 158, 71));
        myButton1.setColorOver(new java.awt.Color(255, 147, 80));
        myButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        myButton1.setRadius(15);
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
            
        for (int i = 0; i < jLayeredPane1.getComponentCount(); i++) {
            CheckBoxContainer checkBoxContainer = (CheckBoxContainer) jLayeredPane1.getComponent(i);
            checkBoxContainer.alterarSelecionados();
        }
    }//GEN-LAST:event_myButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private GUI.swing.MyButton myButton1;
    // End of variables declaration//GEN-END:variables

}
