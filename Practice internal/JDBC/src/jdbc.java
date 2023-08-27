import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
public class jdbc {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String db = "jdbc:mysql://127.0.0.1:3306/?user=root";
            String user = "root";
            String pass = "root";
            Connection con = DriverManager.getConnection(db, user, pass);

            if (con.isClosed())
                System.out.println("Connection is closed");
            System.out.println("Connected!.");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

