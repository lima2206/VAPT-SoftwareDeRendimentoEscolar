package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import conexoes.Conection;
import modelo.Dia_Semana;


public class Dia_SemanaDao {
    
    private Connection conexao;
    private PreparedStatement stmt;
    private ResultSet rs;
    private ArrayList<Dia_Semana> lista;

    public Dia_SemanaDao() {
        this.conexao = new Conection().getConnection();
        this.lista = new ArrayList<>();
    }

    public void adicionar(Dia_Semana dia_Semana) {
        String sql = "INSERT INTO dia_semana(Turma_id_turma, dia, hora_inicio, hora_fim) VALUES(?, ?, ?, ?)";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, dia_Semana.getTurma_id_turma());
            stmt.setString(2, dia_Semana.getDia());
            stmt.setString(3, dia_Semana.getHora_inicio());
            stmt.setString(4, dia_Semana.getHora_fim());
            stmt.execute();
            stmt.close();
            //JOptionPane.showMessageDialog(null,"Dia_semana Cadastrada com Sucesso!");

        } catch (SQLException exception) {
            // TODO: handle exception
            
            JOptionPane.showMessageDialog(null, exception);
        }
    }

    public int buscarTurmaDeAgora(String horaAtual, String dia) {
        String sql = "SELECT * FROM dia_semana WHERE hora_inicio <= ? and  hora_fim >= ? and dia = ?";
        try {
            this.conexao = new Conection().getConnection();
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, horaAtual);
            stmt.setString(2, horaAtual);
            stmt.setString(3, dia);
            rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("Turma_id_turma");

                
            }
            return 0;
        } catch (SQLException exception) {
            // TODO: handle exception
            throw new RuntimeException(exception);
        }

        
    }


}
