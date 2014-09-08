/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe2.pkg26;

import javax.swing.JOptionPane;

/**
 *
 * @author tim
 */
public class PE226 
{
    static double annualInterestPercentage;
    static double monthlyInterestCompound;
    static double startingAmount;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        annualInterestPercentage = Double.parseDouble(JOptionPane.showInputDialog("Please enter the annual interest percentage")) / 100;//the /100 operation is done to make the percentage into a decimal ready for processing
        monthlyInterestCompound = annualInterestPercentage / 12;
        startingAmount = Double.parseDouble(JOptionPane.showInputDialog("Please enter your starting capital"));
        double currentAmount = startingAmount;
        
        for(int i = 0; i < 3; i++)
        {
            currentAmount += currentAmount * monthlyInterestCompound;
            System.out.println("Month " + i + ": " + (Math.round(currentAmount * 100.0) / 100.0));
        }
    }
    
}
