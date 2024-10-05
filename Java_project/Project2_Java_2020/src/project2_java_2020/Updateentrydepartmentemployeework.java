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
import static project2_java_2020.Entrydepartmentemployeework.dataofdepartmentemployeework;
import static project2_java_2020.Entrywork.dataofwork;

/**
 *
 * @author panos
 */
public class Updateentrydepartmentemployeework extends JFrame implements ActionListener // κλάση για την ενημέρωση των εργαζομένων που βρίσκονται σε τμήματα και τους έχουν αναθέσει και έργο.

{

 private JTextField firstname , lastname , numberofchildren , yearofrecruitment , nameofdepartment ,speciality , nameofwork;    
 private JFormattedTextField birthdate , startdate , expirationdate;
 private JComboBox familysituation , levelofeducation;
 private JLabel firstnameJL , lastnameJL , familysituationJL , birthdateJL , numberofchildrenJL , levelofeducationJL , yearofrecruitmentJL , nameofdepartmentJL , specialityJL , date2JL , date3JL , nameofworkJL;
 private String[] Comboboxfamilysituation = {"Unmarried" , "Married"};
 private String[] Comboboxleveleducation = {"Secondary education" , "University education" , "Postgraduate diploma" , "Doctoral degree"};
 private Date date , date1, date2;
 private JButton Add , Back;
 private JPanel updatedepartmentemployeeworkpanel;
 SimpleDateFormat birthdateDF , date2DF , date3DF;   
    
 public Updateentrydepartmentemployeework() // το JPanel για να συμπληρώσουμε τα στοιχεία.
    
 {
 
 super("Update entry department employee with work data");
 
 setSize(600,750);
 setLocationRelativeTo(null);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
 firstnameJL = new JLabel("Firstname : ");
 lastnameJL = new JLabel("Lastname : ");
 birthdateJL = new JLabel("Birth date : ");
 familysituationJL = new JLabel("Update status : ");
 numberofchildrenJL = new JLabel("Update children : ");
 yearofrecruitmentJL = new JLabel("Year : ");
 specialityJL = new JLabel("Update speciality : ");
 levelofeducationJL = new JLabel("Update education : ");
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
 
 BoxLayout box = new BoxLayout(updatedepartmentemployeeworkpanel , BoxLayout.LINE_AXIS);
 
 updatedepartmentemployeeworkpanel = new JPanel();
         
 updatedepartmentemployeeworkpanel.add(Box.createRigidArea(new Dimension(600,10)));
 updatedepartmentemployeeworkpanel.add(firstnameJL);
 updatedepartmentemployeeworkpanel.add(firstname);
 updatedepartmentemployeeworkpanel.add(Box.createRigidArea(new Dimension(600,20)));
 updatedepartmentemployeeworkpanel.add(lastnameJL);
 updatedepartmentemployeeworkpanel.add(lastname);
 updatedepartmentemployeeworkpanel.add(Box.createRigidArea(new Dimension(600,20)));
 updatedepartmentemployeeworkpanel.add(birthdateJL);
 updatedepartmentemployeeworkpanel.add(birthdate);
 updatedepartmentemployeeworkpanel.add(Box.createRigidArea(new Dimension(600,20)));
 updatedepartmentemployeeworkpanel.add(yearofrecruitmentJL);
 updatedepartmentemployeeworkpanel.add(yearofrecruitment);
 updatedepartmentemployeeworkpanel.add(Box.createRigidArea(new Dimension(600,20)));
 updatedepartmentemployeeworkpanel.add(nameofdepartmentJL);
 updatedepartmentemployeeworkpanel.add(nameofdepartment);
 updatedepartmentemployeeworkpanel.add(Box.createRigidArea(new Dimension(600,20)));
 updatedepartmentemployeeworkpanel.add(nameofworkJL);
 updatedepartmentemployeeworkpanel.add(nameofwork);
 updatedepartmentemployeeworkpanel.add(Box.createRigidArea(new Dimension(600,20)));
 updatedepartmentemployeeworkpanel.add(date2JL);
 updatedepartmentemployeeworkpanel.add(startdate);
 updatedepartmentemployeeworkpanel.add(Box.createRigidArea(new Dimension(600,20)));
 updatedepartmentemployeeworkpanel.add(date3JL);
 updatedepartmentemployeeworkpanel.add(expirationdate);
 updatedepartmentemployeeworkpanel.add(Box.createRigidArea(new Dimension(600,20)));
 updatedepartmentemployeeworkpanel.add(familysituationJL);
 updatedepartmentemployeeworkpanel.add(familysituation);
 updatedepartmentemployeeworkpanel.add(Box.createRigidArea(new Dimension(600,20)));
 updatedepartmentemployeeworkpanel.add(numberofchildrenJL);
 updatedepartmentemployeeworkpanel.add(numberofchildren);
 updatedepartmentemployeeworkpanel.add(Box.createRigidArea(new Dimension(600,20)));
 updatedepartmentemployeeworkpanel.add(specialityJL);
 updatedepartmentemployeeworkpanel.add(speciality);
 updatedepartmentemployeeworkpanel.add(Box.createRigidArea(new Dimension(600,20)));
 updatedepartmentemployeeworkpanel.add(levelofeducationJL);
 updatedepartmentemployeeworkpanel.add(levelofeducation);
 updatedepartmentemployeeworkpanel.add(Box.createRigidArea(new Dimension(600,20)));
 updatedepartmentemployeeworkpanel.add(Add);
 updatedepartmentemployeeworkpanel.add(Box.createRigidArea(new Dimension(600,5)));
 updatedepartmentemployeeworkpanel.add(Back);
 
 this.add(updatedepartmentemployeeworkpanel);
 this.setVisible(true); 
      
 }   
    
