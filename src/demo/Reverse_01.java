package demo;

public class Reverse_01 
{
	public class Reverse_Number {

		public static void main(String[] args) 
		{
			int no =223;
			int rev = 0;
			int rem=0;
			while(no!=0)
			{
				rem=no%10;
				rev=rev*10+rem;
				no=no/10;
			}
			System.out.println(rev);
		}
}
}