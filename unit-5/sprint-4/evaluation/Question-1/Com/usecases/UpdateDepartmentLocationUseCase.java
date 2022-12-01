package sprint4Evaluation._1QuestionNumber1.usecases;

import sprint4Evaluation._1QuestionNumber1.dao.DepartmentDao;
import sprint4Evaluation._1QuestionNumber1.dao.DepatmentDaoImplementation;

public class UpdateDepartmentLocationUseCase {
	
	public static void main(String[] args) {
		
		DepartmentDao dao = new DepatmentDaoImplementation();
		
		String res = dao.updateDepartmentLocation();
		
		System.out.println(res);
		
		
		
		
		
		
	}

}
