import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MyConnection {
public static Connection con=null;

	public static Connection makeConnection() {
		try {
			// load and register driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//String url = protocol://Hostname:portNumber; databaseName
			String url = "jdbc.sqlserver://A205\\SQLEXPRESS01:52752;databaseName = Lab03";
			con = DriverManager.getConnection(url, "sa", "1122");
			System.out.println("Connection is established..");
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Connection failed");
		}
		
		return con;
	}
}
