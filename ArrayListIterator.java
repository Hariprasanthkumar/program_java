import java.util.*;  
public class ArrayListIterator
{  
 public static void main(String args[])
 {  
  ArrayList<Integer> list=new ArrayList <Integer>();
  list.add(1);

  list.add(2);    
  list.add(3);    
  list.add(4);    
    
  Iterator itr=list.iterator();  
  while(itr.hasNext())
  {

   System.out.println(itr.next());  
  }  
 }  
}  