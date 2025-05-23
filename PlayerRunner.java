public class PlayerRunner
{
	public static void main(String[] args)
	{
		Player s = new Player("Michael Jackson", "rock");

		System.out.println(s.getChoice());			//outs rock
		//call the getName() method 					//outs Michael Jackson
		System.out.println(s);								//outs Michael Jackson rock
		
		//set the choice to paper
		System.out.println(s);								//outs Michael Jackson paper	
		
		//instantiate a new Player named jb named Jim Bob that chose scissors
		//print out Jim Bob	

		Player b = new Player("Jim Bob", "scisors"); //runs constructor with two parameters
		
		System.out.println(b.getName());
		
	}
}

