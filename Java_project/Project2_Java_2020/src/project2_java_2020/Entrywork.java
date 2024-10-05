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
public class Entrywork extends JFrame implements ActionListener // κλάση για την δημιουργία ενός έργου.

{

static ArrayList<Work> dataofwork = new ArrayList<Work>();   
    
 private JTextField nameofwork , shortdescription , grossrevenueofcompany , costsforlogisticalinfrastructure , costsforotheroperatingexpenses;
 private JLabel nameofworkJL , shortdescriptionJL , grossrevenueofcompanyJL , costsforlogisticalinfrastructureJL , costsforotheroperatingexpensesJL;
 private JButton Add , Back;
 private JPanel workpanel;    
    
 public Entrywork() // το JPanel για να συμπληρώσουμε τα απαραίτητα στοιχεία.
 
 {
 
 super("Entry work data"); 
 
 setSize(600,600);
 setLocationRelativeTo(null);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
 nameofworkJL = new JLabel("Name of work : ");
 shortdescriptionJL = new JLabel("Short description : ");
 grossrevenueofcompanyJL = new JLabel("Grossrevenueofcompany : ");
 costsforlogisticalinfrastructureJL =  new JLabel("Costsforlogisticalinfrastructure : ");
 costsforotheroperatingexpensesJL = new JLabel("Costsforotheroperatingexpenses : ");
 
 nameofwork = new JTextField(27);
 shortdescription = new JTextField(25);
 grossrevenueofcompany = new JTextField(21);
 costsforlogisticalinfrastructure = new JTextField(18);
 costsforotheroperatingexpenses = new JTextField(17);
 Add = new JButton("Add");
 Add.addActionListener(this);
 Back = new JButton("Back");
 Back.addActionListener(this);
 
 BoxLayout box = new BoxLayout(workpanel , BoxLayout.LINE_AXIS);
 
 workpanel = new JPanel();
 
 workpanel.add(Box.createRigidArea(new Dimension(600,10)));
 workpanel.add(nameofworkJL);
 workpanel.add(nameofwork);
 workpanel.add(Box.createRigidArea(new Dimension(600,20)));
 workpanel.add(shortdescriptionJL);
 workpanel.add(shortdescription);
 workpanel.add(Box.createRigidArea(new Dimension(600,20)));
 workpanel.add(grossrevenueofcompanyJL);
 workpanel.add(grossrevenueofcompany);
 workpanel.add(Box.createRigidArea(new Dimension(600,20)));
 workpanel.add(costsforlogisticalinfrastructureJL);
 workpanel.add(costsforlogisticalinfrastructure);
 workpanel.add(Box.createRigidArea(new Dimension(600,20)));
 workpanel.add(costsforotheroperatingexpensesJL);
 workpanel.add(costsforotheroperatingexpenses);
 workpanel.add(Box.createRigidArea(new Dimension(600,20)));
 workpanel.add(Add);
 workpanel.add(Box.createRigidArea(new Dimension(600,20)));
 workpanel.add(Back);
 
 this.add(workpanel);
 this.setVisible(true);

 }
 
    @Override
    public void actionPerformed(ActionEvent e) // ActionListener για τα κουμπιά Add και Back και αφού έχουμε συμπληρώσει όλα τα στοιχεία και σωστά τότε γίνονται οι απαραίτητες λειτουργίες με το πάτημα του κουμπιού Add.
    
    {
        
    if(e.getSource() == Add)
        
    { 
    
    Work work = new Work(nameofwork.getText() , shortdescription.getText() , Double.parseDouble(grossrevenueofcompany.getText()) , Double.parseDouble(costsforlogisticalinfrastructure.getText()) , Double.parseDouble(costsforotheroperatingexpenses.getText()));
    
    JOptionPane.showMessageDialog(this, "Work added successfully.","Success",JOptionPane.INFORMATION_MESSAGE);
    
    dataofwork.add(work);
    
    System.out.println("\n" + dataofwork.toString());
    
    this.dispose();
    
    Maincompany maincompany = new Maincompany();
    
    } 
 
    if(e.getSource() == Back)
        
    {
    
    this.dispose();
    
    Maincompany maincompany = new Maincompany();
    
    }   
        
    }
      
}
