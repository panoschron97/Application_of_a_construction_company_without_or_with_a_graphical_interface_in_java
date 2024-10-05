/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2_java_2020;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author panos
 */
public class Employee extends Companydata implements Serializable // κλάση με τα στοιχεία του κάθε εργαζόμενου που δεν βρίσκεται σε κάποιο τμήμα.

{
    
 public Employee(String firstname , String lastname , Date birthdate , String familysituation , int numberofchildren , int yearofrecruitment , String speciality , String levelofeducation)
        
{
    
this.firstname=firstname;
this.lastname=lastname;
this.birthdate=birthdate;
this.familysituation=familysituation;
this.numberofchildren=numberofchildren;
this.yearofrecruitment=yearofrecruitment;
this.speciality=speciality;
this.levelofeducation=levelofeducation;  
    
}

public String Getfirstname()
        
{

return firstname;    
    
}

public String Getlastname()
        
{

return lastname;

}

public Date Getbirthdate()
 
{

return birthdate;    

}

public String Getfamiliysituation()
  
{

return familysituation;

}

public int Getnumberofchildren()
        
{

return numberofchildren;

}        

public int Getyearofrecruitment()
        
{

return yearofrecruitment;
    
}

public String Getspeciality()
     
{

return speciality;

}

public String Getlevelofeducation()
   
{

return levelofeducation;    

}

@Override
public String toString()
        
{

return firstname + "," + lastname + "," + birthdate + "," + familysituation + "," + numberofchildren + "," + yearofrecruitment + "," + speciality + "," + levelofeducation;

}

}
