/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_java_2020;

import java.util.Date;

/**
 *
 * @author panos
 */
public class Employee extends Companydata // κλάση με τα στοιχεία των εργαζομένων οι οποίοι δεν έχουν ενταχθεί ακόμα σε κάποιο τμήμα.

{

public Employee(String firstname , String lastname , Date birthdate , String familysituation , int numberofchildren , int yearofrecruitment , String speciality , int levelofeducation)
        
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

public int Getlevelofeducation()
   
{

return levelofeducation;    

}

@Override
public String toString()
        
{

return "\nFirstname : " + firstname + "\nLastname : " + lastname + "\nBirth date : " + birthdate + "\nFamily situation : " + familysituation + "\nNumber of children : " + numberofchildren + "\nYear of recruitment : " + yearofrecruitment + "\nSpeciality : " + speciality + "\nLevel of education : " + levelofeducation;

}
    
}
