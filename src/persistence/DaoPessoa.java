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
                Pessoa pessoa = new Pessoa();
                pessoa.setIdPessoa(rs.getInt("idpessoa"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setCpf(rs.getInt("cpf"));

                listPessoa.add(pessoa);
            }

        } catch (SQLException e) {
            System.out.println("Falha ao carregar todas as pessoas" + e.getMessage());
        }
        return listPessoa;
    }

    @Override
    public boolean save(Pessoa pessoa) {
        try {
            String insert = "INSERT INTO pessoa(nome, cpf)\n"
                    + " VALUES (?, ?)";

            PreparedStatement ps = criarPreparedStatement(insert);
            ps.setString(1, pessoa.getNome());
            ps.setInt(2, pessoa.getCpf());

            ps.execute();
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
                    + " WHERE idpessoa= " + pessoa.getIdPessoa();

            PreparedStatement ps = criarPreparedStatement(sql);
            ps.setString(1, pessoa.getNome());
            ps.setInt(2, pessoa.getCpf());

            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Falha ao editar pessoa!\n" + e.getMessage());
            return false;
        }
    }

    @Override
    public Pessoa findById(int id) {
        Pessoa cl = null;

        try {
                String sql = "SELECT * FROM pessoa \n" +
                        " where pessoa.idpessoa = " + id;

            ResultSet rs = runSQL(sql);

            if (rs.next()) {
                cl = new Pessoa();
                cl.setIdPessoa(rs.getInt("idpessoa"));
                cl.setNome(rs.getString("nome"));
                cl.setCpf(rs.getInt("cpf"));
            }
        } catch (SQLException e) {
            System.out.println("Falha ao carregar pessoa!\n"
                    + e.getMessage());
        }
        return cl;
    }
}
