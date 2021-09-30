/**
* Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. 
* @Programmer: Varunakar Shukla
* Date: 21/09/2021 
*/

import java.util.Scanner;
class Ass_6
{
public static void main(String  args[])// start execution from main method
{
Scanner s= new Scanner(System.in);
int a, b;
int add, sub, mul, div, rem;

System.out.println("Enter a First number");

a= s.nextInt();// 125
System.out.println("Enter a Second number");
b=s.nextInt();//24
add= a+b;
sub= a-b;
mul= a*b;
div= a/b;
rem= a%b;
System.out.println("The addition of two Number is:"  +add);
System.out.println("The subtraction of two Number is:"  +sub);
System.out.println("The product of two Number is:"  +mul);
System.out.println("The division of two Number is:"  +div);
System.out.println("The remainder  of two Number is:"  +rem);

}
}


