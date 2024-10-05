
//Χρονόπουλος Παναγιώτης 321/2015222



package project_java_2020;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author panos
 */
public class Project_Java_2020 

{

    /**
     * @param args the command line arguments
     */
    
    static Scanner inputdata = new Scanner(System.in);
    static ArrayList<Employee> dataofemployee = new ArrayList<Employee>();
    static ArrayList<Department> dataofdepartment = new ArrayList<Department>();
    static ArrayList<Work> dataofwork = new ArrayList<Work>();
    static ArrayList<Departmentmanager> dataofdepartmentmanager = new ArrayList<Departmentmanager>();
    static ArrayList<Departmentemployee> dataofdepartmentemployee = new ArrayList<Departmentemployee>();
    static ArrayList<Double> totalsalaryfordepartmentemployees = new ArrayList<Double>();
    static ArrayList<Double> totalsalaryfordepartmentmanagers = new ArrayList<Double>();    //Όλα τα arraylist που δημιουργήθηκαν για κάθε ξεχωριστή λειτουργία με την κατάλληλη ονομασία.
    static ArrayList<Double> totalsalaryfordepartmentemployeeswithwork  = new ArrayList<Double>();
    static ArrayList<Departmentemployeework> dataofdepartmentemployeework = new ArrayList<Departmentemployeework>();
    static SimpleDateFormat dateofemployeesbirth = new SimpleDateFormat("dd/MM/yyyy");
    static SimpleDateFormat dateofappointmentofadepartmentmanager = new SimpleDateFormat("dd/MM/yyyy");
    static SimpleDateFormat startdateofworktoanemployee = new SimpleDateFormat("dd/MM/yyyy");
    static SimpleDateFormat expirationdateofworktoanemployee = new SimpleDateFormat("dd/MM/yyyy");
    
    public static void main(String[] args) throws ParseException // η main κλάση μας η οποία εμπεριέχει το menu στην κονσόλα όταν τρέχουμε το πρόγραμμα όπου αναφέρει τα κουμπιά και το τι λειτουργία κάνει το καθένα από αυτά δίπλα πατώντας τα ένα ένα.
    
    {
        
        // TODO code application logic here
        
        boolean condition = true;
        
        while(condition)
        
        {
        
        System.out.println("\nAn application in a graphical environment that will manage the finances of a company , its departments , the employees who belong to these departments with different roles each as well as the projects that they undertake to carry out. \n");
        System.out.println("01 - Creation of an employee. ");
        System.out.println("02 - Creation of a department. ");
        System.out.println("03 - Appointment of a department manager. ");
        System.out.println("04 - Assignment of an employee to a department of the company. ");
        System.out.println("05 - Creation of a project undertaken by the company to carry out. ");
        System.out.println("06 - Assignment of an employee who belongs to a part of the company in a specific project. ");
        System.out.println("07 - Information on marital status and number of children and specialty and level of education for employees. ");
        System.out.println("08 - Information on marital status and number of children and specialty and level of education for department employees. ");
        System.out.println("09 - Information on marital status and number of children and specialty and level of education for department employees with work. ");
        System.out.println("10 - Information on marital status and number of children and specialty and level of education for department managers. ");
        System.out.println("11 - Relocation of an employee from one department to another. ");
        System.out.println("12 - Assignment to another employee the management of a department. ");
        System.out.println("13 - Calculation of an employee's monthly salary. ");
        System.out.println("14 - Calculation of an employee's monthly salary who has a work. ");
        System.out.println("15 - Calculation of a department manager. ");
        System.out.println("16 - Calculation of payroll costs for a separate for the time period. ");
        System.out.println("17 - Calculation of payroll costs for a project. ");
        System.out.println("18 - Calculation of net revenue for a project taking into account gross project revenue, miscellaneous costs and payroll costs. ");
        System.out.println("19 - Show all the elements of the project that provides the most net revenue to the company. ");
        System.out.println("20 - Create objects. ");
        System.out.println("21 - Exit application. ");
        
        System.out.print("\nPlease enter an option(between 1-21) : ");
        int choice = inputdata.nextInt();
        
        switch(choice)
         
        {
        
        case 1:
        creationofanemployee();        
        break;
        case 2:
        creationofdepartment();
        break;
        case 3:
        appointmentofadepartmentmanager();
        break;
        case 4:
        assignmentofanemployeetoadepartmentofthecompany();
        break;
        case 5:
        creationofaprojectundertakenbythecompanytocarryout();
        break;
        case 6:
        assignmentofanemployeewhobelongstoapartofthecompanyinaspecificproject();    
        break;    
        case 7:
        informationonmaritalstatusandnumberofchildrenandspecialtyandlevelofeducationforemployees();    
        break;
        case 8:
        informationonmaritalstatusandnumberofchildrenandspecialtyandlevelofeducationfordepartmentemployees();      
        break;
        case 9:
        Informationonmaritalstatusandnumberofchildrenandspecialtyandlevelofeducationfordepartmentemployeeswithwork();  
        break;
        case 10:
        informationonmaritalstatusandnumberofchildrenandspecialtyandlevelofeducationfordepartmentmanagers();       
        break;
        case 11:
        relocationofanemployeefromonedepartmenttoanother();
        break;
        case 12:
        assignmenttoanotheremployeethemanagementofadepartment();
        break;
        case 13:
        calculationofanemployeesmonthlysalary();
        break;
        case 14:
        calculationofanemployeesmonthlysalarywhohasawork();
        break;
        case 15:
        calculationofadepartmentmanager();
        break;
        case 16:
        calculationofpayrollcostsforaseparateforthetimeperiod();
        break;
        case 17:
        calculationofpayrollcostsforaproject();
        break;
        case 18:
        calculationofnetrevenueforaprojecttakingintoaccountgrossprojectrevenuemiscellaneouscostsandpayrollcosts();
        break;
        case 19:
        showalltheelementsoftheprojectthatprovidesthemostnetrevenuetothecompany();
        break;
        case 20:                                                        // νούμερο 20 όπου δημιουργεί τα αντικείμενα που μας ζητώνται να δημιουργήσουμε αφού ολοκληρώσουμε την φάση 1.
        Department object1 = new Department("Karlovasi" , "Samos");
        Department object2 = new Department("Kokkari" , "Samos");
        Department object3 = new Department("Pythagoreio" , "Samos");
        Work object4 = new Work("Bigfish" , "Sea" , 900000.0 , 100000.0 , 200000.0);
        Work object5 = new Work("Batman" , "Antihero" , 1000000.0 , 250000.0 , 150000.0);
        Employee object6 = new Employee("Panos" , "Chronopoulos" , dateofemployeesbirth.parse("27/03/1997")  , "Unmarried" , 0 , 2019 , "Tester" , 3  );
        Employee object7 = new Employee("Alekos" , "Pappas" , dateofemployeesbirth.parse("24/07/1992")  , "Unmarried" , 0 , 2016 , "Tester" , 1 );
        Departmentemployee object8 = new Departmentemployee("Kwstas" , "Zografos" , dateofemployeesbirth.parse("27/03/1995")  , "Unmarried" , 0 , 2017 , "Tester" , 4 , "Karlovasi"  );
        Departmentmanager object9 = new Departmentmanager("Giwrgos" , "Magkos" , dateofemployeesbirth.parse("10/05/1990")  , "Married" , 2 , 2017 , "Tester" , 3 , "Kokkari" , dateofappointmentofadepartmentmanager.parse("05/12/2020"));
        Departmentemployeework object10 = new Departmentemployeework("Nikos" , "Stergiou" , dateofemployeesbirth.parse("15/03/1985")  , "Married" , 3 , 2017 , "Tester" , 4 , "Pythagoreio" , "Batman" , startdateofworktoanemployee.parse("05/12/2020") , expirationdateofworktoanemployee.parse("15/01/2021"));
        dataofdepartment.add(object1);
        dataofdepartment.add(object2);
        dataofdepartment.add(object3);
        dataofwork.add(object4);
        dataofwork.add(object5);
        dataofemployee.add(object6);
        dataofemployee.add(object7);
        dataofdepartmentemployee.add(object8);
        dataofdepartmentmanager.add(object9);
        dataofdepartmentemployeework.add(object10);
        System.out.println(object1.toString());
        System.out.println(object2.toString());
        System.out.println(object3.toString());
        System.out.println(object4.toString());
        System.out.println(object5.toString());
        System.out.println(object6.toString());
        System.out.println(object7.toString());
        System.out.println(object8.toString());
        System.out.println(object9.toString());
        System.out.println(object10.toString());
        break;
        case 21:
        condition = false;
        break;
        
        default : System.out.println("\nInvalid number , please try again. ");
  
        }
        
        }
        System.out.println();
        
    }

