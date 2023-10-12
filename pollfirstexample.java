import java.util.*;
public class pollfirstexample
    {
   public static void main(String[] args) 
   
   {

      // create a LinkedList
      LinkedList list = new LinkedList();

      // add some elements
      list.add("Hariprasanth");
      list.add("Hari is my friend");
      list.add("Chocolate");
      list.add("Atthur");

      // print the list
      System.out.println("LinkedList:" + list);

      // retrieve and remove the first element of the list
      System.out.println("First element of the list:" + list.pollFirst());

      // print the list
      System.out.println("LinkedList:" + list);
   }
}