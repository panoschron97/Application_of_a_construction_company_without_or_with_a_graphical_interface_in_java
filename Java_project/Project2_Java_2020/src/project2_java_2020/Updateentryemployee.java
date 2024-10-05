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
import static project2_java_2020.Entryemployee.dataofemployee;

/**
 *
 * @author panos
 */
public class Updateentryemployee extends JFrame implements ActionListener // κλάση για την ενημέρωση των εργαζομένων στην επιχείρηση.

{

 private JTextField firstname , lastname , numberofchildren , yearofrecruitment , speciality;
 private JComboBox familysituation , levelofeducation;
 private JFormattedTextField birthdate;
 private JLabel firstnameJL , lastnameJL , birthdateJL , numberofchildrenJL , yearofrecruitmentJL , specialityJL , familysituationJL , levelofeducationJL;
 private String[] Comboboxfamilysituation = {"Unmarried" , "Married"};
 private String[] Comboboxleveleducation = {"Secondary education" , "University education" , "Postgraduate diploma" , "Doctoral degree"};
 private JButton Add , Back;
 private JPanel updateemployeepanel;
 SimpleDateFormat birthdateDF;
 private Date date;
  
 public Updateentryemployee() // το JPanel για να συμπληρώσουμε τα απαραίτητα στοιχεία.
    
 {
 
 super("Update entry employee data");
 
 setSize(600,600);
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
 
 firstname = new JTextField(15);
 lastname = new JTextField(15);
 birthdateDF = new SimpleDateFormat("dd/MM/yyyy");
 birthdate = new JFormattedTextField(birthdateDF);
 birthdate.setColumns(15);
 familysituation = new JComboBox(Comboboxfamilysituation);
 numberofchildren = new JTextField(14);
 yearofrecruitment = new JTextField(18);
 speciality = new JTextField(13);
 levelofeducation = new JComboBox(Comboboxleveleducation);
 
 Add = new JButton("Add");
 Add.addActionListener(this);
 Back = new JButton("Back");
 Back.addActionListener(this);
 
 BoxLayout box = new BoxLayout(updateemployeepanel , BoxLayout.LINE_AXIS);
 
 updateemployeepanel = new JPanel();
         
 updateemployeepanel.add(Box.createRigidArea(new Dimension(600,10)));
 updateemployeepanel.add(firstnameJL);
 updateemployeepanel.add(firstname);
 updateemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 updateemployeepanel.add(lastnameJL);
 updateemployeepanel.add(lastname);
 updateemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 updateemployeepanel.add(birthdateJL);
 updateemployeepanel.add(birthdate);
 updateemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 updateemployeepanel.add(yearofrecruitmentJL);
 updateemployeepanel.add(yearofrecruitment);
 updateemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 updateemployeepanel.add(familysituationJL);
 updateemployeepanel.add(familysituation);
 updateemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 updateemployeepanel.add(numberofchildrenJL);
 updateemployeepanel.add(numberofchildren);
 updateemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 updateemployeepanel.add(specialityJL);
 updateemployeepanel.add(speciality);
 updateemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 updateemployeepanel.add(levelofeducationJL);
 updateemployeepanel.add(levelofeducation);
 updateemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 updateemployeepanel.add(Add);
 updateemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 updateemployeepanel.add(Back);
 
 this.add(updateemployeepanel);
 this.setVisible(true);
 
 }   
    
    @Override
    public void actionPerformed(ActionEvent e) // ActionListener για τα κουμπιά Add και Back και αφού έχουμε συμπληρώσει όλα τα στοιχεία και σωστά τότε γίνονται οι απαραίτητες λειτουργίες με το πάτημα του κουμπιού Add.
    
    {
        
    if(e.getSource() == Add)
        
    {   
        
    for(Employee employee :  new ArrayList<Employee>(dataofemployee))
        
    {
        
    if(firstname.getText().equals(employee.Getfirstname()) && lastname.getText().equals(employee.Getlastname()) && birthdate.getText().equals(birthdateDF.format(employee.Getbirthdate())) && Integer.parseInt(yearofrecruitment.getText())==employee.Getyearofrecruitment())
    
    {
      
    dataofemployee.remove(employee);
    
    File inputFile = new File("employees.txt");                      //ενημέρωση αρχείων.
    File tempFile = new File("myTempemployees.txt");

        BufferedReader reader = null;
        
        try 
        
        {
            
            reader = new BufferedReader(new FileReader(inputFile));
            
        } 
        
        catch (FileNotFoundException ex) {
            Logger.getLogger(Updateentryemployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        BufferedWriter writer = null;
        
        try 
        
        {
            
            writer = new BufferedWriter(new FileWriter(tempFile));
            
        } 
        
        catch (IOException ex) {
            Logger.getLogger(Updateentryemployee.class.getName()).log(Level.SEVERE, null, ex);
        }

        String currentLine;

        try 
        
        {
            
            while((currentLine = reader.readLine()) != null) {
                
                String trimmedLine = currentLine.trim();
                if(trimmedLine.equals(employee.toString())) continue;
                writer.write(currentLine + System.getProperty("line.separator"));
            }
            
        } 
        
        catch (IOException ex) {
            Logger.getLogger(Updateentryemployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try 
        
        { 
            
            writer.close();
            
        } 
        
        catch (IOException ex) {
            Logger.getLogger(Updateentryemployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try 
        
        { 
            
            reader.close();
            
        } 
        
        catch (IOException ex) {
            Logger.getLogger(Updateentryemployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        boolean successful = tempFile.renameTo(inputFile);
        tempFile.delete();
    
    try 
        
    {
        
    date = birthdateDF.parse(birthdate.getText());
    
    Employee updateemployee = new Employee(firstname.getText() , lastname.getText() , date , familysituation.getSelectedItem().toString() , Integer.parseInt(numberofchildren.getText()) , Integer.parseInt(yearofrecruitment.getText()) , speciality.getText() , levelofeducation.getSelectedItem().toString());
    
    JOptionPane.showMessageDialog(this, "Employee updated successfully.","Success",JOptionPane.INFORMATION_MESSAGE);
    
    dataofemployee.add(updateemployee);
    
    System.out.println("\n" + dataofemployee.toString());
    
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
    
    if(e.getSource() == Back)
        
    {
    
    this.dispose();
    
    Maincompany maincompany = new Maincompany();
    
    }  
    
}
    
}

  

