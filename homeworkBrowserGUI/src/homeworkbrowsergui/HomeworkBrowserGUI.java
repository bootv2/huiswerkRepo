/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package homeworkbrowsergui;

import chapter3.P314;
import chapter3.P314Hand;
import chapter3.P322;
import homeworkbrowsergui.secondLesson.P211;
import homeworkbrowsergui.secondLesson.P222;
import homeworkbrowsergui.secondLesson.P226;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Scanner;
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        boolean exit = false;
        while(!exit)
        {
            Scanner in = new Scanner(System.in);
            
            ClassNames names = new ClassNames();
            String classname;
            names.init();
            while(true)
            {
                System.out.println("Enter a command!");
                classname = in.next().toUpperCase();
                if(names.getClassId(classname) != -1)
                    break;
            }
            int classId = names.getClassId(classname);
        
            switch(classId)
            {
                case 0:
                    P226 p226 = new P226();
                    p226.main();
                    break;
                case 1:
                    P222 p222 = new P222();
                    p222.main();
                    break;
                case 2:
                    P211 p211 = new P211();
                    p211.main();
                    break;
                case 9:
                    exit = true;
                    break;
                case 10:
                    exit = true;
                    break;
                case 11:
                    exit = true;
                    break;
                case 12:
                    P314 p314 = new P314();
                    p314.run();
                    break;
                case 13:
                    P322 p322 = new P322();
                    p322.run();
                    break;
                case 14:
                    P314Hand p314Hand = new P314Hand();
                    p314Hand.run();
                    break;
            }
        }
        
    }
    
}
