import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class DAO {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	private Users users = null;
	private List<Users> listU = new ArrayList<>();
	
	public Users checkLogin(String user, String pass) {
		String query = "SELECT * FROM USERS WHERE username = ? AND upassword = ?";
		
		try {
			conn = new DBConnection().getConnect();
			ps = conn.prepareStatement(query);
			ps.setString(1, user);
			ps.setString(2, pass);
			rs = ps.executeQuery();
			while (rs.next()) {
				users = new Users();
				users.setUserName(rs.getString(1));
				users.setPassWord(rs.getString(2));
				
				return users;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
}
