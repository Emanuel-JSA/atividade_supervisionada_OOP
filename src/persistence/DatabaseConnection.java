package persistence;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

public class DatabaseConnection {
    private static Connection con = null;
  
    private static void createConnection()
    {
        String url = "jdbc:postgresql://localhost:5432/as_database";
        String user = "postgres";
        String pass = "root";
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexão con o banco de dados realizada com sucesso!");
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection()
    {
        try {
            if(con==null || con.isClosed()){
                createConnection();
            }
        } catch (SQLException ex) {
            System.out.println("Falha ao obter conexão");
        }
        return con;
    }
    
    
}
