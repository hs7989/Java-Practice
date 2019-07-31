import java.util.*;
import java.lang.*;

public class Floyd
{
	public static void main(String [] args)
	{
		int i,j,num=1,n;
		System.out.println("enter number of lines to print");
		Scanner s = new java.util.Scanner(System.in);
		n=s.nextInt();
	for(i=0; i<=n;i++)
	{
		for(j=1;j<=i;j++)
		{
		System.out.print(" "+num);
		n++;

		}
	
		System.out.println("");
		}
	}
}