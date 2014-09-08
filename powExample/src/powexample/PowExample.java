/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package powexample;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author tim
 */
public class PowExample 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        int processable = Integer.parseInt(JOptionPane.showInputDialog("please enter a number to process"));
        System.out.println(processable);
        
        System.out.println("square: " + Math.pow(processable, 2));
        System.out.println("cube: " + Math.pow(processable, 3));
        System.out.println("quad: " + Math.pow(processable, 4));
    }
    
}
