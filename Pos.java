
    public class Pos
    {
         public static void main(String [] args)
         {
		String str = new String("malayalam");
                    int i,count=0,j;
			
		for(i=0; i<str.length();i++)
		{	for(j=i; j<str.length();j++)
			if( i==str.indexOf('a',i))
			{
			
			System.out.println("pos" +i);
			i++;
			}
						
		}

         }
    }