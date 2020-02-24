/**
	@author Burhanuddin Lokhandwala
	@version 10.0
*/
public class RoachPopulation
{
	/**
						waitforDoubling is the Method which doubles the population of roaches.
						spray is the Method which reduces the population by 10%.
						getRoaches is the Method,which returns the number of roaches.
	*/
	private int roaches; //Declaring roaches with private.
	RoachPopulation(int n) //Constructor with arguments
	{
		roaches=n;
		System.out.println("The initial value of roaches is "+ roaches);
	}
	public String toString() //Method used to print properties
	{
		roaches=10;
		return "Initial Roaches of Object 1= "+roaches+"\nInitial Roaches of Object 2 = 102";
	}
	RoachPopulation()//Constructor without arguments
	{
		roaches=102; //Giving initial value 102
	}
	public int waitForDoubling() //Method to double population
	{
		roaches=roaches*2; //Double the Population
		return roaches;
	}
	public int spray() //Method to reduce roach population.
	{
		roaches=roaches*9/10; //Getting quotient
		return roaches;
	}
	public int getRoaches() //Method to return roaches.
	{
		return roaches;
	}

	public boolean equals(Object obj) //Method to check if both objects are equal.
	{
		RoachPopulation c =  (RoachPopulation) obj;
		return(	this.getRoaches() == c.getRoaches()); //Check if they're equal.
	}
}