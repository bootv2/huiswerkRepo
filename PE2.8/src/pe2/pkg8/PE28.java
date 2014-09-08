/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe2.pkg8;

import javax.swing.JOptionPane;

/**
 *
 * @author tim
 */
public class PE28 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int length = Integer.parseInt(JOptionPane.showInputDialog("Please enter a length"));
        int width = Integer.parseInt(JOptionPane.showInputDialog("Please enter a width"));
        System.out.println("Area: " + (length * width));
        System.out.println("Diagonal: " + (Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2))));
    }
    
}
