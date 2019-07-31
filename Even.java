import java.util.*;
import java.lang.*;
public class Even
{
	public static void main(String [] args)
	{
	int i,j,num;
	System.out.println("enter no. of lines to be printed");
	Scanner s= new Scanner(System.in);
	num=s.nextInt();
		for(i=1;i<=num;i++)
		{
		for(j=1;j<=i;j++)
		{
		System.out.print(" "+(i+j+1)%2);
		}
		System.out.println(" ");
		}
	
	}
}