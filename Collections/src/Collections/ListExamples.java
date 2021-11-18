
package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class ListExamples {
    
   public void exaToArray() {
      List<String> lst = new ArrayList<String>();
      lst.add("alpha");
      lst.add("beta");
      lst.add("charlie");
 
      // Use the Object[] version
      Object[] strArray1 = lst.toArray();
      System.out.println(Arrays.toString(strArray1));   // [alpha, beta, charlie]
 
      // Use the generic type verion - Need to specify the type in the argument
      String[] strArray2 = lst.toArray(new String[0]);
      strArray2[0] = "delta";   // modify the returned array
      System.out.println(Arrays.toString(strArray2));   // [delta, beta, charlie]
      System.out.println(lst);  // [alpha, beta, charlie] - no change in the original list
   }
   
   public void ArrayAsList () {
      String[] strs = {"alpha", "beta", "charlie"};
      System.out.println(Arrays.toString(strs));   // [alpha, beta, charlie]
 
      List<String> lst = Arrays.asList("abc", "aaa","abdc", "aafffa");
      System.out.println(lst);  // [alpha, beta, charlie]
 
      // Changes in array or list write thru
      strs[0] += "88";
      lst.set(2, lst.get(2) + "99");
      System.out.println(Arrays.toString(strs)); // [alpha88, beta, charlie99]
      System.out.println(lst);  // [alpha88, beta, charlie99]
 
      // Initialize a list using an array
      Integer[] aryI={22, 44, 11, 33};
      List<Integer> lstInt = Arrays.asList(aryI);
      System.out.println(lstInt);  // [22, 44, 11, 33]
   }   
   
    public  void exaLinkedList(){
      Queue< Integer > list1 = new LinkedList<Integer>();
      List< Integer > list2 = new LinkedList<Integer>();
      LinkedList< Integer > list = new LinkedList<Integer>();
      int newNumber;
      Random randomNumber = new Random();

      // Create objects to store in the List
      for ( int k = 0; k < 25; k++ )
      {
         newNumber = randomNumber.nextInt( 101 );
         list.add( newNumber );
      } // end for
        System.out.println( list );
      Collections.sort( list );
      System.out.println( list );

      int count = 0;
      Iterator< Integer > iterator = list.iterator();

      // calculate total
      while ( iterator.hasNext() ) 
         count += iterator.next();

      System.out.printf( "Sum is: %d\nAverage is: %.2f", count,
            ( ( double ) count / list.size() ) );
   } 
       
       // QueueTest
      
   public void examPriorityQueue()
   {
      // queue of capacity 5 and a new Comparator
    DoubleComparator dc=   new DoubleComparator();
      PriorityQueue< Double > queue =  new PriorityQueue< Double >(15,dc);

      // insert elements to queue
      queue.offer( 16.2 );
      queue.offer( 9.8 );
      queue.offer( 5.4 );
      queue.offer( 1.4 );
       queue.offer( 4.4 );
        queue.offer( 1.5 );

      System.out.print( "Polling from queue: " );

      // display elements in queue
      while ( queue.size() > 0 )
      {
          System.out.println();
         System.out.printf( "%.1f ", queue.peek() ); // view top element
            queue.poll(); // remove top element
         
      } // end while
   }
}  
 