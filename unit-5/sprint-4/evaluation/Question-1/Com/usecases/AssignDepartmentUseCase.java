package sprint4Evaluation._1QuestionNumber1.usecases;

import sprint4Evaluation._1QuestionNumber1.dao.EmployeeDao;
import sprint4Evaluation._1QuestionNumber1.dao.EmployeeDaoImplementation;

public class AssignDepartmentUseCase {
	
	public static void main(String[] args) {
		
		EmployeeDao dao = new EmployeeDaoImplementation();
		dao.assignDepartment();
		
		
		
		
	}

}
