import java.util.Scanner;
class Array1
{
public static void main(String args[])

{
Scanner s=new Scanner(System.in);
int a[]= new int[7];
int sum=0;
System.out.println("Enter the array element:");
for(int i=0; i<a.length; i++)
{
a[i]= s.nextInt();
}
for(int i: a)
{
sum=sum+i;
}
System.out.println("The sum of array is:" +sum);
}
}