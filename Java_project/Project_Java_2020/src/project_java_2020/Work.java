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
public class Work extends Companydata // κλάση με τα στοιχεία του κάθε έργου δηλαδή όνομα , περιγραφή και τα οικονομικά που αφορούν το έργο.

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
 
 return "\nName of work : " + nameofwork + "\nShort description : " + shortdescription + "\nGross revenue of company : " + grossrevenueofcompany + "\nCosts for logistical infrastructure : " + costsforlogisticalinfrastructure + "\nCosts for other operating expenses : " + costsforotheroperatingexpenses;
 
 }
    
}
