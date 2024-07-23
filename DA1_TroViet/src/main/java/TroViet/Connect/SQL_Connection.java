package TroViet.Connect;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author WINDOWS
 */
public class SQL_Connection {

    public static Connection con = null;

    public SQL_Connection() {
        try {
            String username = "nhatro";
            String password = "123456";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=nhatro;Encrypt=True;TrustServerCertificate=True";
            if (con == null) {
                con = DriverManager.getConnection(url, username, password);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
