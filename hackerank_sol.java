package pack1;
import java.io.*;
import java.util.Scanner;  
public class hackerank_sol {

	private static int rs[];

	public static void main(String[] args) throws Exception  {
	 
		
		   
	   int a, b , n ;
	    Scanner s = new Scanner(System.in);
	    System.out.println("enter a,b,n respectively");
	    
	   a= s.nextInt();
	   b= s.nextInt();
	   n= s.nextInt();
	   
	   rs = null;
	   
	   
	   for(int i= 0;i<=n;i++)
	   {
		   rs[i]=(int) (a+ Math.pow(2.0,b))*b;
		   System.out.println(rs[i]);
	   }
		}  

	}


