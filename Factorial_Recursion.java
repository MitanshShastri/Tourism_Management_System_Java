// WAP to print factorial using recursion.
import java.util.Scanner;
class Recursion
{
	int f=1;
	void fac(int n)
	{
		if(n==0)
		{
			System.out.println("factorial: "+f);
			return;
		}
		else
		{
			f=f*n;
			fac(n-1);
		}
	}
}
class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Recursion r = new Recursion();
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
		r.fac(n);
		
	}
}