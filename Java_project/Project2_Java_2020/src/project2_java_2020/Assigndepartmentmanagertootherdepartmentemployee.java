/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2_java_2020;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
import static project2_java_2020.Entrydepartmentmanager.dataofdepartmentmanager;

/**
 *
 * @author panos
 */
public class Assigndepartmentmanagertootherdepartmentemployee extends JFrame implements ActionListener // κλάση για την ενημέρωση της θέσης ενός διευθυντή τμήματος σε άλλον εργαζόμενο.

{

 private JTextField firstname , lastname , numberofchildren , yearofrecruitment , nameofdepartment ,speciality , dateofwithdrawal , oldfirstname , oldlastname;    
 private JFormattedTextField birthdate , dateofwithdrawalJF;
 private JComboBox familysituation , levelofeducation;
 private JLabel firstnameJL , lastnameJL , familysituationJL , birthdateJL , numberofchildrenJL , levelofeducationJL , yearofrecruitmentJL , nameofdepartmentJL , specialityJL , dateofwithdrawalJL , olddepartmentmanagerJL , newdepartmentmanagerJL , oldfirstnameJL , oldlastnameJL;
 private String[] Comboboxfamilysituation = {"Unmarried" , "Married"};
 private String[] Comboboxleveleducation = {"Secondary education" , "University education" , "Postgraduate diploma" , "Doctoral degree"};
 private Date date , date2; 
 private JButton Add , Back;
 private JPanel relocatedepartmentmanagerpanel;
 SimpleDateFormat birthdateDF , dateofwithdrawalDF;   
    
 public Assigndepartmentmanagertootherdepartmentemployee() // το JPanel που συμπληρώνουμε τα απαραίτητα στοιχεία.
    
 {
 
 super("Relocate entry department manager data");
 
 setSize(600,800);
 setLocationRelativeTo(null);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
 olddepartmentmanagerJL = new JLabel("Old department manager");
 newdepartmentmanagerJL = new JLabel("New department manager");
 oldfirstnameJL = firstnameJL = new JLabel("Firstname : ");
 firstnameJL = new JLabel("Firstname : ");
 lastnameJL = new JLabel("Lastname : ");
 oldlastnameJL = new JLabel("Lastname : ");
 birthdateJL = new JLabel("Birth date : ");
 familysituationJL = new JLabel("Status : ");
 numberofchildrenJL = new JLabel("Children : ");
 yearofrecruitmentJL = new JLabel("Year : ");
 specialityJL = new JLabel("Speciality : ");
 levelofeducationJL = new JLabel("Education : ");
 nameofdepartmentJL = new JLabel("Name of department : ");
 dateofwithdrawalJL = new JLabel("Date of withdrawal : ");
 
 oldfirstname = new JTextField(15);
 oldlastname = new JTextField(15);
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
 
 BoxLayout box = new BoxLayout(relocatedepartmentmanagerpanel , BoxLayout.LINE_AXIS);
 
 relocatedepartmentmanagerpanel = new JPanel();
         
 relocatedepartmentmanagerpanel.add(olddepartmentmanagerJL);
 relocatedepartmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,10)));
 relocatedepartmentmanagerpanel.add(oldfirstnameJL);
 relocatedepartmentmanagerpanel.add(oldfirstname);
 relocatedepartmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,10)));
 relocatedepartmentmanagerpanel.add(oldlastnameJL);
 relocatedepartmentmanagerpanel.add(oldlastname);
  relocatedepartmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,10)));
 relocatedepartmentmanagerpanel.add(newdepartmentmanagerJL);
 relocatedepartmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,10)));
 relocatedepartmentmanagerpanel.add(firstnameJL);
 relocatedepartmentmanagerpanel.add(firstname);
 relocatedepartmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,20)));
 relocatedepartmentmanagerpanel.add(lastnameJL);
 relocatedepartmentmanagerpanel.add(lastname);
 relocatedepartmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,20)));
 relocatedepartmentmanagerpanel.add(birthdateJL);
 relocatedepartmentmanagerpanel.add(birthdate);
 relocatedepartmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,20)));
 relocatedepartmentmanagerpanel.add(familysituationJL);
 relocatedepartmentmanagerpanel.add(familysituation);
 relocatedepartmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,20)));
 relocatedepartmentmanagerpanel.add(numberofchildrenJL);
 relocatedepartmentmanagerpanel.add(numberofchildren);
 relocatedepartmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,20)));
 relocatedepartmentmanagerpanel.add(yearofrecruitmentJL);
 relocatedepartmentmanagerpanel.add(yearofrecruitment);
 relocatedepartmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,20)));
 relocatedepartmentmanagerpanel.add(specialityJL);
 relocatedepartmentmanagerpanel.add(speciality);
 relocatedepartmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,20)));
 relocatedepartmentmanagerpanel.add(levelofeducationJL);
 relocatedepartmentmanagerpanel.add(levelofeducation);
 relocatedepartmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,20)));
 relocatedepartmentmanagerpanel.add(nameofdepartmentJL);
 relocatedepartmentmanagerpanel.add(nameofdepartment);
 relocatedepartmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,20)));
 relocatedepartmentmanagerpanel.add(dateofwithdrawalJL);
 relocatedepartmentmanagerpanel.add(dateofwithdrawalJF);
 relocatedepartmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,20)));
 relocatedepartmentmanagerpanel.add(Add);
 relocatedepartmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,5)));
 relocatedepartmentmanagerpanel.add(Back);
 
 this.add(relocatedepartmentmanagerpanel);
 this.setVisible(true); 
      
 }         
              
 @Override
 public void actionPerformed(ActionEvent e) // ActionListener για τα κουμπιά Add και Back και αφού έχουμε συμπληρώσει όλα τα στοιχεία και σωστά τότε γίνονται οι απαραίτητες λειτουργίες με το πάτημα του κουμπιού Add.
    
