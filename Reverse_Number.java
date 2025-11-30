//WAP to reverse a number
import java.util.Scanner;
class reverse
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number: ");
		int n= sc.nextInt();
		int r=0;
		while(n>0)
		{
			r=n%10;
			System.out.print(r);	
			n=n/10;
		}
	}
}
		