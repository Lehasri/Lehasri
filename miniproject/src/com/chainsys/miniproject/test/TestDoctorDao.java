package com.chainsys.miniproject.test;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.AppointmentsDao;
import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.pojo.Doctor;

public class TestDoctorDao {
	
public static void testInsertDoctor() {
	Doctor newdoc = new Doctor();
	newdoc.setDoctor_id(300);
	newdoc.setName("Ana");
	Calendar c1 = Calendar.getInstance();
	java.util.Date newDate =c1.getTime();
	newdoc.setDob(newDate);
	newdoc.setSpeciality("Heart Surgeon");
	newdoc.setCity("Chennai");
	newdoc.setPhone_no(9483748594l);
	newdoc.setStandard_fees(100000);
	int result = DoctorDao.insertDoctor(newdoc);
	System.out.println(result);
	
}
public static void testUpdateDoctor() {
	Doctor oldDoctor = DoctorDao.getDoctorById(302);
	System.out.println(oldDoctor.getDoctor_id()+" "+oldDoctor.getName()+" "+oldDoctor.getStandard_fees());
	oldDoctor.setName("Sekar");
	Calendar c1 = Calendar.getInstance();
	java.util.Date newDate =c1.getTime();
	oldDoctor.setDob(newDate);
	oldDoctor.setCity("Trichy");
	oldDoctor.setSpeciality("Neurologist");
	oldDoctor.setPhone_no(9875456748l);
	oldDoctor.setStandard_fees(40000);
	int result = DoctorDao.updateDoctor(oldDoctor);
	System.out.println(result);
	
}
public static void testUpdateDoctorName() {
	 int result =0;
       int id =302;
       String name ="Sri";
       result = DoctorDao.updateDoctorName(id,name);
       System.out.println(result);
	}
public static void testGetAllDoctors() {
	List<Doctor> allDoctors = DoctorDao.getAllDoctor();
	Iterator<Doctor> docIterator = allDoctors.iterator();
	while(docIterator.hasNext()) {
		Doctor doc = docIterator.next();
		System.out.println(doc.getDoctor_id()+" "+doc.getName()+" "+doc.getStandard_fees());
	}
}
public static void testGetDoctorById() {
Doctor doc = DoctorDao.getDoctorById(300);
System.out.println(doc.getDoctor_id()+" "+doc.getName()+" "+doc.getStandard_fees());
}
public static void testDeleteDoctor() {
	int result = DoctorDao.deleteDoctor(300);
	System.out.println(result);
}
}
