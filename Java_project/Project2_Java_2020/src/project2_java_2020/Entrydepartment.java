/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2_java_2020;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author panos
 */
public class Entrydepartment extends JFrame implements ActionListener // κλάση για την δημιουργία ενός τμήματος.

{
    
static ArrayList<Department> dataofdepartment = new ArrayList<Department>();  
    
 private JTextField nameofdepartment , shortdescription;
 private JLabel nameofdepartmentJL , shortdescriptionJL;
 private JButton Add , Back;
 private JPanel departmentpanel;
    
 public Entrydepartment() // το JPanel για να συμπληρώσουμε τα απαραίτητα στοιχεία.
   
 {
 
 super("Entry department data");
 
 setSize(600,600);
 setLocationRelativeTo(null);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
 nameofdepartmentJL = new JLabel("Name of department : ");
 shortdescriptionJL = new JLabel("Short description : ");
 nameofdepartment = new JTextField(15);
 shortdescription = new JTextField(17);
 
 Add = new JButton("Add");
 Add.addActionListener(this);
 Back = new JButton("Back");
 Back.addActionListener(this);
 
 BoxLayout box = new BoxLayout(departmentpanel , BoxLayout.LINE_AXIS);
 
 departmentpanel = new JPanel();
 
 departmentpanel.add(Box.createRigidArea(new Dimension(600,10)));
 departmentpanel.add(nameofdepartmentJL);
 departmentpanel.add(nameofdepartment);
 departmentpanel.add(Box.createRigidArea(new Dimension(600,20)));
 departmentpanel.add(shortdescriptionJL);
 departmentpanel.add(shortdescription);
 departmentpanel.add(Box.createRigidArea(new Dimension(600,20)));
 departmentpanel.add(Add);
 departmentpanel.add(Box.createRigidArea(new Dimension(600,20)));
 departmentpanel.add(Back);
 
 this.add(departmentpanel);
 this.setVisible(true);
 
 
 }
    

 
    @Override
    public void actionPerformed(ActionEvent e) // ActionListener για τα κουμπιά Add και Back και αφού έχουμε συμπληρώσει όλα τα στοιχεία και σωστά τότε γίνονται οι απαραίτητες λειτουργίες με το πάτημα του κουμπιού Add.
    
    {
        
    if(e.getSource() == Add)
        
    { 
        
    if(nameofdepartment.getText().equals("") || shortdescription.getText().equals(""))
        
    {
    
    JOptionPane.showMessageDialog(this, "Fill all the fields.","Warning",JOptionPane.WARNING_MESSAGE);
    
    }
    
    else
        
    {
    
    Department department = new Department(nameofdepartment.getText() , shortdescription.getText());
    
    JOptionPane.showMessageDialog(this, "Department added successfully.","Success",JOptionPane.INFORMATION_MESSAGE);
    
    dataofdepartment.add(department);
    
    System.out.println("\n" + dataofdepartment.toString());
    
    this.dispose();
    
    Maincompany maincompany = new Maincompany();
    
    }
    
    }
        
    if(e.getSource() == Back)
        
    {
    
    this.dispose();
    
    Maincompany maincompany = new Maincompany();
    
    }

    }
              
    }
   
