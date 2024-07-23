package TroViet.Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQL_Connection {

    public static Connection con = null;

    public SQL_Connection() {
        try {
            String username = "TROVIET";
            String password = "123456";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=TroViet;encrypt=false";

            if (con == null) {
                con = DriverManager.getConnection(url, username, password);
                System.out.println("Kết nối thành công!");
            }
        } catch (SQLException e) {
            System.err.println("Kết nối thất bại! Kiểm tra lại thông tin kết nối.");
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        if (con == null) {
            new SQL_Connection();
        }
        return con;
    }
}
