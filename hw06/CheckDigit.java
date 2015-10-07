//Ashini Patel
//hw06 PART2

import java.util.Scanner; // import scanner
import java.lang.*;

public class CheckDigit{ // declare a class
static Scanner myScanner = new Scanner (System.in);

     public static void main(String[]args){ //main method
     System.out.println(multiplyValues(getInt()));

     }
     
     static String getInt(){
         System.out.println("Please enter a 10 digit number: ");
         String ISBN = myScanner.nextLine();
         if(ISBN.length()==10){
             return ISBN;
         }
         else{
        	 System.out.print("This is NOT a valid ISBN. ");
             getInt();
         }
         
         return "this is fine";
     }
     
     
     static String multiplyValues(String ISBN){
         String withoutLastNum = ISBN.substring(0,ISBN.length()-1);
         int checkNumber = Integer.parseInt(ISBN.substring(ISBN.length() - 1));
         int multiplier = 10, tempValue, sumOfNums=0;
         for(int i = 1; i<=ISBN.length();i++){
             if(i==ISBN.length()){    
                 if(sumOfNums%11==checkNumber){
                     return "Your ISBN is valid";
                 }
                 else{
                     return "Your ISBN is not valid but, " + withoutLastNum + checkNumber;
                 }
             }
             else{
            	 tempValue = Character.getNumericValue(ISBN.charAt(i-1));
                 sumOfNums = sumOfNums + (tempValue*multiplier);
                 multiplier--;
             }
         }
        return "all done"; 
     }
}