package PRP;

public class Cloning {
		public static void main(String[] args) throws CloneNotSupportedException{
			Employeee obj1 = new Employeee();
			obj1.empid = 132;
			obj1.name = "Reema";
			Employeee obj2 = (Employeee)obj1.clone();
			obj2.empid = 123;
			obj2.name = "Reems";
			System.out.println(obj1);
			System.out.println(obj2);
		}
	}