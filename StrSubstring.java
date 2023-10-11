public class StrFormat  
{  
     
    public static void main(String args[])  
    {  
        String s1 = new String("tekfilo");   
        String s2 = new String(" Hari");      
        String s =String.format(s1,s2);     
            System.out.println(s.toString()); 
             
    }  
}  
public class StrJoin  
{  
    /* Driver Code */  
    public static void main(String args[])  
    {  
        String s1 = new String("Hello");    
        String s2 = new String(" World");      
        String s = String.join("",s1,s2);     
            System.out.println(s.toString());  
    }  
} 
public class StrSubstring
{    
 public static void main(String args[])
 {    
 String s="SachinTendulkar";    
 System.out.println("Original String: " + s);  
 System.out.println("Substring starting from index 6: " +s.substring(6)); 
 System.out.println("Substring starting from index 0 to 6: "+s.substring(0,6));  
 }  
}     