    private static void creationofanemployee() // συνάρτηση για την δημιουργία εργαζομένου που δεν βρίσκεται σε κάποιο τμήμα.
    
    {
        
    String firstname;
    String lastname;
    Date birthdate = new Date();
    String familysituation;
    int numberofchildren;
    int yearofrecruitment;
    String speciality;
    int levelofeducation;
    boolean validdate = true;
    
    System.out.print("\nEnter the first name : ");
    firstname = inputdata.next();
    
    System.out.print("\nEnter the last name : ");
    lastname = inputdata.next();
   
    do 
        
    {
        
    System.out.print("\nEnter the date of birth(dd/MM/yyyy) : ");
    
    try   
        
    {
        
    birthdate = dateofemployeesbirth.parse(inputdata.next());
    
    validdate = false;
				
     } catch (ParseException e) 
     
     {
				
     System.out.println("\nInvalid date. ");
     
     }      
      
    }while(validdate);
    
    System.out.print("\nEnter the family situation(married/unmarried) : ");
    familysituation = inputdata.next();
    
    System.out.print("\nEnter the number of children : ");
    numberofchildren = inputdata.nextInt();
    
    System.out.print("\nEnter the year of recruitment : ");
    yearofrecruitment = inputdata.nextInt();
    
    System.out.print("\nEnter the speciality : ");
    speciality = inputdata.next();
    
    System.out.print("\nEnter the level of education(secondary education->1/university education->2/postgraduate diploma->3/doctoral degree->4) : ");
    levelofeducation = inputdata.nextInt();
    
    Employee employee = new Employee(firstname , lastname , birthdate , familysituation , numberofchildren , yearofrecruitment , speciality , levelofeducation);
    
    dataofemployee.add(employee);
    
    System.out.println("\nEmployee created successfully. \n");
    
    System.out.println(dataofemployee.toString());
    
 }

    private static void creationofdepartment() // δημιουργία τμήματος.
    
    {
        
    String nameofdepartment;
    String shortdescription;
    
    System.out.print("\nEnter the name of department : ");
    nameofdepartment = inputdata.next();
    
    System.out.print("\nEnter a short description of the department : ");
    shortdescription = inputdata.next();
    
    Department department = new Department(nameofdepartment , shortdescription);
    
    dataofdepartment.add(department);
    
    System.out.println("\nDepartment created successfully. \n");
    
    System.out.println(dataofdepartment.toString());
        
    }

    private static void appointmentofadepartmentmanager() // συνάρτηση για την ανάθεση εργαζομένου ως διευθυντής σε ένα τμήμα.(Σημείωση πρέπει να υπάρχει ο εργαζόμενος και το τμήμα.)
    
    {
        
    String firstname;
    String lastname;
    Date birthdate = new Date();
    String familysituation;
    int numberofchildren;
    int yearofrecruitment;
    String speciality;
    int levelofeducation;
    String nameofdepartment;
    Date dateofwithdrawal = new Date();
    boolean validdate = true;
    
    System.out.print("\nEnter the first name : ");
    firstname = inputdata.next();
    
    System.out.print("\nEnter the last name : ");
    lastname = inputdata.next();
    
      do 
        
    {
        
    System.out.print("\nEnter the date of birth(dd/MM/yyyy) : ");
    
    try   
        
    {
        
    birthdate = dateofemployeesbirth.parse(inputdata.next());
    
    validdate = false;
				
     } catch (ParseException e) 
     
     {
				
     System.out.println("\nInvalid date. ");
     
     }      
      
    }while(validdate);
    
    System.out.print("\nEnter the family situation(married/unmarried) : ");
    familysituation = inputdata.next();
    
    System.out.print("\nEnter the number of children : ");
    numberofchildren = inputdata.nextInt();
    
    System.out.print("\nEnter the year of recruitment : ");
    yearofrecruitment = inputdata.nextInt();
    
    System.out.print("\nEnter the speciality : ");
    speciality = inputdata.next();
    
    System.out.print("\nEnter the level of education(secondary education->1/university education->2/postgraduate diploma->3/doctoral degree->4) : ");
    levelofeducation = inputdata.nextInt();
    
    System.out.print("\nEnter the name of department that the employee would be the manager : ");
    nameofdepartment = inputdata.next();
    
     do 
        
    {
        
    System.out.print("\nEnter the date of withdrawal(dd/MM/yyyy) : ");
    
    try   
        
    {
        
    dateofwithdrawal = dateofappointmentofadepartmentmanager.parse(inputdata.next());
    
    validdate = false;
				
     } catch (ParseException e) 
     
     {
				
     System.out.println("\nInvalid date. ");
     
     }      
      
    }while(validdate);
    
    
    
    for(Employee employee : new ArrayList<Employee>(dataofemployee))
        
    {
    
    for(Department department : dataofdepartment)
    
    {
    
    if(firstname.equals(employee.Getfirstname()) && lastname.equals(employee.Getlastname()) && birthdate.equals(employee.Getbirthdate()) && familysituation.equals(employee.Getfamiliysituation()) && numberofchildren==employee.Getnumberofchildren() && yearofrecruitment==employee.Getyearofrecruitment() && speciality.equals(employee.Getspeciality()) && levelofeducation==employee.Getlevelofeducation() && nameofdepartment.equals(department.Getnameofdepartment()))
     
    {
        
    dataofemployee.remove(employee);
    
    Departmentmanager departmentmanager = new Departmentmanager(firstname , lastname , birthdate ,  familysituation , numberofchildren , yearofrecruitment , speciality , levelofeducation , nameofdepartment , dateofwithdrawal);
    
    dataofdepartmentmanager.add(departmentmanager);
    
    System.out.println("\nDepartment manager created successfully. \n");
    
    System.out.println(dataofdepartmentmanager.toString());
        
    }
    
    }    
      
    }
                
    }

    private static void assignmentofanemployeetoadepartmentofthecompany() // συνάρτηση για την ανάθεση εργαζομένου σε ένα τμήμα(εργαζόμενος τμήματος δηλαδή) και πρέπει να υπάρχει ο εργαζόμενος και το τμήμα.
    
