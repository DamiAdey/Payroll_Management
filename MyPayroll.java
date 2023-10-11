//Oluwadamilola Adeyemo
//ID: 2021-08-0281, Period 2

/**
This is a program that uses five arrays 
to store information about 10 employees.
*/


import java.util.Scanner; // For Scanner class

public class MyPayroll
{
   public static void main(String[] args)
   {

      // Variable Declaration
      
      final int employees = 10;
      String heading1 = "Name", h2 = "ID", h3 = "Hours ", h4 = "Payrate", h5 = "Wages";
      
      
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
         System.out.println( " ");                 
      }
      
      
       // Output
       
       System.out.println();
       System.out.printf("    %-13s| %-8s| %-10s | %-10s | %-10s ",heading1, h2, h3, h4, h5);
       System.out.println();
       System.out.println("-----------------------------------------------------------------");
       
       for (int i = 0; i < employees; i++)//i used for index
       {
       System.out.printf("  %-15s| %8d| ", name[i],id[i]);
       System.out.printf(" %7.0f hrs| $%8.2f| $%7.2f",hours[i],payRate[i],wages[i]); 
       System.out.println();
       }

       System.out.println();

  }
}
