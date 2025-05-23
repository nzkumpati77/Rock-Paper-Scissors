import java.util.Random;

public class Computer
{
	//instance / member variables
   private String choice;
   
	public Computer()
	{
		randomSetChoice();
	}
	
	public String getChoice()
	{
		return choice;
	}
	
	public void randomSetChoice()
	{
		//use Math.random()
		//use switch case
		int numChoice = (int)(Math.random() * 3);
		switch (numChoice) // assigns string values of rock, paper, and scissors to number values 1, 2, and 3 respectively
		{
			case 0: choice = "rock"; break;
			case 1: choice = "paper"; break;
			case 2: choice = "scissors"; break;
			default : choice = "";
		}

	}	
		
	/*
	 didIWin(Player p) will return the following values
	 	0 - both players have the same choice
	 	1 - the computer had the higher ranking choice
	 	-1 - the player had the higher ranking choice
	 */	
	public int didIWin(Player p)
	{
		String playerChoice = p.getChoice();
		if (playerChoice == choice) { 
			return 0; // when both player and computer chose the same choice
		}
		else if (playerChoice == "rock") {
			if (choice == "scissors") {
				return -1; // player chooses rock ,pooter chooses scissors, player wins
			}
			else if (choice == "paper") {
				return 1; // player chooses rock ,pooter chooses paper, pooter wins
			}
		}
		else if (playerChoice == "scissors") {
			if (choice == "rock") {
				return 1; // player chooses scissors,pooter chooses rock, pooter wins
			}
			else if (choice == "paper") {
				return -1; // player chooses scissors ,pooter chooses paper, player wins
			}
		}
		else if (playerChoice == "paper") {
			if (choice == "rock") {
				return -1; // player chooses paper ,pooter chooses rock, player wins
			}
			else if (choice == "scissors") {
				return 1; // player chooses paper ,pooter chooses scissors, pooter wins
			}
		}
		
		return 0;
	}
	
	public String toString()
	{
		return "pooter " + choice;
	}		   
}