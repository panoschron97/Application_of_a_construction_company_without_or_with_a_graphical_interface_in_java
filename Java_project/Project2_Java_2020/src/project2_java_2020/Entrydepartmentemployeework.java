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
import static project2_java_2020.Entrywork.dataofwork;

/**
 *
 * @author panos
 */
public class Entrydepartmentemployeework extends JFrame implements ActionListener // κλάση για την ανάθεση ενός εργαζόμενου που βρίσκεται σε κάποιο τμήμα να αναλάβει και ένα έργο.

{
    
static ArrayList<Departmentemployeework> dataofdepartmentemployeework = new ArrayList<Departmentemployeework>();    

 private JTextField firstname , lastname , numberofchildren , yearofrecruitment , nameofdepartment ,speciality , nameofwork;    
 private JFormattedTextField birthdate , startdate , expirationdate;
 private JComboBox familysituation , levelofeducation;
 private JLabel firstnameJL , lastnameJL , familysituationJL , birthdateJL , numberofchildrenJL , levelofeducationJL , yearofrecruitmentJL , nameofdepartmentJL , specialityJL , date2JL , date3JL , nameofworkJL;
 private String[] Comboboxfamilysituation = {"Unmarried" , "Married"};
 private String[] Comboboxleveleducation = {"Secondary education" , "University education" , "Postgraduate diploma" , "Doctoral degree"};
 private Date date , date1, date2;
 private JButton Add , Back;
 private JPanel departmentemployeeworkpanel;
 SimpleDateFormat birthdateDF , date2DF , date3DF;   
    
 public Entrydepartmentemployeework() // το JPanel για να συμπληρώσουμε τα απαραίτητα στοιχεία.
    
 {
 
 super("Entry department employee with work data");
 
 setSize(600,750);
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
 nameofworkJL = new JLabel("Name of work : ");
 date2JL = new JLabel("Start date : ");
 date3JL = new JLabel("Expiration date : ");
 
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
 nameofwork = new JTextField(15);
 date2DF = new SimpleDateFormat("dd/MM/yyyy");
 startdate = new JFormattedTextField(date2DF);
 startdate.setColumns(17);
 date3DF = new SimpleDateFormat("dd/MM/yyyy");
 expirationdate = new JFormattedTextField(date3DF);
 expirationdate.setColumns(14);
 
 Add = new JButton("Add");
 Add.addActionListener(this);
 Back = new JButton("Back");
 Back.addActionListener(this);
 
 BoxLayout box = new BoxLayout(departmentemployeeworkpanel , BoxLayout.LINE_AXIS);
 
 departmentemployeeworkpanel = new JPanel();
         
 departmentemployeeworkpanel.add(Box.createRigidArea(new Dimension(600,10)));
 departmentemployeeworkpanel.add(firstnameJL);
 departmentemployeeworkpanel.add(firstname);
 departmentemployeeworkpanel.add(Box.createRigidArea(new Dimension(600,20)));
 departmentemployeeworkpanel.add(lastnameJL);
 departmentemployeeworkpanel.add(lastname);
 departmentemployeeworkpanel.add(Box.createRigidArea(new Dimension(600,20)));
 departmentemployeeworkpanel.add(birthdateJL);
 departmentemployeeworkpanel.add(birthdate);
 departmentemployeeworkpanel.add(Box.createRigidArea(new Dimension(600,20)));
 departmentemployeeworkpanel.add(familysituationJL);
 departmentemployeeworkpanel.add(familysituation);
 departmentemployeeworkpanel.add(Box.createRigidArea(new Dimension(600,20)));
 departmentemployeeworkpanel.add(numberofchildrenJL);
 departmentemployeeworkpanel.add(numberofchildren);
 departmentemployeeworkpanel.add(Box.createRigidArea(new Dimension(600,20)));
 departmentemployeeworkpanel.add(yearofrecruitmentJL);
 departmentemployeeworkpanel.add(yearofrecruitment);
 departmentemployeeworkpanel.add(Box.createRigidArea(new Dimension(600,20)));
 departmentemployeeworkpanel.add(specialityJL);
 departmentemployeeworkpanel.add(speciality);
 departmentemployeeworkpanel.add(Box.createRigidArea(new Dimension(600,20)));
 departmentemployeeworkpanel.add(levelofeducationJL);
 departmentemployeeworkpanel.add(levelofeducation);
 departmentemployeeworkpanel.add(Box.createRigidArea(new Dimension(600,20)));
 departmentemployeeworkpanel.add(nameofdepartmentJL);
 departmentemployeeworkpanel.add(nameofdepartment);
 departmentemployeeworkpanel.add(Box.createRigidArea(new Dimension(600,20)));
 departmentemployeeworkpanel.add(nameofworkJL);
 departmentemployeeworkpanel.add(nameofwork);
 departmentemployeeworkpanel.add(Box.createRigidArea(new Dimension(600,20)));
 departmentemployeeworkpanel.add(date2JL);
 departmentemployeeworkpanel.add(startdate);
 departmentemployeeworkpanel.add(Box.createRigidArea(new Dimension(600,20)));
 departmentemployeeworkpanel.add(date3JL);
 departmentemployeeworkpanel.add(expirationdate);
 departmentemployeeworkpanel.add(Box.createRigidArea(new Dimension(600,20)));
 departmentemployeeworkpanel.add(Add);
 departmentemployeeworkpanel.add(Box.createRigidArea(new Dimension(600,5)));
 departmentemployeeworkpanel.add(Back);
 
 this.add(departmentemployeeworkpanel);
 this.setVisible(true); 
      
 }
 
