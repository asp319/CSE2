public class Poker{
        //main method
    public static void main( String[] args ) { 
        int randomcard1 = (int)(Math.random()*52)+1; //picking 1 card number 1-52
        int randomcard2 = (int)(Math.random()*52)+1; //picking 2 card number 1-52
        int randomcard3 = (int)(Math.random()*52)+1; //picking 3 card number 1-52
        int randomcard4 = (int)(Math.random()*52)+1; //picking 4 card number 1-52
        
        String MySuit1 ="";
    
        
        int tempsuit1= randomcard1/13 ;
        if (randomcard1 % 13 ==0){
            tempsuit1-=1;
            
        }
        if (randomcard1 % 26 ==1){
            tempsuit1-=1;
            
        }
        if (randomcard1 % 39 ==2){
            tempsuit1-=1;
            
        }
        if (randomcard1 % 52 ==3){
            tempsuit1-=1;
            
        }
            
        
        switch(tempsuit1){          
            case 0:
                MySuit1= "diamonds"; 
                break; 
            case 1:
                MySuit1= "clubs";
                break;
            case 2:
                MySuit1= "hearts";
                break;
            default:
                MySuit1= "spades";
                break;
            
        }  
       
        int tempnumber1= randomcard1 ;
        switch(randomcard1){
         case 1: case 14: case 27: case 40: 
             tempnumber1 = 1;
             break;
         case 2: case 15: case 28: case 41:
             tempnumber1= 2;
             break;
         case 3: case 16: case 29: case 42:
             tempnumber1= 3;
             break;
         case 4: case 17: case 30: case 43:
             tempnumber1= 4;
             break;
         case 5: case 18: case 31: case 44:
             tempnumber1= 5;
             break;
         case 6: case 19: case 32: case 45:
             tempnumber1= 6;
             break;
         case 7: case 20: case 33: case 46:
             tempnumber1= 7;
             break;
         case 8: case 21: case 34: case 47:
             tempnumber1= 8;
             break;
         case 9: case 22: case 35: case 48:
             tempnumber1= 9;
             break;
         case 10:  case 23: case 36: case 49:
             tempnumber1= 10;
             break;
         case 11: case 24: case 37: case 50:
             tempnumber1= 11;
             break;
         case 12: case 25: case 38: case 51:
             tempnumber1= 12;
             break;
         case 13: case 26: case 39: case 52:
            tempnumber1= 13;
             break;
        }
        
     String MySuit2 ="";
    
        
        int tempsuit2= randomcard2/13 ;
        if (randomcard2 % 13 ==0){
            tempsuit2-=1;
            
        }
        if (randomcard2 % 26 ==1){
            tempsuit2-=1;
            
        }
        if (randomcard2 % 39 ==2){
            tempsuit2-=1;
            
        }
        if (randomcard2 % 52 ==3){
            tempsuit2-=1;
            
        }
            
        
        switch(tempsuit2){          
            case 0:
                MySuit2= "diamonds"; 
                break; 
            case 1:
                MySuit2= "clubs";
                break;
            case 2:
                MySuit2= "hearts";
                break;
            default:
                MySuit2= "spades";
                break;
            
        }  
       
        int tempnumber2= randomcard2 ;
        switch(randomcard2){
         case 1: case 14: case 27: case 40: 
             tempnumber2 = 1;
             break;
         case 2: case 15: case 28: case 41:
             tempnumber2= 2;
             break;
         case 3: case 16: case 29: case 42:
             tempnumber2= 3;
             break;
         case 4: case 17: case 30: case 43:
             tempnumber2= 4;
             break;
         case 5: case 18: case 31: case 44:
             tempnumber2= 5;
             break;
         case 6: case 19: case 32: case 45:
             tempnumber2= 6;
             break;
         case 7: case 20: case 33: case 46:
             tempnumber2= 7;
             break;
         case 8: case 21: case 34: case 47:
             tempnumber2= 8;
             break;
         case 9: case 22: case 35: case 48:
             tempnumber2= 9;
             break;
         case 10:  case 23: case 36: case 49:
             tempnumber2= 10;
             break;
         case 11: case 24: case 37: case 50:
             tempnumber2= 11;
             break;
         case 12: case 25: case 38: case 51:
             tempnumber2= 12;
             break;
         case 13: case 26: case 39: case 52:
            tempnumber2= 13;
             break;
        }
        
        
     String MySuit3 ="";
    
        
        int tempsuit3= randomcard3/13 ;
        if (randomcard3 % 13 ==0){
            tempsuit3-=1;
            
        }
        if (randomcard3 % 26 ==1){
            tempsuit3-=1;
            
        }
        if (randomcard3 % 39 ==2){
            tempsuit3-=1;
            
        }
        if (randomcard3 % 52 ==3){
            tempsuit3-=1;
            
        }
            
        
        switch(tempsuit3){          
            case 0:
                MySuit3= "diamonds"; 
                break; 
            case 1:
                MySuit3= "clubs";
                break;
            case 2:
                MySuit3= "hearts";
                break;
            default:
                MySuit3= "spades";
                break;
            
        }  
       
        int tempnumber3= randomcard3 ;
        switch(randomcard3){
         case 1: case 14: case 27: case 40: 
             tempnumber3 = 1;
             break;
         case 2: case 15: case 28: case 41:
             tempnumber3= 2;
             break;
         case 3: case 16: case 29: case 42:
             tempnumber3= 3;
             break;
         case 4: case 17: case 30: case 43:
             tempnumber3= 4;
             break;
         case 5: case 18: case 31: case 44:
             tempnumber3= 5;
             break;
         case 6: case 19: case 32: case 45:
             tempnumber3= 6;
             break;
         case 7: case 20: case 33: case 46:
             tempnumber3= 7;
             break;
         case 8: case 21: case 34: case 47:
             tempnumber3= 8;
             break;
         case 9: case 22: case 35: case 48:
             tempnumber3= 9;
             break;
         case 10:  case 23: case 36: case 49:
             tempnumber3= 10;
             break;
         case 11: case 24: case 37: case 50:
             tempnumber3= 11;
             break;
         case 12: case 25: case 38: case 51:
             tempnumber3= 12;
             break;
         case 13: case 26: case 39: case 52:
            tempnumber3= 13;
             break;
        }
            
     String MySuit4 ="";
    
        
        int tempsuit4= randomcard4/13 ;
        if (randomcard4 % 13 ==0){
            tempsuit4-=1;
            
        }
        if (randomcard4 % 26 ==1){
            tempsuit4-=1;
            
        }
        if (randomcard4 % 39 ==2){
            tempsuit4-=1;
            
        }
        if (randomcard4 % 52 ==3){
            tempsuit4-=1;
            
        }
            
        
        switch(tempsuit4){          
            case 0:
                MySuit4= "diamonds"; 
                break; 
            case 1:
                MySuit4= "clubs";
                break;
            case 2:
                MySuit4= "hearts";
                break;
            default:
                MySuit4= "spades";
                break;
            
        }  
       
        int tempnumber4= randomcard4 ;
        switch(randomcard4){
         case 1: case 14: case 27: case 40: 
             tempnumber4 = 1;
             break;
         case 2: case 15: case 28: case 41:
             tempnumber4= 2;
             break;
         case 3: case 16: case 29: case 42:
             tempnumber4= 3;
             break;
         case 4: case 17: case 30: case 43:
             tempnumber4= 4;
             break;
         case 5: case 18: case 31: case 44:
             tempnumber4= 5;
             break;
         case 6: case 19: case 32: case 45:
             tempnumber4= 6;
             break;
         case 7: case 20: case 33: case 46:
             tempnumber4= 7;
             break;
         case 8: case 21: case 34: case 47:
             tempnumber4= 8;
             break;
         case 9: case 22: case 35: case 48:
             tempnumber4= 9;
             break;
         case 10:  case 23: case 36: case 49:
             tempnumber4= 10;
             break;
         case 11: case 24: case 37: case 50:
             tempnumber4= 11;
             break;
         case 12: case 25: case 38: case 51:
             tempnumber4= 12;
             break;
         case 13: case 26: case 39: case 52:
            tempnumber4= 13;
             break;
        }
      
     System.out.println("You picked the  "+tempnumber1  +" of " + MySuit1+"."); 
     System.out.println("You picked the  "+tempnumber2  +" of " + MySuit2+".");
     System.out.println("You picked the  "+tempnumber3  +" of " + MySuit3+".");
     System.out.println("You picked the  "+tempnumber4  +" of " + MySuit4+".");
     
     boolean result;
if (tempnumber1==tempnumber2){
System.out.println("You have a pair!");
}
else{
System.out.println("You have a high card hand!");
}

 
    }
}