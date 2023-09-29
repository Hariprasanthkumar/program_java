import java.io.*;
class hari5

{
    DataInputStream obj= new  DataInputStream(System.in);
    hari5()
    {
    try{
        System.out.println("enter your name:");
        String name= obj.readLine();
        System.out.println("enter your sex:");
        
         
        String sex= obj.readLine();
         
        System.out.println(" your name:"+name);
        System.out.println(" your sex:"+sex);
        
        
    
    }catch(Exception H){}
    }
}
class demologinuser
{
    public static void main(String asd[])
    {
        hari5 obj=new hari5();

    }
}