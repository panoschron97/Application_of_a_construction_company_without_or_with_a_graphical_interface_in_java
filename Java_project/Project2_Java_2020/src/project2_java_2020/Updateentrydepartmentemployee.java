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
import static project2_java_2020.Entrydepartmentemployee.dataofdepartmentemployee;

/**
 *
 * @author panos
 */
public class Updateentrydepartmentemployee extends JFrame implements ActionListener // κλάση για την ενημέρωση των στοιχείων των εργαζομένων που βρίσκονται σε τμήματα.

{

 private JTextField firstname , lastname , numberofchildren , yearofrecruitment , nameofdepartment ,speciality;    
 private JFormattedTextField birthdate;
 private JComboBox familysituation , levelofeducation;
 private JLabel firstnameJL , lastnameJL , familysituationJL , birthdateJL , numberofchildrenJL , levelofeducationJL , yearofrecruitmentJL , nameofdepartmentJL , specialityJL;
 private String[] Comboboxfamilysituation = {"Unmarried" , "Married"};
 private String[] Comboboxleveleducation = {"Secondary education" , "University education" , "Postgraduate diploma" , "Doctoral degree"};
 private Date date; 
 private JButton Add , Back;
 private JPanel updatedepartmentemployeepanel;
 SimpleDateFormat birthdateDF;   
    
 public Updateentrydepartmentemployee() // το JPanel για να συμπληρώσουμε τα απαραίτητα στοιχεία.
    
 {
 
 super("Update entry department employee data");
 
 setSize(600,620);
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
 
 firstname = new JTextField(15);
 lastname = new JTextField(15);
 birthdateDF = new SimpleDateFormat("dd/MM/yyyy");
 birthdate = new JFormattedTextField(birthdateDF);
 birthdate.setColumns(15);
 familysituation = new JComboBox(Comboboxfamilysituation);
 numberofchildren = new JTextField(15);
 yearofrecruitment = new JTextField(18);
 speciality = new JTextField(15);
 levelofeducation = new JComboBox(Comboboxleveleducation);
 nameofdepartment = new JTextField(11);
 
 Add = new JButton("Add");
 Add.addActionListener(this);
 Back = new JButton("Back");
 Back.addActionListener(this);
 
 BoxLayout box = new BoxLayout(updatedepartmentemployeepanel , BoxLayout.LINE_AXIS);
 
 updatedepartmentemployeepanel = new JPanel();
         
 updatedepartmentemployeepanel.add(Box.createRigidArea(new Dimension(600,10)));
 updatedepartmentemployeepanel.add(firstnameJL);
 updatedepartmentemployeepanel.add(firstname);
 updatedepartmentemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 updatedepartmentemployeepanel.add(lastnameJL);
 updatedepartmentemployeepanel.add(lastname);
 updatedepartmentemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 updatedepartmentemployeepanel.add(birthdateJL);
 updatedepartmentemployeepanel.add(birthdate);
 updatedepartmentemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 updatedepartmentemployeepanel.add(yearofrecruitmentJL);
 updatedepartmentemployeepanel.add(yearofrecruitment);
 updatedepartmentemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 updatedepartmentemployeepanel.add(nameofdepartmentJL);
 updatedepartmentemployeepanel.add(nameofdepartment);
 updatedepartmentemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 updatedepartmentemployeepanel.add(familysituationJL);
 updatedepartmentemployeepanel.add(familysituation);
 updatedepartmentemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 updatedepartmentemployeepanel.add(numberofchildrenJL);
 updatedepartmentemployeepanel.add(numberofchildren);
 updatedepartmentemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 updatedepartmentemployeepanel.add(specialityJL);
 updatedepartmentemployeepanel.add(speciality);
 updatedepartmentemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 updatedepartmentemployeepanel.add(levelofeducationJL);
 updatedepartmentemployeepanel.add(levelofeducation);
 updatedepartmentemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 updatedepartmentemployeepanel.add(Add);
 updatedepartmentemployeepanel.add(Box.createRigidArea(new Dimension(600,5)));
 updatedepartmentemployeepanel.add(Back);
 
 this.add(updatedepartmentemployeepanel);
 this.setVisible(true); 
      
 }    
    
    @Override
    public void actionPerformed(ActionEvent e) // ActionListener για τα κουμπιά Add και Back και αφού έχουμε συμπληρώσει όλα τα στοιχεία και σωστά τότε γίνονται οι απαραίτητες λειτουργίες με το πάτημα του κουμπιού Add.
    
    {
      
    if(e.getSource() == Add)
        
    { 
        
    for(Departmentemployee departmentemployee : new ArrayList<Departmentemployee>(dataofdepartmentemployee))
        
    {
    
    if(firstname.getText().equals(departmentemployee.Getfirstname()) && lastname.getText().equals(departmentemployee.Getlastname()) && birthdate.getText().equals(birthdateDF.format(departmentemployee.Getbirthdate())) && Integer.parseInt(yearofrecruitment.getText())==departmentemployee.Getyearofrecruitment() && nameofdepartment.getText().equals(departmentemployee.Getnameofdepartment()))
        
    {
        
    dataofdepartmentemployee.remove(departmentemployee);    
    
    File inputFile = new File("departmentemployees.txt");           //ενημέρωση αρχείων.
    
    File tempFile = new File("myTempdepartmentemployees.txt");

        BufferedReader reader = null;
        
        try 
        
        {
            
            reader = new BufferedReader(new FileReader(inputFile));
            
        } 
        
        catch (FileNotFoundException ex) {
            Logger.getLogger(Updateentrydepartmentemployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        BufferedWriter writer = null;
        
        try 
        
        {
            writer = new BufferedWriter(new FileWriter(tempFile));
        } 
        
        catch (IOException ex) {
            Logger.getLogger(Updateentrydepartmentemployee.class.getName()).log(Level.SEVERE, null, ex);
        }

        String currentLine;

        try 
        
        {
           
            while((currentLine = reader.readLine()) != null) {
                
                String trimmedLine = currentLine.trim();
                if(trimmedLine.equals(departmentemployee.toString())) continue;
                writer.write(currentLine + System.getProperty("line.separator"));
                
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Updateentrydepartmentemployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try 
        
        { 
            
            writer.close();
        }
        
        catch (IOException ex) {
            Logger.getLogger(Updateentrydepartmentemployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try 
        
        { 
            
            reader.close();
            
        } 
        
        catch (IOException ex) {
            Logger.getLogger(Updateentrydepartmentemployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        boolean successful = tempFile.renameTo(inputFile);
        tempFile.delete();
    
    try 
        
    {
        
    date = birthdateDF.parse(birthdate.getText());
    
    Departmentemployee updatedepartmentemployee = new Departmentemployee(firstname.getText() , lastname.getText() , date , familysituation.getSelectedItem().toString() , Integer.parseInt(numberofchildren.getText()) , Integer.parseInt(yearofrecruitment.getText()) , speciality.getText() , levelofeducation.getSelectedItem().toString() , nameofdepartment.getText());
    
    JOptionPane.showMessageDialog(this, "Department employee updated successfully.","Success",JOptionPane.INFORMATION_MESSAGE);
    
    dataofdepartmentemployee.add(updatedepartmentemployee);
    
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
        
    if(e.getSource() == Back)
        
    {
    
    this.dispose();
    
    Maincompany maincompany = new Maincompany();
    
    }     
        
    } 
    
}
