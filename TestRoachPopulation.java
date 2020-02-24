/**
	@author Burhanuddin Lokhandwala
	@version 9.0
*/
class TestRoachPopulation
{
	/**
					Main is the Method which shows beginning of Prog

					@param args String Array
	*/
	public static void main(String args[])
	{
		RoachPopulation rp= new RoachPopulation(10); //Calling Constructor with argument.
		RoachPopulation rp2=new RoachPopulation(); //Calling Constructor without argument.
		for(int i=0;i<4;i++) //Loop used to call methods 3 times.
		{
			rp.waitForDoubling(); //Calling doubling method.
			rp.spray(); //Calling spray method.
			System.out.println(rp.getRoaches()+" roaches"); //Calling method to get number of roaches.
		}
		System.out.println("\n\n\nGiving Initial Value 102 to 2nd Object");
		System.out.println ("Object 1 and Object 2 have Equal Roaches ?\nAnswer = "+ rp. equals (rp2) ); //Using Equals method to check whether both are same.
		System.out.println("\n\n"+rp.toString()); //Calling toString method to print.

	}
}