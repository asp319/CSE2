//Ashini Patel
//hw07
//Twisty
/*
#     /\     ##     /\     ##     /\   
 #   /  \   #  #   /  \   #  #   /  \  
  # /    \ #    # /    \ #    # /    \ 
   #      \      #      \      #      \
  / #    # \    / #    # \    / #    # 
 /   #  #   \  /   #  #   \  /   #  #  
/     ##     \/     ##     \/     ##  
 make this type of pattern                */
import java.util.Scanner; // import class 
public class Twisty{ //declare a class
    public static void main(String[]args){ //main method 
    
     Scanner myScanner = new Scanner (System.in ); //scanner
int length=0;
int width=0;
     while (true){
       System.out.println("Input your desired length: "); //asking for length
      if (myScanner.hasNextInt()){
       length= myScanner.nextInt();
       if(length>0 && length<80){
       break;
      }
      else{
       continue;
      }
     }
    }
    while(true){
     System.out.println("Input your desired width: "); //asking for width
     if (myScanner.hasNextInt()){
      width= myScanner.nextInt();
      if(width<length){
      break;
     }
     else{
      continue;
      
     }
    }
   }
 //printing lenth*width box
//20*5=100
 /*for(;box>0; box--){
   if (box%length==0){ //80=60 so skip
    System.out.println("");
    }
   else if(box==(length*width)-s){
    System.out.print("#");
    s+=7;
   }
   else if(box==(length*width)-e){ //200=( 200-8[192])
    System.out.print("/");
    e+=8;
   }
   else{
    System.out.print(" ");
   } */
  for(int a=0; a<width; a++){
    //reprinting x
    int s=1;
    int d=length;
    while(d>0){
     if(s%2!=0){
      for(int b=0; b<width; b++){
      if(a==b && d!=0){
     System.out.print("#");
     d--;
    }
     else if(b+a==(width-1) && d!=0){
     System.out.print("/");
     d--;
     }else if(d!=0){
     System.out.print(" ");
     d--;
    }
   }
     }
   else if(s%2==0){
      for(int b=0; b<width; b++){
      if(a==b && d!=0){
     System.out.print("\\");
     d--;
    }
     else if(b+a==(width-1) && d!=0){
     System.out.print("#");
     d--;
     }else if(d!=0){
     System.out.print(" ");
     d--;
    }
   }
   }
 s++;
      
    }
   System.out.println(" "); 
   }
  
  }
}