    {
        
    String firstname;
    String lastname;
    Date birthdate = new Date();
    String familysituation;
    int numberofchildren;
    int yearofrecruitment;
    String speciality;
    int levelofeducation;
    String nameofdepartment;
    boolean validdate = true;
    
    System.out.print("\nEnter the first name : ");
    firstname = inputdata.next();
    
    System.out.print("\nEnter the last name : ");
    lastname = inputdata.next();
   
    do 
        
    {
        
    System.out.print("\nEnter the date of birth(dd/MM/yyyy) : ");
    
    try   
        
    {
        
    birthdate = dateofemployeesbirth.parse(inputdata.next());
    
    validdate = false;
				
     } catch (ParseException e) 
     
     {
				
     System.out.println("\nInvalid date. ");
     
     }      
      
    }while(validdate);
    
    System.out.print("\nEnter the family situation(married/unmarried) : ");
    familysituation = inputdata.next();
    
    System.out.print("\nEnter the number of children : ");
    numberofchildren = inputdata.nextInt();
    
    System.out.print("\nEnter the year of recruitment : ");
    yearofrecruitment = inputdata.nextInt();
    
    System.out.print("\nEnter the speciality : ");
    speciality = inputdata.next();
    
    System.out.print("\nEnter the level of education(secondary education->1/university education->2/postgraduate diploma->3/doctoral degree->4) : ");
    levelofeducation = inputdata.nextInt();
    
    System.out.print("\nEnter the name of department that the employee will be working : ");
    nameofdepartment = inputdata.next();
    
    for(Employee employee : new ArrayList<Employee>(dataofemployee))
        
    {
    
    for(Department department : dataofdepartment)
        
    {
    
    if(firstname.equals(employee.Getfirstname()) && lastname.equals(employee.Getlastname()) && familysituation.equals(employee.Getfamiliysituation()) && numberofchildren==employee.Getnumberofchildren() && yearofrecruitment==employee.Getyearofrecruitment() && speciality.equals(employee.Getspeciality()) && levelofeducation==employee.Getlevelofeducation() && nameofdepartment.equals(department.Getnameofdepartment()))
        
    {
        
    dataofemployee.remove(employee);
    
    Departmentemployee departmentemployee = new Departmentemployee(firstname , lastname , birthdate ,  familysituation , numberofchildren , yearofrecruitment , speciality , levelofeducation , nameofdepartment);
    
    dataofdepartmentemployee.add(departmentemployee);
    
    System.out.println("\nEmployee added to the department successfully. \n");
    
    System.out.println(dataofdepartmentemployee.toString()); 

    }
    
    }
    
    }
    
    }  

    private static void creationofaprojectundertakenbythecompanytocarryout() // συνάρτηση για την δημιουργία ενός έργου.
    
    {
        
    String nameofwork;
    String shortdescription;
    double grossrevenueofcompany;
    double costsforlogisticalinfrastructure;
    double costsforotheroperatingexpenses;
    
    System.out.print("\nEnter the name of work : ");
    nameofwork = inputdata.next();
    
    System.out.print("\nEnter a short description of the work : ");
    shortdescription = inputdata.next();
    
    System.out.print("\nEnter the gross revenue of the company : ");
    grossrevenueofcompany = inputdata.nextDouble();
    
    System.out.print("\nEnter the costs for logistical in frastructure : ");
    costsforlogisticalinfrastructure = inputdata.nextDouble();
    
    System.out.print("\nEnter the costs for other operating expenses : ");
    costsforotheroperatingexpenses = inputdata.nextDouble();
    
    Work work = new Work(nameofwork , shortdescription , grossrevenueofcompany , costsforlogisticalinfrastructure , costsforotheroperatingexpenses);
    
    dataofwork.add(work);
    
    System.out.println("\nWork created successfully. \n");
    
    System.out.println(dataofwork.toString()); 
        
    }

    private static void assignmentofanemployeewhobelongstoapartofthecompanyinaspecificproject() // συνάρτηση για την ανάθεση ενός έργο σε έναν εργαζόμενο που βρίσκεται σε κάποιο τμήμα (Σημείωση πρέπει να υπάρχει ο εργαζόμενος , το τμήμα και το έργο.)
    
    {
        
    String firstname;
    String lastname;
    Date birthdate = new Date();
    String familysituation;
    int numberofchildren;
    int yearofrecruitment;
    String speciality;
    int levelofeducation;
    String nameofdepartment;
    String nameofwork;
    Date startdate = new Date();
    Date expirationdate = new Date();
    boolean validdate = true;
    
    System.out.print("\nEnter the first name : ");
    firstname = inputdata.next();
    
    System.out.print("\nEnter the last name : ");
    lastname = inputdata.next();
   
    do 
        
    {
        
    System.out.print("\nEnter the date of birth(dd/MM/yyyy) : ");
    
    try   
        
    {
        
    birthdate = dateofemployeesbirth.parse(inputdata.next());
    
    validdate = false;
				
     } catch (ParseException e) 
     
     {
				
     System.out.println("\nInvalid date. ");
     
     }      
      
    }while(validdate);
    
    System.out.print("\nEnter the family situation(married/unmarried) : ");
    familysituation = inputdata.next();
    
    System.out.print("\nEnter the number of children : ");
    numberofchildren = inputdata.nextInt();
    
    System.out.print("\nEnter the year of recruitment : ");
    yearofrecruitment = inputdata.nextInt();
    
    System.out.print("\nEnter the speciality : ");
    speciality = inputdata.next();
    
    System.out.print("\nEnter the level of education(secondary education->1/university education->2/postgraduate diploma->3/doctoral degree->4) : ");
    levelofeducation = inputdata.nextInt();
    
    System.out.print("\nEnter the name of department that the employee is working : ");
    nameofdepartment = inputdata.next();
    
    System.out.print("\nEnter the name of work that the department employee will be working : ");
    nameofwork = inputdata.next();
    
    do 
        
    {
        
    System.out.print("\nEnter the start date(dd/MM/yyyy) : ");
    
    try   
        
    {
        
    startdate = startdateofworktoanemployee.parse(inputdata.next());
    
    validdate = false;
				
     } catch (ParseException e) 
     
     {
				
     System.out.println("\nInvalid date. ");
     
     }      
      
    }while(validdate);
    
    do 
        
    {
        
    System.out.print("\nEnter the expiration date(dd/MM/yyyy) : ");
    
    try   
        
    {
        
    expirationdate = expirationdateofworktoanemployee.parse(inputdata.next());
    
    validdate = false;
				
     } catch (ParseException e) 
     
     {
				
     System.out.println("\nInvalid date. ");
     
     }      
      
    }while(validdate);
    
    for(Departmentemployee employee : new ArrayList<Departmentemployee>(dataofdepartmentemployee))
        
    {
        
    for(Department department : dataofdepartment)
        
    {
        
    for(Work work : dataofwork)
        
    {
    
    if(firstname.equals(employee.Getfirstname()) && lastname.equals(employee.Getlastname()) && birthdate.equals(employee.Getbirthdate()) && familysituation.equals(employee.Getfamiliysituation()) && numberofchildren==employee.Getnumberofchildren() && yearofrecruitment==employee.Getyearofrecruitment() && speciality.equals(employee.Getspeciality()) && levelofeducation==employee.Getlevelofeducation() && nameofdepartment.equals(department.Getnameofdepartment()) && nameofwork.equals(work.Getnameofwork()))
    
    {
        
    dataofdepartmentemployee.remove(employee);
    
    Departmentemployeework departmentemployeework = new Departmentemployeework(firstname , lastname , birthdate , familysituation , numberofchildren , yearofrecruitment , speciality , levelofeducation , nameofdepartment , nameofwork , startdate , expirationdate);
        
    dataofdepartmentemployeework.add(departmentemployeework);
    
    System.out.println("\nDepartment employee assigned the specific work successfully. \n");
    
    System.out.println(dataofdepartmentemployeework.toString()); 
    
    }
    
    }
      
    }  
    
    }    
        
    } 

    private static void informationonmaritalstatusandnumberofchildrenandspecialtyandlevelofeducationforemployees() // συνάρτηση για την ενημέρωση συγκεκριμένων στοιχείων με βάση το ερώτημα του πρότζεκτ του εργαζομένου που δεν βρίσκεται σε κάποιο τμήμα(Σημείωση πρέπει να υπάρχει εργαζόμενος.). 
    
