package com.chainsys.miniproject.ui;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.AppointmentsDao;
import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Appointments;
import com.chainsys.miniproject.pojo.Doctor;
import com.chainsys.miniproject.pojo.Employee;

public class EmployeeUi {
	public static void addNewEmployee() {

		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		try {
			System.out.println("Enter the Employee id:");
			String emp_id = sc.nextLine();
			// TODO =validate input String
			try {
				Validator.checkStringForParse(emp_id);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
               return;	
			}
			int id = Integer.parseInt(emp_id);
			try {
				Validator.CheckNumberForGreaterThanZero(id);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
				return;
			}
			emp.setEmp_ID(id);
			System.out.println("Enter Employee first name:");
			String emp_Firstname = sc.nextLine();
			try {
				Validator.checkStringOnly(emp_Firstname);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
				return;
			}
			emp.setFirst_name(emp_Firstname);
			System.out.println("Enter Employee Last Name:");
			String emp_LastName = sc.nextLine();
			try {
				Validator.checkStringOnly(emp_LastName);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
				return;
			}
			emp.setLast_name(emp_LastName);
			System.out.println("Enter Employee Email:");
			String emp_email = sc.nextLine();
			try {
				Validator.checkMail(emp_email);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
				return;
			}
			emp.setEmail(emp_email);
			System.out.println("Enter Employee hire_date:");
			SimpleDateFormat hire_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
			String emp_HireDate = sc.nextLine();
			// Date hire_date=hire_dateFormate.parse(emp_HireDate);
			try {
				emp.setHire_date(hire_dateFormate.parse(emp_HireDate));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			System.out.println("Enter the Job id:");
			String job_id = sc.nextLine();
			// TODO =validate input String
			try {
				Validator.checkStringForParse(job_id);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
               return;	
			}
			int id1 = Integer.parseInt(job_id);
			try {
				Validator.CheckNumberForGreaterThanZero(id1);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
				return;
			}
			emp.setEmp_ID(id1);
			System.out.println("Enter Salary of Employee:");
		    String s=sc.nextLine();
			try {
				Validator.checkStringForParse(s);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
				return;
			}
			Float emp_salary = (float) Integer.parseInt(s);
			try {
				Validator.checkSalLimit(emp_salary);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
				return;
			}
			emp.setSalary(id1);
			int result = EmployeeDao.insertEmployee(emp);
			System.out.println(result + "row inserted");
			sc.close();
		} finally {
			sc.close();
		}
	}

	public static void UpdateEmployee() {

		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		try {
			System.out.println("Enter the Employee id:");
			String emp_id = sc.nextLine();
			// TODO =validate input String
			try {
				Validator.checkStringForParse(emp_id);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();

			}
			int id = Integer.parseInt(emp_id);
			try {
				Validator.CheckNumberForGreaterThanZero(id);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
				return;
			}
			emp.setEmp_ID(id);
			System.out.println("Enter Employee first name:");
			String emp_Firstname = sc.nextLine();
			try {
				Validator.checkStringOnly(emp_Firstname);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
				return;
			}
			emp.setFirst_name(emp_Firstname);
			System.out.println("Enter Employee Last Name:");
			String emp_LastName = sc.nextLine();
			try {
				Validator.checkStringOnly(emp_LastName);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
				return;
			}
			emp.setLast_name(emp_LastName);
			System.out.println("Enter Employee Email:");
			String emp_email = sc.nextLine();
			try {
				Validator.checkMail(emp_email);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
				return;
			}
			emp.setEmail(emp_email);
			System.out.println("Enter Employee hire_date:");
			SimpleDateFormat hire_dateFormate = new SimpleDateFormat("MM/dd/yyyy");
			String emp_HireDate = sc.nextLine();
			// Date hire_date=hire_dateFormate.parse(emp_HireDate);
			try {
				emp.setHire_date(hire_dateFormate.parse(emp_HireDate));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			try {
				Validator.checkDateFormat(emp_HireDate);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
				return;
			}
			Date newDate=null;
			emp.setHire_date(newDate);
			System.out.println("Enter the job_id:");
			String emp_Job_id = sc.nextLine();
			emp.setJob_id(emp_Job_id);
			System.out.println("Enter Salary of Employee:");
			Float emp_salary = sc.nextFloat();
			try {
				Validator.checkSalLimit(emp_salary);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
				return;
			}
			emp.setSalary(emp_salary);
			int result = EmployeeDao.updateEmployee(emp);
			System.out.println(result + "row inserted");
			sc.close();
		} finally {
			sc.close();
		}
	}

	public static void updateEmployeeFirstName() {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		try {
			System.out.println("Enter the Employee id:");
			String emp_id = sc.nextLine();
			// TODO =validate input String
			try {
				Validator.checkStringForParse(emp_id);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
               return;	
			}
			int id = Integer.parseInt(emp_id);
			try {
				Validator.CheckNumberForGreaterThanZero(id);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
				return;
			}
			emp.setEmp_ID(id);
			System.out.println("Enter Employee first name:");
			String emp_Firstname = sc.nextLine();
			try {
				Validator.checkStringOnly(emp_Firstname);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
				return;
			}
			emp.setFirst_name(emp_Firstname);
		} finally {
			sc.close();
		}
	}
	public static void getEmployeeById() {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		int id;
		try {
			System.out.println("Enter the Employee id:");
			String emp_id = sc.nextLine();
			// TODO =validate input String
			try {
				Validator.checkStringForParse(emp_id);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			   return;	
			}
			id = Integer.parseInt(emp_id);
			try {
				Validator.CheckNumberForGreaterThanZero(id);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
				return;
			}
		} finally {
			sc.close();
		}
		emp.setEmp_ID(id);
		Employee result = EmployeeDao.getEmployeeById(id);
			System.out.println(emp.getEmp_ID() + " " + emp.getFirst_name() + " " + emp.getSalary());
		}


	public static void getAllEmployees() {
		Employee emp;
		Scanner sc = new Scanner(System.in);
		try {
			emp = new Employee();
			System.out.println("Enter the Employee id:");
			String emp_id = sc.nextLine();
			// TODO =validate input String
			try {
				Validator.checkStringForParse(emp_id);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			   return;	
			}
			int id = Integer.parseInt(emp_id);
			try {
				Validator.CheckNumberForGreaterThanZero(id);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
				return;
			}
			emp.setEmp_ID(id);
		}finally{
            sc.close();
		}
		List<Employee> allEmployee = EmployeeDao.getAllEmployee();
		Iterator<Employee> empIterator = allEmployee.iterator();
		while(empIterator.hasNext()) {
		    emp = empIterator.next();
			System.out.println(emp.getEmp_ID()+" "+emp.getFirst_name()+" "+emp.getSalary());
		}
}
	

	public static void deleteEmployee() {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		try {
			System.out.println("Enter Employee id:");
			String emp_id = sc.nextLine();
			try {
				Validator.checkStringForParse(emp_id);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			   return;	
			}
			int id = Integer.parseInt(emp_id);
			try {
				Validator.CheckNumberForGreaterThanZero(id);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
				return;
			}
			emp.setEmp_ID(id);

			int result = EmployeeDao.deleteEmployee(id);
			System.out.println(result + "row deleted");
			sc.close();
		}finally {
			sc.close();
		}
	}

}
