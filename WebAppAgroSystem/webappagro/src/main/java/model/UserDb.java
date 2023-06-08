package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import beans.LoginBean;
import beans.Record;
import beans.RecordId;
import beans.RegisterBean;


public class UserDb {

    public String insertUser(RegisterBean user1) {

        ConnectionDb bd = new ConnectionDb();
        Connection con = bd.getCon();

        String s1 = null;

        try {
            Statement stmt = (Statement) con.createStatement();
            stmt.executeUpdate("INSERT INTO USERS(userNome,email,senha) values('" + user1.getNome()
                    + "','" + user1.getEmail() + "','" + user1.getSenha() + "')");
            s1 = "Insert concluded";

        } catch (SQLException e) {

            e.printStackTrace();
        }
        return s1;
    }

    public ResultSet autenticacaoUsuario(LoginBean user) {

        ConnectionDb bd = new ConnectionDb();
        Connection con = bd.getCon();
        ResultSet rs = null;

        try {
            String sql = "select Email,senha from users where Email = ? and senha = ?";

            PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql);
            stmt.setString(1, user.getEmail());
            stmt.setString(2, user.getSenha());

            rs = stmt.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rs;

    }

    public List<Record> getRecordsFromDatabase() {
        ConnectionDb bd = new ConnectionDb();
        Connection con = bd.getCon();
        ResultSet rs = null;
        List<Record> records = new ArrayList<>();

        try {
            String sql = "SELECT agendamento.id, atendentes.nome AS nome_atendente, diassemana.dia AS nome_dia_semana, horasdia.hora AS nome_hora_dia, tiposservico.servico AS nome_tipo_servico, agendamento.preco FROM agendamento JOIN atendentes ON agendamento.atendente_id = atendentes.id JOIN diassemana ON agendamento.dia_semana_id = diassemana.id JOIN horasdia ON agendamento.hora_dia_id = horasdia.id JOIN tiposservico ON agendamento.tipo_servico_id = tiposservico.id;";
            Statement statement = (Statement) con.createStatement();
            rs = statement.executeQuery(sql);

            while (rs.next()) {

                int id = rs.getInt("id");
                String atendente = rs.getString("nome_atendente");
                String diaSemana = rs.getString("nome_dia_semana");
                String horaDia = rs.getString("nome_hora_dia");
                String tipoServico = rs.getString("nome_tipo_servico");
                double preco = rs.getDouble("preco");

                Record record = new Record(id, atendente, diaSemana, horaDia, tipoServico, preco);
                records.add(record);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return records;
    }

    public void updateRecord(RecordId user) {

        ConnectionDb bd = new ConnectionDb();
        Connection con = bd.getCon();

        try {

            String consultaPreco = "SELECT preco FROM tiposservico WHERE id = ?";
            double preco = 0.0;

            PreparedStatement statementConsulta = con.prepareStatement(consultaPreco);
            statementConsulta.setInt(1, user.getTipoServico());
            ResultSet resultSet = statementConsulta.executeQuery();

            if (resultSet.next()) {
                preco = resultSet.getDouble("preco");
            }

            String inserirAgendamento = "insert INTO agendamento (dia_semana_id, hora_dia_id, tipo_servico_id, preco, atendente_id ) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement statementInsercao = con.prepareStatement(inserirAgendamento);
            statementInsercao.setInt(1, user.getDiaSemana());
            statementInsercao.setInt(2, user.getHoraDia());
            statementInsercao.setInt(3, user.getTipoServico());
            statementInsercao.setDouble(4, preco);
            statementInsercao.setInt(5, user.getAtendente());

            statementInsercao.executeUpdate();

            statementInsercao.close();
            statementConsulta.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void deleteRecord(int id) {

        ConnectionDb bd = new ConnectionDb();
        Connection con = bd.getCon();
        try {
            PreparedStatement statement = (PreparedStatement) con.prepareStatement("DELETE FROM tabela WHERE id = ?");
            statement.setInt(1, id);

            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}