/* Ashini Patel
CSE 02
Lab 06
*/

public class GettingLoopy{ // declare a class
     public static void main(String[]args){ //main method
     
 //Step 1 
      int number = 1;
while (number <7){
	System.out.print( number);
	number++;
}
     while (number>0){
         System.out.print("7");
         number--;
}
        
     
 //Step 2 (finding all the prime numbers 10-100 )
   //using while loop
System.out.println("\n");
System.out.print("While loop:");   
    int i =10;
while (i<=100){
      int factor=2;
      while (i%factor!=0 && factor<i){
          factor++;
          
      }
    if(factor==i){
        System.out.print(i+" ");
    }
    i++;
}
  //using for loop
System.out.println("\n");
System.out.print("For loop:");
    for (i = 10; i < 100; i++) { 
    int factor=2; 
    while (i%factor!=0 && factor<i){
          factor++;
        
    }
    if(factor==i){
        System.out.print(i+" ");
}
}
System.out.println("\n");
System.out.print("Do while loop:");
 i=10;
    do{ int factor=2;
    
        while(i%factor!=0 && factor<i){
        factor++;
            if(factor==i){
                System.out.print(i+" ");
            }
        }
        i++;
        
    }while(i<100 );
    
    
System.out.println("\n");  

//Step 3: smiley face 
int faces =(int)(Math.random()*501) + 5;
System.out.println(faces);
    for(; faces>=5; faces--) { 
         if ((faces-5)%20==0){
         System.out.println("\n");
         System.out.print("ツ");
         } else{System.out.print("ツ");
         }
    
    }

 

     }	
}

 
