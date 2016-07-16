import java.sql.*;

public class Main {

    public static void main(String[] args) {
        String DriverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String DBUrl = "jdbc:sqlserver://192.168.1.104:1433;databaseName=Viva";
        String UserName = "sa";
        String Password = "Viva.3074";
        String sql = "CREATE TABLE Tomas(id INT,username VARCHAR(30),age INT,category VARCHAR(15))";

        try {
            // 连接数据库
            Class.forName(DriverName);
            Connection con = DriverManager.getConnection(DBUrl, UserName, Password);
            System.out.println("Connect to SQL Server Success !");
            // 创建表
            Statement sm = con.createStatement();
            sm.execute(sql);
            System.out.println("Create table success !");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
