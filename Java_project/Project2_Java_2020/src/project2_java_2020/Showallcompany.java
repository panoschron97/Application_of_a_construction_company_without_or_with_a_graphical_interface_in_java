/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2_java_2020;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static project2_java_2020.Entrydepartment.dataofdepartment;
import static project2_java_2020.Entrydepartmentemployee.dataofdepartmentemployee;
import static project2_java_2020.Entrydepartmentemployeework.dataofdepartmentemployeework;
import static project2_java_2020.Entrydepartmentmanager.dataofdepartmentmanager;
import static project2_java_2020.Entryemployee.dataofemployee;
import static project2_java_2020.Entrywork.dataofwork;

/**
 *
 * @author panos
 */
public class Showallcompany extends JFrame // κλάση για την εμφάνιση όλων των εργαζομένων , εργαζομένων σε τμήμα , εργαζομένων σε τμήμα που ασχολούνται με έργο , διευθυντών τμημάτων , τμημάτων , έργων.

{
    
   public Showallcompany()
    
    {  
        
     for(Employee employee : dataofemployee)
        
     {
    
     JOptionPane.showMessageDialog(this, "Elements of employee : " + dataofemployee.toString() ,"Success",JOptionPane.INFORMATION_MESSAGE);
     
     break;
     
     }  
     
     for(Departmentemployee departmentemployee : dataofdepartmentemployee)
        
     {
    
     JOptionPane.showMessageDialog(this, "Elements of department employee : " + dataofdepartmentemployee.toString() ,"Success",JOptionPane.INFORMATION_MESSAGE);
     
     break;
     
     }  
     
     for(Departmentmanager departmentmanager : dataofdepartmentmanager)
        
     {
    
     JOptionPane.showMessageDialog(this, "Elements of department manager : " + dataofdepartmentmanager.toString() ,"Success",JOptionPane.INFORMATION_MESSAGE);
     
     break;
     
     }  
     
     for(Departmentemployeework departmentemployeework : dataofdepartmentemployeework)
        
     {
    
     JOptionPane.showMessageDialog(this, "Elements of department employee with work : " + dataofdepartmentemployeework.toString() ,"Success",JOptionPane.INFORMATION_MESSAGE);
     
     break;
     
     }  
     
     for(Department department : dataofdepartment)
        
     {
    
     JOptionPane.showMessageDialog(this, "Elements of department : " + dataofdepartment.toString() ,"Success",JOptionPane.INFORMATION_MESSAGE);
     
     break;
     
     }  
    
     for(Work work : dataofwork)
        
     {
    
     JOptionPane.showMessageDialog(this, "Elements of work : " + dataofwork.toString() ,"Success",JOptionPane.INFORMATION_MESSAGE);
     
     break;
     
     }
     
     Maincompany maincompany = new Maincompany();
    
     }
    
 }


   

