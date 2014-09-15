/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chapter3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author tim
 */
public class P314Hand
{
    static String output = "";
    static ArrayList<String> input = new ArrayList<String>();
    
    public static void main(String[] args)
    {
        run();
    }
    
    public static void run()
    {
        for(int i = 0; i < 5; i++)
        {
        System.out.print("Please enter the card code(Color:Type): ");
        Scanner in = new Scanner(System.in);
        String inputLine = in.next();
        inputLine = inputLine.toUpperCase();
        input.add(inputLine);
        }
        
        recogniseCards();//translate the character inputs to numerical values
        
        sortArrayList(); //sort the numerical values so poker hand checks become easyer
        
        checkPokerHands();//check for poker hands
       
        
        System.out.println("\n\n" + output);
    }
    
    /*checkPokerHands
    *A = 1
    *J = 11
    *Q = 12
    *K = 13
    */
    
    static ArrayList<Integer> inputType = new ArrayList<Integer>();
    static ArrayList<Integer> inputNum = new ArrayList<Integer>();
    
    public static void checkPokerHands()
    {
        System.out.println("\n");//splitting input and ouput
        
        if(royalFlush())
        {
            System.out.println("You are holding a royal flush!!!");
        }
        
        else if(isStreet())
        {
            System.out.println("You are holding a street!!");
        }
        
        else if(isFlush())
        {
            System.out.println("You are holding a flush!!");
        }
        
        else if(fullHouse())
        {
            System.out.println("You are holding a full house!!");
        }
        
        else if(fourOfAKind())
        {
            System.out.println("You are holding four of a kind!!");
        }
        
        else if(threeOfAKind())
        {
            System.out.println("You are holding three of a kind!");
        }
        
        else if(amountOfPairs() >= 1)
        {
            System.out.println("You have " + amountOfPairs() + " pairs!");
        }
        else
            System.out.println("You have high card with:\n" + getHighCard());
        
        
    }
    
    /*
    *D 0
    *H 1
    *S 2
    *C 3
    */
    
    public static String getHighCard()
    {
        return "Card:\t" + input.get(4) + "\n" + "Card:\t" + input.get(3);
    }
    
    public static boolean fourOfAKind()
    {
        for(int i = 0; i < 5; i++)
        {
            for(int x = i + 1; x < 5; x++)
            {
                for(int y = x + 1; y < 5; y++)
                {
                    for(int z = y + 1; z < 5; z++)
                    {
                        if(inputNum.get(i) == inputNum.get(x))
                        {
                            if(inputNum.get(x) == inputNum.get(y))
                            {
                                if(inputNum.get(y) == inputNum.get(z)) return true;
                            }
                        }
                    }
                }
            }
        }
        
        return false;
    }
    
    
    public static boolean royalFlush()
    {
        if(!isFlush()) return false;
        
        if(!royal()) return false;
        
        
        boolean result = false;
        if(inputNum.get(0) == 1)
        {
            for(int i = 1; i < 4; i++)
            {
                if(inputNum.get(i) == (inputNum.get(i + 1) - 1))
                {
                    //System.out.println("input " + i + " is in line for a street with input " + (i + 1));
                    result = true;
                }
                else
                {
                    result = false;
                    break;
                }
            }
        }
        
        return result;
        
    }
    
    public static boolean royal()
    {
        boolean isRoyal = false;
        if(inputNum.get(0) == 1 || inputNum.get(1) == 1 || inputNum.get(2) == 1 || inputNum.get(3) == 1 || inputNum.get(4) == 1) isRoyal = true;
        else isRoyal = false;
        if(inputNum.get(0) == 10 || inputNum.get(1) == 10 || inputNum.get(2) == 10 || inputNum.get(3) == 10 || inputNum.get(4) == 10) isRoyal = true;
        else isRoyal = false;
        if(inputNum.get(0) == 11 || inputNum.get(1) == 11 || inputNum.get(2) == 11 || inputNum.get(3) == 11 || inputNum.get(4) == 11) isRoyal = true;
        else isRoyal = false;
        if(inputNum.get(0) == 12 || inputNum.get(1) == 12 || inputNum.get(2) == 12 || inputNum.get(3) == 12 || inputNum.get(4) == 12) isRoyal = true;
        else isRoyal = false;
        if(inputNum.get(0) == 13 || inputNum.get(1) == 13 || inputNum.get(2) == 13 || inputNum.get(3) == 13 || inputNum.get(4) == 13) isRoyal = true;
        else isRoyal = false;
        
        return isRoyal;
    }
    
    
    public static int amountOfPairs()
    {
        int result = 0;
        for(int i = 0; i < 5; i++)
        {
            for(int x = i + 1; x < 5; x++)
            {
                if(inputNum.get(i) == inputNum.get(x))//check for every card if the same card number appears to check for pairs
                {
                    result++;
                }
            }
        }
        return result;
    }
    
    public static boolean isFlush()
    {
        boolean result = false;
        for(int i = 0; i < 4; i++)
        {
            if(inputType.get(i) != inputType.get(i + 1))
            {
                result = false;
                break;
            }
            else result = true;
        }
        return result;
        
    }
    
