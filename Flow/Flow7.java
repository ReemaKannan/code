public class Flow7{
public static void main(String[] args)
{
char c=args[0].charAt(0);
int temp;
if(c>='a' && c<='z')
{
System.out.print(c+"->");
temp=(int)c;
temp=temp-32;
c=(char)temp;
System.out.println(c);
}
else
{
System.out.print(c+"->");
temp=(int)c;
temp=temp+32;
c=(char)temp;
System.out.println(c);
}
}
}
