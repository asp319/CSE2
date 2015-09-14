//Ashini Patel
//hw03
//timer class Java Program

import java.util.Scanner;
    public class Timer{ //define a class
     public static void main(String[] args) { //add main method
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter the current time in military time:"); //military time is HHMM format
            int currenttime = myScanner.nextInt();
         System.out.print("Enter the time that you will be eating dinner(in military time):");
            int diningtime = myScanner.nextInt();
        
    int timeleft;
    int hours; // to store hours
    int minutes; // to store minutes 
    timeleft=diningtime-currenttime; //finding the difference
    hours=(timeleft/100);
    minutes=timeleft-(hours*100);
        System.out.println("You have "+hours+" hours and "+minutes+" minutes until dinner.") ;
    } //end of main method
}//end of class 
    