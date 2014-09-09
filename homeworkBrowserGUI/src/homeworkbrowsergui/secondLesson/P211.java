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
public class P211 
{
    final static int COST_PER_MILE = 100;
    public static void main() 
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter the maximum amount of gallons your tank can carry: ");
        
        double maxGallons = in.nextDouble();
        
        System.out.print("\nPlease enter how many miles you can drive on a gallon: ");
        double milesPerGallon = in.nextDouble();
        
        System.out.print("\nPlease enter the current gas price per gallon");
        double pricePerGallon = in.nextDouble();
        
        System.out.println("Price per 100 miles: " + ((COST_PER_MILE / milesPerGallon) * pricePerGallon));
        System.out.println("Maximum distance on a full tank: " + (milesPerGallon * maxGallons));
    }
}
