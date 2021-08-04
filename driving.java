package customexception; //checkedexception

import java.util.Scanner;

public class driving {

	public static void main(String[] args) throws underage  {
		//or use try catch 
		
		
		int age;

		Scanner sc = new Scanner(System.in);
		age =sc.nextInt();
				
		try 
		{
			if(age<18)
			
			throw new underage();
			
			else 
				System.out.println("enter further details ");
			
		}
		catch(underage e )
		{
			System.out.println(e.getMessage() +"enter proper age ");
		}
		}
	
		
	}



class underage extends RuntimeException 
{
	//try {}use try catch for both bcz in unchecked it will compile the code but will not 
	underage()
	{
		System.out.println("you are under age for licence ");
	}

}