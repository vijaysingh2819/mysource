package pack1;
import java.util.Scanner;
public class area {

	
		static double area(double l, double b)
		{
			return l*b;
		}
		static double area(double s)
		{
			return s*s;
		}
		static double area(double a,double b,double h )
		{
			return(a+b)* h/2;
		}
		
		public static void main(String[] args) {
		
			System.out.println(" R for Rectangle\n S for Sqaure\n T for Trapezium\n Enter the value:");
			Scanner sc=new Scanner(System.in);
			String s=sc.nextLine();
			if(s.equals("R"))
			{
				System.out.println("length of rect.");
				double l=sc.nextDouble();
				System.out.println("Breadth of rect.");
				double b=sc.nextDouble();
				System.out.println("Area of rectangle is:");
				System.out.println(area(l,b));
			}
			if(s.equals("S"))
			{
				System.out.println("Side of Square");
				double l=sc.nextDouble();
				System.out.println("Area of square is:");
				System.out.println(area(l));
			}
			if(s.equals("T"))
			{
				System.out.println("length of first parallel side");
				double l=sc.nextDouble();
				System.out.println("length of second parallel side");
				double b=sc.nextDouble();
				System.out.println("Height of trapezium");
				double h=sc.nextDouble();
				System.out.println("Area of trapezium is:");
				System.out.println(area(l,b,h));
			}
			sc.close();
			
		}

}
