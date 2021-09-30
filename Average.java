import java.util.Scanner;
class Average
{
public static void main(String args[])

{
Scanner s=new Scanner(System.in);
int a[]= new int[7];
int sum=0;
double avg=0;
System.out.println("Enter the array element:");
for(int i=0; i<a.length; i++)
{
a[i]= s.nextInt();
}
for(int i: a)
{
sum=sum+i;
avg= sum/a.length;
}
System.out.println("The sum of array is:" +sum);
System.out.println("---------------");
System.out.println("The avg of array is:" +avg);
}
}