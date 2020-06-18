import java.util.*;
public class Array1{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
float avg;
int sum=0;
System.out.println("Enter size of an array");
int a=sc.nextInt();
int[] n=new int[a];
System.out.println("Enter array elements");
for(int i=0;i<a;i++)
{
n[i]=sc.nextInt();
sum=sum+n[i];
}

System.out.println("Sum:"+sum);
avg=(float)sum/a;
System.out.println("Avg:"+avg);
}
}

