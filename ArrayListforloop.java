import java.util.*;

class student
{
    String name,city;
    int age;
   
   public student(String name,int age,String city)
    {
        this.name=name;
        this.age=age;
        this.city=city;
    }

   
}
class ArrayListforloop
{
    
    public static void main(String asd[])
    {
         ArrayList<student> a1=new ArrayList<student>();
        student obj1=new student("sivam",23,"Salem");
        student obj2=new student("Hari",12,"Salem");
        a1.add(obj1);
        a1.add(obj2);

        for(student s:a1)
        {
            System.out.println(s.name);
            System.out.println(s.age);
            System.out.println(s.city);
        }
    }
}