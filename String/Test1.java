package PRP;
import java.util.*;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String ss=s.toLowerCase();
		StringBuffer sb=new StringBuffer(ss);
		String s1=sb.reverse().toString();
		if(ss.contentEquals(s1))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}

	}

}
