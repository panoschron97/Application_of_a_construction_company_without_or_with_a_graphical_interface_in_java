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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static project2_java_2020.Entrydepartmentemployee.dataofdepartmentemployee;
import static project2_java_2020.Entrydepartmentemployeework.dataofdepartmentemployeework;
import static project2_java_2020.Entrydepartmentmanager.dataofdepartmentmanager;

/**
 *
 * @author panos
 */
public class Salaryofallemployees extends JFrame implements ActionListener // κλάση για τον υπολογισμό όλων των εργαζομένων της εταιρείας.

{
    
 static ArrayList<Double> totalsalaryfordepartmentemployees = new ArrayList<Double>(); 
 static ArrayList<Double> totalsalaryfordepartmentemployeeswithwork  = new ArrayList<Double>();
 static ArrayList<Double> totalsalaryfordepartmentmanagers = new ArrayList<Double>();

 private JTextField firstname , lastname;
 private JLabel firstnameJL , lastnameJL; 
 private JButton Add , Back;
 private JPanel salaryofallemployeespanel;   
    
 public Salaryofallemployees() // το JPanel για να συμπληρώσουμε τα απαραίτητα στοιχεία.
    
 {
 
 super("Salary of employee you want to find");
 
 setSize(600,600);
 setLocationRelativeTo(null);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
 firstnameJL = new JLabel("Firstname : ");
 lastnameJL = new JLabel("Lastname : ");
 
 firstname = new JTextField(15);
 lastname = new JTextField(15);
 
 Add = new JButton("Add");
 Add.addActionListener(this);
 Back = new JButton("Back");
 Back.addActionListener(this);
 
 BoxLayout box = new BoxLayout(salaryofallemployeespanel , BoxLayout.LINE_AXIS);
 
 salaryofallemployeespanel = new JPanel();
         
 salaryofallemployeespanel.add(Box.createRigidArea(new Dimension(600,10)));
 salaryofallemployeespanel.add(firstnameJL);
 salaryofallemployeespanel.add(firstname);
 salaryofallemployeespanel.add(Box.createRigidArea(new Dimension(600,20)));
 salaryofallemployeespanel.add(lastnameJL);
 salaryofallemployeespanel.add(lastname);
 salaryofallemployeespanel.add(Box.createRigidArea(new Dimension(600,20)));
 salaryofallemployeespanel.add(Add);
 salaryofallemployeespanel.add(Box.createRigidArea(new Dimension(600,20)));
 salaryofallemployeespanel.add(Back);
 
 this.add(salaryofallemployeespanel);
 this.setVisible(true);
 
 }   
    
    @Override
    public void actionPerformed(ActionEvent e) // ActionListener για τα κουμπιά Add και Back και αφού έχουμε συμπληρώσει όλα τα στοιχεία και σωστά τότε γίνονται οι απαραίτητες λειτουργίες με το πάτημα του κουμπιού Add.
    
