package kb.junit.tutorialspoint;

public class EmpBusinessLogic {

	/**
	 * <b>Das Jahresgehalt des Angestellten</b><br>
	 * Das monatliche Gehalt des Angesllten wird mit 12 multipliziert
	 * (in Österreich mit 14)
	 * 
	 * 
	 * @param employeeDetails - Der Angestellte
	 * 
	 * @return - Jahresgehalt 
	 */
	public double calculateYearlySalary(EmployeeDetails employeeDetails){
		double yearlySalary = 0;
		yearlySalary = employeeDetails.getMonthlySalary() * 12;
		return yearlySalary;
	}
	
	/**
	 * <b>Mitarbeiterbewertung</b><br>
	 * Ist das Gehalt des Mitarbeiters unter 10000 so bekommt dieser
	 * eine Bewertung von 500. Darüber eine Bewertung von 1000.
	 * 
	 * 
	 * @param employeeDetails - Der Angestellte
	 * 
	 * @return - Die derzeitige Bewertung des Angestellten
	 */
	public double calculateAppraisal(EmployeeDetails employeeDetails){
		double appraisal = 0;
		
		if(employeeDetails.getMonthlySalary() < 10000) {
			appraisal = 500;
		}else{
			appraisal = 1000;
		}
		
		return appraisal;
	}
}
