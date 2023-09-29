class abs
 {
    String hero,city;
    String movie,song;

    abs(String hero,String movie,String city,String song)
	{
          this.hero=hero;
          this.movie=movie;
          this.city=city;
          this.song=song;
	}
 }


class thalapathy 	
 { 
   String movie;
   String song;
   abs add;	// entity relationship 
   thalapathy(String movie,String song,abs add)
	{
	   this.movie=movie;
           this.song=song;
	   this.add=add;
	}

   public void displaydetails()
	{
            System.out.println("hero="+movie);
	    System.out.println("city="+song);
	    System.out.println("movie="+add.movie);
	    System.out.println("song="+add.song);
	    System.out.println("City="+add.city);
	    System.out.println("hero="+add.hero);


	 }

 }
   class demoabstract
 {
   public static void main(String asd[])
	{
	    abs a1=new abs("vijay","leo","chennai","naa ready");
         
        thalapathy t1=new thalapathy("vijay", "naa ready dhavarava", a1);
        t1.displaydetails();
	}
 }

