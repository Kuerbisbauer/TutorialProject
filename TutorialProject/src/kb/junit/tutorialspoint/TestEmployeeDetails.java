package kb.junit.tutorialspoint;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmployeeDetails {

	EmpBusinessLogic empBusinessLogic 	= new EmpBusinessLogic();
	EmployeeDetails employee			= new EmployeeDetails();
	
	@Test
	public void testCalculateAppriasal(){
		employee.setName("Testy");
		employee.setAge(30);
		employee.setMonthlySalary(7000);
		double appraisal = empBusinessLogic.calculateAppraisal(employee);
		
		assertEquals(500, appraisal, 0.0);
	}
	
	@Test
	public void testCalculateYearlySalary(){
		employee.setName("Testy");
		employee.setAge(30);
		employee.setMonthlySalary(7000);
		double salary = empBusinessLogic.calculateYearlySalary(employee);
		
		assertEquals(84000, salary, 0.0);
	}
}
