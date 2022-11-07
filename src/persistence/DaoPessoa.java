package persistence;

import model.Pessoa;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoPessoa extends DAO implements DefaultPersistence<Pessoa>{

    public DaoPessoa() {
    }

    @Override
    public ArrayList<Pessoa> findAll() {
        ArrayList<Pessoa> listPessoa = new ArrayList<>();

        try{
            String query = "SELECT * FROM pessoa";
            ResultSet rs = runSQL(query);

            while (rs.next()) {
                Pessoa p = new Pessoa();
                p.setId(rs.getInt("idpessoa"));
                p.setNome(rs.getString("nome"));
                p.setCpf(rs.getString("cpf"));

                listPessoa.add(p);
            }


        } catch (SQLException e) {
            System.out.println("Falha ao carregar todas as pessoas" + e.getMessage());
        }
        return listPessoa;
    }

    @Override
    public boolean save(Pessoa pessoa) {
        try {
            String insert = "INSERT INTO pessoa( id, nome, cpf)\n"
                    + " VALUES (?, ?, ?)";

            PreparedStatement ps = criarPreparedStatement(insert);
            pessoa.setId(gerarProximoId("pessoa"));
            ps.setInt(1, pessoa.getId());
            ps.setString(2, pessoa.getNome());
            ps.setString(3, pessoa.getCpf());

            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao adicionar pessoa" + e.getMessage());
            return false;
        }

    }

    @Override
    public boolean update(Pessoa pessoa) {
        try {
            String sql = "UPDATE pessoa\n"
                    + "SET nome=?, cpf=?\n"
                    + " WHERE id= " + pessoa.getId();

            PreparedStatement ps = criarPreparedStatement(sql);
            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getCpf());

            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Falha ao editar pessoa!\n" + e.getMessage());
            return false;
        }
    }

    @Override
    public Pessoa findById(String query) {
        Pessoa cl = null;

        try {
            String sql = "SELECT * FROM pessoa \n" +
                    " where pessoa.idpessoa = " + query +
                    " or pessoa.nome = " + query +
                    " or pessoa.cpf = " + query;

            ResultSet rs = runSQL(sql);

            if (rs.next()) {
                cl = new Pessoa();
                cl.setId(rs.getInt("id"));
                cl.setNome(rs.getString("nome"));
                cl.setCpf(rs.getString("cpf"));
            }
        } catch (SQLException e) {
            System.out.println("Falha ao carregar pessoa!\n"
                    + e.getMessage());
        }
        return cl;
    }
}
