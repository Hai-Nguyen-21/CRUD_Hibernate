import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	// kết nối vào SQL Server
	// sử dụng bộ điều khiển jtds
	public Connection getConnect() throws SQLException, ClassNotFoundException{
		String hostName = "localhost";
		String sqlInstandName = "DESKTOP-BTQL9MM";
		String databaseName = "DB_QLSV";
		String user = "sa";
		String pass = "21012002";
		return getConnection(hostName, sqlInstandName, databaseName, user, pass);
	}
	
	private static Connection getConnection(String hostName, String sqlInstandName, String databaseName, String user, String pass) 
			throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String url = "jdbc:sqlserver://"+hostName+":1433;"+"databaseName="+databaseName+";";
		return DriverManager.getConnection(url, user, pass);
	}

}
