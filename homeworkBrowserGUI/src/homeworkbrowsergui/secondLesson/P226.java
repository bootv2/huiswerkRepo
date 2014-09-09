/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package homeworkbrowsergui.secondLesson;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author tim
 */
public class P226 {
    static double annualInterestPercentage;
    static double monthlyInterestCompound;
    static double startingAmount;
    
    /**
     * @param args the command line arguments
     */
    public static void main() 
    {
        Scanner in = new Scanner(System.in);//create a new input method
        
        System.out.print("Please enter your annual interest percentage: ");
        
        annualInterestPercentage    = in.nextDouble() / 100;//the /100 operation is done to make the percentage into a decimal ready for processing
        monthlyInterestCompound     = annualInterestPercentage / 12;
        
        System.out.print("\nPlease enter your starting capital: ");
        startingAmount              = in.nextDouble();
        double currentAmount        = startingAmount;
        
        System.out.println("\n");
        
        for(int i = 0; i < 3; i++)
        {
            currentAmount += currentAmount * monthlyInterestCompound;
            
            System.out.println("Month " + i + ": " + (Math.round(currentAmount * 100.0) / 100.0));
        }
    }
}
