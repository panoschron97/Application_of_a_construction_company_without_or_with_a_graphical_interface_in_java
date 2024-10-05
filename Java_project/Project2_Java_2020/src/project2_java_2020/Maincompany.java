/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2_java_2020;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
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
public class Maincompany extends JFrame implements ActionListener // η κλάση με το menu της εφαρμογής μας και όλες οι λειτουργίες που μπορεί ο χρήστης να πραγματοποιήσει μέσω ενός comnbobox.

{
    
 private JButton Entry;   
 private JButton Exit;
 private JPanel Buttonspanel;
    
 private JComboBox Choicecombobox;   
 private String[] Entrychoices = {"Create employee" , "Create department" , "Create work" , "Assign employee to a department" , "Assign employee as manager to a department" , "Assign department employee to a work" , "Update employee data" , "Update department employee data" , "Update department manager data" , "Update department employee to a work data" , "Relocate department employee to other department" , "Assign department manager to other department employee" , "Calculate salary for someone" , "Calculate costs for a department" , "Calculate costs for a project" , "Calculate net income for a project" , "Show all the elements of the project with the most net revenue" , "Show all company"};
 
 public Maincompany()
         
 {
 
  super("Application menu");
  
  
  setSize(450,600);
  setLocationRelativeTo(null);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  BoxLayout box = new BoxLayout(Buttonspanel , BoxLayout.LINE_AXIS);
 
  Entry = new JButton("Action");
  Entry.addActionListener(this);
  Exit = new JButton("Exit");
  Exit.addActionListener(this);
  Choicecombobox = new JComboBox(Entrychoices);
  
  Buttonspanel = new JPanel();
  Buttonspanel.add(Box.createRigidArea(new Dimension(400,50)));
  Buttonspanel.add(Choicecombobox);
  Buttonspanel.add(Box.createRigidArea(new Dimension(400,25)));
  Buttonspanel.add(Entry);
  Buttonspanel.add(Box.createRigidArea(new Dimension(400,25)));
  Buttonspanel.add(Exit);
 
  this.add(Buttonspanel);
  this.setVisible(true);
  
 }
   
    @Override
    public void actionPerformed(ActionEvent e) // ActionListener όπου όταν διαλέγουμε το String με την συγκεκριμένη λειτουργία που θέλουμε να εκτελέσουμε πατάμε το κουμπί add και μας προσδιορίζει στο αντίστοιχο JPanel.
    
