import java.util.Scanner; // import scanner
public class Area{ //declare a class
    public static void main(String[]args){ //main method 
    Scanner myScanner = new Scanner (System.in ); //scanner
        double slength=0;
        double theight=0;
        double twidth=0;
        double cradius=0;
        String shape="";
        
        String s="";
        String t="";
        String c="";
    while (true){
       System.out.println("Enter shape:");
    shape=myScanner.next();
         s="square";
         t="triangle";
         c="circle";

        if (shape.equals(s)){
            System.out.println("Enter length:");
            slength=check();
            break;
        }
        else if (shape.equals(t)){
            System.out.println("Enter height:");
            theight=check();
            System.out.println("Enter width:");
            twidth=check();
            break;
        }
        else if (shape.equals(c)){
            System.out.println("Enter radius:");
            cradius=check();
            break;
        }
        else{
            continue;
            
        }
        }
        
        double sarea=squarearea(slength);
        double tarea=trianglearea(theight, twidth);
        double carea=circlearea(cradius);
     if(shape.equals(s)){
         System.out.println("The area of the square is "+ sarea);
        } 
     else if(shape.equals(t)){
         System.out.println("The area of the triangle is "+ tarea);
        }
     if(shape.equals(c)){
         System.out.println("The area of the circle is "+ carea);
        }
    }//end of main method
     
    
    //doublemethod
    public static double check( ){
    Scanner myScanner = new Scanner (System.in ); //scanner
       while (!myScanner.hasNextDouble())
{
    System.out.println("Invalid input, Type the double-type number:");
    myScanner.next();
}
double userInput = myScanner.nextDouble();    // need to check the data type?
        return userInput;
    }
    //square area
    public static double squarearea(double slenght){
        double sarea=slenght*slenght;
        return sarea;
        
    }
    
    //triangle area
    public static double trianglearea(double theight, double twidth){
        double tarea=0.5*(theight*twidth);
        return tarea;
        
    }
    
    //circle area
    public static double circlearea(double cradius){
        double carea=3.14*cradius*cradius;
        return carea;
    }  
    
 }
    
        
 