/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe2.pkg11;

import javax.swing.JOptionPane;

/**
 *
 * @author tim
 */
public class PE211 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        double maxGallons = Double.parseDouble(JOptionPane.showInputDialog("Please enter the maximum amount of gallons your tank can carry"));
        double milesPerGallon = Double.parseDouble(JOptionPane.showInputDialog("Please enter how many miles you can drive on a gallon"));
        double pricePerGallon = Double.parseDouble(JOptionPane.showInputDialog("Please enter the current gas price per gallon"));
        
        System.out.println("Price per 100 miles: " + ((100 / milesPerGallon) * pricePerGallon));
        System.out.println("Maximum distance on a full tank: " + (milesPerGallon * maxGallons));
    }
    
}
