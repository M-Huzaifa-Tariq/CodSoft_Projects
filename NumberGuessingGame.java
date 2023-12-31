package com;
import java.util.*;
public class NumberGuessingGame {
	public static void main (String[] Args)
	{
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int minRange=1;
		int maxRange=100;
		int attempts= 5;
		int score= 0;
		boolean PlayAgain= true;
		System.out.println("**** WELCOME TO THE NUMBER GUESSING GAME ****");
		System.out.println("Guess number between " + minRange +  " and "  + maxRange);
		while(PlayAgain)
		{
			int Num = random.nextInt(maxRange - minRange + 1) + minRange;
			int AttemptCount = 0;
			System.out.println("Guess in " + attempts + " attempts.");
			while(AttemptCount < attempts)
			{
				System.out.println("**************");
				System.out.println("enter your guess");
				int UserGuess = scanner.nextInt();
				if(UserGuess == Num)
				{
					System.out.println("Congrats! you guess the correct number:" + Num);
					score++;
					break;
				}
				else if(UserGuess < Num)
				{
					System.out.println("Too Low!");
				}
				else
				{
					System.out.println("Too High!");
				}
				AttemptCount++;
			}
			if(AttemptCount == attempts)
			{
				System.out.println("Out of Attempts. Better luck next time! The corect number was" + Num);	
			}
			System.out.println("DO YOU WANT TO PLAY AGAIN? (Yes/No):");
		    String PlayAgainResponse= scanner.next().toLowerCase();
		    if(PlayAgainResponse.equalsIgnoreCase("Yes"))
		    {
		    	PlayAgain = true;
		    }
		    else if(PlayAgainResponse.equalsIgnoreCase("No"))
		    {
		    	break;
		    }
		}
		System.out.println("Thanks for Playing! You secured " + score +" marks.");
		scanner.close();
		
	}

}
