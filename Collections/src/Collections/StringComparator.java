package Collections;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {
      // Define a Comparator<String> to order strings in case-insensitive manner
   
      @Override
      public int compare(String s1, String s2) {
         return s1.compareToIgnoreCase(s2);
      }
   }
    

