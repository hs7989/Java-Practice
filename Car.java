
class Cars
{
public void start()
{
System.out.println("class Cars");
}
}

class Bmw extends Cars
{
public void start()
{
System.out.println("class Bmw");
}
}

class Audi extends Cars
{
public void start()
{
System.out.println("class Audi");
}
}


    public class Car 	
    {
         public static void main(String [] args)
         {
           Cars c;
		
		c = new Bmw();
		c.start();
			
		c = new Audi();
		c.start();
         }
    }