    @Override
    public void actionPerformed(ActionEvent e) // ActionListener για τα κουμπιά Add και Back και αφού έχουμε συμπληρώσει όλα τα στοιχεία και σωστά τότε γίνονται οι απαραίτητες λειτουργίες με το πάτημα του κουμπιού Add.
    
    {
       
    if(e.getSource() == Add)
        
    { 
        
    for(Departmentemployee employee : new ArrayList<Departmentemployee>(dataofdepartmentemployee))
        
    {
        
    for(Department department : dataofdepartment)
        
    {
        
    for(Work work : dataofwork)
        
    {
    
    if(firstname.getText().equals(employee.Getfirstname()) && lastname.getText().equals(employee.Getlastname()) && birthdate.getText().equals(birthdateDF.format(employee.Getbirthdate())) && familysituation.getSelectedItem().toString().equals(employee.Getfamiliysituation()) && Integer.parseInt(numberofchildren.getText())==employee.Getnumberofchildren() && Integer.parseInt(yearofrecruitment.getText())==employee.Getyearofrecruitment() && speciality.getText().equals(employee.Getspeciality()) && levelofeducation.getSelectedItem().toString().equals(employee.Getlevelofeducation()) && nameofdepartment.getText().equals(department.Getnameofdepartment()) && nameofwork.getText().equals(work.Getnameofwork()))
    
    {
            
    dataofdepartmentemployee.remove(employee);
    
    try 
    
    {
        
    date = birthdateDF.parse(birthdate.getText());
    
    date1 = date2DF.parse(startdate.getText());
    
    date2 = date3DF.parse(expirationdate.getText());
          
    Departmentemployeework departmentemployeework = new Departmentemployeework(firstname.getText() , lastname.getText() , date , familysituation.getSelectedItem().toString() , Integer.parseInt(numberofchildren.getText()) , Integer.parseInt(yearofrecruitment.getText()) , speciality.getText() , levelofeducation.getSelectedItem().toString() , nameofdepartment.getText() , nameofwork.getText()  , date1 , date2);
        
    JOptionPane.showMessageDialog(this, "Department employee assigned successfully to the work.","Success",JOptionPane.INFORMATION_MESSAGE);
    
    dataofdepartmentemployeework.add(departmentemployeework);
    
    System.out.println("\n" + dataofdepartmentemployeework.toString());
    
    this.dispose();
    
    Maincompany maincompany = new Maincompany();
    
    }
    
    catch (ParseException ex) 
    
    {
        
    Logger.getLogger(Entrydepartmentemployeework.class.getName()).log(Level.SEVERE, null, ex);
    
    }
  
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
