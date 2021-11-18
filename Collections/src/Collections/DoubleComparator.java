
package Collections;

import java.util.Comparator;

public class DoubleComparator implements Comparator< Double >
   {
      public int compare( Double first, Double second )
      {
         return Double.compare( first, second );
      } 
   } 