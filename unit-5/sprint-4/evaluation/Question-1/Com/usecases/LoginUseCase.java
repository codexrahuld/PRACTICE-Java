package sprint4Evaluation._1QuestionNumber1.usecases;

import sprint4Evaluation._1QuestionNumber1.dao.EmployeeDao;
import sprint4Evaluation._1QuestionNumber1.dao.EmployeeDaoImplementation;
import sprint4Evaluation._1QuestionNumber1.model.Employee;

public class LoginUseCase {
	
	public static void main(String[] args) {
		
		EmployeeDao dao = new EmployeeDaoImplementation();
		
		Employee e = dao.login();
		
		System.out.println(e);
		
		
		
		
		
		
	}

}
