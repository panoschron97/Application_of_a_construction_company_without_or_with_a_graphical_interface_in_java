/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2_java_2020;

import java.io.Serializable;

/**
 *
 * @author panos
 */
public class Department extends Companydata implements Serializable // κλάση με τα στοιχεία κάθε τμήματος.

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
 
 return nameofdepartment + "," + shortdescription;
 
 }    
  
}
