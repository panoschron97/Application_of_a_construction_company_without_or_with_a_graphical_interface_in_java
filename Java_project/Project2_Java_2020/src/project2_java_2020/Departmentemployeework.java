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
public class Departmentemployeework extends Companydata implements Serializable // κλάση με τα στοιχεία του κάθε εργαζόμενου σε κάποιο τμήμα και με κάποιο έργο όπου ασχολείται μαζί με την ημερομηνία αρχής και λήξης σε αυτό.

{
    
public Departmentemployeework(String firstname , String lastname , Date birthdate , String familysituation , int numberofchildren , int yearofrecruitment , String speciality , String levelofeducation , String nameofdepartment , String nameofwork , Date startdate , Date expirationdate)
        
{
    
this.firstname=firstname;
this.lastname=lastname;
this.birthdate=birthdate;
this.familysituation=familysituation;
this.numberofchildren=numberofchildren;
this.yearofrecruitment=yearofrecruitment;
this.speciality=speciality;
this.levelofeducation=levelofeducation; 
this.nameofdepartment = nameofdepartment;
this.nameofwork = nameofwork;
this.startdate = startdate;
this.expirationdate = expirationdate;
    
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

public String Getnameofdepartment()
        
{

return nameofdepartment;    
    
}

public String Getnameofwork()
        
{

return nameofwork;

}

public Date Getstartdate()
        
{

return startdate;

}

public Date Getexpirationdate()
        
{

return expirationdate;

}

@Override
public String toString()
        
{

return firstname + "," + lastname + "," + birthdate + "," + familysituation + "," + numberofchildren + "," + yearofrecruitment + "," + speciality + "," + levelofeducation + "," + nameofdepartment + "," + nameofwork + "," + startdate + "," + expirationdate;

}         
    
}
