package persistence;

import model.Imovel;
import model.Pessoa;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoImovel extends DAO implements DefaultPersistence<Imovel> {
    @Override
    public ArrayList<Imovel> findAll() {
        ArrayList<Imovel> listImovel = new ArrayList<>();

        try{
            String query = "SELECT * FROM imovel";
            ResultSet rs = runSQL(query);

            while (rs.next()) {
                Imovel imovel = new Imovel();
                imovel.setIdimovel(rs.getInt("idimovel"));
                imovel.setMatriculaimovel(rs.getString("matriculaimovel"));
                imovel.setTipo(rs.getString("tipo"));
                imovel.setComprimento(rs.getDouble("comprimento"));
                imovel.setLargura(rs.getDouble("largura"));
                imovel.setValor(rs.getDouble("valor"));
                imovel.setCadpro(rs.getDouble("cadpro"));

                listImovel.add(imovel);
            }


        } catch (SQLException e) {
            System.out.println("Falha ao carregar todas as imoveis" + e.getMessage());
        }
        return listImovel;
    }

    @Override
    public boolean save(Imovel imovel) {
        try {
            String insert = "INSERT INTO imovel(matriculaimovel, tipo, comprimento, largura, valor, cadpro, endereco)"
                    + " VALUES (?,?,?,?,?,?,?)";

            PreparedStatement ps = criarPreparedStatement(insert);
            ps.setString(1, imovel.getMatriculaimovel());
            ps.setString(3, imovel.getTipo());
            ps.setDouble(4, imovel.getComprimento());
            ps.setDouble(5,imovel.getLargura());
            ps.setDouble(6, imovel.getValor());
            ps.setDouble(7, imovel.getCadpro());
            ps.setInt(8, imovel.getEndereco().getIdendereco());

            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao adicionar imovel" + e.getMessage());
            return false;
        }

    }

    @Override
    public boolean update(Imovel imovel) {
        try {
            String sql = "UPDATE imovel\n"
                    + "SET idimovel=?, matriculaimovel=?, tipo=?, comprimento=?, largura=?, valor=?, cadpro=?\n"
                    + " WHERE idimovel= " + imovel.getIdimovel();

            PreparedStatement ps = criarPreparedStatement(sql);
            ps.setString(2, imovel.getMatriculaimovel());
            ps.setString(4, imovel.getTipo());
            ps.setDouble(5, imovel.getComprimento());
            ps.setDouble(6,imovel.getLargura());
            ps.setDouble(7, imovel.getValor());
            ps.setDouble(8, imovel.getCadpro());

            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Falha ao editar imovel!\n" + e.getMessage());
            return false;
        }
    }

    @Override
    public Imovel findById(int id) {
        Imovel cl = null;

        try {
            String sql = "SELECT * FROM imovel \n" +
                    " where imovel.idimovel = " + id;

            ResultSet rs = runSQL(sql);

            if (rs.next()) {
                cl = new Imovel();
                cl.setIdimovel(rs.getInt("idimovel"));
                cl.setMatriculaimovel(rs.getString("matriculaimovel"));
                cl.setTipo(rs.getString("tipo"));
                cl.setComprimento(rs.getDouble("comprimento"));
                cl.setLargura(rs.getDouble("largura"));
                cl.setValor(rs.getDouble("valor"));
                cl.setCadpro(rs.getDouble("cadpro"));
            }
        } catch (SQLException e) {
            System.out.println("Falha ao carregar imovel!\n"
                    + e.getMessage());
        }
        return cl;
    }

    @Override
    public void delete(int id) {
        try {
            String sql = "DELETE FROM imovel\n" +
                         "WHERE idimovel = " + id;
            executeSql(sql);

        }catch (SQLException e) {
            System.out.println("Falha ao deletar!\n"
                               + e.getMessage());
        }
    }
}
