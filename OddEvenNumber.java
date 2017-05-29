/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddevennumber;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class OddEvenNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int x;
            Scanner input=new Scanner(System.in);
            System.out.println("enter an integer");
              x = input.nextInt(); 
            if(x%2==0)
            {
                System.out.println("it is an even number");
            }
           else
            {
               System.out.println("it is an odd number");             
            }
        }
    }


        // TODO code application logic here
    
    

