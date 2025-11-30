// WAP which can enter n number from user and stored in one array and print that array elements. 
import java.util.Scanner;
class Arrayelement
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter elements:");
		int n=sc.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("enter elements-"+(i+1)+":");
			a[i]=sc.nextInt();
		}
		System.out.println("array elements");
		for(int ele:a)
		{
			System.out.println(ele);
		}
	}
}