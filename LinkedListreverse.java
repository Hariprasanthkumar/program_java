import java.util.*;  
public class LinkedListreverse{  
 public static void main(String args[]){  
  
  LinkedList<String> ll=new LinkedList<String>();  
           ll.add("hari");  
           ll.add("Vijay");  
           ll.add("Suraj");  
           ll.add("dinesh"); 
           ll.add("praveen"); 
           ll.add("saravanan"); 
           //Traversing the list of elements in reverse order  
           Iterator i=ll.descendingIterator();  
           while(i.hasNext())  
           {  
               System.out.println(i.next());  
           }  
             
 }  
}  