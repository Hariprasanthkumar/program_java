class Hari{

void getHari0(String name)
  {
   System.out.println("vijay");
   System.out.println(name);
   }

void getHari1()
  {
this.getHari0("mohan");
System.out.println("Hari vijay");
   }
}

class demothis
{
  public static void main(String arg[])
{

    Hari obj= new Hari();
    obj.getHari1();
}

}