package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.AppointmentsDao;
import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.pojo.Appointments;
import com.chainsys.miniproject.pojo.Doctor;

/**
 * Servlet implementation class Appointment
 */
public class Appointment extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		List<Appointments> allAppointments = AppointmentsDao.getAllAppointments();
		Iterator<Appointments> appIterator = allAppointments.iterator();
		while (appIterator.hasNext()) {
			Appointments result = appIterator.next();
			out.println("<hr/>");

			out.println(result.getApp_id() + "," + result.getApp_date() + "," + result.getDoctor_id() + ","
					+ result.getPatient_name() + "," + result.getFees_collected() + "</p>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String submitvalue = request.getParameter("submit");
		if (submitvalue.equals("Update")) {
			doPut(request, response);
		} else if (submitvalue.equals("Delete")) {
			doDelete(request, response);
		} else if (submitvalue.equals("Add")) {
			Appointments newapp = null;
			int result = 0;
			int appId = 0;
			String testname = null;
			try {
				newapp = new Appointments();
				String id = request.getParameter("id");
				try {
					Validator.checkStringForParse(id);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				appId = Integer.parseInt(id);
				try {
					Validator.CheckNumberForGreaterThanZero(appId);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				newapp.setApp_id(appId);
//--------------------------------
				SimpleDateFormat dateFormate = new SimpleDateFormat("dd/MM/yyyy");
				String appdate = request.getParameter("appdate");

				try {
					Validator.checkDateFormat(appdate);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
				}
				Date newDate = null;
				try {
					newDate = dateFormate.parse(appdate);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				try {
					Validator.CheckNofutureDate(newDate);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
				}

				newapp.setApp_date(newDate);
				//--------------------------------------			
				int DoctorId = 0;
					newapp = new Appointments();
					String doctorId = request.getParameter("doctorId");
					try {
						Validator.checkStringForParse(id);
					} catch (InvalidInputDataException err) {
						err.printStackTrace();
					}
					DoctorId = Integer.parseInt(id);
					try {
						Validator.CheckNumberForGreaterThanZero(appId);
					} catch (InvalidInputDataException err) {
						err.printStackTrace();
					}
					newapp.setDoctor_id(DoctorId);
//--------------------------------------			
				String patientName = request.getParameter("patientName");
				testname = patientName;
				try {
					Validator.checkStringOnly(testname);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
					return;
				}
				try {
					Validator.checklengthOfString(testname);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				newapp.setPatient_name(patientName);
//--------------------------------
				String fees_collected = request.getParameter("fees_collected");
				try {
					Validator.checkStringForParse(fees_collected);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				int fees = Integer.parseInt(fees_collected);
				try {
					Validator.checkstandard_fees(fees);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				newapp.setFees_collected(fees);
//----------------------------------------------			
				result = AppointmentsDao.insertAppointments(newapp);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
			}
			out.println("<div> Add Appointment: " + result + "</div>");
		}
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		        PrintWriter out = response.getWriter();
				Appointments newapp = null;
				int result = 0;
				int appId = 0;
				String testname = null;
				try {
					newapp = new Appointments();
					String id = request.getParameter("id");
					try {
						Validator.checkStringForParse(id);
					} catch (InvalidInputDataException err) {
						err.printStackTrace();
					}
					appId = Integer.parseInt(id);
					try {
						Validator.CheckNumberForGreaterThanZero(appId);
					} catch (InvalidInputDataException err) {
						err.printStackTrace();
					}
					newapp.setApp_id(appId);
	//--------------------------------
					SimpleDateFormat dateFormate = new SimpleDateFormat("dd/MM/yyyy");
					String appdate = request.getParameter("appdate");

					try {
						Validator.checkDateFormat(appdate);
					} catch (InvalidInputDataException e) {
						e.printStackTrace();
					}
					Date newDate = null;
					try {
						newDate = dateFormate.parse(appdate);
					} catch (ParseException e) {
						e.printStackTrace();
					}
					try {
						Validator.CheckNofutureDate(newDate);
					} catch (InvalidInputDataException e) {
						e.printStackTrace();
					}

					newapp.setApp_date(newDate);
					//--------------------------------------			
					int DoctorId = 0;
						newapp = new Appointments();
						String doctorId = request.getParameter("doctorId");
						try {
							Validator.checkStringForParse(id);
						} catch (InvalidInputDataException err) {
							err.printStackTrace();
						}
						DoctorId = Integer.parseInt(id);
						try {
							Validator.CheckNumberForGreaterThanZero(appId);
						} catch (InvalidInputDataException err) {
							err.printStackTrace();
						}
						newapp.setDoctor_id(DoctorId);
	//--------------------------------------			
					String patientName = request.getParameter("patientName");
					testname = patientName;
					try {
						Validator.checkStringOnly(testname);
					} catch (InvalidInputDataException e) {
						e.printStackTrace();
						return;
					}
					try {
						Validator.checklengthOfString(testname);
					} catch (InvalidInputDataException err) {
						err.printStackTrace();
					}
					newapp.setPatient_name(patientName);
	//--------------------------------
					String fees_collected = request.getParameter("fees_collected");
					try {
						Validator.checkStringForParse(fees_collected);
					} catch (InvalidInputDataException err) {
						err.printStackTrace();
					}
					int fees = Integer.parseInt(fees_collected);
					try {
						Validator.checkstandard_fees(fees);
					} catch (InvalidInputDataException err) {
						err.printStackTrace();
					}
					newapp.setFees_collected(fees);
	//----------------------------------------------			
					result = AppointmentsDao.updateAppointments(newapp);
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
				}
				out.println("<div> Update Appointment: " + result + "</div>");
				}
	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Appointments newapp = null;
		int result = 0;
		int appId = 0;
		try {
			newapp = new Appointments();
			String id = request.getParameter("id");
			try {
				Validator.checkStringForParse(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			appId = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(appId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			newapp.setApp_id(appId);
			result = AppointmentsDao.deleteAppointments(appId);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		out.println("<div> Delete Appointment: " + result + "</div>");
	}

}
