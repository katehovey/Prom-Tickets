import java.util.Scanner;
import java.util.Random;

public class conditionals {
    public static void main(String[] args) 
    { 
    	Scanner customer = new Scanner(System.in); 
    	
    	//This determines the name of the customer
    	
    	System.out.println("TICKET LADY: Hello, dear! May I have your name, last then first?"); 
        String name = customer.nextLine(); 
  
        int firstIndex = name.indexOf(" ");
		int plusOne = firstIndex + 1;
        String firstname = name.substring(plusOne);
		
        System.out.println("Thank you, " + firstname); 
        
        //This next part determines the grade of the customer
        
        System.out.println("And what grade are you in? 9, 10, 11, or 12?"); 
        int grade = customer.nextInt(); 
        
        String ticketType1;
        
        if (grade == 9) {
            System.out.println("Oh, how exciting! Your first prom!"); 
   	        ticketType1 = "freshman";
        }
        else if(grade == 12) {
            System.out.println("Wow! Senior year! This is going to be so memorable for you."); 
            ticketType1 = "senior";
        }
        else if(grade == 10) {
            ticketType1 = "sophomore";
        }
        else {
            ticketType1 = "junior";
        }
        
        //This next part determines the number of tickets the customer will be purchasing

  	    System.out.println("And how many tickets will you be purchasing?"); 
  	    int ticket = customer.nextInt(); 
  	    
  	    String ticketType2;
  	    
        if (ticket == 1) {
      	    System.out.println("Well... nothing wrong with that I guess!"); 
      	    ticketType2 = "single";
      	}
      	else if(ticket == 2) {
            System.out.println("Lucky you ;)"); 
      	    ticketType2 = "couple's";
      	}
      	else {
      	    ticketType2 = "group";
      	}
        
        //This tells the total ticket price
        
        System.out.println("Alright, " + firstname + ", you are a " + ticketType1 + " purchasing a " + ticketType2 + " ticket.");
        double price;
        
        if (grade == 9) {
      	      if(ticket == 1) {
      		    price = 65.00;
      	      }
      	      else if(ticket == 2) {
      		    price = 98.00;
      	      }
      	      else {
      	 	    price = 163.00;
      	      }
      	}
        
      	else if(grade == 10) {
        	  if(ticket == 1) {
          		price = 55.00;  
          	  }
          	  else if(ticket == 2) {
          		price = 83.00;  
          	  }
          	  else {
          		price = 138.00;  
          	  }
      	}
        
      	else if(grade == 11) {
        	  if(ticket == 1) {
          		 price = 45.00; 
          	  }
          	  else if(ticket == 2) {
          		 price = 68.00; 
          	  }
          	  else {
          		  price = 113.00;
          	  }  
      	}	
        
      	else {
      	      if(ticket == 1) {
      		  price = 40.00;
      	      }
      	      else if(ticket == 2) {
      		  price = 60.00;
      	      }
      	      else {
      		  price = 100.00;
      	      }	  
      	}
        
        System.out.println("That will be $" + price);
        
        //This next part generates the confirmation number
        
        int num;
        
        String lA = "abcdefghijklmnopqrstuvwxyz";
        String uA = "ABCDEFGHIJKLMNOPQRZTUVWXYZ";
        
        int count = 1;
        
        System.out.println("Your confirmation number is: ");
        
    while(count <= 6) {
        if (Math.random() < 0.5){
        	num = (int)(Math.random() * 10);
        	System.out.print(num);
        	}
        else{
            if (Math.random() < 0.5){
            	num = (int)(Math.random() * 27);
            	System.out.print(lA.substring(num, (num + 1)));
            	}
            else{
            	num = (int)(Math.random() * 27);
            	System.out.print(uA.substring(num, (num + 1)));
            	}
        	}
        count++;
    	}
    

	}
    
}
      
        

  

