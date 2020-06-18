package PRP;

public class Employee extends Person{
	double annual_Salary;
	int year;
	String insurance_num;
	public Employee(String name, double annual_Salary, int year, String insurance_num) {
		super(name);
		this.annual_Salary = annual_Salary;
		this.year = year;
		this.insurance_num = insurance_num;
	}
	public double getAnnual_Salary() {
		return annual_Salary;
	}
	public void setAnnual_Salary(double annual_Salary) {
		this.annual_Salary = annual_Salary;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getInsurance_num() {
		return insurance_num;
	}
	public void setInsurance_num(String insurance_num) {
		this.insurance_num = insurance_num;
	}
	
}