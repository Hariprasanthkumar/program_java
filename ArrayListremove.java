import java.util.*;  
 class ArrayListremove 
 {  
  
        public static void main(String [] args)  
        {  
          ArrayList<String> al=new ArrayList<String>();  
          al.add("mankatha");    
          al.add("ajith");    
          al.add("movie");   
          al.add("Directed by");  
          al.add("Venkat Prabhu");  
          System.out.println("Action and Thriller movie "+al);   
           
          al.remove("movie");  
          System.out.println("Thalapathy 68"+al);   
           
          al.remove(0);  
          System.out.println("thalapathy leo project completed"+al);   
            
            
          ArrayList<String> al2=new ArrayList<String>();    
          al2.add("thrisha");    
          al2.add("parthi");    
            
          al.addAll(al2);  
          System.out.println("leo caste : "+al);   
            
          al.removeAll(al2);  
          System.out.println("removeAll() method: "+al);   
           
          al.removeIf(str -> str.contains("vijay"));    
          System.out.println("removeIf() method: "+al);  
           
          al.clear();  
          System.out.println("After invoking clear() method: "+al);   
       }  
    }                   