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
public abstract class Companydata implements Serializable // abstract κλάση για να μπορούν οι άλλες κλάσεις να κληρωνομούν τα απαραίτητα στοιχεία που χρειάζονται.

{
    
protected String firstname;
protected String lastname;
protected Date birthdate;
protected String familysituation;
protected int numberofchildren;
protected int yearofrecruitment;
protected String speciality;
protected String levelofeducation;
protected String nameofdepartment;
protected Date dateofwithdrawal;   
protected String shortdescription;
protected String nameofwork;
protected double grossrevenueofcompany;
protected double  costsforlogisticalinfrastructure;
protected double costsforotheroperatingexpenses;   
protected Date startdate;
protected Date expirationdate;       
    
}
