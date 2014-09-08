/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package intsumdiff;

import javax.swing.JOptionPane;

/**
 *
 * @author tim
 * //Excersises P2.4, P2.5
 */
public class IntSumDiff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number1;
        int number2;
        number1 = Integer.parseInt(JOptionPane.showInputDialog("please enter the first number to process"));
        number2 = Integer.parseInt(JOptionPane.showInputDialog("please enter the second number to process"));
        System.out.println("Sum: \t\t" + (number1 + number2));
        if(number1 >= number2)
            System.out.println("Diff: \t\t" + (number1 - number2));
        else
            System.out.println("Diff: \t\t" + (number2 - number1));
        
        System.out.println("Product: \t" + (number1 * number2));
        
        System.out.println("Avg: \t\t" + (((double)number1 + number2) / 2.0));
        
        if(number1 >= number2)
        {
            System.out.println("Distance: \t" + Math.abs(number1 - number2));
            System.out.println("Max: \t\t" + number1);
            System.out.println("Min: \t\t" + number2);
        }
 
        else
        {
            System.out.println("Distance: \t" + Math.abs(number2 - number1));
            System.out.println("Max: \t\t" + number2);
            System.out.println("Min: \t\t" + number1);
        }
        
        
    }
    
}
