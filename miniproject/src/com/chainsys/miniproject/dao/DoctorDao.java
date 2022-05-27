package com.chainsys.miniproject.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.chainsys.miniproject.pojo.Doctor;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class DoctorDao {
	public static Connection getConnection() {
		String drivername = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String pwd = "oracle";
		try {
			Class.forName(drivername);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, pwd);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	private static java.sql.Date convertToSqlDate(java.util.Date date) {
		java.sql.Date sqldate = new java.sql.Date(date.getTime());
		return sqldate;
	}

	public static int insertDoctor(Doctor newdoc) {
		String insertquery = "insert into doctor(DOCTOR_ID,NAME,DOB,SPECIALITY,CITY,PHONE_NO,STANDARD_FEES) values (?,?,?,?,?,?,?)";
		Connection con = null;
		int rows = 0;
		PreparedStatement stmt = null;
		try {
			con = getConnection();
			stmt = con.prepareStatement(insertquery);
			stmt.setInt(1, newdoc.getDoctor_id());
			stmt.setString(2, newdoc.getName());
			stmt.setDate(3, convertToSqlDate(newdoc.getDob()));
			stmt.setString(4, newdoc.getSpeciality());
			stmt.setString(5, newdoc.getCity());
			stmt.setLong(6, newdoc.getPhone_no());
			stmt.setInt(7, newdoc.getStandard_fees());
			rows = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}

		}
		return rows;
	}
	public static int updateDoctor(Doctor newdoc) {
		String updatequery = "update doctor set NAME=?,DOB=?,SPECIALITY=?,CITY=?,PHONE_NO=?,STANDARD_FEES=? where DOCTOR_ID=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(updatequery);
			ps.setInt(7, newdoc.getDoctor_id());
			ps.setString(1, newdoc.getName());
			ps.setDate(2, convertToSqlDate(newdoc.getDob()));
			ps.setString(3, newdoc.getSpeciality());
			ps.setString(4, newdoc.getCity());
			ps.setLong(5, newdoc.getPhone_no());
			ps.setInt(6, newdoc.getStandard_fees());
			ps.executeUpdate();
			rows = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return rows;
	}
	public int updateDoctorName(int id, String fname) {
		String updatequery = "update doctor set NAME=? where doctor_id=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(updatequery);
			ps.setString(1, fname);
			ps.setInt(2, id);
			ps.executeUpdate();
			rows = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return rows;
	}

		public static int deleteDoctor(int id) {
		String deletequery = "delete from doctor where DOCTOR_ID=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;

		try {
			con = getConnection();
			ps = con.prepareStatement(deletequery);
			ps.setInt(1, id);
			ps.executeUpdate();
			rows = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}
	public static Doctor getDoctorById(int id) {
		Doctor doc = null;
		String selectquery = "select DOCTOR_ID,NAME,DOB,SPECIALITY,CITY,PHONE_NO,STANDARD_FEES  from doctor where doctor_id = ? ";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(selectquery);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			doc = new Doctor();
			if (rs.next()) {
				doc.setDoctor_id(rs.getInt(1));
				doc.setName(rs.getString(2));
				java.util.Date date = new java.util.Date(rs.getDate(3).getTime());
				doc.setDob(date);
				doc.setSpeciality(rs.getString(4));
				doc.setCity(rs.getString(5));
				doc.setPhone_no(rs.getLong(6));
				doc.setStandard_fees(rs.getInt(7));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return doc;

	}
	public static List<Doctor> getAllDoctor() {
		List<Doctor> listOfDoctors = new ArrayList<Doctor>();// ok sir
		Doctor doc = null;
		String selectquery = "select DOCTOR_ID,NAME,DOB,SPECIALITY,CITY,PHONE_NO,STANDARD_FEES  from Doctor";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(selectquery);
			rs = ps.executeQuery();
			while (rs.next()) {
				doc = new Doctor();
				doc.setDoctor_id(rs.getInt(1));
				doc.setName(rs.getString(2));
				java.util.Date date = new java.util.Date(rs.getDate(3).getTime());
				doc.setDob(date);
				doc.setSpeciality(rs.getString(4));
				doc.setCity(rs.getString(5));
				doc.setPhone_no(rs.getLong(6));
				doc.setStandard_fees(rs.getInt(7));
				listOfDoctors.add(doc);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return listOfDoctors;
	}
}



