package kb.junit.tutorialspoint;

public class EmployeeDetails {

	private String name;
	private double monthlySalary;
	private int age;
	
	/**
	 * @return - Name des Angestellten
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return - Monatliches Gehalt
	 */
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
	/**
	 * @return - Alter des Angestellten
	 */
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
