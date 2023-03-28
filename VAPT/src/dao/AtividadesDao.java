package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import conexoes.Conection;
import modelo.Atividades;


/**
 * <h1>Classe de modificação na tabela Atividades</h1>
 * <h2>Métodos</h2>
 * <ul>
 *      <li>adicionar()</li>
 * 
 * </ul>
 * 
 */

public class AtividadesDao {

    private Connection conexao;
    private PreparedStatement stmt;
    private ResultSet rs;
    private ArrayList<Atividades> lista;

    public AtividadesDao() {
        this.conexao = new Conection().getConnection();
    }

    /** 
     * 
     * <p>Esse método recebe como parâmetro um Objeto da Classe Atividades que será inserido no banco de dados</p>
    */
    public void adicionar(Atividades atividades) {
        String sql = "INSERT INTO atividade(tipo, descricao, data_inicio, data_fim, Turma_id_turma) VALUES(?, ?, ?, ?, ?)";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, atividades.getTipo());
            stmt.setString(2, atividades.getDescricao());
            stmt.setDate(3, atividades.getData_inicio());
            stmt.setDate(4, atividades.getData_fim());
            stmt.setInt(5, atividades.getTurma_id_turma());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null,"Ativididade Cadastrada com Sucesso!");

        } catch (SQLException exception) {
            // TODO: handle exception
            
            JOptionPane.showMessageDialog(null, exception);
        }
    }


}