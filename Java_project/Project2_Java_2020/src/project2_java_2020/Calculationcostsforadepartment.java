/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2_java_2020;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static project2_java_2020.Entrydepartmentemployee.dataofdepartmentemployee;
import static project2_java_2020.Entrydepartmentemployeework.dataofdepartmentemployeework;
import static project2_java_2020.Entrydepartmentmanager.dataofdepartmentmanager;
import static project2_java_2020.Salaryofallemployees.totalsalaryfordepartmentemployees;
import static project2_java_2020.Salaryofallemployees.totalsalaryfordepartmentemployeeswithwork;
import static project2_java_2020.Salaryofallemployees.totalsalaryfordepartmentmanagers;

/**
 *
 * @author panos
 */

public class Calculationcostsforadepartment extends JFrame implements ActionListener // κλάση για τον υπολογισμό των δαπανών για ένα τμήμα.

{
 
   private JTextField nameofdepartment;
   private JLabel nameofdepartmentJL; 
   private JButton Add , Back; 
   private JPanel calcuationcostsforadepartment;

 public Calculationcostsforadepartment() // το JPanel που συμπληρώνουμε τα απαραίτητα στοιχεία.
    
 {
   
 super("Calculation costs for a department");
 
 setSize(600,750);
 setLocationRelativeTo(null);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    
 nameofdepartmentJL = new JLabel("Name of department : ");   
 nameofdepartment = new JTextField(11);
 
 Add = new JButton("Add");
 Add.addActionListener(this);
 Back = new JButton("Back");
 Back.addActionListener(this);
 
 BoxLayout box = new BoxLayout(calcuationcostsforadepartment , BoxLayout.LINE_AXIS);
 
 calcuationcostsforadepartment = new JPanel();
 
 calcuationcostsforadepartment.add(Box.createRigidArea(new Dimension(600,20)));
 calcuationcostsforadepartment.add(nameofdepartmentJL);
 calcuationcostsforadepartment.add(nameofdepartment);
 calcuationcostsforadepartment.add(Box.createRigidArea(new Dimension(600,20)));
 calcuationcostsforadepartment.add(Add);
 calcuationcostsforadepartment.add(Box.createRigidArea(new Dimension(600,5)));
 calcuationcostsforadepartment.add(Back);
 
 this.add(calcuationcostsforadepartment);
 this.setVisible(true); 
    
    
 }
    
    @Override
    public void actionPerformed(ActionEvent e) // ActionListener για τα κουμπιά Add και Back και αφού έχουμε συμπληρώσει όλα τα στοιχεία και σωστά τότε γίνονται οι απαραίτητες λειτουργίες με το πάτημα του κουμπιού Add.
    
    {
        
    if(e.getSource() == Add)
    
    {
    
    double totalofthree=0.0;    
 
    for(Departmentemployee departmentemployee : dataofdepartmentemployee)
    
    {
        
    if(nameofdepartment.getText().equals(departmentemployee.Getnameofdepartment())) 
        
    {
        
    for(int i =0; i<totalsalaryfordepartmentemployees.size(); i++) 
          
    {    
      
    totalofthree = totalofthree + totalsalaryfordepartmentemployees.get(i);
    
    } 
    
    }
    
    break;
    
    }
    
    for(Departmentmanager departmentmanager : dataofdepartmentmanager)
    
    {
        
    if(nameofdepartment.getText().equals(departmentmanager.Getnameofdepartment())) 
        
    {
        
    for(int i =0; i<totalsalaryfordepartmentmanagers.size(); i++) 
          
    {    
      
    totalofthree = totalofthree + totalsalaryfordepartmentmanagers.get(i);
    
    } 
    
    }
    
    break;
 
    }
    
    for(Departmentemployeework departmentemployeework : dataofdepartmentemployeework)
    
    {
        
    if(nameofdepartment.getText().equals(departmentemployeework.Getnameofdepartment())) 
        
    {
        
    for(int i =0; i<totalsalaryfordepartmentemployeeswithwork.size(); i++) 
          
    {  
        
    totalofthree = totalofthree + totalsalaryfordepartmentemployeeswithwork.get(i);
    
    } 
    
    }
    
    break;
    
    }
    
    if(totalofthree==0.0)
        
    {
    
    this.dispose();
    
    Maincompany maincompany = new Maincompany(); 
    
    }
    
    else
        
    {
    
    JOptionPane.showMessageDialog(this, "Total cost for the department is : " + totalofthree,"Success",JOptionPane.INFORMATION_MESSAGE);
    
    this.dispose();
    
    Maincompany maincompany = new Maincompany(); 
    
    }   
    
    }
     
    if(e.getSource() == Back)
        
    {
    
    this.dispose();
    
    Maincompany maincompany = new Maincompany();
    
    }      
        
    }
    
}
