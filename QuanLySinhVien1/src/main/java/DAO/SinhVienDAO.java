package DAO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import connect.DBConnection;
import entity.*;

public class SinhVienDAO {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	private List<SinhVien> listSV = new ArrayList<>();
	private List<KhoaNganh> listKN = new ArrayList<>();
	private SinhVien sv = null;
	private KhoaNganh kn = null;
	
	public boolean add(SinhVien sv) {
		String query = "INSERT INTO SINHVIEN VALUES(?, ?, ?, ?, ?, ?)";
		
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, sv.getIdSV());
			ps.setString(2, sv.getNameSV());
			ps.setString(3, sv.getIdKN());
			ps.setString(4, sv.getCCCD());
			ps.setString(5, sv.getPhoneNum());
			ps.setString(6, sv.getMail());
			
			return ps.executeUpdate() >0;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean update(SinhVien sv) {
		String query = "UPDATE SINHVIEN SET Hoten = ?, MaKN = ?, CMND = ?, DienThoai = ?, email = ? WHERE Masv = ?";
		
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(6, sv.getIdSV());
			ps.setString(1, sv.getNameSV());
			ps.setString(2, sv.getIdKN());
			ps.setString(3, sv.getCCCD());
			ps.setString(4, sv.getPhoneNum());
			ps.setString(5, sv.getMail());
			
			return ps.executeUpdate() >0;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean delete(String id) {
		String query = "DELETE FROM SINHVIEN WHERE Masv = ?";
		
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, id);
			
			return ps.executeUpdate() >0;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	
	public List<SinhVien> getAllSV(){
		String query = "SELECT * FROM SINHVIEN";
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				sv = new SinhVien();
				sv.setIdSV(rs.getString(1));
				sv.setNameSV(rs.getString(2));
				sv.setIdKN(rs.getString(3));
				sv.setCCCD(rs.getString(4));
				sv.setPhoneNum(rs.getString(5));
				sv.setMail(rs.getString(6));
				
				listSV.add(sv);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return listSV;
	}
	
	public List<KhoaNganh> getAllKN(){
		String query = "SELECT * FROM KHOANGANH";
		
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				kn = new KhoaNganh();
				kn.setIdKN(rs.getString(1));
				kn.setNameKN(rs.getString(2));
				
				listKN.add(kn);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return listKN;
	}
	
	public SinhVien getSVByID(String id) {
		String query = "SELECT * FROM SINHVIEN WHERE Masv = ?";
		sv = new SinhVien();
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(query);
			ps.setString(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				sv.setIdSV(rs.getString(1));
				sv.setNameSV(rs.getString(2));
				sv.setIdKN(rs.getString(3));
				sv.setCCCD(rs.getString(4));
				sv.setPhoneNum(rs.getString(5));
				sv.setMail(rs.getString(6));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return sv;
	}
	
//	public List<SinhVien> fillTable(){
//		listSV.add(new SinhVien("SV001", "NGUY???N L?? H???I", "CNTT", "001202037271", "0977256375", "HAINL@MAIL"));
//		listSV.add(new SinhVien("SV002", "V?? KH??NH NG??N", "MARKETING", "001202037362", "0977256375", "NGANVK@MAIL"));
//		listSV.add(new SinhVien("SV003", "TR???N VI???T B???O", "Y ??A KHOA", "001294738271", "0977256375", "BAOTV@MAIL"));
//		listSV.add(new SinhVien("SV004", "NGUY???N TI???N D???NG", "K??? THU???T", "001202083927", "0977256375", "DUNGNT@MAIL"));
//		listSV.add(new SinhVien("SV005", "L?? TH??NH ?????T", "QTKD", "001202648104", "0977256375", "DATLT@MAIL"));
//		return listSV;
//	}
	
//	public static void main(String[] args) {
//		SinhVienDAO dao = new SinhVienDAO();
//		for (KhoaNganh o : dao.getAllKN()) {
//			System.out.println(o.getIdKN());
//		}
//	}
}
