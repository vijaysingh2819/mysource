package pack1;



public class student 
{

	public static void main(String[] args)
	{ 	
		library obj= new library();
		obj.setBook("ab");
		obj.setPrice(500);
		sports s = new sports();
		s.setPlayer(5);
		s.setSname("volleyball");
	System.out.println(obj.getBook());
	System.out.println(obj.getPrice());
	System.out.println(s.getPlayer());
	System.out.println(s.getSname());
	}

	
	
	
	
	
}
