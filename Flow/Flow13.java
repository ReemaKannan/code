public class Flow13{
public static void main(String[] args){
for(int i=10;i<=99;i++)
{
int temp=0;
for(int j=2;j<i;j++)
{
if(i%j==0)
{
temp=1;
break;
}
}
if(temp==0)
System.out.println(i);
}
}
}