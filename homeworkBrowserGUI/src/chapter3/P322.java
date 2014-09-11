/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chapter3;

import java.util.Scanner;

/**
 *
 * @author tim
 */
public class P322 
{
    public void run()
    {
        boolean married;
        Scanner in = new Scanner(System.in);
        while(true)
        {
            System.out.print("Are you single or married?(S/M): ");
            
            String marriedStr = in.next().toUpperCase();
        
            if(marriedStr.charAt(0) == 'S')
            {
                married = false;
                break;
            }
            else if(marriedStr.charAt(0) == 'M')
            {
                married = true;
                break;
            }
            else System.out.println("\nInput not recognised, please try again!");
        }
        
        System.out.print("How much is your total taxable income? ");
        int taxableIncome = in.nextInt();
        int tax;
        if(married)
        {
            if(taxableIncome <= 16000)
                tax = (taxableIncome / 100) * 10;//10 percent tax
            else if(taxableIncome <= 64000)
            {
                tax = 16000 / 10;
                taxableIncome -= 16000;
                tax += ((taxableIncome / 100) * 15) + 1600;
            }
            else
            {
                tax = 16000 / 10;
                taxableIncome -= 16000;
                tax += ((64000 / 100) * 15) + 1600;
                taxableIncome -= 64000;
                tax += ((taxableIncome / 100) * 25) + 8800;
            }
        }
        else
        {
            if(taxableIncome <= 8000)
                tax = (taxableIncome / 100) * 10;//10 percent tax
            else if(taxableIncome <= 32000)
            {
                tax = 8000 / 10;
                taxableIncome -= 8000;
                tax += ((taxableIncome / 100) * 15) + 800;
            }
            else
            {
                tax = 8000 / 10;
                taxableIncome -= 8000;
                tax += ((32000 / 100) * 15) + 800;
                taxableIncome -= 64000;
                tax += ((taxableIncome / 100) * 25) + 4400;
            }
        }
        System.out.println("\n\nThe total amount of tax you have to pay is: " + tax);
    }
}
