package connect;
import java.sql.*;
public class DBConnection {
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String url = "jdbc:sqlserver://localhost:1433;databaseName=DB_QLSV1";
		
		
		return DriverManager.getConnection(url, "sa", "21012002");
	}
}
