//Oluwadamilola Adeyemo
//ID: 2021-08-0281, Period 2

/**
This is a program that uses five arrays 
to store information about 10 employees. 
And PART B, searches for employees, caculates wage average, 
maximum and minimum. Then outputs the information 
and the wages equal to or greater than average.
*/


import java.util.Scanner; // For Scanner class

public class MyPartBPayroll
{
   public static void main(String[] args)
   {
   
      // Variable Declaration
      
      final int employees = 10;
      String heading1 = "Name", h2 = "ID", h3 = "Hours ", h4 = "Payrate", h5 = "Wages"; 
      double maxWages = 0, minWages = Double.MAX_VALUE;
       
      
      // Array Declaration
      
      int[] employess = new int[employees];
      String [] name = new String[employees];
      int [] id = new int[employees];
      double [] hours = new double [employees]; 
      double [] payRate = new double [employees]; 
      double [] wages = new double [employees];
      
      
   
      // Scanner object for keyboard input
      
      Scanner keyboard = new Scanner(System.in);
   
   
      // Introduction
      
      System.out.println("\nEnter the name, IDs, hours worked and pay rate of employees,"); 
      System.out.println("and their wages will be calculated and outputed." );
   
   
      // Input
      
      for (int i = 0; i < employees; i++)//i used for index
      {
         System.out.print( "\nInput for Employee #" + (i + 1) + ": ");
         
         System.out.print( "\nName: ");         
         name[i] = keyboard.nextLine();
         System.out.print( "ID: ");   
         id[i] = keyboard.nextInt(); 
         System.out.print( "Hours Worked: "); 
         hours[i] = keyboard.nextDouble();
         System.out.print( "Pay rate: "); 
         payRate[i] = keyboard.nextDouble(); 
         keyboard.nextLine(); // clear the enter key
                                        
         wages[i] = hours[i] * payRate [i];        
         System.out.printf( "\n" +name[i] + "'s wage is $%.2f" ,wages [i]); 
         System.out.println(" ");  
               
      }
      
             
       // Output
       
      System.out.println();
      System.out.printf("    %-13s| %-8s| %-10s | %-9s | %-10s ",heading1, h2, h3, h4, h5);
      System.out.println();
      System.out.println("--------------------------------------------------------------");
       
      for (int i = 0; i < employees; i++)//i used for index
      {
         System.out.printf("  %-15s| %8d| ", name[i],id[i]);
         System.out.printf(" %7.0f hrs| $%8.2f| $%7.2f",hours[i],payRate[i],wages[i]); 
         System.out.println();
      }
   
      System.out.println();
       
       
       
      // PART B //
       
      // Second Variable declaratiion 
       
      double average=0, sum = 0;
      boolean isFound = false;
      int findID;
      String findName;
      String minName = "", maxName = "";
      int minID = 0, maxID = 0;
      double minPayRate = 0, maxPayRate = 0,minHours = 0, maxHours = 0;
   
      // mmaximum & minimum wage
      
      for (int i = 0; i < employees; i++)//i used for index
      {
         // maximum wage          
         if (wages[i]>maxWages){
            maxWages = wages[i];
            maxName = name[i];
            maxID = id[i];
            maxPayRate = payRate[i];
            maxHours = hours[i];
         }
         
         //minimum wage 
         if (wages[i] < minWages) {
            minWages = wages[i];
            minName = name[i];
            minID = id[i];
            minPayRate = payRate[i];
            minHours = hours[i];
         }
      }
   
      // maximum wage Output
      System.out.println("\nThis is the employee with the highest wage:"); 
      System.out.print("- Name: " +maxName+  ", ID: " +maxID);
      System.out.printf(", Wage: $%.2f", maxWages);
      System.out.printf("\n- This employee worked for %.0f hrs, with a pay rate of $%.2f" , maxHours ,maxPayRate); 
      System.out.println();
            
      // minimum wage Output
      System.out.println("\nThis is the employee with the lowest wage:"); 
      System.out.print("- Name: " +minName+  ", ID: " +minID);
      System.out.printf(", Wage: $%.2f", minWages);
      System.out.printf("\n- This employee worked for %.0f hrs, with a pay rate of $%.2f.",maxHours , maxPayRate); 
      System.out.println("\n");
     
      
      // Average wage Heading
      System.out.println("These are the names and wages of the employees"); 
      System.out.println("that have wages more than or equal to average : ");
      System.out.println();   
      
      System.out.println();
      System.out.printf("    %-12s| %-8s| %-9s | %-10s | %-10s ",heading1, h2, h3, h4, h5);
      System.out.println();
      System.out.println("--------------------------------------------------------------");
       
      
      // Average wage Output
      for (int i = 0; i < employees; i++)//i used for index
      {
         sum = sum + wages[i];
         average = sum / employees;
      }
      
      
      for (int i = 0; i < employees; i++)//i used for index
      {
         if (average <= wages[i]) {
            System.out.printf("  %-14s| %8d| ", name[i],id[i]);
            System.out.printf(" %7.0f hrs| $%8.2f| $%7.2f",hours[i],payRate[i],wages[i]); 
            System.out.println();
         }
      }
      
      // Employee Search (String) Output
      System.out.println( "\nEnter employee's name: ");         
      findName = keyboard.nextLine();
               
      for (int i = 0; i < employees; i++)//i used for index
      {
         if (findName.equals(name[i]))// A[i].equals(find) or A[i].compareTo(find) == 0
         {
            System.out.println();
            System.out.println("Name: " +name[i]+  ",  ID: " +id[i]);
            System.out.printf("- Wage: $%.2f", wages[i]);
            System.out.println();
            System.out.printf("- This employee worked for %.0f hrs, with a pay rate of $%.2f.", hours[i] ,payRate[i] ); 
            System.out.println();
         
            isFound = true;      
         }
      }
       
      if (isFound == false)
         System.out.println( "\nSorry the employee you inputed cannot be found. Please try again. ");         
         
     
      // Employee Search (Int) Output
      System.out.println("\nEnter the employees ID: ");
      findID = keyboard.nextInt();
      keyboard.nextLine(); // clear the enter key
   
      for (int i = 0; i < employees; i++)//i used for index
      { 
         if (findID == id[i])          
         {
            System.out.println();
            System.out.println("Name: " +name[i]+  ",  ID: " +id[i]);
            System.out.printf("- Wage: $%.2f", wages[i]);
            System.out.println();
            System.out.printf("- This employee worked for %.0f hrs, with a pay rate of $%.2f.", hours[i],payRate[i]); 
            System.out.println();
         
                     
            isFound = true;
         }
      }
     
      if(isFound == false)
         System.out.println( "\nSorry the employee ID you inputed cannot be found. Please try again. ");         
   
   }
}
