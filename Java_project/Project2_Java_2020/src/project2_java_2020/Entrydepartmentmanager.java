/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2_java_2020;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static project2_java_2020.Entrydepartment.dataofdepartment;
import static project2_java_2020.Entrydepartmentemployee.dataofdepartmentemployee;
import static project2_java_2020.Entryemployee.dataofemployee;

/**
 *
 * @author panos
 */
public class Entrydepartmentmanager extends JFrame implements ActionListener // κλάση για την ανάθεση ενός εργαζομένου ως διευθυντή σε κάποιο τμήμα.

{

 static ArrayList<Departmentmanager> dataofdepartmentmanager = new ArrayList<Departmentmanager>();    
    
 private JTextField firstname , lastname , numberofchildren , yearofrecruitment , nameofdepartment ,speciality , dateofwithdrawal;    
 private JFormattedTextField birthdate , dateofwithdrawalJF;
 private JComboBox familysituation , levelofeducation;
 private JLabel firstnameJL , lastnameJL , familysituationJL , birthdateJL , numberofchildrenJL , levelofeducationJL , yearofrecruitmentJL , nameofdepartmentJL , specialityJL , dateofwithdrawalJL;
 private String[] Comboboxfamilysituation = {"Unmarried" , "Married"};
 private String[] Comboboxleveleducation = {"Secondary education" , "University education" , "Postgraduate diploma" , "Doctoral degree"};
 private Date date , date2; 
 private JButton Add , Back;
 private JPanel departmentmanagerpanel;
 SimpleDateFormat birthdateDF , dateofwithdrawalDF;   
    
 public Entrydepartmentmanager() // το JPanel για να συμπληρώσουμε τα απαραίτητα στοιχεία. 
    
 {
 
 super("Entry department manager data");
 
 setSize(600,650);
 setLocationRelativeTo(null);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
 firstnameJL = new JLabel("Firstname : ");
 lastnameJL = new JLabel("Lastname : ");
 birthdateJL = new JLabel("Birth date : ");
 familysituationJL = new JLabel("Status : ");
 numberofchildrenJL = new JLabel("Children : ");
 yearofrecruitmentJL = new JLabel("Year : ");
 specialityJL = new JLabel("Speciality : ");
 levelofeducationJL = new JLabel("Education : ");
 nameofdepartmentJL = new JLabel("Name of department : ");
 dateofwithdrawalJL = new JLabel("Date of withdrawal : ");
 
 firstname = new JTextField(15);
 lastname = new JTextField(15);
 birthdateDF = new SimpleDateFormat("dd/MM/yyyy");
 birthdate = new JFormattedTextField(birthdateDF);
 birthdate.setColumns(15);
 familysituation = new JComboBox(Comboboxfamilysituation);
 numberofchildren = new JTextField(16);
 yearofrecruitment = new JTextField(18);
 speciality = new JTextField(16);
 levelofeducation = new JComboBox(Comboboxleveleducation);
 nameofdepartment = new JTextField(11);
 dateofwithdrawalDF = new SimpleDateFormat("dd/MM/yyyy");
 dateofwithdrawalJF = new JFormattedTextField(dateofwithdrawalDF);
 dateofwithdrawalJF.setColumns(12);
 
 Add = new JButton("Add");
 Add.addActionListener(this);
 Back = new JButton("Back");
 Back.addActionListener(this);
 
 BoxLayout box = new BoxLayout(departmentmanagerpanel , BoxLayout.LINE_AXIS);
 
 departmentmanagerpanel = new JPanel();
         
 departmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,10)));
 departmentmanagerpanel.add(firstnameJL);
 departmentmanagerpanel.add(firstname);
 departmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,20)));
 departmentmanagerpanel.add(lastnameJL);
 departmentmanagerpanel.add(lastname);
 departmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,20)));
 departmentmanagerpanel.add(birthdateJL);
 departmentmanagerpanel.add(birthdate);
 departmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,20)));
 departmentmanagerpanel.add(familysituationJL);
 departmentmanagerpanel.add(familysituation);
 departmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,20)));
 departmentmanagerpanel.add(numberofchildrenJL);
 departmentmanagerpanel.add(numberofchildren);
 departmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,20)));
 departmentmanagerpanel.add(yearofrecruitmentJL);
 departmentmanagerpanel.add(yearofrecruitment);
 departmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,20)));
 departmentmanagerpanel.add(specialityJL);
 departmentmanagerpanel.add(speciality);
 departmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,20)));
 departmentmanagerpanel.add(levelofeducationJL);
 departmentmanagerpanel.add(levelofeducation);
 departmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,20)));
 departmentmanagerpanel.add(nameofdepartmentJL);
 departmentmanagerpanel.add(nameofdepartment);
 departmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,20)));
 departmentmanagerpanel.add(dateofwithdrawalJL);
 departmentmanagerpanel.add(dateofwithdrawalJF);
 departmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,20)));
 departmentmanagerpanel.add(Add);
 departmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,5)));
 departmentmanagerpanel.add(Back);
 
 this.add(departmentmanagerpanel);
 this.setVisible(true); 
      
 }     
    
    @Override
    public void actionPerformed(ActionEvent e) // ActionListener για τα κουμπιά Add και Back και αφού έχουμε συμπληρώσει όλα τα στοιχεία και σωστά τότε γίνονται οι απαραίτητες λειτουργίες με το πάτημα του κουμπιού Add.
    
    {
        
    if(e.getSource()==Add)
        
    {
    
    for(Employee employee : new ArrayList<Employee>(dataofemployee))
        
    {
    
    for(Department department : dataofdepartment)
    
    {
    
    if(firstname.getText().equals(employee.Getfirstname()) && lastname.getText().equals(employee.Getlastname()) && birthdate.getText().equals(birthdateDF.format(employee.Getbirthdate())) && familysituation.getSelectedItem().toString().equals(employee.Getfamiliysituation()) && Integer.parseInt(numberofchildren.getText())==employee.Getnumberofchildren() && Integer.parseInt(yearofrecruitment.getText())==employee.Getyearofrecruitment() && speciality.getText().equals(employee.Getspeciality()) && levelofeducation.getSelectedItem().toString().equals(employee.Getlevelofeducation()) && nameofdepartment.getText().equals(department.Getnameofdepartment())) 
        
    {
        
    dataofemployee.remove(employee);
    
    try 
        
    {
        
    date = birthdateDF.parse(birthdate.getText());
    
    date2 = dateofwithdrawalDF.parse(dateofwithdrawalJF.getText());
    
    Departmentmanager departmentmanager = new Departmentmanager(firstname.getText() , lastname.getText() , date ,  familysituation.getSelectedItem().toString() , Integer.parseInt(numberofchildren.getText()) , Integer.parseInt(yearofrecruitment.getText()) , speciality.getText() , levelofeducation.getSelectedItem().toString() , nameofdepartment.getText() , date2);
    
    JOptionPane.showMessageDialog(this, "Employee assigned successfully as manager to the department.","Success",JOptionPane.INFORMATION_MESSAGE);
    
    dataofdepartmentmanager.add(departmentmanager);
    
    System.out.println("\n" + dataofdepartmentmanager.toString());
    
    this.dispose();
    
    Maincompany maincompany = new Maincompany();
       
    } 
    
    catch (ParseException ex) 
            
    {
            
    Logger.getLogger(Entrydepartmentmanager.class.getName()).log(Level.SEVERE, null, ex);
            
    }
    
    }    
      
    } 
        
    }
    
    }
    
    if(e.getSource() == Back)
        
    {
    
    this.dispose();
    
    Maincompany maincompany = new Maincompany();
    
    }  
 
}

}
