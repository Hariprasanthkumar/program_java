class operators
{
    int x=67;
    int y=67;
    operators()
    {
       System.out.println("assignment operators");
       this.getresult();
    }

    void getresult()
    {

       System.out.println(x==y);
        System.out.println(x>=y);
       System.out.println(x>y);      
        System.out.println(x!=y); 
        System.out.println(x<=y);
       System.out.println(x<y);
     
       System.out.println(x==y);
       

    }
}
class assign
{
  public static void main(String [] arg)
  {
    operators obj= new operators();
  }
}