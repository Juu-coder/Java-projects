
package assignment;
import java. util.Scanner;
     

public class AreaofCircle{
    
    public static void main(String[] args) {
     Scanner user_input=new Scanner(System.in);
     
//     double length = 3.1428571;
//     System.out.println("Enter the length");
//     length = user_input.nextDouble();
//     
//     double b7readth = 0;
//     System.out.println("Enter the breadth");
//      breadth = user_input.nextDouble();
//     
//     double Area = length * breadth;
//     System.out.println("Area of Rectangle is :" + Area);
    
      double Pi = 3.1428571; 
      
      double Radius;
      System.out.println("Enter Radius");
      Radius = user_input.nextDouble();
      
      double Area = Pi * Radius * Radius;
      System.out.println("Area of Circle is " + Area);
      
    }
    }
    

