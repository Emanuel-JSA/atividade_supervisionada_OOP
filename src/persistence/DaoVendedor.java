package persistence;

import model.Vendedor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoVendedor extends DAO implements DefaultPersistence<Vendedor>{
    @Override
    public ArrayList<Vendedor> findAll() {
        ArrayList<Vendedor> listVendedor = new ArrayList<>();

        try{
            String query = "SELECT * FROM vendedor";
            ResultSet rs = runSQL(query);

            while (rs.next()) {
                Vendedor vendedor = new Vendedor();
                vendedor.setIdvendedor(rs.getInt("idvendedor"));
                vendedor.setPercentualcomissao(rs.getDouble("percentualcomissao"));
                vendedor.setSalario(rs.getDouble("salario"));

                listVendedor.add(vendedor);
            }


        } catch (SQLException e) {
            System.out.println("Falha ao carregar todas as vendedors" + e.getMessage());
        }
        return listVendedor;
    }

    @Override
    public boolean save(Vendedor vendedor) {

        DaoPessoa daoPessoa = new DaoPessoa();
        daoPessoa.save(vendedor);

        try {
            String insert = "INSERT INTO vendedor(percentualcomissao, salario)\n"
                    + " VALUES (?, ?)";

            PreparedStatement ps = criarPreparedStatement(insert);
            ps.setDouble(1, vendedor.getPercentualcomissao());
            ps.setDouble(2, vendedor.getSalario());

            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao adicionar vendedor" + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean update(Vendedor vendedor) {

        DaoPessoa daoPessoa = new DaoPessoa();
        daoPessoa.update(vendedor);

        try {
            String sql = "UPDATE vendedor\n"
                    + "SET percentualcomissao=?, salario=?\n"
                    + " WHERE idvendedor= " + vendedor.getIdvendedor();

            PreparedStatement ps = criarPreparedStatement(sql);
            ps.setDouble(1, vendedor.getPercentualcomissao());
            ps.setDouble(2, vendedor.getSalario());

            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Falha ao editar vendedor!\n" + e.getMessage());
            return false;
        }
    }

    @Override
    public Vendedor findById(int id) {
        Vendedor cl = null;

        try {
            String sql = "SELECT * FROM vendedor \n" +
                    " where vendedor.idvendedor = " + id;

            ResultSet rs = runSQL(sql);

            if (rs.next()) {
                cl = new Vendedor();
                cl.setIdvendedor(rs.getInt("idvendedor"));
                cl.setPercentualcomissao(rs.getDouble("percentualcomissao"));
                cl.setSalario(rs.getDouble("salario"));
            }
        } catch (SQLException e) {
            System.out.println("Falha ao carregar vendedor!\n"
                    + e.getMessage());
        }
        return cl;
    }

    @Override
    public void delete(int id) {
        try {
            String sql = "DELETE FROM vendedor\n" +
                         "WHERE idvendedor = " + id;
            executeSql(sql);

        }catch (SQLException e) {
            System.out.println("Falha ao deletar!\n"
                               + e.getMessage());
        }
    }
}
