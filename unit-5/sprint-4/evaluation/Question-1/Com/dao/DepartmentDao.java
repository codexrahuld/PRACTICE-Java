package sprint4Evaluation._1QuestionNumber1.dao;

import java.util.List;

import sprint4Evaluation._1QuestionNumber1.model.Department;

public interface DepartmentDao {
	
	public String addDepartment(Department d);
	
	public List<Department> allDepatmentDetail();
	
	public String updateDepartmentLocation();
	
	public String deleteDepartment();

}
