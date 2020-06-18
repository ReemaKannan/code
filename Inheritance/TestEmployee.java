package PRP;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Employee e=new Employee("Sam",1000000,2021,"123456789");
System.out.println("Name:"+e.getName());
System.out.println("AnnualSalary:"+e.getAnnual_Salary());
System.out.println("Started Work:"+e.getYear());
System.out.println("Insurance Number:"+e.getInsurance_num());
	}

}
