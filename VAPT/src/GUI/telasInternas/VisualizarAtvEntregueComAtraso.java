/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI.telasInternas;

import GUI.card.CardAtivEntregue;
import GUI.swing.ScrollBarCustom;
import GUI.telasInternas.VisualizarAtvNaoEntregue;
import dao.Aluno_AtividadeDao;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import javax.swing.JDesktopPane;
import javax.swing.JScrollBar;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import modelo.Aluno;
import modelo.Aluno_Atividade;

/**
 *
 * @author joice
 */
public class VisualizarAtvEntregueComAtraso extends javax.swing.JInternalFrame {
      private Aluno_Atividade aluno_atividade = new Aluno_Atividade();
      private JDesktopPane jDesktopPane;
      private JDesktopPane recebeCardsAtv;
      private Aluno aluno;
     javax.swing.JDesktopPane jDesktopPanel;
      private ArrayList<Aluno_Atividade> listaAlunoAtividade = new ArrayList<>();
     
    
     
    public VisualizarAtvEntregueComAtraso( JDesktopPane jDesktopPanel1, JDesktopPane recebeCardsAtv,Aluno aluno) {
        this.jDesktopPanel = jDesktopPanel1;
        this.recebeCardsAtv = recebeCardsAtv;
        this.aluno = aluno;
        
        initComponents();
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        ScrollBarCustom spHorizontal = new ScrollBarCustom();
        spHorizontal.setOrientation(JScrollBar.HORIZONTAL);
        spHorizontal.setUnitIncrement(20);
        spHorizontal.setForeground(new Color(4, 210, 130));
        jScrollPane1.setHorizontalScrollBar(spHorizontal);
       
        preencherAtv1entregue();
        
        /*this.listaAlunoAtividade*/
        
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
     public void preencherAtv1entregue() {
        jLayeredPane1.removeAll();
        Aluno_AtividadeDao atvAluno = new Aluno_AtividadeDao();
         ArrayList<Aluno_Atividade> listaAlunoAtividade = atvAluno.buscarAtividadesDeUmAluno(aluno.getId_aluno());
        int contador=0;
        for (int i = 0; i < listaAlunoAtividade.size(); i++) {
            Aluno_Atividade atividade_Entregue = listaAlunoAtividade.get(i);
            if(atividade_Entregue.getAluno_Ativadade_entrega()){
                java.util.Date data = atividade_Entregue.getAtividade().getData_fim();
                java.util.Date data2 = atividade_Entregue.getAluno_Atividade_data_entrega();
                if (data2.compareTo(data)>0) {
                    CardAtivEntregue cards = new CardAtivEntregue(atividade_Entregue, i+1); 
                    jLayeredPane1.add(cards);
                    contador++;
                }
            
            }}
           
        float porcentagem = (float) contador / listaAlunoAtividade.size();
        porcentagem *= 100;
        if(porcentagem == 0.0){
        porcentagemEntregueAtrasado.setText("0%");
        }else{
        String porcetagemString = String.format("%.2f ", porcentagem);
        porcetagemString+="%";
        porcentagemEntregueAtrasado.setText(porcetagemString);}
        jLayeredPane1.repaint();
        
        
        }
     
       
        
        
         
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        porcentagemEntregueAtrasado = new javax.swing.JTextField();
        texto5 = new javax.swing.JLabel();
        texto6 = new javax.swing.JLabel();
        salvaEntregueAtrasada = new javax.swing.JButton();
        myButton1 = new GUI.swing.MyButton();

        setBackground(new java.awt.Color(246, 246, 249));
        setBorder(null);
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(770, 339));

        jPanel1.setBackground(new java.awt.Color(246, 246, 249));
        jPanel1.setMaximumSize(new java.awt.Dimension(770, 339));
        jPanel1.setMinimumSize(new java.awt.Dimension(770, 339));
        jPanel1.setPreferredSize(new java.awt.Dimension(770, 339));

        jScrollPane1.setBackground(new java.awt.Color(246, 246, 249));
        jScrollPane1.setBorder(null);

        jLayeredPane1.setBackground(new java.awt.Color(246, 246, 249));
        jLayeredPane1.setOpaque(true);
        jLayeredPane1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 33, 25));
        jScrollPane1.setViewportView(jLayeredPane1);

        porcentagemEntregueAtrasado.setEditable(false);
        porcentagemEntregueAtrasado.setBackground(new java.awt.Color(246, 246, 249));
        porcentagemEntregueAtrasado.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        porcentagemEntregueAtrasado.setForeground(new java.awt.Color(79, 93, 117));
        porcentagemEntregueAtrasado.setOpaque(true);
        porcentagemEntregueAtrasado.setSelectionColor(new java.awt.Color(204, 204, 204));

        texto5.setBackground(new java.awt.Color(246, 246, 249));
        texto5.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        texto5.setForeground(new java.awt.Color(79, 93, 117));
        texto5.setText("Atrasou:");

        texto6.setBackground(new java.awt.Color(246, 246, 249));
        texto6.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        texto6.setForeground(new java.awt.Color(79, 93, 117));
        texto6.setText("das atividades ");

        salvaEntregueAtrasada.setBackground(new java.awt.Color(239, 131, 84));
        salvaEntregueAtrasada.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        salvaEntregueAtrasada.setText("Salvar");
        salvaEntregueAtrasada.setToolTipText("");
        salvaEntregueAtrasada.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        salvaEntregueAtrasada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvaEntregueAtrasadaActionPerformed(evt);
            }
        });

        myButton1.setBackground(new java.awt.Color(204, 204, 204));
        myButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/setaBaixo.png"))); // NOI18N
        myButton1.setColor(new java.awt.Color(204, 204, 204));
        myButton1.setRadius(50);
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(porcentagemEntregueAtrasado, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(texto6)
                .addContainerGap(480, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202)
                .addComponent(salvaEntregueAtrasada, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto5)
                    .addComponent(porcentagemEntregueAtrasado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salvaEntregueAtrasada)
                    .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvaEntregueAtrasadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvaEntregueAtrasadaActionPerformed
     for (int i = 0; i < jLayeredPane1.getComponentCount(); i++) {
                CardAtivEntregue checkBoxContainer = (CardAtivEntregue) jLayeredPane1.getComponent(i);
                checkBoxContainer.atualizCards();
                }
                preencherAtv1entregue();
                
                
                
      
    }//GEN-LAST:event_salvaEntregueAtrasadaActionPerformed

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        VisualizarAtvNaoEntregue visuEntreg = new VisualizarAtvNaoEntregue( jDesktopPanel, recebeCardsAtv, aluno);
        recebeCardsAtv.removeAll();
        recebeCardsAtv.add(visuEntreg).setVisible(true);
    }//GEN-LAST:event_myButton1ActionPerformed

    private void porcentagemEntregueAtrasadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porcentagemEntregueAtrasadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_porcentagemEntregueAtrasadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private GUI.swing.MyButton myButton1;
    private javax.swing.JTextField porcentagemEntregueAtrasado;
    private javax.swing.JButton salvaEntregueAtrasada;
    private javax.swing.JLabel texto5;
    private javax.swing.JLabel texto6;
    // End of variables declaration//GEN-END:variables
}
