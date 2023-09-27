import java.io.*;

class user
{
     DataInputStream ha=new DataInputStream(System.in);
  String n;
  int a;
     user()
     { 
       
         try
         {

            System.out.println("enter you name:");
            n= ha.readLine(); 
            System.out.println(" your name:"+n);

            System.out.println("enter you age:");
            a=Integer.parseInt( ha.readLine());
            System.out.println(" your age:"+a);
         }
         catch( Exception s){}
     }
    
}

class userlogin
{
    public static void main(String [] atd)
    {
        user obj=new user();
    }
}

