
    class Employee
    {
        String ename;
        int eid;

        public Employee()
        {
        }
 
        public Employee(String ename , int eid)
        {
          // System.out.println("\n this => "+this);
           this.ename = ename;
           this.eid = eid;      
        }

        public boolean equals(Object o)
        {
            if(o instanceof Employee)
            {
                Employee obj = (Employee) o;

                 if(this.eid == obj.eid && ename.equals(obj.ename))
                 {
                      return true;
                 }   
                 else
                 {
                      return false;
                 }
            }
            else
            {
                 return false;
            }
        }

        public String toString()
        {
            return eid + " "+ ename;
        }
  
    }  

    public class EqualsDemo 
    {
         public static void main(String [] args)
         {
             java.util.Scanner s = new java.util.Scanner(System.in);

                 Employee e1 = new Employee("Hardeep" , 101);
                 Employee e2 = new Employee("Hardeep" , 101);

                  if(e1.equals(e2))
                  {
                     System.out.println("EQUAL");
                  }   
                  else
                  {
                     System.out.println("NOT EQUAL");
                  }


                   System.out.println("\n e1 => "+e1);
                   System.out.println("\n e2 => "+e2);


         }
    }