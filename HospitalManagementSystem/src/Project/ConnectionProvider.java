package Project;
import java.sql.*;

public class ConnectionProvider {
    public static Connection getCon(){
    try {
        //Open connection
            Class.forName("com.mysql.cj.jdbc.Driver");      //opening database connections, interacting with database and closing database connections.    
            //Creating a connection
            String url = "jdbc:mysql://localhost:3306/hms1";
            String username = "root";
            String password = "admin";
            Connection con = DriverManager.getConnection(url,username,password);        //open a database connection.
            return con;
            
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }
    }
    
}