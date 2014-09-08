/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package homeworkbrowsergui;

import homeworkbrowsergui.secondLesson.P211;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author tim
 */
public class HomeworkBrowserGUI {//extends JPanel
                        //implements ActionListener{

    static ClassNames names;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String classname;
        //names.init();
        while(true)
        {
            classname = JOptionPane.showInputDialog("Please enter the name of the class you want to run").toUpperCase();
            //if(names.getClassId(classname) != -1)
                break;
        }
        int classId = 2;// names.getClassId(classname);
        
        switch(classId)
        {
            case 2:
                P211 p211 = new P211();
                p211.main();
        }
        
    }
    
}
