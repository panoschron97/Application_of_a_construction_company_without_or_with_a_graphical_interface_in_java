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
public class Calculationcostsforaproject extends JFrame implements ActionListener // κλάση για τον υπολογισμό των δαπανών ενός έργου.

{

   private JTextField nameofwork;
   private JLabel nameofworkJL; 
   private JButton Add , Back; 
   private JPanel calcuationcostsforaproject;

 public Calculationcostsforaproject() // το JPanel για να συμπληρώσουμε τα απαραίτητα στοιχεία.
    
 {
   
 super("Calculation costs for a project");
 
 setSize(600,750);
 setLocationRelativeTo(null);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    
 nameofworkJL = new JLabel("Name of work : ");   
 nameofwork = new JTextField(11);
 
 Add = new JButton("Add");
 Add.addActionListener(this);
 Back = new JButton("Back");
 Back.addActionListener(this);
 
 BoxLayout box = new BoxLayout(calcuationcostsforaproject , BoxLayout.LINE_AXIS);
 
 calcuationcostsforaproject = new JPanel();
 
 calcuationcostsforaproject.add(Box.createRigidArea(new Dimension(600,20)));
 calcuationcostsforaproject.add(nameofworkJL);
 calcuationcostsforaproject.add(nameofwork);
 calcuationcostsforaproject.add(Box.createRigidArea(new Dimension(600,20)));
 calcuationcostsforaproject.add(Add);
 calcuationcostsforaproject.add(Box.createRigidArea(new Dimension(600,5)));
 calcuationcostsforaproject.add(Back);
 
 this.add(calcuationcostsforaproject);
 this.setVisible(true); 
    
    
 }  
    
    @Override
    public void actionPerformed(ActionEvent e) // ActionListener για τα κουμπιά Add και Back και αφού έχουμε συμπληρώσει όλα τα στοιχεία και σωστά τότε γίνονται οι απαραίτητες λειτουργίες με το πάτημα του κουμπιού Add.
    
    {
        
    if(e.getSource() == Add)
      
    {    
    
    double totalcostofwork=0.0;
    double totaldepartmentemployeewithwork = 0.0;
    double fpa = 0.19; // φπα δικό μου.
    
    for(int i=0; i<totalsalaryfordepartmentemployeeswithwork.size(); i++)
    
    {
    
    totaldepartmentemployeewithwork = totaldepartmentemployeewithwork + totalsalaryfordepartmentemployeeswithwork.get(i);
    
    }
 
    for(Work work : dataofwork)
        
    {
    
    if(nameofwork.getText().equals(work.Getnameofwork()))
        
    {
    
    totalcostofwork = (work.Getgrossrevenueofcompany()*fpa) + work.Getcostsforlogisticalinfrastructure() + work.Getcostsforotheroperatingexpenses() + totaldepartmentemployeewithwork  ;
    
    
    }
         
    }
    
    if(totalcostofwork==0.0)
        
    {
    
    this.dispose();
    
    Maincompany maincompany = new Maincompany(); 
    
    }
    
    else
        
    {
    
    JOptionPane.showMessageDialog(this, "Total salary of the specific project is : " + totalcostofwork ,"Success",JOptionPane.INFORMATION_MESSAGE);
    
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
