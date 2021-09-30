/**
* Write a Java program to print the to swap two varibale;
* @Programmer: Varunakar Shukla
* Date: 21/09/2021 
*/


 class Ass_15 {
 
   

    public static void main(String[] args) {
    
    int a=20, b=25, temp;
   System.out.println("Before swapping : a, = "+a);
   System.out.println("Before swapping : b, = "+b);


temp=a;
a=b;
b= temp;
System.out.println("after  swapping : a, = "+a);
System.out.println("after swapping : b, = "+b);
   
}
}

