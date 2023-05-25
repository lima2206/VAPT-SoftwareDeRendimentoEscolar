/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI.telasInternas;




import GUI.card.CardAtviNaoEntregue;
import GUI.componentes.CheckBoxContainer;
import GUI.swing.ScrollBarCustom;
import dao.Aluno_AtividadeDao;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JDesktopPane;
import javax.swing.JScrollBar;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import modelo.Aluno;
import modelo.Aluno_Atividade;
import modelo.Atividades;

/**
 *
 * @author neyra
 */
public class VisualizarAtvNaoEntregue extends javax.swing.JInternalFrame {
    private Aluno_Atividade aluno_atividade = new Aluno_Atividade();
    private JDesktopPane jDesktopPane;
    private JDesktopPane recebeCardsAtv;
    private Aluno aluno;
    private Atividades atividades;
    javax.swing.JDesktopPane jDesktopPanePrincipal;

    
    public VisualizarAtvNaoEntregue( JDesktopPane jDesktopPanel1, JDesktopPane recebeCardsAtv, Aluno aluno) {
        this.jDesktopPane = jDesktopPanel1;
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
      
        preencherAtvNaoEntregue();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    public void preencherAtvNaoEntregue() {
        jLayeredPane2.removeAll();
        Aluno_AtividadeDao atvAluno = new Aluno_AtividadeDao();
         ArrayList<Aluno_Atividade> listaAlunoAtividade = atvAluno.buscarAtividadesDeUmAluno(aluno.getId_aluno());
        int contador = 0;
        for (int i = 0; i < listaAlunoAtividade.size(); i++) {
            Aluno_Atividade atividade_Entregue = listaAlunoAtividade.get(i);
            if(atividade_Entregue.getAluno_Ativadade_entrega() == false){
                CardAtviNaoEntregue cards = new CardAtviNaoEntregue(atividade_Entregue, i+1); 
                jLayeredPane2.add(cards);
                
                contador++;
            }

        }
        
        
        float porcentagem = (float) contador / listaAlunoAtividade.size();
        porcentagem *= 100;
        if(porcentagem == 0.0){
        porcentagemNaoEntregue.setText("0%");
        }else{
        String porcetagemString = String.format("%.2f ", porcentagem);
        porcetagemString+="%";
        porcentagemNaoEntregue.setText(porcetagemString);
        }
        jLayeredPane2.revalidate();
        jLayeredPane2.repaint();    
        }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        porcentagemNaoEntregue = new javax.swing.JTextField();
        texto5 = new javax.swing.JLabel();
        texto6 = new javax.swing.JLabel();
        chamaAtvAtrasada = new GUI.swing.MyButton();
        jButton1 = new GUI.swing.MyButton();

        setBackground(new java.awt.Color(246, 246, 249));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(770, 339));
        setMinimumSize(new java.awt.Dimension(770, 339));
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(770, 339));

        jPanel1.setBackground(new java.awt.Color(246, 246, 249));

        jScrollPane1.setBackground(new java.awt.Color(246, 246, 249));
        jScrollPane1.setBorder(null);

        jLayeredPane2.setBackground(new java.awt.Color(246, 246, 249));
        jLayeredPane2.setOpaque(true);
        jLayeredPane2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 33, 25));
        jScrollPane1.setViewportView(jLayeredPane2);

        porcentagemNaoEntregue.setEditable(false);
        porcentagemNaoEntregue.setBackground(new java.awt.Color(246, 246, 249));
        porcentagemNaoEntregue.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        porcentagemNaoEntregue.setForeground(new java.awt.Color(79, 93, 117));
        porcentagemNaoEntregue.setSelectionColor(new java.awt.Color(204, 204, 204));
        porcentagemNaoEntregue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porcentagemNaoEntregueActionPerformed(evt);
            }
        });

        texto5.setBackground(new java.awt.Color(236, 236, 236));
        texto5.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        texto5.setForeground(new java.awt.Color(79, 93, 117));
        texto5.setText("Não Entregou:");

        texto6.setBackground(new java.awt.Color(236, 236, 236));
        texto6.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        texto6.setForeground(new java.awt.Color(79, 93, 117));
        texto6.setText("das atividades ");

        chamaAtvAtrasada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/setaBaixo.png"))); // NOI18N
        chamaAtvAtrasada.setColor(new java.awt.Color(204, 204, 204));
        chamaAtvAtrasada.setRadius(50);
        chamaAtvAtrasada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chamaAtvAtrasadaActionPerformed(evt);
            }
        });

        jButton1.setForeground(new java.awt.Color(1, 30, 54));
        jButton1.setText("Salvar");
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setMaximumSize(new java.awt.Dimension(157, 40));
        jButton1.setMinimumSize(new java.awt.Dimension(157, 40));
        jButton1.setPreferredSize(new java.awt.Dimension(157, 40));
        jButton1.setRadius(10);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chamaAtvAtrasada, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(porcentagemNaoEntregue, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(texto6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto5)
                    .addComponent(porcentagemNaoEntregue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chamaAtvAtrasada, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

    private void porcentagemNaoEntregueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porcentagemNaoEntregueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_porcentagemNaoEntregueActionPerformed

    private void chamaAtvAtrasadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chamaAtvAtrasadaActionPerformed
        VisualizarAtvEntregueComAtraso visuAtvAtraso = new VisualizarAtvEntregueComAtraso( jDesktopPane, recebeCardsAtv, aluno);
        recebeCardsAtv.removeAll();
        recebeCardsAtv.add(visuAtvAtraso).setVisible(true);
    }//GEN-LAST:event_chamaAtvAtrasadaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    for (int i = 0; i < jLayeredPane2.getComponentCount(); i++) {
                CardAtviNaoEntregue checkBoxContainer = (CardAtviNaoEntregue) jLayeredPane2.getComponent(i);
                checkBoxContainer.atualizCards();
    }
    preencherAtvNaoEntregue();    
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.swing.MyButton chamaAtvAtrasada;
    private GUI.swing.MyButton jButton1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField porcentagemNaoEntregue;
    private javax.swing.JLabel texto5;
    private javax.swing.JLabel texto6;
    // End of variables declaration//GEN-END:variables
}
