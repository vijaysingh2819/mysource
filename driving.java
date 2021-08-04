package customexception;

import java.util.Scanner;

public class driving {

	public static void main(String[] args) throws underage  {
		
		
		int age;

		Scanner sc = new Scanner(System.in);
		age =sc.nextInt();
				
		if(age<18)
		{
			throw new underage();
		}
		else {
			System.out.println("enter further details ");
		}
	}

}

class underage extends Exception 
{
	underage()
	{
		System.out.println("you are under age for licence ");
	}

}