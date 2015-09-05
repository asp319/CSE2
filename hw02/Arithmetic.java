//Ashini Patel
//HW02
//finding the tax for shopping trip
//
public class Arithmetic{
        //main method
    public static void main( String[] args ) { 
//need to figure out these things
//Total cost of each kind of item; 
//sales tax for that total cost, of each item
//Total cost of purchases (before tax)
//Total actually paid for this transaction, including sales tax


int nSocks=3; //Number of pairs of socks
double sockCost$=2.58; //Cost per pair of socks

int nGlasses=6; //Number of drinking glasses
double glassCost$=2.29; //Cost per glass

int nEnvelopes=1; //Number of boxes of envelopes
double envelopeCost$=3.25; //cost per box of envelopes

double taxPercent=0.06; //tax in PA

double costofsocks$, costofglasses$, costofenvelopes$; //before tax
costofsocks$=(nSocks*sockCost$);
costofglasses$=(nGlasses*glassCost$);
costofenvelopes$=(nEnvelopes*envelopeCost$);
;

double taxcostofsocks$, taxcostofglasses$, taxcostofenvelopes$, salessocks$, salesglasses$,salesenvelopes$; //multiplying each individually to find  just the tax
taxcostofsocks$=(costofsocks$*taxPercent);
salessocks$ = ((int)(taxcostofsocks$*100))/100.0; 
taxcostofglasses$=(costofglasses$*taxPercent);
salesglasses$=((int)(taxcostofglasses$*100))/100.0; 
taxcostofenvelopes$=(costofenvelopes$*taxPercent);
salesenvelopes$=((int)(taxcostofenvelopes$*100))/100.0; 

//all of the numbers before this were not in the right 00.00 format



double totalcostofpurchase$; // total cost before tax
totalcostofpurchase$=costofsocks$+costofglasses$+costofenvelopes$;

double totaltransactioncost$,total$;
totaltransactioncost$=totalcostofpurchase$*taxPercent;
total$=((int)(totaltransactioncost$*100))/100.0;

//printing output data
System.out.println("Before tax, the socks cost "+"$"+costofsocks$+" ,the glasses cost "+"$"+costofglasses$+" and the envelopes cost "+"$"+costofenvelopes$+".");
System.out.println("The sales tax on the socks was "+"$"+salessocks$+", the sales tax on the glasses was "+"$"+salesglasses$+" and the sale tax on the envelopes was "+"$"+salesenvelopes$+".");
System.out.println("Before tax the total cost was "+"$"+totalcostofpurchase$+".");
System.out.println("After sales tax the total cost was "+"$"+total$+".");




    } //end of main method
} //end of class

