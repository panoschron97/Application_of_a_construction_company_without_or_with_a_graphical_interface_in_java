/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2_java_2020;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static project2_java_2020.Entrywork.dataofwork;

/**
 *
 * @author panos
 */
public class Showalltheelementsoftheprojectthatprovidesthemostnetrevenue extends JFrame // κλάση που εμφανίζει το έργο με τα περισσότερα καθαρά κέρδη στην επιχείρηση.

{

    public Showalltheelementsoftheprojectthatprovidesthemostnetrevenue()
    
    {
        
        double fpa = 0.19; // φπα δικό μου.    
    
        for(Work work : dataofwork)
        
        {
    
        if(work.Getgrossrevenueofcompany()-((work.Getgrossrevenueofcompany()*fpa)+work.Getcostsforlogisticalinfrastructure()+work.Getcostsforotheroperatingexpenses())>((work.Getgrossrevenueofcompany()*fpa)+work.Getcostsforlogisticalinfrastructure()+work.Getcostsforotheroperatingexpenses()))
        
        {
    
        JOptionPane.showMessageDialog(this, "Elements with the most net revenue : " + work.toString() ,"Success",JOptionPane.INFORMATION_MESSAGE);
        
        Maincompany maincompany = new Maincompany();
     
        }
    
        }
        if(dataofwork.isEmpty())
            
        {
        
         Maincompany maincompany = new Maincompany();    
            
        }
  
        }  
   
    }
    