    {
    
    String firstname;
    String lastname;
    Date birthdate = new Date();
    String familysituation;
    int numberofchildren;
    int yearofrecruitment;
    String speciality;
    int levelofeducation;
    boolean validdate = true;    
    
    System.out.print("\nEnter the first name : ");
    firstname = inputdata.next();
    
    System.out.print("\nEnter the last name : ");
    lastname = inputdata.next();
    
     do 
        
    {
        
    System.out.print("\nEnter the date of birth(dd/MM/yyyy) : ");
    
    try   
        
    {
        
    birthdate = dateofemployeesbirth.parse(inputdata.next());
    
    validdate = false;
				
     } catch (ParseException e) 
     
     {
				
     System.out.println("\nInvalid date. ");
     
     }      
      
     }while(validdate);
     
     System.out.print("\nEnter the year of recruitment : ");
    yearofrecruitment = inputdata.nextInt();
    
    for(Employee employee :  new ArrayList<Employee>(dataofemployee))
        
    {
    
    if(firstname.equals(employee.Getfirstname()) && lastname.equals(employee.Getlastname()) && birthdate.equals(employee.Getbirthdate()) && yearofrecruitment==employee.Getyearofrecruitment())
    
    {
    
    dataofemployee.remove(employee); 
    
    System.out.print("\nEnter the update family situation(married/unmarried) : ");
    familysituation = inputdata.next();
    
    System.out.print("\nEnter the update number of children : ");
    numberofchildren = inputdata.nextInt();
    
    System.out.print("\nEnter the update speciality : ");
    speciality = inputdata.next();
    
    System.out.print("\nEnter the update level of education(secondary education->1/university education->2/postgraduate diploma->3/doctoral degree->4) : ");
    levelofeducation = inputdata.nextInt();
    
    Employee updateemployee = new Employee(firstname , lastname , birthdate , familysituation , numberofchildren , yearofrecruitment , speciality , levelofeducation);
    
    dataofemployee.add(updateemployee);
    
    System.out.println("\nEmployee updated successfully. \n");
    
    System.out.println(dataofemployee.toString());
    
    }
     
    }
        
    }
    
     private static void informationonmaritalstatusandnumberofchildrenandspecialtyandlevelofeducationfordepartmentemployees() // συνάρτηση για την ενημέρωση συγκεκριμένων στοιχείων με βάση το ερώτημα του πρότζεκτ του εργαζομένου που βρίσκεται σε κάποιο τμήμα(Σημείωση πρέπει να υπάρχει εργαζόμενος και τμήμα.). 
     
    {
        
    String firstname;
    String lastname;
    Date birthdate = new Date();
    String familysituation;
    int numberofchildren;
    int yearofrecruitment;
    String speciality;
    int levelofeducation;
    String nameofdepartment;
    boolean validdate = true;
    
    System.out.print("\nEnter the first name : ");
    firstname = inputdata.next();
    
    System.out.print("\nEnter the last name : ");
    lastname = inputdata.next();
   
    do 
        
    {
        
    System.out.print("\nEnter the date of birth(dd/MM/yyyy) : ");
    
    try   
        
    {
        
    birthdate = dateofemployeesbirth.parse(inputdata.next());
    
    validdate = false;
				
     } catch (ParseException e) 
     
     {
				
     System.out.println("\nInvalid date. ");
     
     }      
      
    }while(validdate);
    
    System.out.print("\nEnter the name of department that the employee is working : ");
    nameofdepartment = inputdata.next();
    
    for(Departmentemployee employee : new ArrayList<Departmentemployee>(dataofdepartmentemployee))
        
    {
    
    if(firstname.equals(employee.Getfirstname()) && lastname.equals(employee.Getlastname()) && birthdate.equals(employee.Getbirthdate()) && nameofdepartment.equals(employee.Getnameofdepartment()))
        
    {
        
    dataofdepartmentemployee.remove(employee);
    
    System.out.print("\nEnter the update family situation(married/unmarried) : ");
    familysituation = inputdata.next();
    
    System.out.print("\nEnter the update number of children : ");
    numberofchildren = inputdata.nextInt();
    
    System.out.print("\nEnter the update year of recruitment : ");
    yearofrecruitment = inputdata.nextInt();
    
    System.out.print("\nEnter the update speciality : ");
    speciality = inputdata.next();
    
    System.out.print("\nEnter the update level of education(secondary education->1/university education->2/postgraduate diploma->3/doctoral degree->4) : ");
    levelofeducation = inputdata.nextInt();
    
    Departmentemployee updatedepartmentemployee = new Departmentemployee(firstname , lastname , birthdate ,  familysituation , numberofchildren , yearofrecruitment , speciality , levelofeducation , nameofdepartment);
    
    dataofdepartmentemployee.add(updatedepartmentemployee);
    
    System.out.println("\nDepartment employee updated successfully. \n");
    
    System.out.println(dataofdepartmentemployee.toString()); 

    }
    
    }    
        
    }
     
     private static void Informationonmaritalstatusandnumberofchildrenandspecialtyandlevelofeducationfordepartmentemployeeswithwork() // συνάρτηση για την ενημέρωση συγκεκριμένων στοιχείων με βάση το ερώτημα του πρότζεκτ του εργαζομένου που βρίσκεται σε κάποιο τμήμα και ασχολείται και με κάποιο έργο(Σημείωση πρέπει να υπάρχει εργαζόμενος , τμήμα και έργο.). 
    
    {
        
    String firstname;
    String lastname;
    Date birthdate = new Date();
    String familysituation;
    int numberofchildren;
    int yearofrecruitment;
    String speciality;
    int levelofeducation;
    String nameofdepartment;
    String nameofwork;
    Date startdate = new Date();
    Date expirationdate = new Date();
    boolean validdate = true;
    
    System.out.print("\nEnter the first name : ");
    firstname = inputdata.next();
    
    System.out.print("\nEnter the last name : ");
    lastname = inputdata.next();
   
    do 
        
    {
        
    System.out.print("\nEnter the date of birth(dd/MM/yyyy) : ");
    
    try   
        
    {
        
    birthdate = dateofemployeesbirth.parse(inputdata.next());
    
    validdate = false;
				
     } catch (ParseException e) 
     
     {
				
     System.out.println("\nInvalid date. ");
     
     }      
      
    }while(validdate);

    System.out.print("\nEnter the year of recruitment : ");
    yearofrecruitment = inputdata.nextInt();
    
    System.out.print("\nEnter the name of department that the employee is working : ");
    nameofdepartment = inputdata.next();
    
    System.out.print("\nEnter the name of work that the department employee is working : ");
    nameofwork = inputdata.next();
    
    do 
        
    {
        
    System.out.print("\nEnter the start date(dd/MM/yyyy) : ");
    
    try   
        
    {
        
    startdate = startdateofworktoanemployee.parse(inputdata.next());
    
    validdate = false;
				
     } catch (ParseException e) 
     
     {
				
     System.out.println("\nInvalid date. ");
     
     }      
      
    }while(validdate);
    
    do 
        
    {
        
    System.out.print("\nEnter the expiration date(dd/MM/yyyy) : ");
    
    try   
        
    {
        
    expirationdate = expirationdateofworktoanemployee.parse(inputdata.next());
    
    validdate = false;
				
     } catch (ParseException e) 
     
     {
				
     System.out.println("\nInvalid date. ");
     
     }      
      
    }while(validdate);
    
    for(Departmentemployeework departmentemployeework : new ArrayList<Departmentemployeework>(dataofdepartmentemployeework))
        
    {
    
    if(firstname.equals(departmentemployeework.Getfirstname()) && lastname.equals(departmentemployeework.Getlastname()) && birthdate.equals(departmentemployeework.Getbirthdate()) && yearofrecruitment==departmentemployeework.Getyearofrecruitment() && nameofdepartment.equals(departmentemployeework.Getnameofdepartment()) && nameofwork.equals(departmentemployeework.Getnameofwork()) && startdate.equals(departmentemployeework.Getstartdate()) && expirationdate.equals(departmentemployeework.Getexpirationdate()))
    
    {
        
    dataofdepartmentemployeework.remove(departmentemployeework);
    
     
    System.out.print("\nEnter the update family situation(married/unmarried) : ");
    familysituation = inputdata.next();
    
    System.out.print("\nEnter the update number of children : ");
    numberofchildren = inputdata.nextInt();
    
    System.out.print("\nEnter the update speciality : ");
    speciality = inputdata.next();
    
    System.out.print("\nEnter the update level of education(secondary education->1/university education->2/postgraduate diploma->3/doctoral degree->4) : ");
    levelofeducation = inputdata.nextInt();
    
    
    Departmentemployeework updatedepartmentemployeework = new Departmentemployeework(firstname , lastname , birthdate , familysituation , numberofchildren , yearofrecruitment , speciality , levelofeducation , nameofdepartment , nameofwork , startdate , expirationdate);
        
    dataofdepartmentemployeework.add(updatedepartmentemployeework);
    
    System.out.println("\nDepartment employee with work updated successfully. \n");
    
    System.out.println(dataofdepartmentemployeework.toString()); 
    
    }
    
    } 
    
    }      
    
