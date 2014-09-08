/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe2.pkg22;

import javax.swing.JOptionPane;

/**
 *
 * @author tim
 */
public class PE222 
{
    final static double tax = 0.075;//7.5 percent tax in decimals
    final static int shippingCostPerBook = 2;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        double bookPrice = Double.parseDouble(JOptionPane.showInputDialog("Please enter the book's price"));
        int booksToBeSold = Integer.parseInt(JOptionPane.showInputDialog("Please enter the amount of books to be sold"));
        
        double total = (booksToBeSold * bookPrice) + (booksToBeSold * shippingCostPerBook);
        total = total + (total * tax);
        
        System.out.println("The total price is: " + total);
        
    }
    
}
