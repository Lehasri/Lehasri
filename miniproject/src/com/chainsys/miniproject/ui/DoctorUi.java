package com.chainsys.miniproject.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.AppointmentsDao;
import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.pojo.Doctor;

public class DoctorUi {
	public static void addNewdoctor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Doctor id:");
		Doctor newdoctor = new Doctor();
		String id = sc.nextLine();
		newdoctor.setDoctor_id(Integer.parseInt(id));
		System.out.println("Enter Doctor name:");
		newdoctor.setName(sc.nextLine());
		System.out.println("Enter dob:");
		String sDate = sc.nextLine();
		Date date;
		try {
			date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
			newdoctor.setDob(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		System.out.println("Enter city:");
		newdoctor.setCity(sc.nextLine());
		System.out.println("Enter doctor phone number:");
		String phno = sc.nextLine();
		newdoctor.setPhone_no(Long.parseLong(phno));
		System.out.println("Enter Speciality:");
		newdoctor.setSpeciality(sc.nextLine());
		System.out.println("Enter standard fees:");
		String fees = sc.nextLine();
		newdoctor.setStandard_fees(Integer.parseInt(fees));

		int result = DoctorDao.insertDoctor(newdoctor);
		System.out.println(result);
	}
	public static void updateOldDoctor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Doctor id:");
		Doctor newdoctor = new Doctor();
		String id = sc.nextLine();
		newdoctor.setDoctor_id(Integer.parseInt(id));
		System.out.println("Enter Doctor name:");
		newdoctor.setName(sc.nextLine());
		System.out.println("Enter dob:");
		String sDate = sc.nextLine();
		Date date;
		try {
			date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
			newdoctor.setDob(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		System.out.println("Enter city:");
		newdoctor.setCity(sc.nextLine());
		System.out.println("Enter doctor phone number:");
		String phno = sc.nextLine();
		newdoctor.setPhone_no(Long.parseLong(phno));
		System.out.println("Enter Speciality:");
		newdoctor.setSpeciality(sc.nextLine());
		System.out.println("Enter standard fees:");
		String fees = sc.nextLine();
		newdoctor.setStandard_fees(Integer.parseInt(fees));

		int result = DoctorDao.updateDoctor(newdoctor);
		System.out.println(result);
	}
	public static void updateOldDoctorName() {
		int result=0;
		int id=0;
		String doctorname=" ";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Doctor id:");
		id=sc.nextInt();
		System.out.println("Enter Doctor name:");
		doctorname=sc.nextLine();
		result = AppointmentsDao.updateAppointmentsName(id,doctorname);
		System.out.println(result);
	}

	public static void getDoctorById() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Doctor id:");
		String id = sc.nextLine();
		List<Doctor> allDoctors = DoctorDao.getAllDoctor();
		Iterator<Doctor> docIterator = allDoctors.iterator();
		while (docIterator.hasNext()) {
			Doctor doc = docIterator.next();
			System.out.println(doc.getDoctor_id() + " " + doc.getName() + " " + doc.getStandard_fees());
		}
	}

	public static void testGetAllDoctors() {
			List<Doctor> allDoctors = DoctorDao.getAllDoctor();
			Iterator<Doctor> docIterator = allDoctors.iterator();
			while(docIterator.hasNext()) {
				Doctor doc = docIterator.next();
				System.out.println(doc.getDoctor_id()+" "+doc.getName()+" "+doc.getStandard_fees());
			}
	}
			 public static void deleteOldDoctor()
			    {
			    	Scanner sc=new Scanner(System.in);
			        System.out.println("Enter Doctor id:");
			        Doctor newdoctor=new Doctor();
			        String id=sc.nextLine();
			        newdoctor.setDoctor_id(Integer.parseInt(id));
			        int result=DoctorDao.deleteDoctor(Integer.parseInt(id));
			    }     
   
}

