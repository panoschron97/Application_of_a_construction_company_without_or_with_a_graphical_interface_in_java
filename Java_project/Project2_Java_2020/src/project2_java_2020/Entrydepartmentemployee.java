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
import static project2_java_2020.Entryemployee.dataofemployee;

/**
 *
 * @author panos
 */
public class Entrydepartmentemployee extends JFrame implements ActionListener // κλάση για την ανάθεση ενός εργαζόμενου σε κάποιο τμήμα.

{

static ArrayList<Departmentemployee> dataofdepartmentemployee = new ArrayList<Departmentemployee>();   
    
 private JTextField firstname , lastname , numberofchildren , yearofrecruitment , nameofdepartment ,speciality;    
 private JFormattedTextField birthdate;
 private JComboBox familysituation , levelofeducation;
 private JLabel firstnameJL , lastnameJL , familysituationJL , birthdateJL , numberofchildrenJL , levelofeducationJL , yearofrecruitmentJL , nameofdepartmentJL , specialityJL;
 private String[] Comboboxfamilysituation = {"Unmarried" , "Married"};
 private String[] Comboboxleveleducation = {"Secondary education" , "University education" , "Postgraduate diploma" , "Doctoral degree"};
 private Date date; 
 private JButton Add , Back;
 private JPanel departmentemployeepanel;
 SimpleDateFormat birthdateDF;   
    
 public Entrydepartmentemployee() // το JPanel για να εισάγουμε τα απαραίτητα στοιχεία.
    
 {
 
 super("Entry department employee data");
 
 setSize(600,600);
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
 
 Add = new JButton("Add");
 Add.addActionListener(this);
 Back = new JButton("Back");
 Back.addActionListener(this);
 
 BoxLayout box = new BoxLayout(departmentemployeepanel , BoxLayout.LINE_AXIS);
 
 departmentemployeepanel = new JPanel();
         
 departmentemployeepanel.add(Box.createRigidArea(new Dimension(600,10)));
 departmentemployeepanel.add(firstnameJL);
 departmentemployeepanel.add(firstname);
 departmentemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 departmentemployeepanel.add(lastnameJL);
 departmentemployeepanel.add(lastname);
 departmentemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 departmentemployeepanel.add(birthdateJL);
 departmentemployeepanel.add(birthdate);
 departmentemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 departmentemployeepanel.add(familysituationJL);
 departmentemployeepanel.add(familysituation);
 departmentemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 departmentemployeepanel.add(numberofchildrenJL);
 departmentemployeepanel.add(numberofchildren);
 departmentemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 departmentemployeepanel.add(yearofrecruitmentJL);
 departmentemployeepanel.add(yearofrecruitment);
 departmentemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 departmentemployeepanel.add(specialityJL);
 departmentemployeepanel.add(speciality);
 departmentemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 departmentemployeepanel.add(levelofeducationJL);
 departmentemployeepanel.add(levelofeducation);
 departmentemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 departmentemployeepanel.add(nameofdepartmentJL);
 departmentemployeepanel.add(nameofdepartment);
 departmentemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 departmentemployeepanel.add(Add);
 departmentemployeepanel.add(Box.createRigidArea(new Dimension(600,5)));
 departmentemployeepanel.add(Back);
 
 this.add(departmentemployeepanel);
 this.setVisible(true); 
      
 }
    
    
    @Override
    public void actionPerformed(ActionEvent e) // ActionListener για τα κουμπιά Add και Back και αφού έχουμε συμπληρώσει όλα τα στοιχεία και σωστά τότε γίνονται οι απαραίτητες λειτουργίες με το πάτημα του κουμπιού Add.
    
    {
        
    if(e.getSource() == Add)
        
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
    
    Departmentemployee departmentemployee = new Departmentemployee(firstname.getText() , lastname.getText() , date , familysituation.getSelectedItem().toString() , Integer.parseInt(numberofchildren.getText()) , Integer.parseInt(yearofrecruitment.getText()) , speciality.getText() , levelofeducation.getSelectedItem().toString() , nameofdepartment.getText());
    
    JOptionPane.showMessageDialog(this, "Employee assigned successfully to the department.","Success",JOptionPane.INFORMATION_MESSAGE);
    
    dataofdepartmentemployee.add(departmentemployee);
    
    System.out.println("\n" + dataofdepartmentemployee.toString());
    
    this.dispose();
    
    Maincompany maincompany = new Maincompany();
    
    } 
    
    catch (ParseException ex) 
    
    {
        
    Logger.getLogger(Entryemployee.class.getName()).log(Level.SEVERE, null, ex);
    
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