    private static void informationonmaritalstatusandnumberofchildrenandspecialtyandlevelofeducationfordepartmentmanagers() // συνάρτηση για την ενημέρωση συγκεκριμένων στοιχείων με βάση το ερώτημα του πρότζεκτ του διευθυντή που βρίσκεται σε κάποιο τμήμα(Σημείωση πρέπει να υπάρχει διευθυντής και τμήμα.). 
    
    {
    
    String firstname;
    String lastname;
    Date birthdate = new Date();
    String familysituation;
    int numberofchildren;
    int yearofrecruitment;
    String speciality;
    int levelofeducation;
    String nameofdepartment;
    Date dateofwithdrawal = new Date();
    boolean validdate = true;
    
    System.out.print("\nEnter the first name : ");
    firstname = inputdata.next();
    
    System.out.print("\nEnter the last name : ");
    lastname = inputdata.next();
    
      do 
        
    {
        
    System.out.print("\nEnter the date of birth(dd/MM/yyyy) : ");
    
    try   
        
    {
        
    birthdate = dateofemployeesbirth.parse(inputdata.next());
    
    validdate = false;
				
     } catch (ParseException e) 
     
     {
				
     System.out.println("\nInvalid date. ");
     
     }
    
    System.out.print("\nEnter the year of recruitment : ");
    yearofrecruitment = inputdata.nextInt();
    
    System.out.print("\nEnter the name of department that the department manager is chief : ");
    nameofdepartment = inputdata.next();
    

     }while(validdate);    
    
    do 
        
    {
        
    System.out.print("\nEnter the date of withdrawal(dd/MM/yyyy) : ");
    
    try   
        
    {
        
    dateofwithdrawal = dateofappointmentofadepartmentmanager.parse(inputdata.next());
    
    validdate = false;
				
     } catch (ParseException e) 
     
     {
				
     System.out.println("\nInvalid date. ");
     
     }      
      
    }while(validdate);  
    
    for(Departmentmanager departmentmanager : new ArrayList<Departmentmanager>(dataofdepartmentmanager) )
        
    {
        
    if(firstname.equals(departmentmanager.Getfirstname()) && lastname.equals(departmentmanager.Getlastname()) && birthdate.equals(departmentmanager.Getbirthdate()) && yearofrecruitment==departmentmanager.Getyearofrecruitment() && nameofdepartment.equals(departmentmanager.Getnameofdepartment()) && dateofwithdrawal.equals(departmentmanager.Getdateofwithdrawal())) 
    
    {    
        
    dataofdepartmentmanager.remove(departmentmanager);    
      
    System.out.print("\nEnter the update family situation(married/unmarried) : ");
    familysituation = inputdata.next();
    
    System.out.print("\nEnter the update number of children : ");
    numberofchildren = inputdata.nextInt();
    
    System.out.print("\nEnter the update speciality : ");
    speciality = inputdata.next();
    
    System.out.print("\nEnter the update level of education(secondary education->1/university education->2/postgraduate diploma->3/doctoral degree->4) : ");
    levelofeducation = inputdata.nextInt(); 
    
    Departmentmanager updatedepartmentmanager = new Departmentmanager(firstname , lastname , birthdate ,  familysituation , numberofchildren , yearofrecruitment , speciality , levelofeducation , nameofdepartment , dateofwithdrawal);
    
    dataofdepartmentmanager.add(updatedepartmentmanager);
    
    System.out.println("\nDepartment manager updated successfully. \n");
    
    System.out.println(dataofdepartmentmanager.toString());
    
    }
     
    }
       
    }

    private static void relocationofanemployeefromonedepartmenttoanother() // συνάρτηση όπου αναθέτουμε έναν εργαζόμενο ενός τμήματος σε κάποιο άλλο(Σημείωση πρέπει να υπάρχει το άλλο τμήμα.).
    
    {
        
    String firstname;
    String lastname;
    Date birthdate = new Date();
    String familysituation;
    int numberofchildren;
    int yearofrecruitment;
    String speciality;
    int levelofeducation;
    String oldnameofdepartment;
    String newnameofdepartment;
    boolean validdate = true;
    
    System.out.print("\nEnter the first name : ");
    firstname = inputdata.next();
    
    System.out.print("\nEnter the last name : ");
    lastname = inputdata.next();
   
    do 
        
    {
        
    System.out.print("\nEnter the date of birth(dd/MM/yyyy) : ");
    
    try   
        
    {
        
    birthdate = dateofemployeesbirth.parse(inputdata.next());
    
    validdate = false;
				
     } catch (ParseException e) 
     
     {
				
     System.out.println("\nInvalid date. ");
     
     }      
      
    }while(validdate);
    
    System.out.print("\nEnter the family situation(married/unmarried) : ");
    familysituation = inputdata.next();
    
    System.out.print("\nEnter the number of children : ");
    numberofchildren = inputdata.nextInt();
    
    System.out.print("\nEnter the year of recruitment : ");
    yearofrecruitment = inputdata.nextInt();
    
    System.out.print("\nEnter the speciality : ");
    speciality = inputdata.next();
    
    System.out.print("\nEnter the level of education(secondary education->1/university education->2/postgraduate diploma->3/doctoral degree->4) : ");
    levelofeducation = inputdata.nextInt(); 
    
    System.out.print("\nEnter the name of the department that the employee will be leave : ");
    oldnameofdepartment = inputdata.next();
    
    for(Departmentemployee departmentemployee : new ArrayList<Departmentemployee>(dataofdepartmentemployee))
        
    {
    
    if(firstname.equals(departmentemployee.Getfirstname()) && lastname.equals(departmentemployee.Getlastname()) && familysituation.equals(departmentemployee.Getfamiliysituation()) && numberofchildren==departmentemployee.Getnumberofchildren() && yearofrecruitment==departmentemployee.Getyearofrecruitment() && speciality.equals(departmentemployee.Getspeciality()) && levelofeducation==departmentemployee.Getlevelofeducation() && oldnameofdepartment.equals(departmentemployee.Getnameofdepartment()))
        
    {
        
    System.out.print("\nEnter the name of the update department that the employee will be moved : ");
    newnameofdepartment = inputdata.next();
    
    for(Department department : dataofdepartment)
        
    {
        
    if(newnameofdepartment.equals(department.Getnameofdepartment()))
        
    {
        
    dataofdepartmentemployee.remove(departmentemployee);
    
    Departmentemployee updatedepartmentemployee = new Departmentemployee(firstname , lastname , birthdate ,  familysituation , numberofchildren , yearofrecruitment , speciality , levelofeducation , newnameofdepartment);
    
    dataofdepartmentemployee.add(updatedepartmentemployee);
    
    System.out.println("\nDepartment employee moved to the department successfully. \n");
    
    System.out.println(dataofdepartmentemployee.toString()); 
    
    }

    }
    
    }
    
    }
    
    }

