import java.util.Date;
import java.util.Scanner;

 public class Main {
   public static void main(String[] args) {
	// Instance Variables
	String fullName, ID, firstClass, secondClass;// REMEMBER to use nextLine(); for multiple words in a string
	String[] data; 
        int crn, creditHour, crn2, creditHour2; 
	double totalPayments;
	double crn1 = 120.25;
	// User Input to define the variables
	 Scanner myScan = new Scanner(System.in);
		
		System.out.print("Enter the Student's Full Name: ");
		fullName = myScan.nextLine();
		System.out.println("     ");
		
		System.out.print("Enter the Student's ID Number: ");
		ID = myScan.nextLine();
		System.out.println("     ");
		
          // Scanning and Splitting the course info into an array
	   /*===============================Class 1=====================================*/
	System.out.print("Enter crn/credit hours for the first class (like 5665/3:  ");
	   firstClass = myScan.next();
	     data = firstClass.split("/"); 
	     crn = Integer.parseInt(data[0]); 
	     creditHour = Integer.parseInt(data[1]); 
	    System.out.println("     ");
	  /*================================Class 2====================================*/
    	System.out.print("Enter crn/credit hours for the second class (like 5665/3:  ");
	    secondClass = myScan.next();
	     data = secondClass.split("/"); 
	     crn2 = Integer.parseInt(data[0]); 
	     creditHour2 = Integer.parseInt(data[1]); 
	    System.out.println("     ");
       myScan.close(); // Was throwing errors if i did not add this method.
    /*====================================================================*/
	System.out.println("Thank you!");
	System.out.println("Fee invoice prepared for: " + fullName);
	/*====================================================================*/

          // Splitting the string for the course number and credit hour
		String formattedString = String.format("[%s]", fullName);
		String formattedStringID = String.format(" [%s]", ID.toUpperCase());

// Method for adding in Java Util Package: Date -> ended up learning that "util.*" adds in all java packages :)
		Date today = new Date(); 
		
	/*===========================Header of the Receipt==================================*/
	System.out.println("     ");
	  System.out.println("*************************************");
	  System.out.println("     UCF ENROLLMENT INVOICE");
	  System.out.println("       Orlando, FL  32717");
  	  System.out.println(today);
	  System.out.println("*************************************");
	  System.out.println("     ");
	    
	/*==========================Body/Data of the Receipt=================================*/
		System.out.println("Fee Invoice Prepared for: ");
		System.out.println(formattedString + formattedStringID);
	         System.out.println(" ");
	    
		System.out.println("1 Credit Hour = $120.25");
		 System.out.println(" ");

		System.out.println("CRN         CREDIT HOURS   ");	
		 System.out.println(" ");
		
		System.out.print(crn + "        " + creditHour + "           $");
		System.out.printf("%6.2f\n", crn1 * creditHour);
		 System.out.println(" ");

		System.out.print(crn2 + "        " + creditHour2 + "           $");
		System.out.printf("%6.2f\n", crn1 * creditHour2);
		 System.out.println(" ");

		System.out.println("Health & ID Fees        $35.00"); 
		 System.out.println(" ");
		
	/*==========================Bottom/Summary of the Receipt============================*/
	  System.out.println("---------------------------------------");

		double class1 = crn1 * creditHour;
		double class2 = crn1 * creditHour2;
    
	 totalPayments = class1 + class2 + 35.00;
          System.out.printf("Total Payments:         $%.2f", totalPayments);
		
  }
  
 }


