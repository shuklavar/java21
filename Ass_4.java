/**
* Write a Java program to print the divide two numbers. 
* @Programmer: Varunakar Shukla
* Date: 21/09/2021 
*/

import java.util.Scanner;
class Ass_3
{
public static void main(String  args[])// start execution from main method
{
Scanner s= new Scanner(System.in);
int a, b;
float c;
System.out.println("Enter a First number");

a= s.nextInt();// 50
System.out.println("Enter a Second number");
b=s.nextInt();// 3
c= a/b;


System.out.println("The Divide  of two Number is:"  +c);

}
}
