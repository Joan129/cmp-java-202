
package primenumbers;

import java.util.Scanner;
public class PrimeNumbers {


    public static void main(String[] args) {
           int y;
              Scanner input = new Scanner (System.in);
              System.out.println("enter an integer");
                y = input.nextInt();
         
            if(y%1==0) 
            {
               System.out.println("it is a prime number");
            }
            else 
            {      
             System.out.println("it is not a prime number");
             }       
          }
} 
    
