package sprint4Evaluation._1QuestionNumber1.usecases;

import java.util.List;

import sprint4Evaluation._1QuestionNumber1.dao.DepartmentDao;
import sprint4Evaluation._1QuestionNumber1.dao.DepatmentDaoImplementation;
import sprint4Evaluation._1QuestionNumber1.model.Department;

public class AllDepatmentDetailUseCase {
	
	public static void main(String[] args) {
		
		DepartmentDao dao = new DepatmentDaoImplementation();
		
		List<Department> dept = dao.allDepatmentDetail();
		
		dept.forEach(d -> System.out.println(d));
		
		
		
		
	}

}
