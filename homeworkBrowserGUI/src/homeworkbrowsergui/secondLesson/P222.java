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
public class P222 
{
    
    final static double tax                 = 0.075;//7.5 percent tax in decimals
    final static int shippingCostPerBook    = 2;
    

    /**
     * 
     */
    public static void main() 
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter the book's price: ");
        
        double bookPrice    = in.nextDouble();
        
        System.out.print("\nAnd the amount of books to be sold: ");
        int booksToBeSold   = in.nextInt();
        
        double total    = (booksToBeSold * bookPrice) + (booksToBeSold * shippingCostPerBook);
        total           = total + (total * tax);
        
        System.out.println("The total price is: " + total);
        
    }
    
}

    

