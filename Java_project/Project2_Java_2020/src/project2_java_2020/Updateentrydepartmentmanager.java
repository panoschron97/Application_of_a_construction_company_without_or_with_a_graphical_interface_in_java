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
import static project2_java_2020.Entrydepartmentmanager.dataofdepartmentmanager;
import static project2_java_2020.Entryemployee.dataofemployee;

/**
 *
 * @author panos
 */
public class Updateentrydepartmentmanager extends JFrame implements ActionListener // κλάση για την ενημέρωση των διευθυντών τμημάτων στην επιχείρηση.

{

private JTextField firstname , lastname , numberofchildren , yearofrecruitment , nameofdepartment ,speciality , dateofwithdrawal;    
private JFormattedTextField birthdate , dateofwithdrawalJF;
private JComboBox familysituation , levelofeducation;
private JLabel firstnameJL , lastnameJL , familysituationJL , birthdateJL , numberofchildrenJL , levelofeducationJL , yearofrecruitmentJL , nameofdepartmentJL , specialityJL , dateofwithdrawalJL;
private String[] Comboboxfamilysituation = {"Unmarried" , "Married"};
private String[] Comboboxleveleducation = {"Secondary education" , "University education" , "Postgraduate diploma" , "Doctoral degree"};
private Date date , date2; 
private JButton Add , Back;
private JPanel updatedepartmentmanagerpanel;
SimpleDateFormat birthdateDF , dateofwithdrawalDF;   
    
 public Updateentrydepartmentmanager() // το JPanel για να συμπληρώσουμε τα απαραίτητα στοιχεία.
    
 {
 
 super("Update entry department manager data");
 
 setSize(600,650);
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
 dateofwithdrawalJL = new JLabel("Date of withdrawal : ");
 
 firstname = new JTextField(15);
 lastname = new JTextField(15);
 birthdateDF = new SimpleDateFormat("dd/MM/yyyy");
 birthdate = new JFormattedTextField(birthdateDF);
 birthdate.setColumns(15);
 familysituation = new JComboBox(Comboboxfamilysituation);
 numberofchildren = new JTextField(14);
 yearofrecruitment = new JTextField(18);
 speciality = new JTextField(14);
 levelofeducation = new JComboBox(Comboboxleveleducation);
 nameofdepartment = new JTextField(10);
 dateofwithdrawalDF = new SimpleDateFormat("dd/MM/yyyy");
 dateofwithdrawalJF = new JFormattedTextField(dateofwithdrawalDF);
 dateofwithdrawalJF.setColumns(12);
 
 Add = new JButton("Add");
 Add.addActionListener(this);
 Back = new JButton("Back");
 Back.addActionListener(this);
 
 BoxLayout box = new BoxLayout(updatedepartmentmanagerpanel , BoxLayout.LINE_AXIS);
 
 updatedepartmentmanagerpanel = new JPanel();
         
 updatedepartmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,10)));
 updatedepartmentmanagerpanel.add(firstnameJL);
 updatedepartmentmanagerpanel.add(firstname);
 updatedepartmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,20)));
 updatedepartmentmanagerpanel.add(lastnameJL);
 updatedepartmentmanagerpanel.add(lastname);
 updatedepartmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,20)));
 updatedepartmentmanagerpanel.add(birthdateJL);
 updatedepartmentmanagerpanel.add(birthdate);
 updatedepartmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,20)));
 updatedepartmentmanagerpanel.add(yearofrecruitmentJL);
 updatedepartmentmanagerpanel.add(yearofrecruitment);
 updatedepartmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,20)));
 updatedepartmentmanagerpanel.add(nameofdepartmentJL);
 updatedepartmentmanagerpanel.add(nameofdepartment);
 updatedepartmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,20)));
 updatedepartmentmanagerpanel.add(dateofwithdrawalJL);
 updatedepartmentmanagerpanel.add(dateofwithdrawalJF);
 updatedepartmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,20)));
 updatedepartmentmanagerpanel.add(familysituationJL);
 updatedepartmentmanagerpanel.add(familysituation);
 updatedepartmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,20)));
 updatedepartmentmanagerpanel.add(numberofchildrenJL);
 updatedepartmentmanagerpanel.add(numberofchildren);
 updatedepartmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,20)));
 updatedepartmentmanagerpanel.add(specialityJL);
 updatedepartmentmanagerpanel.add(speciality);
 updatedepartmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,20)));
 updatedepartmentmanagerpanel.add(levelofeducationJL);
 updatedepartmentmanagerpanel.add(levelofeducation);
 updatedepartmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,20)));
 updatedepartmentmanagerpanel.add(Add);
 updatedepartmentmanagerpanel.add(Box.createRigidArea(new Dimension(600,5)));
 updatedepartmentmanagerpanel.add(Back);
 
 this.add(updatedepartmentmanagerpanel);
 this.setVisible(true); 
      
 }         
    
    @Override
    public void actionPerformed(ActionEvent e) // ActionListener για τα κουμπιά Add και Back και αφού έχουμε συμπληρώσει όλα τα στοιχεία και σωστά τότε γίνονται οι απαραίτητες λειτουργίες με το πάτημα του κουμπιού Add.
   
    {
        
    if(e.getSource()==Add)
        
    {
      
    for(Departmentmanager departmentmanager : new ArrayList<Departmentmanager>(dataofdepartmentmanager))
        
    {
    
    if(firstname.getText().equals(departmentmanager.Getfirstname()) && lastname.getText().equals(departmentmanager.Getlastname()) && birthdate.getText().equals(birthdateDF.format(departmentmanager.Getbirthdate())) && Integer.parseInt(yearofrecruitment.getText())==departmentmanager.Getyearofrecruitment() && nameofdepartment.getText().equals(departmentmanager.Getnameofdepartment()) && dateofwithdrawalJF.getText().equals(dateofwithdrawalDF.format(departmentmanager.Getdateofwithdrawal()))) 
        
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
            Logger.getLogger(Updateentrydepartmentmanager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        BufferedWriter writer = null;
        
        try 
        
        {
            writer = new BufferedWriter(new FileWriter(tempFile));
        } 
        
        catch (IOException ex) {
            Logger.getLogger(Updateentrydepartmentmanager.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Updateentrydepartmentmanager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try 
        
        { 
            
            writer.close();
        }
        
        catch (IOException ex) {
            Logger.getLogger(Updateentrydepartmentmanager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try 
        
        { 
            
            reader.close();
            
        } 
        
        catch (IOException ex) {
            Logger.getLogger(Updateentrydepartmentmanager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        boolean successful = tempFile.renameTo(inputFile);
        tempFile.delete();
    
    try 
        
    {
        
    date = birthdateDF.parse(birthdate.getText());
    
    date2 = dateofwithdrawalDF.parse(dateofwithdrawalJF.getText());
    
    Departmentmanager updatedepartmentmanager = new Departmentmanager(firstname.getText() , lastname.getText() , date ,  familysituation.getSelectedItem().toString() , Integer.parseInt(numberofchildren.getText()) , Integer.parseInt(yearofrecruitment.getText()) , speciality.getText() , levelofeducation.getSelectedItem().toString() , nameofdepartment.getText() , date2);
    
    JOptionPane.showMessageDialog(this, "Department manager updated successfully.","Success",JOptionPane.INFORMATION_MESSAGE);
    
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
        
    if(e.getSource() == Back)
        
    {
    
    this.dispose();
    
    Maincompany maincompany = new Maincompany();
    
    }     
         
    }  
    
}
