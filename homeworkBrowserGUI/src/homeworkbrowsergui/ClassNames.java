/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package homeworkbrowsergui;

import java.util.ArrayList;



/**
 *
 * @author tim
 */
public class ClassNames 
{
    static ArrayList<String> names;
    public void init()
    {
        names = new ArrayList();
        names.add("P2.26");
        names.add("P2.22");
        names.add("P2.11");
        names.add("P2.8");
        names.add("POWEXAMPLE");
        names.add("P2.29");//5
        names.add("INTSUMDIFF");
        names.add("HELLOWORLD");
        names.add("CALCULATEDIMENSIONSINTOMM");
        names.add("EXIT");
        names.add("E");//10
        names.add("Q");
        names.add("P3.14");
        names.add("P3.22");
        //end lesson 2
        
        
    }
    public int getClassId(String className)
    {
        for(int i = 0; i < names.size(); i++)
        {
            if(className.compareTo(names.get(i)) == 0)
            {
                return i;
            }
        }
        return -1;
    }
}
