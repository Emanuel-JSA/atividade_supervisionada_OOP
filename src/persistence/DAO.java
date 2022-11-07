package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
    private final Connection connection;

    public DAO() {
        connection = DatabaseConnection.getConnection();
    }


    public Connection getConnection() {
        return connection;
    }

    public ResultSet runSQL(String comandoSql) throws SQLException {
        return connection.createStatement().executeQuery(comandoSql);
    }

    protected int gerarProximoId(String tabela){
        try {
            ResultSet rs = runSQL("select max(id) from "+tabela);
            if(rs.next()){
                return rs.getInt(1) + 1;
            }
        } catch (SQLException ex) {
            System.out.println("falha ao gerar próximo ID\n"+ ex.getMessage());
        }
        return -1;
    }

    public PreparedStatement criarPreparedStatement(String sql) throws SQLException{
        return connection.prepareStatement(sql);
    }

    public void executeSql(String sql) throws SQLException{
        Statement st =  connection.createStatement();
        st.executeUpdate(sql);
        st.close();
    }
}
