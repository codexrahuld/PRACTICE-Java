package sprint4Evaluation._1QuestionNumber1.usecases;

import java.util.Scanner;

import sprint4Evaluation._1QuestionNumber1.dao.DepartmentDao;
import sprint4Evaluation._1QuestionNumber1.dao.DepatmentDaoImplementation;
import sprint4Evaluation._1QuestionNumber1.dao.EmployeeDao;
import sprint4Evaluation._1QuestionNumber1.dao.EmployeeDaoImplementation;
import sprint4Evaluation._1QuestionNumber1.model.Department;
import sprint4Evaluation._1QuestionNumber1.model.Employee;

public class RegisterEmployeeUsecase {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ename");
		String name = sc.next();
		System.out.println("Enter address ...");
		String address = sc.next();
		System.out.println("Enter email ...");
		String email = sc.next();
		System.out.println("Enter password ...");
		String password = sc.next();
		System.out.println("Enter salary ...");
		int salary = sc.nextInt();
		System.out.println("Enter deptId ...");
		int deptid = sc.nextInt();
		
		
		Employee e = new Employee();
		e.setEname(name);
		e.setAddress(address);
		e.setEmail(email);
		e.setPassword(password);
		e.setSalary(salary);
		e.setDeptid(deptid);
		
		
		
		
		
		EmployeeDao dao = new EmployeeDaoImplementation();
		
		String result = dao.registerEmployee(e);
		System.out.println(result);
		
		
		
		
		
		
	}

}
