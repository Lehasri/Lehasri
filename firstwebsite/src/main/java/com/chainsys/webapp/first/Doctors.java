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
import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Doctor;
import com.chainsys.miniproject.pojo.Employee;

/**
 * Servlet implementation class Doctor
 */
public class Doctors extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Doctors() {
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
		List<Doctor> allDoctor = DoctorDao.getAllDoctor();
		Iterator<Doctor> docIterator = allDoctor.iterator();
		while (docIterator.hasNext()) {
			Doctor result = docIterator.next();
			out.println("<hr/>");

			out.println(result.getDoctor_id() + "," + result.getName() + "," + result.getDob() + ","
					+ result.getSpeciality() + "," + result.getCity() + "," + result.getPhone_no() + ","
					+ result.getStandard_fees() + "</p>");
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
			Doctor newdoc = null;
			int result = 0;
			int docId = 0;
			String testname = null;
			String testspeciality = null;
			String testcity = null;
			try {
				newdoc = new Doctor();
				String id = request.getParameter("id");
				try {
					Validator.checkStringForParse(id);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				docId = Integer.parseInt(id);
				try {
					Validator.CheckNumberForGreaterThanZero(docId);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				newdoc.setDoctor_id(docId);
//--------------------------------
				String name = request.getParameter("name");
				testname = name;
				try {
					Validator.checkStringOnly(testname);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
					return;
				}
				try {
					Validator.checklengthOfString(name);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				newdoc.setName(name);
//--------------------------------------			
				SimpleDateFormat dateFormate = new SimpleDateFormat("dd/MM/yyyy");
				String dob = request.getParameter("dobdate");

				try {
					Validator.checkDateFormat(dob);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
				}
				Date newDate = null;
				try {
					newDate = dateFormate.parse(dob);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				try {
					Validator.CheckNofutureDate(newDate);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
				}

				newdoc.setDob(newDate);
//----------------------------------------
				String speciality = request.getParameter("speciality");
				testspeciality = speciality;
				try {
					Validator.checkStringOnly(testspeciality);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
					return;
				}
				try {
					Validator.checklengthOfString(speciality);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				newdoc.setSpeciality(speciality);
//---------------------------------------
				String city = request.getParameter("city");
				testcity = city;
				try {
					Validator.checkStringOnly(testcity);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
					return;
				}
				try {
					Validator.checklengthOfString(city);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				newdoc.setCity(city);
//---------------------------------------
				String ph = request.getParameter("ph");
				try {
					Validator.checkStringForParse(ph);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				String ph_no = ph;
				try {
					Validator.checklengthOfPhno(ph);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				newdoc.setPhone_no(ph_no);
//--------------------------------
				String standard_fees = request.getParameter("standard_fees");
				try {
					Validator.checkStringForParse(standard_fees);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				int fees = Integer.parseInt(standard_fees);
				try {
					Validator.checkstandard_fees(fees);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				newdoc.setStandard_fees(fees);
//----------------------------------------------			
				result = DoctorDao.insertDoctor(newdoc);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
			}
			out.println("<div> Add Doctor: " + result + "</div>");
		}
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
			Doctor newdoc = null;
			int result = 0;
			int docId = 0;
			String testname = null;
			String testspeciality = null;
			String testcity = null;
			try {
				newdoc = new Doctor();
				String id = request.getParameter("id");
				try {
					Validator.checkStringForParse(id);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				docId = Integer.parseInt(id);
				try {
					Validator.CheckNumberForGreaterThanZero(docId);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				newdoc.setDoctor_id(docId);
//--------------------------------
				String name = request.getParameter("name");
				testname = name;
				try {
					Validator.checkStringOnly(testname);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
					return;
				}
				try {
					Validator.checklengthOfString(name);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				newdoc.setName(name);
//--------------------------------------			
				SimpleDateFormat dateFormate = new SimpleDateFormat("dd/MM/yyyy");
				String dob = request.getParameter("dobdate");

				try {
					Validator.checkDateFormat(dob);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
				}
				Date newDate = null;
				try {
					newDate = dateFormate.parse(dob);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				try {
					Validator.CheckNofutureDate(newDate);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
				}

				newdoc.setDob(newDate);
//----------------------------------------
				String speciality = request.getParameter("speciality");
				testspeciality = speciality;
				try {
					Validator.checkStringOnly(testspeciality);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
					return;
				}
				try {
					Validator.checklengthOfString(speciality);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				newdoc.setSpeciality(speciality);
//---------------------------------------
				String city = request.getParameter("city");
				testcity = city;
				try {
					Validator.checkStringOnly(testcity);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
					return;
				}
				try {
					Validator.checklengthOfString(city);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				newdoc.setCity(city);
//---------------------------------------
				String ph = request.getParameter("ph");
				try {
					Validator.checkStringForParse(ph);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				String ph_no = ph;
				try {
					Validator.checklengthOfPhno(ph);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				newdoc.setPhone_no(ph_no);
//--------------------------------
				String standard_fees = request.getParameter("standard_fees");
				try {
					Validator.checkStringForParse(standard_fees);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				int fees = Integer.parseInt(standard_fees);
				try {
					Validator.checkstandard_fees(fees);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				newdoc.setStandard_fees(fees);
//----------------------------------------------			
				result = DoctorDao.updateDoctor(newdoc);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
			}
			out.println("<div> Update Doctor: " + result + "</div>");
		}
	       protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		    PrintWriter out = response.getWriter();
			Doctor newdoc = null;
			int result = 0;
			int docId = 0;
			try {
				newdoc = new Doctor();
				String id = request.getParameter("id");
				try {
					Validator.checkStringForParse(id);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				docId = Integer.parseInt(id);
				try {
					Validator.CheckNumberForGreaterThanZero(docId);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				newdoc.setDoctor_id(docId);
				result = DoctorDao.deleteDoctor(docId);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
		out.println("<div> Delete Employee: " + result + "</div>");
	}
  }
