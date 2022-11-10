package persistence;

import model.Endereco;
import model.Pessoa;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoEndereco extends DAO implements DefaultPersistence<Endereco>{

    @Override
    public ArrayList<Endereco> findAll() {
        ArrayList<Endereco> listEndereco = new ArrayList<>();

        try{
            String query = "SELECT * FROM endereco";
            ResultSet rs = runSQL(query);

            while (rs.next()) {
                Endereco endereco = new Endereco();
                endereco.setIdendereco(rs.getInt("idendereco"));
                endereco.setRua(rs.getString("rua"));
                endereco.setNumero(rs.getInt("numero"));
                endereco.setCidade(rs.getString("cidade"));

                listEndereco.add(endereco);
            }

        } catch (SQLException e) {
            System.out.println("Falha ao carregar todas as enderecos" + e.getMessage());
        }
        return listEndereco;
    }

    @Override
    public boolean save(Endereco endereco) {
        try {
            String insert = "INSERT INTO endereco(rua, numero, cidade)\n"
                    + " VALUES (?, ?, ?)";

            PreparedStatement ps = criarPreparedStatement(insert);
            ps.setString(1, endereco.getRua());
            ps.setInt(2, endereco.getNumero());
            ps.setString(3, endereco.getCidade());

            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao adicionar endereco" + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean update(Endereco endereco) {
        try {
            String sql = "UPDATE endereco\n"
                    + "SET rua=?, numero=?, cidade=?\n"
                    + " WHERE idendereco= " + endereco.getIdendereco();

            PreparedStatement ps = criarPreparedStatement(sql);
            ps.setString(1, endereco.getRua());
            ps.setInt(2, endereco.getNumero());
            ps.setString(3, endereco.getCidade());

            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Falha ao editar endereco!\n" + e.getMessage());
            return false;
        }
    }

    @Override
    public Endereco findById(int id) {
        Endereco cl = null;

        try {
            String sql = "SELECT * FROM endereco \n" +
                    " where endereco.idendereco = " + id;

            ResultSet rs = runSQL(sql);

            if (rs.next()) {
                cl = new Endereco();
                cl.setRua(rs.getString("rua"));
                cl.setNumero(rs.getInt("numero"));
                cl.setCidade(rs.getString("cidade"));
            }
        } catch (SQLException e) {
            System.out.println("Falha ao carregar endereco!\n"
                    + e.getMessage());
        }
        return cl;
    }
}
