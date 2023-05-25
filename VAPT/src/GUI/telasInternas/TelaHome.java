/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI.telasInternas;

import GUI.card.CardAtividadesAlunosDevendo;
import GUI.card.CardDeTurma;
import GUI.swing.ScrollBarCustom;
import dao.AtividadesDao;
import dao.Dia_SemanaDao;
import dao.TurmaDao;
import modelo.Atividades;
import modelo.Turma;

import java.awt.Color;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JDesktopPane;
import javax.swing.JScrollBar;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Fatec
 */
public class TelaHome extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaHome
     */

    private Turma turma = new Turma();
    
    private int novoGapConteiner=259;
    private JDesktopPane jDesktopPane;
    private int componentPref = 259;
    
    public TelaHome(JDesktopPane jDesktopPane ){
        pegarTurmaDeAgora();
        this.jDesktopPane = jDesktopPane;
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);


        ScrollBarCustom spHorizontal = new ScrollBarCustom();
        spHorizontal.setOrientation(JScrollBar.HORIZONTAL);
        spHorizontal.setUnitIncrement(20);
        spHorizontal.setForeground(new Color(4, 210, 130));
        jScrollPane1.setHorizontalScrollBar(spHorizontal);
        if (turma.getId_turma()!=0) {
            preencherTela();
            
        }
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setResizable(true);
        setPreferredSize(new java.awt.Dimension(1018, 639));

        jScrollPane1.setBackground(new java.awt.Color(242, 242, 242));
        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        jLayeredPane1.setBackground(new java.awt.Color(242, 242, 242));
        jLayeredPane1.setName(""); // NOI18N
        jLayeredPane1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 22, 15));
        jScrollPane1.setViewportView(jLayeredPane1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(239, 131, 84));
        jLabel1.setText("Turma: ");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/schoolred.png"))); // NOI18N
        jLabel2.setText("Escola:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 907, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1)
                        .addGap(244, 244, 244)
                        .addComponent(jLabel2)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void pegarTurmaDeAgora() {
        Calendar calendario = Calendar.getInstance();
        int dia = calendario.get(Calendar.DAY_OF_WEEK);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        String horaAgora = sdf.format(calendario.getTime());
        Dia_SemanaDao dia_SemanaDao = new Dia_SemanaDao();
        int turmaId = 0;
        
        switch (dia) {
            case 2:
                turmaId=dia_SemanaDao.buscarTurmaDeAgora(horaAgora, "Segunda");
                break;
        
            case 3:
                turmaId=dia_SemanaDao.buscarTurmaDeAgora(horaAgora, "Terça");
                break;
        
            case 4:
                turmaId=dia_SemanaDao.buscarTurmaDeAgora(horaAgora, "Quarta");
                break;
        
            case 5:
                turmaId=dia_SemanaDao.buscarTurmaDeAgora(horaAgora, "Quinta");
                break;
        
            case 6:
                turmaId=dia_SemanaDao.buscarTurmaDeAgora(horaAgora, "Sexta");
                break;
        
            default:
                break;
        }
        
        
        if (turmaId!=0) {
            
            TurmaDao turmaDao = new TurmaDao();
            turma = turmaDao.buscarPorId(turmaId);
        
            turma.buscarAtividades();

            if(turma.getAtividadesDaTurma().size()>4){
                novoGapConteiner=30;
                componentPref = 482;
            }
        }
    }
    
    public void preencherTela() {
        jLabel1.setText(jLabel1.getText()+turma.getNome());
        jLabel2.setText(jLabel2.getText()+" "+ turma.getNome_escola());
        ArrayList<Atividades> listaAtividades = turma.getAtividadesDaTurma();
        
        for (int i = 0; i < listaAtividades.size(); i++) {
            Atividades atividade = listaAtividades.get(i);
            CardAtividadesAlunosDevendo card = new CardAtividadesAlunosDevendo(atividade, i+1, jDesktopPane, turma);
            jLayeredPane1.add(card);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
