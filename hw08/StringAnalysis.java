//start
import java.util.Scanner; // import scanner
public class StringAnalysis{ //declare a class
    public static void main(String[]args){ //main method 
    Scanner myScanner = new Scanner (System.in ); //scanner
    
    String string="";
System.out.println("Enter String: ");
     string= myScanner.next(); 
   
System.out.println("Do you want to examine all chacters? type yes or no.");
String q=myScanner.next();
String y="yes";
String n="no";
int x=0;
if(q.equals(n)){
    System.out.println("type the number character:");
    int p=myScanner.nextInt();
    x=p-1;

}


  
  
boolean test=Analysis( string, x);
System.out.println(test);
        
    }
    
    
public static boolean Analysis( String string){
   int len = string.length(); 
int n=0;
char letter='\0';
for(;n<len;n++){
letter = string.charAt(n);
    if (Character.isLetter(letter)){
    }
    else{
        System.out.println("There is not a letter at position:"+ n);
  
            }

        }
       return true; 
    
    }

public static boolean Analysis( String string,int x ){
    char letter='\0';
  letter = string.charAt(x); 
  if (Character.isLetter(letter)){
    return true;}
    else {
        System.out.println("at position"+ x+ "there is not a letter");
        return false;
        }

    }

}