package sprint4Evaluation._1QuestionNumber1.model;

public class Employee {
	
	private int empId;
	private String ename;
	private String address;
	private String email;
	private String password;
	private int salary;
	private int deptid;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public Employee(int empId, String ename, String address, String email, String password, int salary, int deptid) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.address = address;
		this.email = email;
		this.password = password;
		this.salary = salary;
		this.deptid = deptid;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename + ", address=" + address + ", email=" + email
				+ ", password=" + password + ", salary=" + salary + ", deptid=" + deptid + "]";
	}
	
	
	
	
	

}
