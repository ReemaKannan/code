package PRP;

class Animal {
	public void eat()
	{
		System.out.println("An animal eats");
	}
	public void sleep()
	{
		System.out.println("An animal sleeps");
	}
}
class Bird extends Animal{
	public void eat()
	{
		System.out.println("A bird eats");
	}
	public void sleep()
	{
		System.out.println("A bird  sleeps");
	}
}
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal a=new Animal();
Bird b=new Bird();
a.eat();
a.sleep();
b.eat();
b.sleep();
	}

}
