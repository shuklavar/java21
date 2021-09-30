/**
* 12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers. 
* @Programmer: Varunakar Shukla
* Date: 21/09/2021 
*/
import java.util.Scanner;

 class Ass_12 {

    public static void main(String[] args) {

 Scanner s= new Scanner(System.in);
int a, b, c;
float avg;
System.out.println("Enter a first number");
a= s.nextInt();

System.out.println("Enter a Second  number");
b= s.nextInt();

System.out.println("Enter a Third  number");
c=s.nextInt();

avg= (a+b+c)/3;
System.out.println("The average of three number is:" +avg);



    }
}
