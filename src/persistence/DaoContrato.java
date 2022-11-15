package persistence;

import model.Contrato;
import model.Endereco;
import util.DateUtils;


import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoContrato extends DAO implements DefaultPersistence<Contrato> {

    private static DaoPessoa daoPessoa = new DaoPessoa();
    private static DaoEndereco daoEndereco = new DaoEndereco();
    private static DaoImovel daoImovel = new DaoImovel();
    private static DaoVendedor daoVendedor = new DaoVendedor();
    private static DaoContrato DaoContrato = new DaoContrato();

    @Override
    public ArrayList<Contrato> findAll() {
        ArrayList<Contrato> listContrato = new ArrayList<>();

        try {
            String query = "SELECT * FROM contrato";
            ResultSet rs = runSQL(query);

            while (rs.next()) {
                Contrato contrato = new Contrato();
                contrato.setCliente(daoPessoa.findById(rs.getInt("cliente")));
                contrato.setFuncionario(daoVendedor.findById(rs.getInt("funcionario")));
                contrato.setImovel(daoImovel.findById(rs.getInt("imovel")));
                contrato.setValor(rs.getDouble("valor"));
                if (rs.getString("dataInicio") != null){
                    contrato.setDataInicio(DateUtils.parseLocalDate(rs.getString("dataInicio")));
                    contrato.setDataTermino(DateUtils.parseLocalDate(rs.getString("dataTermino")));
                }
                contrato.setFormaPagamento(rs.getString("formapagamento"));
                contrato.setPercentualMulta(rs.getDouble("percentualmulta"));
                contrato.setQtdParcelas(rs.getInt("qtdparcelas"));

                listContrato.add(contrato);
            }

        } catch (SQLException e) {
            System.out.println("Falha ao carregar todas as contratos" + e.getMessage());
        }
        return listContrato;
    }

    @Override
    public boolean save(Contrato contrato) {
        try {
            String insert = """

                    INSERT INTO contrato
                    (idcontrato, funcionario, cliente, imovel, valor, datainicio, datatermino, percentualmulta, formapagamento, qtdparcelas)
                    VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

                    """;

            PreparedStatement ps = criarPreparedStatement(insert);
            ps.setInt(1, contrato.getIdcontrato());
            ps.setInt(2, contrato.getFuncionario().getIdvendedor());
            ps.setInt(3, contrato.getCliente().getIdPessoa());
            ps.setInt(4, contrato.getImovel().getIdimovel());
            ps.setDouble(5, contrato.getValor());
            ps.setString(6, DateUtils.formatarDataBR(contrato.getDataInicio()));
            ps.setString(7, DateUtils.formatarDataBR(contrato.getDataTermino()));
            ps.setDouble(8, contrato.getPercentualMulta());
            ps.setString(9, contrato.getFormaPagamento());
            ps.setInt(10, contrato.getQtdParcelas());

            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao adicionar contrato" + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean update(Contrato contrato) {
        try {
            String sql = "update contrato set \n" +
                    "funcionario = ?, \n" +
                    "cliente = ?, \n" +
                    "imovel = ?, \n" +
                    "valor = ?, \n" +
                    "datainicio = ?, \n" +
                    "datatermino = ?, \n" +
                    "percentualmulta = ?, \n" +
                    "formapagamento = ?, \n" +
                    "qtdparcelas = ? \n" +
                    "where idcontrato = 1; " + contrato.getIdcontrato();

            PreparedStatement ps = criarPreparedStatement(sql);
            ps.setInt(1, contrato.getFuncionario().getIdvendedor());
            ps.setInt(2, contrato.getCliente().getIdPessoa());
            ps.setInt(3, contrato.getImovel().getIdimovel());
            ps.setDouble(4, contrato.getValor());
            ps.setString(5, DateUtils.formatarDataBR(contrato.getDataInicio()));
            ps.setString(6, DateUtils.formatarDataBR(contrato.getDataTermino()));
            ps.setDouble(7, contrato.getPercentualMulta());
            ps.setString(8, contrato.getFormaPagamento());
            ps.setInt(9, contrato.getQtdParcelas());


            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Falha ao editar contrato!\n" + e.getMessage());
            return false;
        }
    }

    @Override
    public Contrato findById(int id) {
        Contrato cl = null;

        try {
            String sql = "SELECT * FROM contrato \n" +
                    " where contrato.idcontrato = " + id;

            ResultSet rs = runSQL(sql);

            if (rs.next()) {
                cl = new Contrato();
                cl.setCliente(daoPessoa.findById(rs.getInt("cliente")));
                cl.setFuncionario(daoVendedor.findById(rs.getInt("funcionario")));
                cl.setImovel(daoImovel.findById(rs.getInt("imovel")));
                cl.setValor(rs.getDouble("valor"));
                if (rs.getString("dataInicio")!= null) {
                    cl.setDataInicio(DateUtils.parseLocalDate(rs.getString("dataInicio")));
                    cl.setDataTermino(DateUtils.parseLocalDate(rs.getString("dataTermino")));
                }
                cl.setFormaPagamento(rs.getString("formapagamento"));
                cl.setPercentualMulta(rs.getDouble("percentualmulta"));
                cl.setQtdParcelas(rs.getInt("qtdparcelas"));
            }
        } catch (SQLException e) {
            System.out.println("Falha ao carregar contrato!\n"
                    + e.getMessage());
        }
        return cl;
    }

    @Override
    public void delete(int id){
    }
}
