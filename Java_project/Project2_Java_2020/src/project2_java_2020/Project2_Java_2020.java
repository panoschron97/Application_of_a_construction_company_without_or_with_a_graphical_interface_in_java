
//Χρονόπουλος Παναγιώτης 321/2015222



package project2_java_2020;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import static project2_java_2020.Entrydepartment.dataofdepartment;
import static project2_java_2020.Entrydepartmentemployee.dataofdepartmentemployee;
import static project2_java_2020.Entrydepartmentemployeework.dataofdepartmentemployeework;
import static project2_java_2020.Entrydepartmentmanager.dataofdepartmentmanager;
import static project2_java_2020.Entryemployee.dataofemployee;
import static project2_java_2020.Entrywork.dataofwork;

/**
 *
 * @author panos
 */
public class Project2_Java_2020 

{ 
    
    /**
     * @param args the command line arguments
     */
    
    static SimpleDateFormat format1 = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzzz yyyy", Locale.ENGLISH);
    static SimpleDateFormat format2 = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzzz yyyy", Locale.ENGLISH);
    static SimpleDateFormat format3 = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzzz yyyy", Locale.ENGLISH);
    static SimpleDateFormat format4 = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzzz yyyy", Locale.ENGLISH);
    static SimpleDateFormat format5 = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzzz yyyy", Locale.ENGLISH);
    static SimpleDateFormat format6 = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzzz yyyy", Locale.ENGLISH);
    static SimpleDateFormat format7 = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzzz yyyy", Locale.ENGLISH);
    static SimpleDateFormat format8 = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzzz yyyy", Locale.ENGLISH);
    
    public static void main(String[] args) throws FileNotFoundException, ParseException, IOException  // η main κλάση μας. 
    
    {
        
    FileWriter file1 = new FileWriter("employees.txt" , true);
    FileWriter file2 = new FileWriter("departmentemployees.txt" , true);                               // Δημιουργία αρχείων της εταιρεία για την κράτηση των στοιχείων όταν ξαναανοίγουμε την εφαρμογή.
    FileWriter file3 = new FileWriter("departmentmanagers.txt" , true);
    FileWriter file4 = new FileWriter("departmentemployeesworks.txt" , true);
    FileWriter file5 = new FileWriter("departments.txt" , true);
    FileWriter file6 = new FileWriter("works.txt" , true);
        
    String firstname , lastname , familysituation , speciality , levelofeducation , nameofdepartment , nameofwork , shortdescription;
    int numberofchildren , yearofrecruitment;
    Date birthdate1 , birthdate2 , birthdate3 , birthdate4 , datewithdrawal , startdate , expirationdate ;
    double grossrevenueofcompany , costsforlogisticalinfrastructure , costsforotheroperatingexpenses;
    
    BufferedReader in1 = new BufferedReader(new FileReader("employees.txt"), 16*1024);
    Scanner read1 = new Scanner(in1);
    read1.useDelimiter(",");
    while(read1.hasNext())
    {
       
     firstname = read1.next();
     lastname = read1.next();
     birthdate1 = format1.parse(read1.next());
     familysituation = read1.next();
     numberofchildren = Integer.parseInt(read1.next());
     yearofrecruitment = Integer.parseInt(read1.next());
     speciality = read1.next();
     levelofeducation=read1.next();
     
     Employee employee = new Employee(firstname , lastname , birthdate1 , familysituation , numberofchildren , yearofrecruitment , speciality , levelofeducation);
     
     dataofemployee.add(employee);
        
        
        
    }
    read1.close();
    
    BufferedReader in2 = new BufferedReader(new FileReader("departmentemployees.txt"), 16*1024);
    Scanner read2 = new Scanner(in2);
    read2.useDelimiter(",");

    while(read2.hasNext())
    {
       
     firstname = read2.next();
     lastname = read2.next();
     birthdate2 = format2.parse(read2.next());
     familysituation = read2.next();
     numberofchildren = Integer.parseInt(read2.next());
     yearofrecruitment = Integer.parseInt(read2.next());
     speciality = read2.next();
     levelofeducation=read2.next();
     nameofdepartment = read2.next();
     
     Departmentemployee departmentemployee = new Departmentemployee(firstname , lastname , birthdate2 , familysituation , numberofchildren , yearofrecruitment , speciality , levelofeducation , nameofdepartment);
     
     dataofdepartmentemployee.add(departmentemployee);
     
    }
    read2.close();

    BufferedReader in3 = new BufferedReader(new FileReader("departmentmanagers.txt"), 16*1024);
    Scanner read3 = new Scanner(in3);
    read3.useDelimiter(",");

    while(read3.hasNext())
    {
       
     firstname = read3.next();
     lastname = read3.next();
     birthdate3 = format3.parse(read3.next());
     familysituation = read3.next();
     numberofchildren = Integer.parseInt(read3.next());
     yearofrecruitment = Integer.parseInt(read3.next());
     speciality = read3.next();
     levelofeducation=read3.next();
     nameofdepartment = read3.next();
     datewithdrawal = format4.parse(read3.next());
     
     Departmentmanager departmentmanager = new Departmentmanager(firstname , lastname , birthdate3 , familysituation , numberofchildren , yearofrecruitment , speciality , levelofeducation , nameofdepartment , datewithdrawal );
     
     dataofdepartmentmanager.add(departmentmanager);
     
    }
    read3.close();
    
    BufferedReader in4 = new BufferedReader(new FileReader("departmentemployeesworks.txt"), 16*1024);
    Scanner read4 = new Scanner(in4);
    read4.useDelimiter(",");

    while(read4.hasNext())
    {
       
     firstname = read4.next();
     lastname = read4.next();
     birthdate4 = format5.parse(read4.next());
     familysituation = read4.next();
     numberofchildren = Integer.parseInt(read4.next());
     yearofrecruitment = Integer.parseInt(read4.next());
     speciality = read4.next();
     levelofeducation=read4.next();
     nameofdepartment = read4.next();
     nameofwork = read4.next();
     startdate = format6.parse(read4.next());
     expirationdate = format7.parse(read4.next());
     
     Departmentemployeework departmentemployeework = new Departmentemployeework(firstname , lastname , birthdate4 , familysituation , numberofchildren , yearofrecruitment , speciality , levelofeducation , nameofdepartment , nameofwork , startdate , expirationdate );
     
     dataofdepartmentemployeework.add(departmentemployeework);
     
    }
    read4.close();
    
    BufferedReader in5 = new BufferedReader(new FileReader("departments.txt"), 16*1024);
    Scanner read5 = new Scanner(in5);
    read5.useDelimiter(",");

    while(read5.hasNext())
    {
       
     firstname = read5.next();
     shortdescription = read5.next();
     
     Department department = new Department(firstname , shortdescription);
     
     dataofdepartment.add(department);
     
    }
    read5.close();
    
    BufferedReader in6 = new BufferedReader(new FileReader("works.txt"), 16*1024);
    Scanner read6 = new Scanner(in6);
    read6.useDelimiter(",");

    while(read6.hasNext())
    {
       
     firstname = read6.next();
     shortdescription = read6.next();
     grossrevenueofcompany = Double.parseDouble(read6.next());
     costsforlogisticalinfrastructure = Double.parseDouble(read6.next());
     costsforotheroperatingexpenses = Double.parseDouble(read6.next());
     
     Work work = new Work(firstname , shortdescription , grossrevenueofcompany , costsforlogisticalinfrastructure , costsforotheroperatingexpenses);
     
     dataofwork.add(work);
     
    }
    read6.close();
           
       Maincompany maincompany = new Maincompany();
        
    }
    
}
