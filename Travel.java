import java.util.Date;
import java.util.Scanner;

class Sample
{
	void display()
	{
	System.out.println("Travels");
	}
}

class Sample1 extends Sample //override
{
	void display()
	{ 
		System.out.println("          ");
		System.out.println("                                                             Amaravathi Travels              ");
		System.out.println(" ");
		System.out.println("*******************************************************************************************************************************************************************************");
		System.out.println("   ");
		System.out.println(" Amaravathi Travels is car online platform that has transformed car travel in the country by bringing ease and convenience to millions of Indians who travel using cars.\n Founded in 2019, Amaravathi Travels is part of India's Leading Travel Online Company. Company Founder is Jasti Satykrishna.  ");
		System.out.println("  ");
		
	}
}

abstract class Charge
{
abstract void cars();
}


class Car extends Charge
{
  
     void cars()
	{
	    
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println(" Enter your Details ");
    	 System.out.println(" ");
    	 System.out.print(" Your Name: ");
     	String Name=sc.next();
         System.out.println(" ");
         System.out.print(" Email: ");
         String Email=sc.next();
         
         System.out.println(" ");
         System.out.print(" Phone Number: ");
         Double phone=sc.nextDouble();
         System.out.println(" ");
        System.out.println(" We have four different types of cars");
		System.out.println(" ");
		System.out.println(" 1.SWIFT 2.ALTO 3.BENZ 4.BMW");
		System.out.println(" ");
		System.out.print(" Select car: ");
		//Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        switch(n)
        {
        case 1:System.out.println(" ");
        	   System.out.println(" Selected SWIFT");
        	   System.out.println(" ");
               System.out.print(" Trip Days: ");    
                int day=sc.nextInt();
                System.out.println(" ");
                System.out.println(" Booking Completed " +day+" Day's Trip"); 
                //System.out.println("");
                System.out.println(" ");
                
                
                if(n==1)
        		{
                	
                    System.out.print(" If Customer needs how many days Extend: ");
                int dayss=sc.nextInt();
                System.out.println("  ");
                System.out.print(" Total Days Booking by Customer: "+(day+dayss));
                System.out.println("  ");
                System.out.println("  ");
                System.out.print(" Rent: ");
                
        		int rent=(dayss+day)*4000;
        		System.out.print(rent);
        		System.out.println("  ");
        		System.out.println("\n If you book the car you have paid to half amount");
        		System.out.println("  ");
        		System.out.print(" Half amount is:");
        		int half=(rent)/2;
        		System.out.print(half);
        		System.out.println("     ");
        		System.out.println("      ");
        		System.out.print(" Customer given the amount: ");
        		int amount=sc.nextInt();
        		if(amount==half)
        		{
        		boolean a=true;
        		System.out.println(" ");
        		System.out.println(" Booking is Confirmed: " +a);
        		System.out.println("  ");
        		Date d=new Date();
        		System.out.println(" Booking Time: " +d);
        		System.out.println(" ");
        		System.out.println(" Happy Journey");
        
        		}
        		
        		else
        		{ 
        			boolean b=false;
        			System.out.println(" ");
        			System.out.println(" Booking is Confirmed: " +b);
        			System.out.println(" ");
        			System.out.println(" Have a Nice Day");
        		}
        		
        		}
                
                break;
                
        case 2:System.out.println(" ");
 	           System.out.println(" Selected ALTO");
 	           System.out.println(" ");
               System.out.print(" Trip days: ");    
               int d1=sc.nextInt();
               System.out.println(" ");
               System.out.println(" Booking completed " +d1+" day's Trip"); 
         
               System.out.println(" ");
         //System.out.println("Happy Journey");  
        
               if(n==2)
 		   {
         
            	   System.out.print(" If Customer needs how many days Extend: ");
         int dayss1=sc.nextInt();
         System.out.println("  ");
         System.out.print(" Total Days Booking by customer: "+(d1+dayss1));
         System.out.println("  ");
         System.out.println("  ");
         System.out.print(" Rent: ");
         //int dayss=sc.nextInt();
 		int rent=(dayss1+d1)*4000;
 		System.out.print(rent);
 		System.out.println("  ");
 		System.out.println("\n If you book the car you have paid to half amount");
 		System.out.println("  ");
 		System.out.print(" Half amount is:");
 		int half=(rent)/2;
 		System.out.print(half);
 		System.out.println("     ");
 		System.out.println("      ");
 		System.out.print(" Customer given the amount: ");
 		int amount=sc.nextInt();
		if(amount==half)
		{
		boolean a=true;
		System.out.println(" ");
		System.out.println(" Booking is Confirmed: " +a);
		System.out.println("  ");
		Date d=new Date();
		System.out.println(" Booked Time: " +d);
		System.out.println(" ");
		System.out.println(" Happy Journey");

		}
		
		else
		{ 
			boolean b=false;
			System.out.println(" ");
			System.out.println(" Booking is Confirmed: " +b);
			System.out.println(" ");
			System.out.println(" Have a Nice Day");
		}
		
		}
         break;
               
        case 3:System.out.println(" ");
  	   System.out.println(" Selected BENZ");
  	   System.out.println(" ");
         System.out.print(" Trip days: ");    
          int d2=sc.nextInt();
          System.out.println(" ");
          System.out.println(" Booking completed " +d2+" day's Trip"); 
          //System.out.println("");
          System.out.println(" ");
          //System.out.println("Happy Journey");  
          if(n==3)
  		{
          
        	  System.out.print(" If Customer needs how many days Extend: ");
          int dayss2=sc.nextInt();
          System.out.println("  ");
          System.out.print(" Total Days Booking by customer: "+(d2+dayss2));
          System.out.println("  ");
          System.out.println("  ");
          System.out.print(" Rent: ");
          //int dayss=sc.nextInt();
  		int rent=(dayss2+d2)*4000;
  		System.out.print(rent);
  		System.out.println("  ");
  		System.out.println("\n If you book the car you have paid to half amount");
  		System.out.println("  ");
  		System.out.print(" Half amount is:");
  		int half=(rent)/2;
  		System.out.print(half);
  		System.out.println("     ");
  		System.out.println("      ");
  		System.out.print(" Customer given the amount: ");
  		int amount=sc.nextInt();
		
		if(amount==half)
		{
		boolean a=true;
		System.out.println(" ");
		System.out.println(" Booking is Confirmed: " +a);
		System.out.println("  ");
		Date d=new Date();
		System.out.println(" Booking Time: " +d);
		System.out.println(" ");
		System.out.println(" Happy Journey");

		}
		
		else
		{ 
			boolean b=false;
			System.out.println(" ");
			System.out.println(" Booking is Confirmed: " +b);
			System.out.println(" ");
			System.out.println(" Have a Nice Day");
		}
		
		}
          break;
               
        case 4:System.out.println(" ");
  	   System.out.println(" Selected BMW");
  	   System.out.println(" ");
         System.out.print(" Trip days: ");    
          int d3=sc.nextInt();
          System.out.println(" ");
          System.out.println(" Booking completed " +d3+" day's Trip"); 
          //System.out.println("");
          System.out.println(" ");
          //System.out.println("Happy Journey");  
          if(n==4)
  		{
         System.out.print(" If Customer needs how many days Extend: ");          
         int dayss3=sc.nextInt();
          System.out.println("  ");
          System.out.print(" Total Days Booking by customer: "+(d3+dayss3));
          System.out.println("  ");
          System.out.println("  ");
          System.out.print(" Rent: ");
          //int dayss=sc.nextInt();
  		int rent=(dayss3+d3)*4000;
  		System.out.print(rent);
  		System.out.println("  ");
  		System.out.println("\n If you book the car you have paid to half amount");
  		System.out.println("  ");
  		System.out.print(" Half amount is:");
  		int half=(rent)/2;
  		System.out.print(half);
  		System.out.println("     ");
  		System.out.println("      ");
  		System.out.print(" Customer given the amount: ");
  		int amount=sc.nextInt();
		if(amount==half)
		{
		boolean a=true;
		System.out.println(" ");
		System.out.println(" Booking is Confirmed: " +a);
		System.out.println("  ");
		Date d=new Date();
		System.out.println(" Booking Time: " +d);
		System.out.println(" ");
		System.out.println(" Happy Journey");

		}
		
		else
		{ 
			boolean b=false;
			System.out.println(" ");
			System.out.println(" Booking is Confirmed: " +b);
			System.out.println(" ");
			System.out.println(" Have a Nice Day");
		}
		
		}          
          
          break;
               
            default: System.out.println(" ");
            	     System.out.println(" We have 4 Cars only");
                     break;
        }
        
	}
}


public class Travelproject{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d=new Date();
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n\t\t\t\t\t\t\t\t\t\t\t\t\t" +d);
		
		Sample1 s=new Sample1();
		s.display();
		
		Charge c=new Car();
		c.cars();
		
		
	}

}
