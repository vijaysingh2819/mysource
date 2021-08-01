package pack1;

public class library {
	
	private String  book;
	private float  price;
	
	
	public String getBook( ) {
		return book;
	}
	public void setBook(String book) {
		
		this.book = book;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		if(price>50) {
		this.price = price;
	}
		else 
		{
			System.out.println("very less price ");
		}
	}
	
	
	
	
	
}
