public class Flow1
{

public static boolean lastDigit(int a,int b)
{
 
a=a%10;
b=b%10;
if(a==b)
{
return true;
}
else 
{
return false;
}
}
public static void main(String[] args)

{
int a=Integer.parseInt(args[0]);
 int b=Integer.parseInt(args[1]);
System.out.println(lastDigit(a,b));

}
}



