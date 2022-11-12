package in.ineuron.main;

  import java.util.Scanner;

   class Guesser
  {
	   int guessNum;
	
	   int guessNum()
    	{
		       Scanner scan=new Scanner (System.in);
		      System.out.println("Guesser, please guess a number between 0 to 100");
		      guessNum =scan.nextInt();
		   
		      
		    	    
		    	     return guessNum;
       }
  }  
   
   
   class Player
   {
	    int guessNum;
		
		int guessNumPlayer1()
		{
			Scanner scan=new Scanner (System.in);
			      System.out.println("Player 1, please guess the number");
			      guessNum =scan.nextInt();
			      
			    return guessNum;
		}
		
		int guessNumPlayer2()
		
		{
			Scanner scan=new Scanner (System.in);
			      System.out.println("Player 2, please guess the number");
			      guessNum =scan.nextInt();
			      return guessNum;
		}
		
		int guessNumPlayer3()
		{
			Scanner scan=new Scanner (System.in);
			      System.out.println("Player 3, please guess the number");
			      guessNum =scan.nextInt();
			      return guessNum;
		}
   }
   
   
   class umpire
   {
	   int numFromGuesser;
	   int numFromPlayer1;
	   int numFromPlayer2;
	   int numFromPlayer3;
	   
	 void collectNumFromGuesser()
	   {
		    Guesser g=new Guesser();
		    
		   numFromGuesser= g.guessNum();
		   if (numFromGuesser >100)
		   {
			   System.out.println("Your number is out of range");
			   
		   }
			   
		  
		   
	   }
	 
	   void  collectNumFromPlayers()
	 {
		   Player p1= new Player();
		   Player p2= new Player();
		   Player p3= new Player();
		    numFromPlayer1= p1.guessNumPlayer1();
		    numFromPlayer2= p2.guessNumPlayer2();
		    numFromPlayer3= p3.guessNumPlayer3();
	 }
	 
    void compare()
    {
	 
 
    	
    
		 if (numFromGuesser ==numFromPlayer1) 
		 {
			 if (numFromGuesser ==numFromPlayer2 &&  numFromGuesser ==numFromPlayer3)
			 {
				 System.out.println("All players won the game");
			 }
			 else if (numFromGuesser ==numFromPlayer2)
			 {
				 System.out.println("Player 1 and 2 won the game"); 
			 }
		      else if (numFromGuesser ==numFromPlayer3)
		     {
			 System.out.println("Player 1 and 3 won the game"); 
		     }
		      else
		      {
		    	  System.out.println("Player 1 won the game");
		      }
		 }
		  
		 else if (numFromGuesser ==numFromPlayer2 )
		 {
			  if (numFromGuesser ==numFromPlayer3)
			  {
			    System.out.println("Player 2 and 3 won the game");
			  }
			  else
			  {
				  System.out.println("Player 2 won the game ");
			  }
		 }
		 else if (numFromGuesser ==numFromPlayer3)
		 {
			 System.out.println("Player 3 is the winner");
		 }
		 
		 else
		 {
			 System.out.println(" Game lost.Try again");
		 }
    
    
     }
          
   }   

  
   

public class GuesserGame {
	
    public static void main(String[] args) {
    	
    	umpire u=new umpire();
    	
    	
    	
    	
    		
    	u.collectNumFromGuesser();
    	
    	u.collectNumFromPlayers();
    	u.compare();
		
		

	}

}
