package pack1;

public class palin {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int arr[]= {5,2,2,33,19,345,67,7};
			pallindrome(arr);

		}
		 static boolean isPallindrome(String s)
		 {
			 StringBuilder sb= new StringBuilder(s);
			 sb.reverse();
			 String s1=sb.toString();
			 return s1.equals(s);
		 }
		 static void pallindrome(int arr[])
		 {
			 for(int i=0;i<arr.length;i++)
			 {
				 
				 if(isPallindrome(arr[i]+""))
				 {
					 System.out.print(arr[i]+" ");
				 }
			 }
		 }
	}


