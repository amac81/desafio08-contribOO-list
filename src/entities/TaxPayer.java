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
	
	//imposto sob o prestacao de servicos
	public double servicesTax() {
		return servicesIncome * 0.15; //15%;
	}
	
	//imposto sob o ganho de capital
	public double capitalTax() {
		return capitalIncome * 0.20; //20% 	;
	}
	
	//imposto bruto
	public double grossTax() {
		return salaryTax() + servicesTax() + capitalTax();
	}
	
	//abatimento de imposto
	public double taxRebate() {
		double maxDeductible = grossTax() * 0.30;
		
		//gastos dedutiveis
		double deductibleExpenses = healthSpending + educationSpending;
		double rebate = 0.0;
		
		rebate = (deductibleExpenses > maxDeductible) ? maxDeductible : deductibleExpenses;
		
		return rebate;
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
