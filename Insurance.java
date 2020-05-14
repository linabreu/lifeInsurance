/*
Lina Breunlin
CIS 1633 AA Java
October 21, 2019
Insurance Premium Calculator that uses a method other than main

Test Data

Inputs (calyear, birthyear respectively)          Outputs                 Passed?

2019, 1995                                          $340.00                    Y
2019, 1985                                          $360.00                    Y
2019, 1975                                          $380.00                    Y
2019, 1965                                          $400.00                    Y
2019, 1955                                          $420.00                    Y
q, N/A                                              error message              Y
2019, k                                             error message              Y
2019, 5007                                          error message              Y
2019, -1995                                         error message              Y
0,0                                                 error message              Y
 */

package insurance;
import java.util.Scanner;


public class Insurance {

    

   public static void main(String[] args) {
    
    //declare variables
    int calYear;
    int birthYear;
        
 
        
    Scanner in = new Scanner (System.in);

    System.out.println("-----------------------------------------------------------------");

    System.out.println("   --| Atrichoke Life Insurance Monthly Premium Calculator |--      ");
   
    System.out.println("-----------------------------------------------------------------");
    
    System.out.println();
  
    //prompt for the current year
    System.out.print ("Please enter the current year: ");

    if (in.hasNextInt()) 
    {
        //get current year
        calYear = in.nextInt();
         
        //If current year is valid, prompt for birthyear
        System.out.print ("Please enter your birth year: ");
        
        if (in.hasNextInt())
        {       
            birthYear = in.nextInt();
                
          //birth year must be greater than zero, a negative number will make a huge premium
          if (birthYear > 0)
            {
              //calendar year must be greater than birth year or the premium will be negative
              if (calYear > birthYear)
               {
                 
                //call method to calculate premium based on customer input
                int premium = getPrem(calYear, birthYear); 
                
                System.out.println ("Your monthly premium is:" + "$" + premium);
                
                System.out.println();

                System.out.println("-----------------------------------------------------------------");
                   
                System.out.println("        Thank you for choosing Artichoke Life Insurance"       );
                   
                System.out.println("-----------------------------------------------------------------");
                    
                }
                
                else
                {
                 System.out.println ("Error. The current year must be greater than your birth year");
                }
             }
             else
             {
               System.out.println ("Error. Birth year must be greater than 0.");  
             }
        }        

        else 
        {
            System.out.println ("Error. Birth year must be a number.");
        }
    }
    else
    {
        System.out.println ("Error. Current year must be a number.");
    }

}
/**
 Computes the monthly premium
  @param calYear = the current year
  @param birthYear = the year the customer was born
  @return monthlyPrem = the decade of the customer's age + 15 and * 20
 */  
 
public static int getPrem(int calYear, int birthYear) {
 
//declare variables used in method
int age;

int decade;

int monthlyPrem;

//declare constants used in method

final int TEN = 10;

final int FIFTEEN = 15;

final int TWETNY = 20;


age = calYear - birthYear; 

decade = age / TEN;

monthlyPrem = (decade + FIFTEEN) * TWETNY;

return monthlyPrem;   
}   

 }  
