/**
* Write a Java program to print the sum of two numbers. 
* @Programmer: Varunakar Shukla
* Date: 21/09/2021 
*/

import java.util.Scanner;
class Ass_2
{
public static void main(String  args[])// start execution from main method
{
Scanner s= new Scanner(System.in);
int a, b, c;
System.out.println("Enter a First number");

a= s.nextInt();// 74
System.out.println("Enter a Second number");
b=s.nextInt();// 34
c= a+b;


System.out.println("The sum of two Number is:"  +c);

}
}
