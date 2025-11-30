// WAP to find out the sum of first and last digit of a given number.
import java.util.Scanner;
class sum 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number: ");
		int n= sc.nextInt();
		int lastdigit= n%10;
		int firstdigit= n;
		while(firstdigit>=10)
		{
			firstdigit/=10;
		}
		int sum=firstdigit+lastdigit;
		System.out.println(" the sum of first digit and last digit is: "+sum);
	}
}