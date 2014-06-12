package javanatela;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public static Connection getConnection() {

        try {

            Class.forName("com.mysql.jdbc.Driver");            
            Connection conn = DriverManager
                .getConnection(
                "jdbc:mysql://localhost:3306/nomebancodedados",
                "usuario", "senha");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
		return null;
    }

}
