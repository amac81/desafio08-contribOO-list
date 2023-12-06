package entities;

public class TaxPayer {
	private double salaryIncome;
	private double servicesIncome;
	private double capitalIncome;
	private double healthSpending;
	private double educationSpending;
	
	public TaxPayer() {}

	public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome, double healthSpending,
			double educationSpending) {
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}

	public double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}

	public double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(double educationSpending) {
		this.educationSpending = educationSpending;
	}
	
	//imposto sob o salario
	public double salaryTax() {
				
		double monthlySalary = salaryIncome/12;
		double salaryTaxValue = 0.0;
		
		if(monthlySalary <  3000.0) {
			salaryTaxValue = 0.0; //isento 	
		}
		else if(monthlySalary >= 3000.0 && monthlySalary <=  5000.0) {
			salaryTaxValue = salaryIncome * 0.10; //10% 	
		}
		else {
			salaryTaxValue = salaryIncome * 0.20; //20%
		}
		
		return salaryTaxValue;
	}
	
	public double servicesTax() {
		return 0.0;
	}
	
	public double capitalTax() {
		return 0.0;
	}
	
	public double grossTax() {
		return 0.0;
	}
	
	public double taxRebate() {
		return 0.0;
	}
	
	public double netTax() {
		return 0.0;
	}

	@Override
	public String toString() {
		return "TaxPayer [salaryIncome=" + salaryIncome + ", servicesIncome=" + servicesIncome + ", capitalIncome="
				+ capitalIncome + ", healthSpending=" + healthSpending + ", educationSpending=" + educationSpending
				+ "]";
	}
	

}
