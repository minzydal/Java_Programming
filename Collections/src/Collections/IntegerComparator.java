
package Collections;

import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer> {
    // Define a Comparator<Integer> to order Integers based on the least significant digit
  
      @Override
      public int compare(Integer s1, Integer s2) {
       //  if (s1>s2)
        //     return 1;
        // else return 0;
        return (s1-s2);
      }
   } 
    
 