public class ComputerRunner
{
	public static void main(String[] args)
	{
		//instantiate a new Computer named c
		Computer c = new Computer();
		//call and print out getChoice()				//outs random choice
		System.out.println(c.getChoice());								//outs pooter random choice
		
		//call randomChoice
		c.randomSetChoice();
		System.out.println(c);								//outs pooter random choice
		
		//this code will test didIWin( Player p )
		System.out.println(c.didIWin(new Player("dude","rock")));
		System.out.println(c.didIWin(new Player("dude","paper")));
		System.out.println(c.didIWin(new Player("dude","scissors")));				
	}
}
