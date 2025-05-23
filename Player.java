public class Player
{
	private String name;
	private String choice;

	public Player(String nm) // constructor with one parameter with the name of the player
	{
        name = nm;
	} 	
	
	public Player(String nm, String ch) // constructor with one parameter with the name of the player and the choice of the player
	{
        name = nm;
        choice = ch;
	} 
		
	public void setName( String nm) // mutator method that would set the paramter(the uesr's name) into the instance varibale name
	{
        name = nm; //instance varibale allows for it to be used in multiple methods within the class
	}	
		
	public void setChoice( String ch ) // mutator method that would set the paramter(the uesr's choice) into the instance varibale choice
	{
        choice = ch; //instance varibale allows for it to be used in multiple methods within the class		
	}	
		
	public String getChoice() // accesor method return the user's choice
	{
		return choice;
	}	
		
	public String getName() // accesor method to return the user's name
	{
		return name;
	}
	
	public String toString() // This always run when called with an object instaniation calls it or you try to print the object instantiaton's refrence variable
	{
		return name + " " + choice;
	}
}