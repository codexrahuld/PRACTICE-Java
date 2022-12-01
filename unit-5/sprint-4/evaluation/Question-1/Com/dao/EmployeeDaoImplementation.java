package sprint4Evaluation._1QuestionNumber1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import sprint4Evaluation._1QuestionNumber1.model.Employee;
import sprint4Evaluation._1QuestionNumber1.utility.DBUtility;

public class EmployeeDaoImplementation implements EmployeeDao {

	@Override
	public String registerEmployee(Employee e) {
		
		String result = "not Registered..";
		
		
		try (Connection conn = DBUtility.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("insert into employee(ename,address,email,password,salary,deptId) values(?,?,?,?,?,?)");
			ps.setString(1, e.getEname());
			ps.setString(2, e.getAddress());
			ps.setString(3, e.getEmail());
			ps.setString(4, e.getPassword());
			ps.setInt(5, e.getSalary());
			ps.setInt(6, e.getDeptid());
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				result = "Registered";
			}
			
			
			
			
		} catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
		
		
		
		
		
		return result;	
		
	}

	@Override
	public void assignDepartment() {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter empId to update department ...");
		int empId = sc.nextInt();
		System.out.println("Enter deptid of required departemnt ...");
		int depId = sc.nextInt();
		
		
		
		try (Connection conn = DBUtility.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("update employee set deptId = ? where empid = ?");
			ps.setInt(1, depId);
			ps.setInt(2, empId);
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				System.out.println("updated ..");
			}
			
			
			
			
		} catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
		
		
		
		
	}

	@Override
	public Employee login() {
		
		Employee e = new Employee();
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email");
		String email = sc.next();
		System.out.println("Enter password ...");
		String password = sc.next();
		
		
		
		try (Connection conn = DBUtility.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from employee where email = ? AND password = ?");
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				e.setEmpId(rs.getInt("empid"));
				e.setEname(rs.getString("ename"));
				e.setAddress(rs.getString("address"));
				e.setEmail(rs.getString("email"));
				e.setPassword(rs.getString("password"));
				e.setSalary(rs.getInt("salary"));
				e.setDeptid(rs.getInt("deptid"));
				
				
			}else {
				System.out.println("wrong credential");
			}
			
			
			
			
		} catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
		
		
		return e;
	}

	@Override
	public String updatePassword() {
		
		String result = "password not changed ..";
		
		
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter empId to update password ...");
		int empId = sc.nextInt();
		System.out.println("Enter updated password ...");
		String password = sc.next();
		
		
		
		try (Connection conn = DBUtility.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("update employee set password = ? where empid = ?");
			ps.setString(1, password);
			ps.setInt(2, empId);
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				result = "updated ..";
			}
			
			
			
			
		} catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
		
		
		
		
		return result;
		
		
		
	}

}