    private static void assignmenttoanotheremployeethemanagementofadepartment() // συνάρτηση όπου αναθέτουμε κάποιον άλλου εργαζόμενο τμήματος σαν διευθυντή.
    
    {
    
    String firstname;
    String lastname;
    Date birthdate = new Date();
    String familysituation;
    int numberofchildren;
    int yearofrecruitment;
    String speciality;
    int levelofeducation;
    String nameofdepartment;
    Date dateofwithdrawal = new Date();
    boolean validdate = true;
    
    System.out.print("\nOld department manager. \n");
    
    System.out.print("\nEnter the first name : ");
    firstname = inputdata.next();
    
    System.out.print("\nEnter the last name : ");
    lastname = inputdata.next();
    
      do 
        
    {
        
    System.out.print("\nEnter the date of birth(dd/MM/yyyy) : ");
    
    try   
        
    {
        
    birthdate = dateofemployeesbirth.parse(inputdata.next());
    
    validdate = false;
				
     } catch (ParseException e) 
     
     {
				
     System.out.println("\nInvalid date. ");
     
     }      
      
    }while(validdate);
    
    System.out.print("\nEnter the family situation(married/unmarried) : ");
    familysituation = inputdata.next();
    
    System.out.print("\nEnter the number of children : ");
    numberofchildren = inputdata.nextInt();
    
    System.out.print("\nEnter the year of recruitment : ");
    yearofrecruitment = inputdata.nextInt();
    
    System.out.print("\nEnter the speciality : ");
    speciality = inputdata.next();
    
    System.out.print("\nEnter the level of education(secondary education->1/university education->2/postgraduate diploma->3/doctoral degree->4) : ");
    levelofeducation = inputdata.nextInt();
    
    System.out.print("\nEnter the name of department that the department manager will stop being manager : ");
    nameofdepartment = inputdata.next();
    
      do 
        
    {
        
    System.out.print("\nEnter the date of withdrawal(dd/MM/yyyy) : ");
    
    try   
        
    {
        
    dateofwithdrawal = dateofappointmentofadepartmentmanager.parse(inputdata.next());
    
    validdate = false;
				
     } catch (ParseException e) 
     
     {
				
     System.out.println("\nInvalid date. ");
     
     }      
      
    }while(validdate);
    
    for(Departmentmanager dataofdepartmentmanagerr :  new ArrayList<Departmentmanager>(dataofdepartmentmanager))
        
    {
    
    if(firstname.equals(dataofdepartmentmanagerr.Getfirstname()) && lastname.equals(dataofdepartmentmanagerr.Getlastname()) && birthdate.equals(dataofdepartmentmanagerr.Getbirthdate()) && familysituation.equals(dataofdepartmentmanagerr.Getfamiliysituation()) && numberofchildren==dataofdepartmentmanagerr.Getnumberofchildren() && yearofrecruitment==dataofdepartmentmanagerr.Getyearofrecruitment() && speciality.equals(dataofdepartmentmanagerr.Getspeciality()) && levelofeducation==dataofdepartmentmanagerr.Getlevelofeducation() && nameofdepartment.equals(dataofdepartmentmanagerr.Getnameofdepartment()) && dateofwithdrawal.equals(dataofdepartmentmanagerr.Getdateofwithdrawal()))
     
    {
        
    dataofdepartmentmanager.remove(dataofdepartmentmanagerr);
    
    Departmentemployee downgradetodepartmentemployee = new Departmentemployee(firstname , lastname , birthdate , familysituation , numberofchildren , yearofrecruitment , speciality , levelofeducation , nameofdepartment);
    
    dataofdepartmentemployee.add(downgradetodepartmentemployee);
     
    }
    
    }
    
    System.out.print("\nNew department manager. \n");
    
    System.out.print("\nEnter the first name : ");
    firstname = inputdata.next();
    
    System.out.print("\nEnter the last name : ");
    lastname = inputdata.next();
    
      do 
        
    {
        
    System.out.print("\nEnter the date of birth(dd/MM/yyyy) : ");
    
    try   
        
    {
        
    birthdate = dateofemployeesbirth.parse(inputdata.next());
    
    validdate = false;
				
     } catch (ParseException e) 
     
     {
				
     System.out.println("\nInvalid date. ");
     
     }      
      
    }while(validdate);
    
    System.out.print("\nEnter the family situation(married/unmarried) : ");
    familysituation = inputdata.next();
    
    System.out.print("\nEnter the number of children : ");
    numberofchildren = inputdata.nextInt();
    
    System.out.print("\nEnter the year of recruitment : ");
    yearofrecruitment = inputdata.nextInt();
    
    System.out.print("\nEnter the speciality : ");
    speciality = inputdata.next();
    
    System.out.print("\nEnter the level of education(secondary education->1/university education->2/postgraduate diploma->3/doctoral degree->4) : ");
    levelofeducation = inputdata.nextInt();
    
    System.out.print("\nEnter the name of department that the employee would be the manager : ");
    nameofdepartment = inputdata.next();
    
     do 
        
    {
        
    System.out.print("\nEnter the date of withdrawal(dd/MM/yyyy) : ");
    
    try   
        
    {
        
    dateofwithdrawal = dateofappointmentofadepartmentmanager.parse(inputdata.next());
    
    validdate = false;
				
     } catch (ParseException e) 
     
     {
				
     System.out.println("\nInvalid date. ");
     
     }      
      
    }while(validdate);
    
    
    
    for(Departmentemployee employee : new ArrayList<Departmentemployee>(dataofdepartmentemployee))
        
    {
    
    for(Department department : dataofdepartment)
    
    {
    
    if(firstname.equals(employee.Getfirstname()) && lastname.equals(employee.Getlastname()) && birthdate.equals(employee.Getbirthdate()) && familysituation.equals(employee.Getfamiliysituation()) && numberofchildren==employee.Getnumberofchildren() && yearofrecruitment==employee.Getyearofrecruitment() && speciality.equals(employee.Getspeciality()) && levelofeducation==employee.Getlevelofeducation() && nameofdepartment.equals(department.Getnameofdepartment()))
     
    {
        
    dataofdepartmentemployee.remove(employee);
    
    Departmentmanager departmentmanager = new Departmentmanager(firstname , lastname , birthdate ,  familysituation , numberofchildren , yearofrecruitment , speciality , levelofeducation , nameofdepartment , dateofwithdrawal);
    
    dataofdepartmentmanager.add(departmentmanager);
    
    System.out.println("\nDepartment manager changed successfully. \n");
    
    System.out.println(dataofdepartmentmanager.toString());
        
    }
    
    }    
      
    }
        
    }   

    private static void calculationofanemployeesmonthlysalary() // συνάρτηση για τον υπολογισμό του μισθού ενός εργαζομένου που βρίσκεται σε τμήμα.
    
