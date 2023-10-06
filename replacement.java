public class replacement
{
public static void main(String args[])
{
String s1="Senthilraja Rajesh";
String[] words=s1.split("\\s");

for(String w:words){
System.out.println(w);
}
}
}
public class replace
{  
    public static void main(String args[])
    {  
    String s1="Hariii";  
    String replaceString=s1.replace('i','e');
    System.out.println(replaceString);  
    }
}  
    