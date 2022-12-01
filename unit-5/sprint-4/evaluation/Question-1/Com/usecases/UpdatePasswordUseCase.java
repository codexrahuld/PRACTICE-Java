package sprint4Evaluation._1QuestionNumber1.usecases;

import sprint4Evaluation._1QuestionNumber1.dao.EmployeeDao;
import sprint4Evaluation._1QuestionNumber1.dao.EmployeeDaoImplementation;

public class UpdatePasswordUseCase {
	
	public static void main(String[] args) {
		
		EmployeeDao dao = new EmployeeDaoImplementation();
		
		String res = dao.updatePassword();
		
		System.out.println(res);
		
		
		
		
		
	}

}
