class sample
 {
    int x=10,y=12;
    sample()
	{
	   System.out.println(!(x<y));

	   if(!(x<y))
	    {
	       System.out.println("x is less than y");
	    }
	   else
	   {
	       System.out.println("x is not less than");
	   }


	}

 }


class sample2
 {
    public static void main(String asd[])
	{
	  sample obj = new sample();
	}
 }