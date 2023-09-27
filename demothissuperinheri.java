class Mohan
{
 Mohan()
 {
   //this.display();
   System.out.println("i am constructor");
 }
 void display()
 {
  int a=10;
  int b=29;
 // this.display1("manmohan sing",1,23.89f);
  System.out.println(a+b);

 }
 void display1(String name,int age,float mark)
 {
  System.out.println(name );
  System.out.println(age );
  System.out.println(mark );
 }
 void display2(String movie)
 {
  System.out.println(movie);
 }
}
class hari extends Mohan
{
  hari()
  {
    super.display1("manmohan",23,3f);
    super.display();
    super.display2("leo");
  }
}
class demothissuperinheri
{
  public static void main(String aaa[])
  {
    ///Mohan obj=new Mohan();
    //obj.display(); 
    hari obj=new hari();

  }
}

  