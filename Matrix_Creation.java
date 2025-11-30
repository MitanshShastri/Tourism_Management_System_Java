//WAP to take n numbers from user and create a matrix
import java.util.Scanner;
class matrix1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter numbers for rows:");
		int rows=sc.nextInt();
		System.out.print("enter numbers for columms:");
		int cols=sc.nextInt();
		int[][] m=new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print("enter element ["+i+"]["+j+"]:");
				m[i][j]=sc.nextInt();
			}
			System.out.println("the matrix is:");
			for( i=0;i<rows;i++)
			{
				for(int j=0;j<cols;j++)
				{
					System.out.print(m[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}