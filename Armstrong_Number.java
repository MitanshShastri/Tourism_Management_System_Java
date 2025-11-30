//WAP to find if the number is Armstrong number or not.
import java.util.Scanner;
class armstrong
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number: ");
		int n= sc.nextInt();
		int temp=n;
		int num=0,rem=0;
		while(n>0)
		{
			rem=n%10;
			num=(rem*rem*rem)+num;
			n=n/10;
		}
		if(temp==num)
		{
			System.out.print("number is an armstrong number");
		}
		else
			System.out.print("number is not an armstrong number");
	}
}