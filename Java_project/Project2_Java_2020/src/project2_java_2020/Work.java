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
public class Work extends Companydata implements Serializable // κλάση με τα στοιχεία κάθε έργου.

{
    
public Work(String nameofwork , String shortdescription , double grossrevenueofcompany , double costsforlogisticalinfrastructure , double costsforotheroperatingexpenses)
         
 {
 
 this.nameofwork = nameofwork;
 this.shortdescription = shortdescription;
 this.grossrevenueofcompany = grossrevenueofcompany;
 this.costsforlogisticalinfrastructure = costsforlogisticalinfrastructure;
 this.costsforotheroperatingexpenses = costsforotheroperatingexpenses;
 
 }
 
 public String Getnameofwork()
  
 {
 
 return nameofwork;
 
 }
 
 public String Getshortdescription()
 
 {
 
 return shortdescription;
 
 }
 
 public Double Getgrossrevenueofcompany()
  
 {
 
 return grossrevenueofcompany;
 
 }
 
 public Double Getcostsforlogisticalinfrastructure()
  
 {
 
 return costsforlogisticalinfrastructure;
 
 }
 
 public Double Getcostsforotheroperatingexpenses()
  
 {
 
 return costsforotheroperatingexpenses;
 
 }
 
 @Override
 public String toString()

 {
 
 return nameofwork + "," + shortdescription + "," + grossrevenueofcompany + "," + costsforlogisticalinfrastructure + "," + costsforotheroperatingexpenses;
 
 }   
    
}
