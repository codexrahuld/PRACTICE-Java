package sprint4Evaluation._1QuestionNumber1.usecases;

import java.util.Scanner;

import sprint4Evaluation._1QuestionNumber1.dao.DepartmentDao;
import sprint4Evaluation._1QuestionNumber1.dao.DepatmentDaoImplementation;
import sprint4Evaluation._1QuestionNumber1.model.Department;

public class AddDepartmentUsecase {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dname");
		String name = sc.next();
		System.out.println("Enter location ...");
		String location = sc.next();
		
		
		Department d = new Department();
		d.setDname(name);
		d.setLocation(location);
		
		DepartmentDao dao = new DepatmentDaoImplementation();
		
		String result = dao.addDepartment(d);
		System.out.println(result);
		
		
	}

}