    public static boolean threeOfAKind()
    {
        for(int i = 0; i < 5; i++)
        {
            for(int x = i + 1; x < 5; x++)
            {
                for(int y = x + 1; y < 5; y++)
                {
                    if(inputNum.get(i) == inputNum.get(x))//check for every card if the same card number appears to check for pairs
                    {
                        if(inputNum.get(x) == inputNum.get(y))
                            return true;
                    }
                }
            }
        }
        return false;
    }
    
    public static boolean fullHouse()
            {
                boolean result = false;
                if(threeOfAKind())
                {
                    for(int i = 0; i < 5; i++)
                    {
                        for(int x = i + 1; x < 5; x++ )
                        {
                            for(int y = x + 1; y < 5; y++)
                            {
                                if(inputNum.get(i) == inputNum.get(x))
                                {
                                    //found a pair, let's check if it's the three of a kind or if it results in a full house
                                    if(inputNum.get(x) == inputNum.get(y))
                                    {
                                        i += 2;
                                        x += 1;
                                         
                                        result = false;
                                        
                                    }
                                    else
                                        result = true;
                                }
                            }
                        }
                    }
                }
                return result;
            }
    
    public static boolean isStreet()
    {
        boolean result = false;
        for(int i = 0; i < 4; i++)
        {
            if(inputNum.get(i) == (inputNum.get(i + 1) - 1))
            {
                //System.out.println("input " + i + " is in line for a street with input " + (i + 1));
                result = true;
            }
            else
            {
                result = false;
                break;
            }
        }
        
        return result;
    }
    
    public static void sortArrayList()
    {
        boolean sortingAttempted = true;
        int temp = 0;
        int tempType = 0;
        String tempInput = "";
        while(sortingAttempted)
        {
            sortingAttempted = false;
            for(int i = 0; i < 4; i++)
            {
                if(inputNum.get(i) > inputNum.get(i + 1))
                {
                    temp = inputNum.get(i);
                    tempType = inputType.get(i);
                    tempInput = input.get(i);
                    input.set(i, input.get(i + 1));
                    input.set(i + 1, tempInput);
                    inputType.set(i, inputType.get(i + 1));
                    inputType.set(i + 1, tempType);
                    inputNum.set(i, inputNum.get(i + 1));
                    inputNum.set(i + 1, temp);
                    sortingAttempted = true;
                }
            }
        }
    }
    
    
    
    
    public static void recogniseCards()
    {
        for(int i = 0; i < 5; i++)
        {
        
        if(input.get(i).length() == 3)//since the input length is 3, we can safely assume the card number is 10, since this is the only card number that uses a character more for identification
        {
            switch(input.get(i).charAt(0))
            {
                case 'D':
                    output += "Ten of Diamonds\n";
                    inputType.add(0);
                    inputNum.add(10);
                    break;
                case 'H':
                    output += "Ten of Hearts\n";
                    inputType.add(1);
                    inputNum.add(10);
                    break;
                case 'S':
                    output += "Ten of Spades\n";
                    inputType.add(2);
                    inputNum.add(10);
                    break;
                case 'C':
                    output += "Ten of Clubs\n";
                    inputType.add(3);
                    inputNum.add(10);
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
            switch(input.get(i).charAt(0))
            {
                case 'D':
                    type = "Diamonds";
                    inputType.add(0);
                    break;
                case 'H':
                    type = "Hearts";
                    inputType.add(1);
                    break;
                case 'S':
                    type = "Spades";
                    inputType.add(2);
                    break;
                case 'C':
                    type = "Clubs";
                    inputType.add(3);
                    break;
                default:
                    type = "Input not recognised!";
                    break;
            }
            switch(input.get(i).charAt(1))
            {
                case 'A':
                    cardNum = "Ace";
                    inputNum.add(1);
                    break;
                case '2':
                    cardNum = "Two";
                    inputNum.add(2);
                    break;
                case '3':
                    cardNum = "Three";
                    inputNum.add(3);
                    break;
                case '4':
                    cardNum = "Four";
                    inputNum.add(4);
                    break;
                case '5':
                    cardNum = "Five";
                    inputNum.add(5);
                    break;
                case '6':
                    cardNum = "Six";
                    inputNum.add(6);
                    break;
                case '7':
                    cardNum = "Seven";
                    inputNum.add(7);
                    break;
                case '8':
                    cardNum = "Eight";
                    inputNum.add(8);
                    break;
                case '9':
                    cardNum = "Nine";
                    inputNum.add(9);
                    break;
                case 'J':
                    cardNum = "Jack";
                    inputNum.add(11);
                    break;
                case 'Q':
                    cardNum = "Queen";
                    inputNum.add(12);
                    break;
                case 'K':
                    cardNum = "King";
                    inputNum.add(13);
                    break;
                default:
                    cardNum = "Not recognised";
                    break;
            }
            output += cardNum + " of " + type + "\n";
        }
        }//end for loop
    }
    
}
