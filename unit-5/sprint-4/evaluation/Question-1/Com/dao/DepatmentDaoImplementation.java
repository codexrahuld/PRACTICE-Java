package sprint4Evaluation._1QuestionNumber1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sprint4Evaluation._1QuestionNumber1.model.Department;
import sprint4Evaluation._1QuestionNumber1.utility.DBUtility;

public class DepatmentDaoImplementation implements DepartmentDao {

	@Override
	public String addDepartment(Department d) {
		String result = "not Inserted ..";
		
		
		try (Connection conn = DBUtility.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("insert into department(dname,location) values(?,?)");
			ps.setString(1, d.getDname());
			ps.setString(2, d.getLocation());
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				result = "inserted";
			}
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		return result;
	}

	@Override
	public List<Department> allDepatmentDetail() {
		
		List<Department> dept = new ArrayList<>();
		
		try (Connection conn = DBUtility.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from department");
			
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int d = rs.getInt("did");
				String n = rs.getString("dname");
				String l = rs.getString("location");
				
				Department department = new Department(d, n, l);
				dept.add(department);
				
				
			}

			
			
			
			
		} catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
		
		
		
		if(dept.size()==0){
			System.out.println("No department exists ..");
		}
		
		
		
		
		return dept;
		
		
		
		
		
	}

	@Override
	public String updateDepartmentLocation() {
		String result = "Not Updated ...";
		
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter did ...");
		int did= sc.nextInt();
		System.out.println("Enter new location ...");
		String location = sc.next();
		
		
		
		try (Connection conn = DBUtility.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("update department set location = ? where did = ?");
			ps.setString(1, location);
			ps.setInt(2, did);
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				result = "updated";
			}
			
			
			
			
		} catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
		
		
		
		
		
		return result;
				
	}

	@Override
	public String deleteDepartment() {
		String res = "not deleted";
		
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter did to delete depatment...");
		int did= sc.nextInt();
		
		
		try (Connection conn = DBUtility.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("update employee set deptid = NULL where deptid = ?");
			ps.setInt(1, did);
			int x = ps.executeUpdate();
			
			
			PreparedStatement ps2 = conn.prepareStatement("delete from department where did = ?");
			ps2.setInt(1, did);
			int y= ps2.executeUpdate();
			
			if(y>0) {
				res = "deletion done ...";
			}
			
			
			
			
		} catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
		
		
		
		return res;
	}

}
