package pack1;

public class http_check {
	static String check(String str)
	{
		if(str.startsWith("https://"))
			{return "secure";}
		else
		if(str.startsWith("http://"))
		{return "not secure";}
		
		return "not secure";
		
	}
	public static void main(String[] args) 
	{
		System.out.println(check("https://en.wikipedia.org/wiki/Main_Page"));
		System.out.println(check("https://en.wikipedia.org/wiki/Main_Page"));
		
		
	}
}
