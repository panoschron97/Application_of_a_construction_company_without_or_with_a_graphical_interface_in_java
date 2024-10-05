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

/**
 *
 * @author panos
 */
public class Entryemployee extends JFrame implements ActionListener // κλάση για την δημιουργία ενός εργαζομένου που δεν βρίσκεται σε τμήμα.

{

 static ArrayList<Employee> dataofemployee = new ArrayList<Employee>();   
 private JTextField firstname , lastname , numberofchildren , yearofrecruitment , speciality;
 private JComboBox familysituation , levelofeducation;
 private JFormattedTextField birthdate;
 private JLabel firstnameJL , lastnameJL , birthdateJL , numberofchildrenJL , yearofrecruitmentJL , specialityJL , familysituationJL , levelofeducationJL;
 private String[] Comboboxfamilysituation = {"Unmarried" , "Married"};
 private String[] Comboboxleveleducation = {"Secondary education" , "University education" , "Postgraduate diploma" , "Doctoral degree"};
 private JButton Add , Back;
 private JPanel employeepanel;
 SimpleDateFormat birthdateDF;
 private Date date;
  
 public Entryemployee() // το JPanel για να συμπληρώσουμε τα απαραίτητα στοιχεία.
    
 {
 
 super("Entry employee data");
 
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
 
 Add = new JButton("Add");
 Add.addActionListener(this);
 Back = new JButton("Back");
 Back.addActionListener(this);
 
 BoxLayout box = new BoxLayout(employeepanel , BoxLayout.LINE_AXIS);
 
 employeepanel = new JPanel();
         
 employeepanel.add(Box.createRigidArea(new Dimension(600,10)));
 employeepanel.add(firstnameJL);
 employeepanel.add(firstname);
 employeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 employeepanel.add(lastnameJL);
 employeepanel.add(lastname);
 employeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 employeepanel.add(birthdateJL);
 employeepanel.add(birthdate);
 employeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 employeepanel.add(familysituationJL);
 employeepanel.add(familysituation);
 employeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 employeepanel.add(numberofchildrenJL);
 employeepanel.add(numberofchildren);
 employeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 employeepanel.add(yearofrecruitmentJL);
 employeepanel.add(yearofrecruitment);
 employeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 employeepanel.add(specialityJL);
 employeepanel.add(speciality);
 employeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 employeepanel.add(levelofeducationJL);
 employeepanel.add(levelofeducation);
 employeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 employeepanel.add(Add);
 employeepanel.add(Box.createRigidArea(new Dimension(600,20)));
 employeepanel.add(Back);
 
 this.add(employeepanel);
 this.setVisible(true);
 
 }

    
    @Override
    public void actionPerformed(ActionEvent e) // ActionListener για τα κουμπιά Add και Back και αφού έχουμε συμπληρώσει όλα τα στοιχεία και σωστά τότε γίνονται οι απαραίτητες λειτουργίες με το πάτημα του κουμπιού Add.
    
    {
        
    if(e.getSource() == Add)
        
    { 
        
    if(firstname.getText().equals("") || lastname.getText().equals("") || birthdate.getText().equals("") || numberofchildren.getText().equals("") || yearofrecruitment.getText().equals("") || speciality.getText().equals(""))
        
    {
    
    JOptionPane.showMessageDialog(this, "Fill all the fields.","Warning",JOptionPane.WARNING_MESSAGE);
    
    }    
    
    else
        
    {
        
    
    try 
        
    {
        
    date = birthdateDF.parse(birthdate.getText());
    
    Employee employee = new Employee(firstname.getText() , lastname.getText() , date , familysituation.getSelectedItem().toString() , Integer.parseInt(numberofchildren.getText()) , Integer.parseInt(yearofrecruitment.getText()) , speciality.getText() , levelofeducation.getSelectedItem().toString());
    
    JOptionPane.showMessageDialog(this, "Employee added successfully.","Success",JOptionPane.INFORMATION_MESSAGE);
    
    dataofemployee.add(employee);
    
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
        
    if(e.getSource() == Back)
        
    {
    
    this.dispose();
    
    Maincompany maincompany = new Maincompany();
    
    }

    }

}
