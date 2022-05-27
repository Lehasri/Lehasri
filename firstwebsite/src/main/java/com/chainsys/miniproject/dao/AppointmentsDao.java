package com.chainsys.miniproject.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chainsys.miniproject.pojo.Appointments;
import com.chainsys.miniproject.pojo.Doctor;

public class AppointmentsDao {
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
	public static int insertAppointments(Appointments newapp) {
		String insertquery = "insert into appointments(APP_ID,APP_DATE,DOCTOR_ID,PATIENT_NAME,FEES_COLLECTED) values (?,?,?,?,?,)";
		Connection con = null;
		int rows = 0;
		// int rows;
		PreparedStatement stmt = null;
		try {
			con = getConnection();
			stmt = con.prepareStatement(insertquery);
			stmt.setInt(1, newapp.getApp_id());
			stmt.setDate(2, convertToSqlDate(newapp.getApp_date()));
			stmt.setInt(3, newapp.getDoctor_id());
			stmt.setString(4, newapp.getPatient_name());
			stmt.setLong(5, newapp.getFees_collected());
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
	public static int updateAppointments(Appointments newapp) {
		String updatequery = "update doctor set APP_DATE=?,DOCTOR_ID=?,PATIENT_NAME=?,FEES_COLLECTED=? where APP_ID=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(updatequery);
			ps.setInt(5, newapp.getApp_id());
			ps.setDate(1, convertToSqlDate(newapp.getApp_date()));
			ps.setInt(2, newapp.getDoctor_id());
			ps.setString(3, newapp.getPatient_name());
			ps.setInt(4, newapp.getFees_collected());
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
	public static int updateAppointmentsName(int id, String fname) {
		String updatequery = "update Appointments set PATIENT_NAME=? where APP_ID=?";
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

		public static int deleteAppointments(int id) {
		String deletequery = "delete from appointments where APP_ID=?";
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
	public static Appointments getAppoinmentsById(int id) {
		Appointments app = null;
		String selectquery = "select APP_ID,APP_DATE,DOCTOR_ID,PATIENT_NAME,FEES_COLLECTED  from Appointments where app_id = ? ";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(selectquery);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			app = new Appointments();
			if (rs.next()) {
				app.setApp_id(rs.getInt(1));
				java.util.Date date = new java.util.Date(rs.getDate(2).getTime());
				app.setApp_date(date);
				app.setDoctor_id(rs.getInt(3));
				app.setPatient_name(rs.getString(4));
				app.setFees_collected(rs.getInt(5));
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
		return app;

	}
	public static List<Appointments> getAllAppointments() {
		List<Appointments> listOfAppointment = new ArrayList<Appointments>();
		Appointments app = null;
		String selectquery = "select APP_ID,APP_DATE,DOCTOR_ID,PATIENT_NAME,FEES_COLLECTED  from Appointments";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(selectquery);
			rs = ps.executeQuery();
			while (rs.next()) {
				app = new Appointments();
				app.setApp_id(rs.getInt(1));
				java.util.Date date = new java.util.Date(rs.getDate(2).getTime());
				app.setApp_date(date);
				app.setDoctor_id(rs.getInt(3));
				app.setPatient_name(rs.getString(4));
				app.setFees_collected(rs.getInt(5));
				listOfAppointment.add(app);
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
		return listOfAppointment;
	}

}
