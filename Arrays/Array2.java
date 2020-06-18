public class Array2{
public int max(int[] array)
{
int max=0;
for(int i=0;i<array.length;i++)
{
if(array[i]>max)
{
max=array[i];
}
}
return max;
}
public int min(int[] array)
{
int min=array[0];
for(int i=0;i<array.length;i++)
{
if(array[i]<min)
{
min=array[i];
}
}
return min;
}
public static void main(String[] args)
{
int [] array={23,54,22,95,2};
MinandMax  a=new MinandMax();
System.out.println("Maximum value:"+a.max(array));
System.out.println("Minimum value:"+a.min(array));
}
}