    {
        
    if(e.getSource() == Add)
        
    {
        
    double salary1=0.0;
    double salary2=0.0;
    double salary3=0.0;
    double minimumwage=750.0;
    double childbenefit=60.0;
    double studyallowance=80.0;
    double preserviceallowance=40.0;
    int currentyear = 2020;  
    int bonuswork = 100;
    int bonusmanager = 400;
    
    if(firstname.getText().equals("") && lastname.getText().equals(""))
        
    {
    
     JOptionPane.showMessageDialog(this, "Fill all the fields.","Warning",JOptionPane.WARNING_MESSAGE);
    
    }
    
    for(Departmentemployee departmentemployee : dataofdepartmentemployee)
    
    {
    
    if(firstname.getText().equals(departmentemployee.Getfirstname()) && lastname.getText().equals(departmentemployee.Getlastname()))
    
    {
    
    if((currentyear-departmentemployee.Getyearofrecruitment())%3==0 && 3>=departmentemployee.Getnumberofchildren())
    
    {
        
    salary1 = minimumwage + (childbenefit*departmentemployee.Getnumberofchildren()) + preserviceallowance ;
    
    }

    if(!departmentemployee.Getlevelofeducation().equals("Secondary education") && (currentyear-departmentemployee.Getyearofrecruitment())%3==0 && 3>=departmentemployee.Getnumberofchildren())
        
    {
    
    salary1 = minimumwage + (childbenefit*departmentemployee.Getnumberofchildren()) + studyallowance  + preserviceallowance ;
    
    }

    if((currentyear-departmentemployee.Getyearofrecruitment())%3!=0 && 3>=departmentemployee.Getnumberofchildren())

    {
    
    salary1 = minimumwage + (childbenefit*departmentemployee.Getnumberofchildren());   
    
    }

    if(!departmentemployee.Getlevelofeducation().equals("Secondary education") && (currentyear-departmentemployee.Getyearofrecruitment())%3!=0 && 3>=departmentemployee.Getnumberofchildren())  
        
    {
    
    salary1 = minimumwage + (childbenefit*departmentemployee.Getnumberofchildren()) + studyallowance ;
        
    }
    
    if((currentyear-departmentemployee.Getyearofrecruitment())%3==0 && 3<departmentemployee.Getnumberofchildren())
    
    {
        
    salary1 = minimumwage + (childbenefit*3) + preserviceallowance ;
    
    }

    if(!departmentemployee.Getlevelofeducation().equals("Secondary education") && (currentyear-departmentemployee.Getyearofrecruitment())%3==0 && 3<departmentemployee.Getnumberofchildren())
        
    {
    
    salary1 = minimumwage + (childbenefit*3) + studyallowance  + preserviceallowance ;
    
    }

    if((currentyear-departmentemployee.Getyearofrecruitment())%3!=0 && 3<departmentemployee.Getnumberofchildren())

    {
    
    salary1 = minimumwage + (childbenefit*3);   
    
    }

    if(!departmentemployee.Getlevelofeducation().equals("Secondary education") && (currentyear-departmentemployee.Getyearofrecruitment())%3!=0 && 3<departmentemployee.Getnumberofchildren())  
        
    {
    
    salary1 = minimumwage + (childbenefit*3) + studyallowance ;
        
    }
    
    } 
         
    }
    
    if(salary1==0.0)
        
    {
   
    totalsalaryfordepartmentemployees.remove(salary1);  
    
    }
    
    else
        
    {
    
    totalsalaryfordepartmentemployees.add(salary1);   
    
    JOptionPane.showMessageDialog(this, "Total salary of the specific employee is : " + salary1,"Success",JOptionPane.INFORMATION_MESSAGE);
    
    System.out.println("\n" + totalsalaryfordepartmentemployees.toString());
    
    this.dispose();
    
    Maincompany maincompany = new Maincompany();
    
    }
   
    for(Departmentemployeework departmentemployeework : dataofdepartmentemployeework)
    
    {
        
    int days = (int) ((departmentemployeework.Getexpirationdate().getTime()-departmentemployeework.Getstartdate().getTime()) / (1000 * 60 * 60 * 24));
     
    int months = (days/30);
    
    System.out.println("\n" +days);
    
    System.out.println("\n" +months);
        
    if(firstname.getText().equals(departmentemployeework.Getfirstname()) && lastname.getText().equals(departmentemployeework.Getlastname()))
    
    {
    
    if((currentyear-departmentemployeework.Getyearofrecruitment())%3==0 && 3>=departmentemployeework.Getnumberofchildren())
    
    {
        
    salary2 = ((minimumwage + (childbenefit*departmentemployeework.Getnumberofchildren()) + preserviceallowance + bonuswork)*months);
    
    }

    if(!departmentemployeework.Getlevelofeducation().equals("Secondary education") && (currentyear-departmentemployeework.Getyearofrecruitment())%3==0 && 3>=departmentemployeework.Getnumberofchildren())
        
    {
    
    salary2 = ((minimumwage + (childbenefit*departmentemployeework.Getnumberofchildren()) + studyallowance  + preserviceallowance + bonuswork)*months) ;
    
    }

    if((currentyear-departmentemployeework.Getyearofrecruitment())%3!=0 && 3>=departmentemployeework.Getnumberofchildren())

    {
    
    salary2 = ((minimumwage + (childbenefit*departmentemployeework.Getnumberofchildren()) + bonuswork)*months);   
    
    }

    if(!departmentemployeework.Getlevelofeducation().equals("Secondary education") && (currentyear-departmentemployeework.Getyearofrecruitment())%3!=0 && 3>=departmentemployeework.Getnumberofchildren())  
        
    {
    
    salary2 = ((minimumwage + (childbenefit*departmentemployeework.Getnumberofchildren()) + studyallowance + bonuswork)*months) ;
        
    }
    
    if((currentyear-departmentemployeework.Getyearofrecruitment())%3==0 && 3<departmentemployeework.Getnumberofchildren())
    
    {
        
    salary2 = ((minimumwage + (childbenefit*3) + preserviceallowance + bonuswork)*months)  ;
    
    }

    if(!departmentemployeework.Getlevelofeducation().equals("Secondary education") && (currentyear-departmentemployeework.Getyearofrecruitment())%3==0 && 3<departmentemployeework.Getnumberofchildren())
        
    {
    
    salary2 = ((minimumwage + (childbenefit*3) + studyallowance  + preserviceallowance + bonuswork)*months) ;
    
    }

    if((currentyear-departmentemployeework.Getyearofrecruitment())%3!=0 && 3<departmentemployeework.Getnumberofchildren())

    {
    
    salary2 = ((minimumwage + (childbenefit*3) + bonuswork)*months) ;   
    
    }

    if(!departmentemployeework.Getlevelofeducation().equals("Secondary education") && (currentyear-departmentemployeework.Getyearofrecruitment())%3!=0 && 3<departmentemployeework.Getnumberofchildren())  
        
    {
    
    salary2 = ((minimumwage + (childbenefit*3) + studyallowance + bonuswork)*months)  ;
        
    }
    
    
    
    } 
    
    } 
    
     if(salary2==0.0)
        
    {
   
    totalsalaryfordepartmentemployeeswithwork.remove(salary2);  
    
    }
    
    else
        
    {
    
    totalsalaryfordepartmentemployeeswithwork.add(salary2);  
      
    
    JOptionPane.showMessageDialog(this, "Total salary of the specific employee is : " + salary2,"Success",JOptionPane.INFORMATION_MESSAGE);
    
    System.out.println("\n" + totalsalaryfordepartmentemployeeswithwork.toString());
    
    this.dispose();
    
    Maincompany maincompany = new Maincompany();
    
    }
     
    for(Departmentmanager departmentmanager : dataofdepartmentmanager)
    
    {
    
    if(firstname.getText().equals(departmentmanager.Getfirstname()) && lastname.getText().equals(departmentmanager.Getlastname()))
    
    {
    
    if((currentyear-departmentmanager.Getyearofrecruitment())%3==0 && 3>=departmentmanager.Getnumberofchildren())
    
    {
        
    salary3 = minimumwage + (childbenefit*departmentmanager.Getnumberofchildren()) + preserviceallowance +bonusmanager ;
    
    }

    if(!departmentmanager.Getlevelofeducation().equals("Secondary education") && (currentyear-departmentmanager.Getyearofrecruitment())%3==0 && 3>=departmentmanager.Getnumberofchildren())
        
    {
    
    salary3 = minimumwage + (childbenefit*departmentmanager.Getnumberofchildren()) + studyallowance  + preserviceallowance +bonusmanager ;
    
    }

    if((currentyear-departmentmanager.Getyearofrecruitment())%3!=0 && 3>=departmentmanager.Getnumberofchildren())

    {
    
    salary3 = minimumwage + (childbenefit*departmentmanager.Getnumberofchildren()) +bonusmanager;   
    
    }

    if(!departmentmanager.Getlevelofeducation().equals("Secondary education") && (currentyear-departmentmanager.Getyearofrecruitment())%3!=0 && 3>=departmentmanager.Getnumberofchildren())  
        
    {
    
    salary3 = minimumwage + (childbenefit*departmentmanager.Getnumberofchildren()) + studyallowance +bonusmanager ;
        
    }
    
    if((currentyear-departmentmanager.Getyearofrecruitment())%3==0 && 3<departmentmanager.Getnumberofchildren())
    
    {
        
    salary3 = minimumwage + (childbenefit*3) + preserviceallowance +bonusmanager ;
    
    }

    if(!departmentmanager.Getlevelofeducation().equals("Secondary education") && (currentyear-departmentmanager.Getyearofrecruitment())%3==0 && 3<departmentmanager.Getnumberofchildren())
        
    {
    
    salary3 = minimumwage + (childbenefit*3) + studyallowance  + preserviceallowance +bonusmanager ;
    
    }

    if((currentyear-departmentmanager.Getyearofrecruitment())%3!=0 && 3<departmentmanager.Getnumberofchildren())

    {
    
    salary3 = minimumwage + (childbenefit*3) +bonusmanager;   
    
    }

    if(!departmentmanager.Getlevelofeducation().equals("Secondary education") && (currentyear-departmentmanager.Getyearofrecruitment())%3!=0 && 3<departmentmanager.Getnumberofchildren())  
        
    {
    
    salary3 = minimumwage + (childbenefit*3) + studyallowance +bonusmanager ;
        
    }
    
    }   
         
    } 
    
    if(salary3==0.0)
        
    {
          
    totalsalaryfordepartmentmanagers.remove(salary3);
    
    }

    else
        
    {
       
    totalsalaryfordepartmentmanagers.add(salary3);  
      
    JOptionPane.showMessageDialog(this, "Total salary of the specific employee is : " + salary3,"Success",JOptionPane.INFORMATION_MESSAGE);
    
    System.out.println("\n" + totalsalaryfordepartmentmanagers.toString());
    
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
