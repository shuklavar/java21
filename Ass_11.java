/**
* Write a Java program to print the area and perimeter of a circle.
* @Programmer: Varunakar Shukla
* Date: 21/09/2021 
*/

 class Ass_11 {
 
   private static final double radius = 7.5;

    public static void main(String[] args) {

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}
