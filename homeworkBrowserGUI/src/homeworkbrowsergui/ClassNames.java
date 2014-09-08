/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package homeworkbrowsergui;

import java.util.List;



/**
 *
 * @author tim
 */
public class ClassNames 
{
    static List<String> names;
    public void init()
    {
        names.add("P2.26");
        names.add("P2.22");
        names.add("P2.11");
        names.add("P2.8");
        names.add("POWEXAMPLE");
        names.add("P2.29");
        names.add("INTSUMDIFF");
        names.add("HELLOWORLD");
        names.add("CALCULATEDIMENSIONSINTOMM");
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
