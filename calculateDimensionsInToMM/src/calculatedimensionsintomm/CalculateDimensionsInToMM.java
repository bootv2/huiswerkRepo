/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculatedimensionsintomm;

/**
 *
 * @author tim
 */
public class CalculateDimensionsInToMM 
{

    final static double millimetresPerInch = 25.4;//the amount of millimetres in an inch
    static double width, height;//the width and height of the dimensions to calculate
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("Enter the width and height of the object you want to calculate the dimensions for\n"
                + "Output is in millimetres");
        width = 8.5;
        height = 11;
        System.out.println("Width: " + (width * millimetresPerInch) + " Height: " + (height * millimetresPerInch) + " in millimetres");//calculate the width and height to millimetres, then calculate how many millimetres the dimensions are
    }
    
}
