
public class Array5{
public static void main(String[] args)
{
int[] a={22,95,36,20};
int smallest=a[0];
int largest=a[0];

for(int i=0;i<a.length;i++)
{
if(a[i]<smallest)
{
smallest=a[i];
}
if(a[i]>largest)
{
largest=a[i];
}
}
System.out.println(smallest+" "+largest);
}
}



