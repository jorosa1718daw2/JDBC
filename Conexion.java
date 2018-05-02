package jdbc_PR;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {


    //static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/jdbc?autoReconnect=true&useSSL=false";
    static final String USER = "root";
    static final String PASS = "mrcali95";

    public static Connection getConnection() {
        try {
            DriverManager.registerDriver(new Driver());
            System.out.println("Connecting to database...");

            return DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException ex) {
            throw new RuntimeException("Error al conectar a la BD", ex);
        }
    }
}
