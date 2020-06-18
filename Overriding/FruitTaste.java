package PRP;

class Fruit{
	String name;
	String taste;
	String size;
public void eat()
{
	System.out.println("Enter the Name of the fruit ");
	System.out.println("Enter the Taste of the fruit");
}
}
class Apple 
{
  public void eat()
	{
		System.out.println("Apple");
		System.out.println("Taste is Sweet");
	}
}
class Orange 
{
	public void eat()
	{
		System.out.println("Orange");
		System.out.println("Taste is Sour");
	}
}

public class FruitTaste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a=new Apple();
		Orange o=new Orange();
		Fruit f=new Fruit();
		f.eat();
		a.eat();
		o.eat();

	}

}
