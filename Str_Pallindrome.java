//WAP to check a given string is pallindrome or not without using reverse method.
import java.util.Scanner;
class strpallindrome
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String: ");
		String s= sc.next();
		String s1= s;
		String rev="";
		int len=s.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if( s1.equals(rev))
		{
			System.out.println(s1+" :pallinndrome string");
		}
		else
		{
			System.out.println(s1+" : not a pallinndrome string");
		}
	}
}