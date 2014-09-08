/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pescience2.pkg28;

import javax.swing.JOptionPane;

/**
 *
 * @author tim
 */
public class PEScience228 
{

    static double R1, R2, R3, rParallel;//the individual resistances. These are initialised by user input.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO calculate total R(resistance) from r2, and r3 being parallel, but r1 is in series with r2 and r3
        //r2+r3 parallel resistance formula = (R2 * R3) / (R2 + R3)
        //Series is just a sum(R1 + Rx)
        R1 = Double.parseDouble(JOptionPane.showInputDialog("Please enter the resistance in series"));
        R2 = Double.parseDouble(JOptionPane.showInputDialog("Please enter the first parallel resistance"));
        R3 = Double.parseDouble(JOptionPane.showInputDialog("Please enter the second parallel resistance"));
        rParallel = (R2 * R3) / (R2 + R3);
        System.out.println("The total resistance is: " + (R1 + rParallel));
    }
    
}