    {
    
    
    double salary=0.0;
    double minimumwage=750.0;
    double childbenefit=60.0;
    double studyallowance=80.0;
    double preserviceallowance=40.0;
    int currentyear = 2020;
    String firstname;
    String lastname;
    
    System.out.print("\nEnter the first name : ");
    firstname = inputdata.next();
    
    System.out.print("\nEnter the last name : ");
    lastname = inputdata.next();
    
    for(Departmentemployee departmentemployee : dataofdepartmentemployee)
    
    {
    
    if(firstname.equals(departmentemployee.Getfirstname()) && lastname.equals(departmentemployee.Getlastname()))
    
    {
    
    if((currentyear-departmentemployee.Getyearofrecruitment())%3==0 && 3>=departmentemployee.Getnumberofchildren())
    
    {
        
    salary = minimumwage + (childbenefit*departmentemployee.Getnumberofchildren()) + preserviceallowance ;
    
    }

    if(departmentemployee.Getlevelofeducation()>1 && (currentyear-departmentemployee.Getyearofrecruitment())%3==0 && 3>=departmentemployee.Getnumberofchildren())
        
    {
    
    salary = minimumwage + (childbenefit*departmentemployee.Getnumberofchildren()) + studyallowance  + preserviceallowance ;
    
    }

    if((currentyear-departmentemployee.Getyearofrecruitment())%3!=0 && 3>=departmentemployee.Getnumberofchildren())

    {
    
    salary = minimumwage + (childbenefit*departmentemployee.Getnumberofchildren());   
    
    }

    if(departmentemployee.Getlevelofeducation()>1 && (currentyear-departmentemployee.Getyearofrecruitment())%3!=0 && 3>=departmentemployee.Getnumberofchildren())  
        
    {
    
    salary = minimumwage + (childbenefit*departmentemployee.Getnumberofchildren()) + studyallowance ;
        
    }
    
    if((currentyear-departmentemployee.Getyearofrecruitment())%3==0 && 3<departmentemployee.Getnumberofchildren())
    
    {
        
    salary = minimumwage + (childbenefit*3) + preserviceallowance ;
    
    }

    if(departmentemployee.Getlevelofeducation()>1 && (currentyear-departmentemployee.Getyearofrecruitment())%3==0 && 3<departmentemployee.Getnumberofchildren())
        
    {
    
    salary = minimumwage + (childbenefit*3) + studyallowance  + preserviceallowance ;
    
    }

    if((currentyear-departmentemployee.Getyearofrecruitment())%3!=0 && 3<departmentemployee.Getnumberofchildren())

    {
    
    salary = minimumwage + (childbenefit*3);   
    
    }

    if(departmentemployee.Getlevelofeducation()>1 && (currentyear-departmentemployee.Getyearofrecruitment())%3!=0 && 3<departmentemployee.Getnumberofchildren())  
        
    {
    
    salary = minimumwage + (childbenefit*3) + studyallowance ;
        
    }
    
    }   
         
    }
    
    if(salary==0)
        
    {
          
    totalsalaryfordepartmentemployees.remove(salary);
    
    }

    else
        
    {
       
    System.out.println("\nSalary of department employee is : " + salary); 
        
    totalsalaryfordepartmentemployees.add(salary);
    
    } 
          
    }

    private static void calculationofanemployeesmonthlysalarywhohasawork() // συνάρτηση για τον υπολογισμό του μισθού ενός εργαζομένου που βρίσκεται σε τμήμα και ασχολείται και με κάποιο έργο.
    
    {
    
    double salary=0.0;
    double minimumwage=750.0;
    double childbenefit=60.0;
    double studyallowance=80.0;
    double preserviceallowance=40.0;
    int currentyear = 2020;
    int bonus = 100;
    String firstname;
    String lastname;
    double totalsalaryofdepartmentemployees=0.0;
    
    System.out.print("\nEnter the first name : ");
    firstname = inputdata.next();
    
    System.out.print("\nEnter the last name : ");
    lastname = inputdata.next();
    
    for(Departmentemployeework departmentemployeework : dataofdepartmentemployeework)
    
    {
        
    int days = (int) ((departmentemployeework.Getexpirationdate().getTime()-departmentemployeework.Getstartdate().getTime()) / (1000 * 60 * 60 * 24));
     
    int months = (days/30);
    
    System.out.println("\n" +days);
    
    System.out.println("\n" +months);
        
    if(firstname.equals(departmentemployeework.Getfirstname()) && lastname.equals(departmentemployeework.Getlastname()))
    
    {
    
    if((currentyear-departmentemployeework.Getyearofrecruitment())%3==0 && 3>=departmentemployeework.Getnumberofchildren())
    
    {
        
    salary = ((minimumwage + (childbenefit*departmentemployeework.Getnumberofchildren()) + preserviceallowance + bonus)*months);
    
    }

    if(departmentemployeework.Getlevelofeducation()>1 && (currentyear-departmentemployeework.Getyearofrecruitment())%3==0 && 3>=departmentemployeework.Getnumberofchildren())
        
    {
    
    salary = ((minimumwage + (childbenefit*departmentemployeework.Getnumberofchildren()) + studyallowance  + preserviceallowance + bonus)*months) ;
    
    }

    if((currentyear-departmentemployeework.Getyearofrecruitment())%3!=0 && 3>=departmentemployeework.Getnumberofchildren())

    {
    
    salary = ((minimumwage + (childbenefit*departmentemployeework.Getnumberofchildren()) + bonus)*months);   
    
    }

    if(departmentemployeework.Getlevelofeducation()>1 && (currentyear-departmentemployeework.Getyearofrecruitment())%3!=0 && 3>=departmentemployeework.Getnumberofchildren())  
        
    {
    
    salary = ((minimumwage + (childbenefit*departmentemployeework.Getnumberofchildren()) + studyallowance + bonus)*months) ;
        
    }
    
    if((currentyear-departmentemployeework.Getyearofrecruitment())%3==0 && 3<departmentemployeework.Getnumberofchildren())
    
    {
        
    salary = ((minimumwage + (childbenefit*3) + preserviceallowance + bonus)*months)  ;
    
    }

    if(departmentemployeework.Getlevelofeducation()>1 && (currentyear-departmentemployeework.Getyearofrecruitment())%3==0 && 3<departmentemployeework.Getnumberofchildren())
        
    {
    
    salary = ((minimumwage + (childbenefit*3) + studyallowance  + preserviceallowance + bonus)*months) ;
    
    }

    if((currentyear-departmentemployeework.Getyearofrecruitment())%3!=0 && 3<departmentemployeework.Getnumberofchildren())

    {
    
    salary = ((minimumwage + (childbenefit*3) + bonus)*months) ;   
    
    }

    if(departmentemployeework.Getlevelofeducation()>1 && (currentyear-departmentemployeework.Getyearofrecruitment())%3!=0 && 3<departmentemployeework.Getnumberofchildren())  
        
    {
    
    salary = ((minimumwage + (childbenefit*3) + studyallowance + bonus)*months)  ;
        
    } 
    
    } 
    
    } 
    
    if(salary==0)
        
    {
          
    totalsalaryfordepartmentemployeeswithwork.remove(salary);
    
    }

    else
        
    {
       
    System.out.println("\nSalary of department employee with work is : " + salary); 
        
    totalsalaryfordepartmentemployeeswithwork.add(salary);
    
    }  
     
    }

    private static void calculationofadepartmentmanager() // συνάρτηση για τον υπολογισμού του μισθού ενός διευθυντή σε κάποιο τμήμα.
    
