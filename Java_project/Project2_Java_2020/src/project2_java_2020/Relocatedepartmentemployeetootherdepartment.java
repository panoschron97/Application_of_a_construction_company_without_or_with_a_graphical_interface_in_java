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

/**
 *
 * @author panos
 */
public class Relocatedepartmentemployeetootherdepartment extends JFrame implements ActionListener // κλάση για την ανάθεση ενός εργαζομένου από το τμήμα που βρίσκεται σε κάποιο άλλο τμήμα.

{

private JTextField firstname , lastname , numberofchildren , yearofrecruitment , oldnameofdepartment ,speciality , newnameofdepartment;    
 private JFormattedTextField birthdate;
 private JComboBox familysituation , levelofeducation;
 private JLabel firstnameJL , lastnameJL , familysituationJL , birthdateJL , numberofchildrenJL , levelofeducationJL , yearofrecruitmentJL , oldnameofdepartmentJL , newnameofdepartmentJL , specialityJL;
 private String[] Comboboxfamilysituation = {"Unmarried" , "Married"};
 private String[] Comboboxleveleducation = {"Secondary education" , "University education" , "Postgraduate diploma" , "Doctoral degree"};
 private Date date; 
 private JButton Add , Back;
 private JPanel relocatedepartmentemployeepanel;
 SimpleDateFormat birthdateDF;   
    
 public Relocatedepartmentemployeetootherdepartment() // το JPanel για να συμπληρώσουμε τα απαραίτητα στοιχεία.
    
 {
 
 super("Relocate department employee to other department");
 
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
 oldnameofdepartmentJL = new JLabel("Old name of department : ");
 newnameofdepartmentJL = new JLabel("New name of department : ");
 
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
 oldnameofdepartment = new JTextField(11);
 newnameofdepartment = new JTextField(11);
 
 Add = new JButton("Add");
 Add.addActionListener(this);
 Back = new JButton("Back");
 Back.addActionListener(this);
 
 BoxLayout box = new BoxLayout(relocatedepartmentemployeepanel , BoxLayout.LINE_AXIS);
 
 relocatedepartmentemployeepanel = new JPanel();
         
 relocatedepartmentemployeepanel.add(Box.createRigidArea(new Dimension(600,10)));
 relocatedepartmentemployeepanel.add(firstnameJL);
 relocatedepartmentemployeepanel.add(firstname);
 relocatedepartmentemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 relocatedepartmentemployeepanel.add(lastnameJL);
 relocatedepartmentemployeepanel.add(lastname);
 relocatedepartmentemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 relocatedepartmentemployeepanel.add(birthdateJL);
 relocatedepartmentemployeepanel.add(birthdate);
 relocatedepartmentemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 relocatedepartmentemployeepanel.add(familysituationJL);
 relocatedepartmentemployeepanel.add(familysituation);
 relocatedepartmentemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 relocatedepartmentemployeepanel.add(numberofchildrenJL);
 relocatedepartmentemployeepanel.add(numberofchildren);
 relocatedepartmentemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 relocatedepartmentemployeepanel.add(yearofrecruitmentJL);
 relocatedepartmentemployeepanel.add(yearofrecruitment);
 relocatedepartmentemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 relocatedepartmentemployeepanel.add(specialityJL);
 relocatedepartmentemployeepanel.add(speciality);
 relocatedepartmentemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 relocatedepartmentemployeepanel.add(levelofeducationJL);
 relocatedepartmentemployeepanel.add(levelofeducation);
 relocatedepartmentemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 relocatedepartmentemployeepanel.add(oldnameofdepartmentJL);
 relocatedepartmentemployeepanel.add(oldnameofdepartment);
 relocatedepartmentemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 relocatedepartmentemployeepanel.add(newnameofdepartmentJL);
 relocatedepartmentemployeepanel.add(newnameofdepartment);
 relocatedepartmentemployeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 relocatedepartmentemployeepanel.add(Add);
 relocatedepartmentemployeepanel.add(Box.createRigidArea(new Dimension(600,5)));
 relocatedepartmentemployeepanel.add(Back);
 
 this.add(relocatedepartmentemployeepanel);
 this.setVisible(true); 
      
 }    
    
    @Override
    public void actionPerformed(ActionEvent e) // ActionListener για τα κουμπιά Add και Back και αφού έχουμε συμπληρώσει όλα τα στοιχεία και σωστά τότε γίνονται οι απαραίτητες λειτουργίες με το πάτημα του κουμπιού Add.
    
    {
           
    if(e.getSource() == Add)
        
    { 
        
    for(Departmentemployee departmentemployee : new ArrayList<Departmentemployee>(dataofdepartmentemployee))
        
    {
    
    if(firstname.getText().equals(departmentemployee.Getfirstname()) && lastname.getText().equals(departmentemployee.Getlastname()) && birthdate.getText().equals(birthdateDF.format(departmentemployee.Getbirthdate())) && familysituation.getSelectedItem().toString().equals(departmentemployee.Getfamiliysituation()) && Integer.parseInt(numberofchildren.getText())==departmentemployee.Getnumberofchildren() && Integer.parseInt(yearofrecruitment.getText())==departmentemployee.Getyearofrecruitment() && speciality.getText().equals(departmentemployee.Getspeciality()) && levelofeducation.getSelectedItem().toString().equals(departmentemployee.Getlevelofeducation()) && oldnameofdepartment.getText().equals(departmentemployee.Getnameofdepartment()))
        
    {
        
    for(Department department : dataofdepartment)
        
    {
        
    if(newnameofdepartment.getText().equals(department.Getnameofdepartment()))
        
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
            Logger.getLogger(Relocatedepartmentemployeetootherdepartment.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        BufferedWriter writer = null;
        
        try 
        
        {
            writer = new BufferedWriter(new FileWriter(tempFile));
        } 
        
        catch (IOException ex) {
            Logger.getLogger(Relocatedepartmentemployeetootherdepartment.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Relocatedepartmentemployeetootherdepartment.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try 
        
        { 
            
            writer.close();
        }
        
        catch (IOException ex) {
            Logger.getLogger(Relocatedepartmentemployeetootherdepartment.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try 
        
        { 
            
            reader.close();
            
        } 
        
        catch (IOException ex) {
            Logger.getLogger(Relocatedepartmentemployeetootherdepartment.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        boolean successful = tempFile.renameTo(inputFile);
        tempFile.delete();
    
    try 
        
    {
        
    date = birthdateDF.parse(birthdate.getText());
    
    Departmentemployee relocatedepartmentemployee = new Departmentemployee(firstname.getText() , lastname.getText() , date , familysituation.getSelectedItem().toString() , Integer.parseInt(numberofchildren.getText()) , Integer.parseInt(yearofrecruitment.getText()) , speciality.getText() , levelofeducation.getSelectedItem().toString() , newnameofdepartment.getText());
    
    JOptionPane.showMessageDialog(this, "Department employee transfered successfully to other department.","Success",JOptionPane.INFORMATION_MESSAGE);
    
    dataofdepartmentemployee.add(relocatedepartmentemployee);
    
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
        
    }  
    
    if(e.getSource() == Back)
        
    {
    
    this.dispose();
    
    Maincompany maincompany = new Maincompany();
    
    } 
    
}

}
