import java.util.*;

class sample
 {
   ArrayList<String> a=new ArrayList<String>();
   sample()
	{
	   a.add("Suraj");
	   a.add("Hari");
	   a.add("Saravanan");
	   a.add("Mohan");
	   a.add("120");
	   a.add("12.43");

	   Iterator itr=a.iterator();

	   while(itr.hasNext())
		{
	           System.out.println(itr.next());
		}

	}
 }

class ArrayCollection
 {
    public static void main(String asd[])
	{
		 new sample();
	}
 }