/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2_java_2020;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static project2_java_2020.Entrywork.dataofwork;
import static project2_java_2020.Salaryofallemployees.totalsalaryfordepartmentemployeeswithwork;

/**
 *
 * @author panos
 */
public class Calculationofnetincomeforaproject extends JFrame implements ActionListener // κλάση για τον υπολογισμού των καθαρών εσόδων για ένα έργο.

{

   private JTextField nameofwork;
   private JLabel nameofworkJL; 
   private JButton Add , Back; 
   private JPanel calcuationnetincomeforaproject;

 public Calculationofnetincomeforaproject() // το JPanel που συμπληρώνουμε τα απαραίτητα στοιχεία.
    
 {
   
 super("Calculation net income for a project");
 
 setSize(600,750);
 setLocationRelativeTo(null);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    
 nameofworkJL = new JLabel("Name of work : ");   
 nameofwork = new JTextField(11);
 
 Add = new JButton("Add");
 Add.addActionListener(this);
 Back = new JButton("Back");
 Back.addActionListener(this);
 
 BoxLayout box = new BoxLayout(calcuationnetincomeforaproject , BoxLayout.LINE_AXIS);
 
 calcuationnetincomeforaproject = new JPanel();
 
 calcuationnetincomeforaproject.add(Box.createRigidArea(new Dimension(600,20)));
 calcuationnetincomeforaproject.add(nameofworkJL);
 calcuationnetincomeforaproject.add(nameofwork);
 calcuationnetincomeforaproject.add(Box.createRigidArea(new Dimension(600,20)));
 calcuationnetincomeforaproject.add(Add);
 calcuationnetincomeforaproject.add(Box.createRigidArea(new Dimension(600,5)));
 calcuationnetincomeforaproject.add(Back);
 
 this.add(calcuationnetincomeforaproject);
 this.setVisible(true);   
    
 }  
    
    @Override
    public void actionPerformed(ActionEvent e) // ActionListener για τα κουμπιά Add και Back και αφού έχουμε συμπληρώσει όλα τα στοιχεία και σωστά τότε γίνονται οι απαραίτητες λειτουργίες με το πάτημα του κουμπιού Add.
    
    {
        
    double fpa = 0.19; // φπα δικό μου.
    double totaldepartmentemployeewithwork = 0.0;
    double netincome=0.0;
    
    for(int i=0; i<totalsalaryfordepartmentemployeeswithwork.size(); i++)
    
    {
    
    totaldepartmentemployeewithwork = totaldepartmentemployeewithwork + totalsalaryfordepartmentemployeeswithwork.get(i);
    
    }
    
    for(Work work : dataofwork)
        
    {
    
    if(nameofwork.getText().equals(work.Getnameofwork()))
        
    {
    
    netincome = work.Getgrossrevenueofcompany() - ((work.Getgrossrevenueofcompany()*fpa)+work.Getcostsforlogisticalinfrastructure()+work.Getcostsforotheroperatingexpenses()+totaldepartmentemployeewithwork) ;
     
    }
         
    }
    
   if(netincome==0.0)
        
    {
    
    this.dispose();
    
    Maincompany maincompany = new Maincompany(); 
    
    }
    
    else
        
    {
    
    JOptionPane.showMessageDialog(this, "Total net income of the specific project is : " + netincome ,"Success",JOptionPane.INFORMATION_MESSAGE);
    
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
