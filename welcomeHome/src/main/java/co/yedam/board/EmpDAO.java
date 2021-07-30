package co.yedam.board;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.yedam.DAO;

public class EmpDAO extends DAO {
	
	//전체 사원리스트
	public List<Employee> getEmpList() {
		connect(); //Connection 개체. 
		List<Employee> empList = new ArrayList<>();
		try {
			psmt = conn.prepareStatement("select * from emp_temp");
			rs = psmt.executeQuery();
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setSalary(rs.getInt("salary"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				
				empList.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return empList;
	}
}
