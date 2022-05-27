package com.chainsys.miniproject.test;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.AppointmentsDao;
import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.pojo.Appointments;
import com.chainsys.miniproject.pojo.Doctor;

public class TestAppointmentsDao {
	public static void testInsertAppointments() {
		Appointments newapp = new Appointments();
		newapp.setApp_id(300);
		Calendar c1 = Calendar.getInstance();
		java.util.Date newDate =c1.getTime();
		newapp.setApp_date(newDate);
		newapp.setDoctor_id(1);
		newapp.setPatient_name("Lekha");
		newapp.setFees_collected(400);
		int result = AppointmentsDao.insertAppointments(newapp);
		System.out.println(result);
		
	}
	public static void testUpdateAppointments() {
		Appointments oldAppointments = AppointmentsDao.getAppoinmentsById(302);
		System.out.println(oldAppointments.getApp_id()+" "+oldAppointments.getPatient_name()+" "+oldAppointments.getFees_collected());
		Calendar c1 = Calendar.getInstance();
		java.util.Date newDate =c1.getTime();
		oldAppointments.setApp_date(newDate);
		oldAppointments.setDoctor_id(1);
		oldAppointments.setPatient_name("Lekha");
		oldAppointments.setFees_collected(500);
		int result = AppointmentsDao.updateAppointments(oldAppointments);
		System.out.println(result);
		}
	public static void testUpdateAppointmentsName() {
		 int result =0;
	        int id =302;
	        String name ="Sri";
	        result = AppointmentsDao.updateAppointmentsName(id,name);
	        System.out.println(result);
		}
	public static void testGetAllAppointment() {
		List<Appointments> allAppointment = AppointmentsDao.getAllAppointments();
		Iterator<Appointments> appIterator = allAppointment.iterator();
		while(appIterator.hasNext()) {
			Appointments app = appIterator.next();
			System.out.println(app.getApp_id()+" "+app.getPatient_name()+" "+app.getFees_collected());
		}
	}
	public static void testGetAppointmentsById() {
	Appointments app = AppointmentsDao.getAppoinmentsById(1);
	System.out.println(app.getApp_id()+" "+app.getPatient_name()+" "+app.getFees_collected());
	}
	public static void testDeleteAppointments() {
		int result = AppointmentsDao.deleteAppointments(1);
		System.out.println(result);
	}

}
