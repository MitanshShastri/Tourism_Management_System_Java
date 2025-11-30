// WAP to find HCF of two numbers using recusrsion.
import java.util.Scanner;
class Recursion
{
	int findHCF(int n1,int n2)
	{
		if(n2==0)
		{
			return n1;
		}
		else
		{
			return findHCF(n2,n1%n2);
		}
	}
}
class Main
{
	public static void main(String[] args)
	{
		Recursion r = new Recursion();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number-1: ");
		int n1 = sc.nextInt();
		System.out.println("Enter number-2: ");
		int n2 = sc.nextInt();
		System.out.println("HCF of two numbers= "+r.findHCF(n1,n2));
	}
}