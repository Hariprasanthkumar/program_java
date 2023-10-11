import java.util.*;

class student
{
    String name,city;
    int age;
    ArrayList a1=new ArrayList();
    student(String name,int age,String city)
    {
        this.name=name;
        this.age=age;
        this.city=city;

        a1.add(this.name);
        a1.add(this.age);
        a1.add(this.city);

    }

    public void display()
    {
        Iterator itr=a1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
class ArrayListIT 
{
    public static void main(String asd[])
    {
        student obj1=new student("sivam",23,"Salem");
        student obj2=new student("Hari",12,"Salem");
        obj1.display();
         obj2.display();
    }
}