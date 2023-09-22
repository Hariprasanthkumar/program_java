class sample 
 {
    public void Hari()
	{
	  System.out.println("method1");
	}
    public void Hari(int x,int y)
	{
	  System.out.println(x+y);
	}
    public void Hari(float x,float y)
	{
	  System.out.println(x+y);
	}
 }

class demooverloading
 {
   public static void main(String asd[])
	{
	   sample obj=new sample();
	   obj.Hari(10.0f,12.3f);
           obj.Hari (5,7);  
	}
 }
