package sprint4Evaluation._1QuestionNumber1.dao;

import sprint4Evaluation._1QuestionNumber1.model.Employee;

public interface EmployeeDao {
	
	public String registerEmployee(Employee e);
	
	public void assignDepartment();
	
	public Employee login();
	
	public String updatePassword();

}
