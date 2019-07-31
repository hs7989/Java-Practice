import java.lang.*;
import java.util.*;

public class Array7
{
public static void main(String [] args)
{
	int i,size;
	Scanner s = new Scanner(System.in);

	System.out.println("enter size");
              	size=s.nextInt();

        int x[]= new int[size];

     System.out.println("enter "+size+" integers");

	for(i=0; i<size; i++)
	{
           x[i]=s.nextInt();
	}

         int even [] = new int[size];
         int odd [] = new int[size];
               int j=0,k=0;

            for(i=0 ;i<x.length ; i++)
            {
                if( x[i]%2 == 0)
                {
                   even[j] = x[i];
                    j++;
                }
                else
                {
                   odd[k++] = x[i];
                }
            }

            System.out.println("\n Even Numbers : ");
               for(i=0 ; i<j ; i++)
               {
                   System.out.print(" "+even[i]);
               }

            System.out.println("\n Odd Numbers : ");
               for(i=0 ; i<k ; i++)
               {
                   System.out.print(" "+odd[i]);
               }
	 }
}