    {
     
    double salary=0.0;
    double minimumwage=750.0;
    double childbenefit=60.0;
    double studyallowance=80.0;
    double preserviceallowance=40.0;
    int currentyear =2020;
    int bonus=400;
    String firstname;
    String lastname;
    
    System.out.print("\nEnter the first name : ");
    firstname = inputdata.next();
    
    System.out.print("\nEnter the last name : ");
    lastname = inputdata.next();
    
    for(Departmentmanager departmentmanager : dataofdepartmentmanager)
    
    {
    
    if(firstname.equals(departmentmanager.Getfirstname()) && lastname.equals(departmentmanager.Getlastname()))
    
    {
    
    if((currentyear-departmentmanager.Getyearofrecruitment())%3==0 && 3>=departmentmanager.Getnumberofchildren())
    
    {
        
    salary = minimumwage + (childbenefit*departmentmanager.Getnumberofchildren()) + preserviceallowance +bonus ;
    
    }

    if(departmentmanager.Getlevelofeducation()>1 && (currentyear-departmentmanager.Getyearofrecruitment())%3==0 && 3>=departmentmanager.Getnumberofchildren())
        
    {
    
    salary = minimumwage + (childbenefit*departmentmanager.Getnumberofchildren()) + studyallowance  + preserviceallowance +bonus ;
    
    }

    if((currentyear-departmentmanager.Getyearofrecruitment())%3!=0 && 3>=departmentmanager.Getnumberofchildren())

    {
    
    salary = minimumwage + (childbenefit*departmentmanager.Getnumberofchildren()) +bonus;   
    
    }

    if(departmentmanager.Getlevelofeducation()>1 && (currentyear-departmentmanager.Getyearofrecruitment())%3!=0 && 3>=departmentmanager.Getnumberofchildren())  
        
    {
    
    salary = minimumwage + (childbenefit*departmentmanager.Getnumberofchildren()) + studyallowance +bonus ;
        
    }
    
    if((currentyear-departmentmanager.Getyearofrecruitment())%3==0 && 3<departmentmanager.Getnumberofchildren())
    
    {
        
    salary = minimumwage + (childbenefit*3) + preserviceallowance +bonus ;
    
    }

    if(departmentmanager.Getlevelofeducation()>1 && (currentyear-departmentmanager.Getyearofrecruitment())%3==0 && 3<departmentmanager.Getnumberofchildren())
        
    {
    
    salary = minimumwage + (childbenefit*3) + studyallowance  + preserviceallowance +bonus ;
    
    }

    if((currentyear-departmentmanager.Getyearofrecruitment())%3!=0 && 3<departmentmanager.Getnumberofchildren())

    {
    
    salary = minimumwage + (childbenefit*3) +bonus;   
    
    }

    if(departmentmanager.Getlevelofeducation()>1 && (currentyear-departmentmanager.Getyearofrecruitment())%3!=0 && 3<departmentmanager.Getnumberofchildren())  
        
    {
    
    salary = minimumwage + (childbenefit*3) + studyallowance +bonus ;
        
    }
    
    }   
         
    }   
       
    if(salary==0)
        
    {
          
    totalsalaryfordepartmentmanagers.remove(salary);
    
    }

    else
        
    {
       
    System.out.println("\nSalary of department manager is : " + salary); 
        
    totalsalaryfordepartmentmanagers.add(salary);
    
    }  
    
    }

    private static void calculationofpayrollcostsforaseparateforthetimeperiod() // συνάρτηση για τον υπολογισμό του συνολικού μισθού για ένα συγκεκριμένο τμήμα.
    
    {
        
    double totalofthree=0.0;    
    double totaldepartmentemployeee=0.0;
    double totaldepartmentmanager=0.0;
    double totaldepartmentemployeewithwork=0.0;
    String nameofdepartment;
    
    System.out.print("\nEnter the name of the specific department that you want to find the total salary : ");
    nameofdepartment = inputdata.next();
    
    for(Departmentemployee departmentemployee : dataofdepartmentemployee)
    
    {
        
    if(nameofdepartment.equals(departmentemployee.Getnameofdepartment())) 
        
    {
        
    for(int i =0; i<totalsalaryfordepartmentemployees.size(); i++) 
          
    {    
      
    totaldepartmentemployeee = totaldepartmentemployeee + totalsalaryfordepartmentemployees.get(i);
    
    } 
    
    }
    
    break;
    
    }
    
    for(Departmentmanager departmentmanager : dataofdepartmentmanager)
    
    {
        
    if(nameofdepartment.equals(departmentmanager.Getnameofdepartment())) 
        
    {
        
    for(int i =0; i<totalsalaryfordepartmentmanagers.size(); i++) 
          
    {    
      
    totaldepartmentmanager = totaldepartmentmanager + totalsalaryfordepartmentmanagers.get(i);
    
    } 
    
    }
    
    break;
 
    }
    
    for(Departmentemployeework departmentemployeework : dataofdepartmentemployeework)
    
    {
        
    if(nameofdepartment.equals(departmentemployeework.Getnameofdepartment())) 
        
    {
        
    for(int i =0; i<totalsalaryfordepartmentemployeeswithwork.size(); i++) 
          
    {  
        
    totaldepartmentemployeewithwork = totaldepartmentemployeewithwork + totalsalaryfordepartmentemployeeswithwork.get(i);
    
    } 
    
    }
    
    break;
    
    }
    
    totalofthree = totaldepartmentemployeee + totaldepartmentmanager + totaldepartmentemployeewithwork ;
    
    System.out.println("\nTotal salary of all employees are : " + totalofthree);
              
    }  

    private static void calculationofpayrollcostsforaproject() // συνάρτηση για το συνολικό κόστος ενός έργου συνυπολογίζοντας και τους μισθούς των εργαζομένων που δουλεύουν πάνω στο έργο αυτό.
    
    {
        
    double totalcostofwork=0.0;
    String nameofwork;
    double totaldepartmentemployeewithwork = 0.0;
    double fpa = 0.19; // φπα δικό μου.
    
    for(int i=0; i<totalsalaryfordepartmentemployeeswithwork.size(); i++)
    
    {
    
    totaldepartmentemployeewithwork = totaldepartmentemployeewithwork + totalsalaryfordepartmentemployeeswithwork.get(i);
    
    }
    
    System.out.print("\nEnter the name of work : ");
    nameofwork = inputdata.next();
    
    for(Work work : dataofwork)
        
    {
    
    if(nameofwork.equals(work.Getnameofwork()))
        
    {
    
    totalcostofwork = (work.Getgrossrevenueofcompany()*fpa) + work.Getcostsforlogisticalinfrastructure() + work.Getcostsforotheroperatingexpenses() + totaldepartmentemployeewithwork  ;
    
    
    }
         
    }
    
    System.out.println("\nTotal cost for the project is : " + totalcostofwork);
     
    }

    private static void calculationofnetrevenueforaprojecttakingintoaccountgrossprojectrevenuemiscellaneouscostsandpayrollcosts() // συνάρτηση που υπολογίζει τα καθαρά κέρδη που έβγαλε η επιχείρηση από ένα έργο.
    
    {
        
    double fpa = 0.19; // φπα δικό μου.
    String nameofwork;
    double totaldepartmentemployeewithwork = 0.0;
    double netincome=0.0;
    
    for(int i=0; i<totalsalaryfordepartmentemployeeswithwork.size(); i++)
    
    {
    
    totaldepartmentemployeewithwork = totaldepartmentemployeewithwork + totalsalaryfordepartmentemployeeswithwork.get(i);
    
    }
    
    System.out.print("\nEnter the name of work : ");
    nameofwork = inputdata.next();
    
    for(Work work : dataofwork)
        
    {
    
    if(nameofwork.equals(work.Getnameofwork()))
        
    {
    
    netincome = work.Getgrossrevenueofcompany() - ((work.Getgrossrevenueofcompany()*fpa)+work.Getcostsforlogisticalinfrastructure()+work.Getcostsforotheroperatingexpenses()+totaldepartmentemployeewithwork) ;
     
    }
         
    }
    
    System.out.println("\nTotal net income for the project is : " + netincome);
        
    }

    private static void showalltheelementsoftheprojectthatprovidesthemostnetrevenuetothecompany() // συνάρτηση που εμφανίζει τα στοιχεία του έργου με τα περισσότερα καθαρά κέρδη.
    
    {
     
    double fpa = 0.19; // φπα δικό μου.    
    String nameofwork;

    for(Work work : dataofwork)
        
    {
    
    if(work.Getgrossrevenueofcompany()-((work.Getgrossrevenueofcompany()*fpa)+work.Getcostsforlogisticalinfrastructure()+work.Getcostsforotheroperatingexpenses())>((work.Getgrossrevenueofcompany()*fpa)+work.Getcostsforlogisticalinfrastructure()+work.Getcostsforotheroperatingexpenses()))
        
    {
    
    System.out.println(work.toString());
     
    }
    
    }
        
    } 
          
    }

          
    
        
    

    


