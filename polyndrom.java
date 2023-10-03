import java.util.*;
class Hari
			
	  {
		Scanner prasanth=new Scanner(System.in);
		
	    Hari()
	         {
			String saro=prasanth.nextLine();
			String p2=saro;
			System.out.println("Enter the name");
			StringBuffer pra = new StringBuffer(saro);
			pra.reverse();
			String p1=pra.toString();
			

		   if(p1.equals(p2))
			{
				System.out.println("this is polyndrom");
			}
		  else
			{
				System.out.println("not polyndrom");
			}
		 }
			
}
class polyndrom
		{
	 	  public static void main(String asd[])
                  {
		    Hari obj=new Hari();		 
		  }
}