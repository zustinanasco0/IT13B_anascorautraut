/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prelim;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class arithmetics_operators {
  
    public static void main(String[] args) {
       
         int x;
         int y;
        
       Scanner in = new Scanner(System.in);
             
       System.out.println(" Enter first number: ");
       x = in.nextInt();
        System.out.println(" Enter second number: ");
       y = in.nextInt();
       
       
            
       System.out.println(x + " + " + y + " = " + (x+y));
       System.out.println(x + " - " + y + " = " + (x+y));
       System.out.println(x + " x " + y + " = " + (x+y));
       System.out.println(x + " / " + y + " = " + (x+y));
       System.out.println(x + " mod " + y + " = " + (x+y));
}
}

