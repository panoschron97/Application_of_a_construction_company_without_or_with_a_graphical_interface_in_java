/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_java_2020;

/**
 *
 * @author panos
 */
public class Department extends Companydata // κλάση με τα στοιχεία του κάθε τμήματος , όνομα , περιγραφή.

{
    
 public Department(String nameofdepartment , String shortdescription)
 
 {
 
 this.nameofdepartment=nameofdepartment;
 this.shortdescription=shortdescription;
     
 } 
 
 public String Getnameofdepartment()
 
 {
 
 return nameofdepartment;
 
 }
 
 @Override
 public String toString()
         
 {
 
 return "\nName of department : " + nameofdepartment + "\nShort description : " + shortdescription;
 
 }
    
}
