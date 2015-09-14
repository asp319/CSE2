//Ashini Patel
//hw03
//calculating the volume and surface area of a block

import java.util.Scanner;
    public class Block{ // declare a class
     public static void main(String[]args){ //main method
       Scanner myScanner = new Scanner (System.in );
       
       System.out.print("Enter the length of the block:");
         double length= myScanner.nextDouble();
       System.out.print("Enter the width of the block:");
         double width= myScanner.nextDouble();
       System.out.print("Enter the height of the block:");
         double height= myScanner.nextDouble();
    
    double volume;
    volume=length*width*height; //calculating volume
    System.out.println("The volume of the block of dimensions "+length+" x "+width+" x "+height+" is "+volume+" .");
    double surfacearea;
    double surface;
    surface= width*height+length*width+length*height;
    surfacearea=surface*2;
    System.out.println("The surface are of the block is "+surfacearea+" ."); 
    }//end of main method
}//end of class


       