    @Override
    public void actionPerformed(ActionEvent e) // ActionListener για τα κουμπιά Add και Back και αφού έχουμε συμπληρώσει όλα τα στοιχεία και σωστά τότε γίνονται οι απαραίτητες λειτουργίες με το πάτημα του κουμπιού Add. 
    
    {
    
    if(e.getSource() == Add)
        
    { 
        
    for(Departmentemployeework departmentemployeework : new ArrayList<Departmentemployeework>(dataofdepartmentemployeework))
        
    {
    
    if(firstname.getText().equals(departmentemployeework.Getfirstname()) && lastname.getText().equals(departmentemployeework.Getlastname()) && birthdate.getText().equals(birthdateDF.format(departmentemployeework.Getbirthdate()))  && Integer.parseInt(yearofrecruitment.getText())==departmentemployeework.Getyearofrecruitment() && nameofdepartment.getText().equals(departmentemployeework.Getnameofdepartment()) && nameofwork.getText().equals(departmentemployeework.Getnameofwork()) && startdate.getText().equals(date2DF.format(departmentemployeework.Getstartdate())) && expirationdate.getText().equals(date3DF.format(departmentemployeework.Getexpirationdate())))
    
    {
            
    dataofdepartmentemployeework.remove(departmentemployeework);
    
     File inputFile = new File("departmentemployeesworks.txt");           //ενημέρωση αρχείων.
    
    File tempFile = new File("myTempdepartmentemployeesworks.txt");

        BufferedReader reader = null;
        
        try 
        
        {
            
            reader = new BufferedReader(new FileReader(inputFile));
            
        } 
        
        catch (FileNotFoundException ex) {
            Logger.getLogger(Updateentrydepartmentemployeework.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        BufferedWriter writer = null;
        
        try 
        
        {
            writer = new BufferedWriter(new FileWriter(tempFile));
        } 
        
        catch (IOException ex) {
            Logger.getLogger(Updateentrydepartmentemployeework.class.getName()).log(Level.SEVERE, null, ex);
        }

        String currentLine;

        try 
        
        {
           
            while((currentLine = reader.readLine()) != null) {
                
                String trimmedLine = currentLine.trim();
                if(trimmedLine.equals(departmentemployeework.toString())) continue;
                writer.write(currentLine + System.getProperty("line.separator"));
                
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Updateentrydepartmentemployeework.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try 
        
        { 
            
            writer.close();
        }
        
        catch (IOException ex) {
            Logger.getLogger(Updateentrydepartmentemployeework.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try 
        
        { 
            
            reader.close();
            
        } 
        
        catch (IOException ex) {
            Logger.getLogger(Updateentrydepartmentemployeework.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        boolean successful = tempFile.renameTo(inputFile);
        tempFile.delete();
    
    try 
    
    {
        
    date = birthdateDF.parse(birthdate.getText());
    
    date1 = date2DF.parse(startdate.getText());
    
    date2 = date3DF.parse(expirationdate.getText());
          
    Departmentemployeework updatedepartmentemployeework = new Departmentemployeework(firstname.getText() , lastname.getText() , date , familysituation.getSelectedItem().toString() , Integer.parseInt(numberofchildren.getText()) , Integer.parseInt(yearofrecruitment.getText()) , speciality.getText() , levelofeducation.getSelectedItem().toString() , nameofdepartment.getText() , nameofwork.getText()  , date1 , date2);
        
    JOptionPane.showMessageDialog(this, "Department employee to a work updated successfully.","Success",JOptionPane.INFORMATION_MESSAGE);
    
    dataofdepartmentemployeework.add(updatedepartmentemployeework);
    
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
           
    if(e.getSource() == Back)
        
    {
    
    this.dispose();
    
    Maincompany maincompany = new Maincompany();
    
    }      
        
    }
      
}
