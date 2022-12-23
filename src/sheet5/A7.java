package sheet5;
import java.util.Scanner;
public class A7 {
    
public static void main(String[] args) {
      Scanner input = new Scanner(System.in); 
      
      System.out.println("Enter x:");
       int x = input.nextInt();
       
       System.out.println("Enter y:");
       int y = input.nextInt();
       int z;
       
       if (x>2) { 
         if (y>2) {
             z= x+y;
             System.out.println("z is"+ z);
         }
       }
       else 
           System.out.println("x is"+ x);
       
      
      
    
}
}