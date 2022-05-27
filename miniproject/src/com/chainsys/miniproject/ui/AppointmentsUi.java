package com.chainsys.miniproject.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.chainsys.miniproject.dao.AppointmentsDao;
import com.chainsys.miniproject.pojo.Appointments;
import com.chainsys.miniproject.pojo.Doctor;

public class AppointmentsUi {
	public static void addNewAppointments() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Appointment id:");
			Appointments newAppointment = new Appointments();
			String id = sc.nextLine();
			newAppointment.setApp_id(Integer.parseInt(id));
			System.out.println("Enter Appointment Date:");
			String sDate = sc.nextLine();
			Date date;
			try {
				date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
				newAppointment.setApp_date(date);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			System.out.println("Enter Doctor id:");
			String doctor_id = sc.nextLine();
			System.out.println("Enter Patient name:");
			newAppointment.setPatient_name(sc.nextLine());
			System.out.println("Enter fees that is collecting:");
			newAppointment.setFees_collected(sc.nextInt());


			int result = AppointmentsDao.insertAppointments(newAppointment);
			System.out.println(result);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		finally
		{
			sc.close();
		}
	}
	public static void updateOldAppointments() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Appointment id:");
		Appointments newAppointment = new Appointments();
		String id = sc.nextLine();
		newAppointment.setApp_id(Integer.parseInt(id));
		System.out.println("Enter Appointment Date:");
		String sDate = sc.nextLine();
		Date date;
		try {
			date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
			newAppointment.setApp_date(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("Enter Doctor id:");
		String doctor_id = sc.nextLine();
		System.out.println("Enter Patient name:");
		newAppointment.setPatient_name(sc.nextLine());
		System.out.println("Enter fees that is collecting:");
		newAppointment.setFees_collected(sc.nextInt());


		int result = AppointmentsDao.updateAppointments(newAppointment);
		System.out.println(result);
	}
	public static void updateOldAppointmentsName() {
		int result=0;
		int id=0;
		String patientname=" ";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Appointment id:");
		id=sc.nextInt();
		System.out.println("Enter Patient name:");
		patientname=sc.nextLine();
		result = AppointmentsDao.updateAppointmentsName(id,patientname);
		System.out.println(result);
	}
	

	public static void getAppointmentsById() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Appointment id:");
		String id = sc.nextLine();
		List<Appointments> allAppointments = AppointmentsDao.getAllAppointments();
		Iterator<Appointments> appIterator = allAppointments.iterator();
		while (appIterator.hasNext()) {
			Appointments app = appIterator.next();
			System.out.println(app.getApp_id() + " " + app.getPatient_name() + " " + app.getFees_collected());
		}
	}

	public static void testGetAllppointments() {
			List<Appointments> allAppoinments = AppointmentsDao.getAllAppointments();
			Iterator<Appointments> appIterator = allAppoinments.iterator();
			while(appIterator.hasNext()) {
				Appointments app = appIterator.next();
				System.out.println(app.getApp_id()+" "+app.getPatient_name()+" "+app.getFees_collected());
			}
	}
			 public static void deleteOldAppointments()
			    {
			    	Scanner sc=new Scanner(System.in);
			        System.out.println("Enter Appointment id:");
			        Appointments newAppointments=new Appointments();
			        String id=sc.nextLine();
			        newAppointments.setApp_id(Integer.parseInt(id));
			        int result=AppointmentsDao.deleteAppointments(Integer.parseInt(id));
			        System.out.println(result);
			    }     
   
}




