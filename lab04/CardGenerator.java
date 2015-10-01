//Ashini 
//Lab 04 
//a program that will pick a random card from the deck 
//select a number from 1 to 52 (inclusive)
//1-13 represent the diamonds
//14-26 represent the clubs
//27-39 represents hearts
//40-52 represents then spades
//14 is the ace of clubs, 15 is the 2 of clubs, and 26 is the king of clubs.

public class CardGenerator{
        //main method
    public static void main( String[] args ) { 
        int randomcard = (int)(Math.random()*52)+1; //picking card number 1-52
        String MySuit ="";
    
        
        int tempsuit= randomcard/13 ;
        if (randomcard % 13 ==0){
            tempsuit-=1;
            
        }
        if (randomcard % 26 ==1){
            tempsuit-=1;
            
        }
        if (randomcard % 39 ==2){
            tempsuit-=1;
            
        }
        if (randomcard % 52 ==3){
            tempsuit-=1;
            
        }
            
        
        switch(tempsuit){          
            case 0:
                MySuit= "diamonds"; 
                break; 
            case 1:
                MySuit= "clubs";
                break;
            case 2:
                MySuit= "hearts";
                break;
            default:
                MySuit= "spades";
                break;
            
        }  
       
        int tempnumber= randomcard ;
        switch(randomcard){
         case 1: case 14: case 27: case 40: 
             tempnumber=1;
             break;
         case 2: case 15: case 28: case 41:
             tempnumber= 2;
             break;
         case 3: case 16: case 29: case 42:
             tempnumber= 3;
             break;
         case 4: case 17: case 30: case 43:
             tempnumber= 4;
             break;
         case 5: case 18: case 31: case 44:
             tempnumber= 5;
             break;
         case 6: case 19: case 32: case 45:
             tempnumber= 6;
             break;
         case 7: case 20: case 33: case 46:
             tempnumber= 7;
             break;
         case 8: case 21: case 34: case 47:
             tempnumber= 8;
             break;
         case 9: case 22: case 35: case 48:
             tempnumber= 9;
             break;
         case 10:  case 23: case 36: case 49:
             tempnumber= 10;
             break;
         case 11: case 24: case 37: case 50:
             tempnumber= 11;
             break;
         case 12: case 25: case 38: case 51:
             tempnumber= 12;
             break;
         case 13: case 26: case 39: case 52:
            tempnumber= 13;
             break;
        }
         String tempstring= tempnumber+"";
        switch (tempnumber){
            case 1:
                tempstring="Ace";
                break;
            case 11:
                tempstring= "Jack";
                break;
            case 12:
                tempstring= "Queen";
                break;
            case 13:
                tempstring= "King";
            default:
                tempstring= tempnumber+ "";
             }
       
        
       
       
     System.out.println("You picked the  "+tempstring  +" of " + MySuit+"."); 
     
    }
}
        
        