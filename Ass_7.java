/**
* Write a Java program to print the multiplication of  numbers. 
* @Programmer: Varunakar Shukla
* Date: 21/09/2021 
*/

import java.util.Scanner;
class Ass_7
{
public static void main(String  args[])// start execution from main method
{
Scanner s= new Scanner(System.in);
int n, i;
int c;
System.out.println("enter a number");
n= s.nextInt();
for(i=1; i<=10; i++)
{
c= n*i;


System.out.println("multiplication of number is "  +c);
}
}
}