    {
     
     if(e.getSource() == Entry)
         
     {
     
     if(Choicecombobox.getSelectedItem().toString().equals("Create employee"))    
     
     {
     
     this.dispose();
     
     Entryemployee entryemployee = new Entryemployee();
     
     }
     
     if(Choicecombobox.getSelectedItem().toString().equals("Create department"))
         
     {
     
     this.dispose();
     
     Entrydepartment entrydepartment = new Entrydepartment();
     
     }
     
     if(Choicecombobox.getSelectedItem().toString().equals("Create work"))
         
     {
     
     this.dispose();
     
     Entrywork entrywork = new Entrywork();
     
     }
     
     if(Choicecombobox.getSelectedItem().toString().equals("Assign employee to a department"))    
     
     {
     
     this.dispose();
     
     Entrydepartmentemployee entrydepartmentemployee = new Entrydepartmentemployee();
     
     }
     
     if(Choicecombobox.getSelectedItem().toString().equals("Assign employee as manager to a department"))    
     
     {
     
     this.dispose();
     
     Entrydepartmentmanager entrydepartmentmanager = new Entrydepartmentmanager();
     
     }
     
     if(Choicecombobox.getSelectedItem().toString().equals("Assign department employee to a work"))    
     
     {
     
     this.dispose();
     
     Entrydepartmentemployeework entrydepartmentemployeework = new Entrydepartmentemployeework();
     
     }
     
     if(Choicecombobox.getSelectedItem().toString().equals("Update employee data"))    
     
     {
     
     this.dispose();
     
     Updateentryemployee updateentryemployee = new Updateentryemployee();
     
     }
     
     if(Choicecombobox.getSelectedItem().toString().equals("Update department employee data"))    
     
     {
     
     this.dispose();
     
     Updateentrydepartmentemployee updateentrydepartmentemployee = new Updateentrydepartmentemployee();
     
     }
     
     if(Choicecombobox.getSelectedItem().toString().equals("Update department manager data"))    
     
     {
     
     this.dispose();
     
     Updateentrydepartmentmanager updateentrydepartmentmanager = new Updateentrydepartmentmanager();
     
     }
     
     if(Choicecombobox.getSelectedItem().toString().equals("Update department employee to a work data"))    
     
     {
     
     this.dispose();
     
     Updateentrydepartmentemployeework updateentrydepartmentemployeework = new Updateentrydepartmentemployeework();
     
     }
     
     if(Choicecombobox.getSelectedItem().toString().equals("Relocate department employee to other department"))    
     
     {
     
     this.dispose();
     
     Relocatedepartmentemployeetootherdepartment relocatedepartmentemployeetootherdepartment = new Relocatedepartmentemployeetootherdepartment();
     
     }
     
     if(Choicecombobox.getSelectedItem().toString().equals("Assign department manager to other department employee"))    
     
     {
     
     this.dispose();
     
     Assigndepartmentmanagertootherdepartmentemployee assigndepartmentmanagertootherdepartmentemployee = new Assigndepartmentmanagertootherdepartmentemployee();
     
     }
     
     if(Choicecombobox.getSelectedItem().toString().equals("Calculate salary for someone"))    
     
     {
     
     this.dispose();
     
     Salaryofallemployees salaryofallemployees = new Salaryofallemployees();
     
     }
     
     if(Choicecombobox.getSelectedItem().toString().equals("Calculate costs for a department"))    
     
     {
     
     this.dispose();
     
     Calculationcostsforadepartment calculationcostsforadepartment = new Calculationcostsforadepartment();
     
     }
     
     if(Choicecombobox.getSelectedItem().toString().equals("Calculate costs for a project"))    
     
     {
     
     this.dispose();
     
     Calculationcostsforaproject calculationcostsforaproject = new Calculationcostsforaproject();
     
     }
     
     if(Choicecombobox.getSelectedItem().toString().equals("Calculate net income for a project"))    
     
     {
     
     this.dispose();
     
     Calculationofnetincomeforaproject calculationofnetincomeforaproject = new Calculationofnetincomeforaproject();
     
     }
     
     if(Choicecombobox.getSelectedItem().toString().equals("Show all the elements of the project with the most net revenue"))    
     
     {
     
     this.dispose();
     
     Showalltheelementsoftheprojectthatprovidesthemostnetrevenue showalltheelementsoftheprojectthatprovidesthemostnetrevenue = new Showalltheelementsoftheprojectthatprovidesthemostnetrevenue();
     
     }
     
     if(Choicecombobox.getSelectedItem().toString().equals("Show all company"))    
     
     {
     
     this.dispose();
     
     Showallcompany showallcompany = new Showallcompany();
     
     }
         
     }
     
     if(e.getSource() == Exit) // Αν πατήσουμε το κουμπί Exit δημιουργούμε τα αρχεία κειμένου , ένα αρχείο με τους εργαζόμενους της εταιρείας , ένα με τα τμήματα και ένα με τα έργα με την μορφή που ζητάει το πρότζεκτ.
         
     {
         
      try {
              
           
           FileWriter writer1 = new FileWriter("employees.txt" ); 
           BufferedWriter bw1 = new BufferedWriter(writer1);
           FileWriter writer2 = new FileWriter("departmentemployees.txt"); 
           BufferedWriter bw2 = new BufferedWriter(writer2);
           FileWriter writer3 = new FileWriter("departmentmanagers.txt"); 
           BufferedWriter bw3 = new BufferedWriter(writer3);
           FileWriter writer4 = new FileWriter("departmentemployeesworks.txt"); 
           BufferedWriter bw4 = new BufferedWriter(writer4);
           FileWriter writer5 = new FileWriter("departments.txt"); 
           BufferedWriter bw5 = new BufferedWriter(writer5);
           FileWriter writer6 = new FileWriter("works.txt"); 
           BufferedWriter bw6 = new BufferedWriter(writer6);
           
           for(Employee employee : dataofemployee)
            
           {
           
            bw1.write(employee.toString() + ",");
            
           }
           
           for(Departmentemployee departmentemployee : dataofdepartmentemployee)
            
           {
           
            bw2.write(departmentemployee.toString() + ",");
            
           }
           
           for(Departmentmanager departmentmanager : dataofdepartmentmanager)
            
           {
           
            bw3.write(departmentmanager.toString() + ",");
            
           }
           
           for(Departmentemployeework departmentemployeework : dataofdepartmentemployeework)
            
           {
           
            bw4.write(departmentemployeework.toString()+ ",");
            
           }
           
           for(Department department : dataofdepartment)
            
           {
           
            bw5.write(department.toString()+ ",");
            
           }
           
           for(Work work : dataofwork)
            
           {
           
            bw6.write(work.toString()+ ",");
            
           }
           
            bw1.close();
            bw2.close();
            bw3.close();
            bw4.close();
            bw5.close();
            bw6.close();
  
        } catch (IOException ex) { 
             Logger.getLogger(Maincompany.class.getName()).log(Level.SEVERE, null, ex);
         }
       
     System.out.println();
     System.exit(0);
     
     }     
        
    }
    
}
