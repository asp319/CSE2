//Ashini Patel
//hw06
//Bar Graph 
//weekly expenses 
import java.util.Scanner; // import class 
public class BarGraph{ //declare a class
    public static void main(String[]args){ //main method 
    
     Scanner myScanner = new Scanner (System.in ); //scanner
     
     System.out.print("Expences for Monday: $"); //asking for number
     double mon= myScanner.nextDouble();
     
     int m = (int)Math.round(mon); //rounding number
     
     System.out.print("Expences for Tuesday: $");
     double tues= myScanner.nextDouble();
     
     int t = (int)Math.round(tues);
     
     System.out.print("Expences for Wednesday: $");
     double wed= myScanner.nextDouble();
     
     int w = (int)Math.round(wed);
     
     System.out.print("Expences for Thursday: $");
     double thurs= myScanner.nextDouble();
     
     int th = (int)Math.round(thurs);
     
     System.out.print("Expences for Friday: $");
     double fri= myScanner.nextDouble();
     
     int f = (int)Math.round(fri);
     
     System.out.print("Expences for Saturday: $");
     double sat= myScanner.nextDouble();
     
     int s = (int)Math.round(sat);
     
     System.out.print("Expences for Sunday: $");
     double sun= myScanner.nextDouble();
     
     int su = (int)Math.round(sun);
     
     System.out.println("");
     System.out.print("Mon:");
     while(m>0){
         System.out.print("*");
         m--;
     }
    System.out.println("");
    System.out.print("Tues:");
     while(t>0){
         System.out.print("*");
         t--;
     }
    System.out.println("");
    System.out.print("Wed:");
     while(w>0){
         System.out.print("*");
         w--;
     }
    System.out.println("");
    System.out.print("Thu:");
     while(th>0){
         System.out.print("*");
         th--;
     }
    System.out.println("");
    System.out.print("Fri:");
     while(f>0){
         System.out.print("*");
         f--;
     }
    System.out.println("");
    System.out.print("Sat:");
     while(s>0){
         System.out.print("*");
         s--;
     }
     System.out.println("");
     System.out.print("Sun:");
     while(su>0){
         System.out.print("*");
         su--;
     }
     
     
     double weeklyex= (mon+tues+wed+thurs+fri+sat+sun);
     double avg= weeklyex/7;
     double roundOff = (double) Math.round(avg * 100) / 100;
     
     
     double fouryrs= weeklyex*208;
     
     System.out.println("");
     System.out.println("Your average weekly expenses are: $"+roundOff);
     
     double sum=0;
     for (int weeks=208; weeks>0; weeks-- ){
     double perc = ((double)(Math.random()*41)-20)/100;
   
     double expenses=(1+perc)*roundOff;
  
     
     sum = sum + expenses;
     }
     
     double roundedsum = (double) Math.round(sum * 100) / 100;
     System.out.println("Estimated expenditure for 4 years: $"+ roundedsum);
     
     
     
    }
}