{
    
  if(e.getSource()==Add)
        
    {
        
    for(Departmentmanager departmentmanager : new ArrayList<Departmentmanager>(dataofdepartmentmanager) )    
        
    {
    
    if(oldfirstname.getText().equals(departmentmanager.Getfirstname()) && oldlastname.getText().equals(departmentmanager.Getlastname()))
    
    {
    
     dataofdepartmentmanager.remove(departmentmanager);
     
      File inputFile = new File("departmentmanagers.txt");           //ενημέρωση αρχείων.
    
    File tempFile = new File("myTempdepartmentmanagers.txt");

        BufferedReader reader = null;
        
        try 
        
        {
            
            reader = new BufferedReader(new FileReader(inputFile));
            
        } 
        
        catch (FileNotFoundException ex) {
            Logger.getLogger(Assigndepartmentmanagertootherdepartmentemployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        BufferedWriter writer = null;
        
        try 
        
        {
            writer = new BufferedWriter(new FileWriter(tempFile));
        } 
        
        catch (IOException ex) {
            Logger.getLogger(Assigndepartmentmanagertootherdepartmentemployee.class.getName()).log(Level.SEVERE, null, ex);
        }

        String currentLine;

        try 
        
        {
           
            while((currentLine = reader.readLine()) != null) {
                
                String trimmedLine = currentLine.trim();
                if(trimmedLine.equals(departmentmanager.toString())) continue;
                writer.write(currentLine + System.getProperty("line.separator"));
                
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Assigndepartmentmanagertootherdepartmentemployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try 
        
        { 
            
            writer.close();
        }
        
        catch (IOException ex) {
            Logger.getLogger(Assigndepartmentmanagertootherdepartmentemployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try 
        
        { 
            
            reader.close();
            
        } 
        
        catch (IOException ex) {
            Logger.getLogger(Assigndepartmentmanagertootherdepartmentemployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        boolean successful = tempFile.renameTo(inputFile);
        tempFile.delete();
    
    }
    
    }   
         
    for(Departmentemployee departmentemployee : new ArrayList<Departmentemployee>(dataofdepartmentemployee))
        
    {
    
    for(Department department : dataofdepartment)
    
    {
    
    if(firstname.getText().equals(departmentemployee.Getfirstname()) && lastname.getText().equals(departmentemployee.Getlastname()) && birthdate.getText().equals(birthdateDF.format(departmentemployee.Getbirthdate())) && familysituation.getSelectedItem().toString().equals(departmentemployee.Getfamiliysituation()) && Integer.parseInt(numberofchildren.getText())==departmentemployee.Getnumberofchildren() && Integer.parseInt(yearofrecruitment.getText())==departmentemployee.Getyearofrecruitment() && speciality.getText().equals(departmentemployee.Getspeciality()) && levelofeducation.getSelectedItem().toString().equals(departmentemployee.Getlevelofeducation()) && nameofdepartment.getText().equals(department.Getnameofdepartment())) 
        
    {
        
    dataofdepartmentemployee.remove(departmentemployee);
    
    try 
        
    {
        
    date = birthdateDF.parse(birthdate.getText());
    
    date2 = dateofwithdrawalDF.parse(dateofwithdrawalJF.getText());
    
    Departmentmanager updatedepartmentmanager = new Departmentmanager(firstname.getText() , lastname.getText() , date ,  familysituation.getSelectedItem().toString() , Integer.parseInt(numberofchildren.getText()) , Integer.parseInt(yearofrecruitment.getText()) , speciality.getText() , levelofeducation.getSelectedItem().toString() , nameofdepartment.getText() , date2);
    
    JOptionPane.showMessageDialog(this, "New department employee assigned successfully as department manager.","Success",JOptionPane.INFORMATION_MESSAGE);
    
    dataofdepartmentmanager.add(updatedepartmentmanager);
    
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
  

