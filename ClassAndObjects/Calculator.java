package PRP;

class Cal {
public static double PowerInt(int num1,int num2)
{
	return Math.pow(num1, num2);
}
public static double PowerDouble(double num1,int num2)
{
	return Math.pow(num1, num2);
}
}
public class Calculator{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal c=new Cal();
		System.out.println(c.PowerInt(5,2));
		System.out.println(c.PowerDouble(5.4,2));

	}

}
