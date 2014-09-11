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
public class P314 
{
    public void run()
    {
        System.out.print("Please enter the card code(Color:Type): ");
        Scanner in = new Scanner(System.in);
        String input = in.next();
        input = input.toUpperCase();
        String output;
        
        if(input.length() == 3)//since the input length is 3, we can safely assume the card number is 10, since this is the only card number that uses a character more for identification
        {
            switch(input.charAt(0))
            {
                case 'D':
                    output = "Ten of Diamonds";
                    break;
                case 'H':
                    output = "Ten of Hearts";
                    break;
                case 'S':
                    output = "Ten of Spades";
                    break;
                case 'C':
                    output = "Ten of Clubs";
                    break;
                default:
                    output = "Input not recognised!";
                    break;
            }
            
        }
        else//now we have to filter for every other possible card.
        {
            String type;
            String cardNum;
            switch(input.charAt(0))
            {
                case 'D':
                    type = "Diamonds";
                    break;
                case 'H':
                    type = "Hearts";
                    break;
                case 'S':
                    type = "Spades";
                    break;
                case 'C':
                    type = "Clubs";
                    break;
                default:
                    type = "Input not recognised!";
                    break;
            }
            switch(input.charAt(1))
            {
                case 'A':
                    cardNum = "Ace";
                    break;
                case '2':
                    cardNum = "Two";
                    break;
                case '3':
                    cardNum = "Three";
                    break;
                case '4':
                    cardNum = "Four";
                    break;
                case '5':
                    cardNum = "Five";
                    break;
                case '6':
                    cardNum = "Six";
                    break;
                case '7':
                    cardNum = "Seven";
                    break;
                case '8':
                    cardNum = "Eight";
                    break;
                case '9':
                    cardNum = "Nine";
                    break;
                case 'J':
                    cardNum = "Jack";
                    break;
                case 'Q':
                    cardNum = "Queen";
                    break;
                case 'K':
                    cardNum = "King";
                    break;
                default:
                    cardNum = "Not recognised";
                    break;
            }
            output = cardNum + " of " + type;
        }
        System.out.println("\n\n" + output);
    }
    
}
