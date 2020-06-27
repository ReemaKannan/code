package PRP;

import java.util.Random;

abstract class Compartment
 {
	public abstract String notice();
}
class FirstClass extends Compartment{
	public String notice()
	{
	     return "FirstClass Compartment";

	}
}
class Ladies extends Compartment{
	public String notice() 
	{
		return "ladies Compartment";
	}
	
}
class General extends Compartment{
	public String notice() 
	{
		return "General Compartment";
	}
}
class Luggage extends Compartment{

	public String notice() 
	{
			return "Luggage Compartment";
	}
		
}


public  class TestCompartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartment c[]=new Compartment[10];
		Random r=new Random();
		for (int i = 0; i < 10; i++) {
	    	int randomNum = r.nextInt((4 - 1) + 1) + 1;
	    	if (randomNum == 1)
	    		c[i] = new FirstClass();
	    	else if (randomNum == 2)
	    		c[i] = new Ladies();
	    	else if (randomNum == 3)
	    		c[i] = new General();
	    	else if (randomNum == 4)
	    		c[i] = new Luggage();
	    	
	    	System.out.println(c[i].notice());
	    	
	    }
	}
	
}
	
