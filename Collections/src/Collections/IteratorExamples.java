
package Collections;

import java.util.ArrayList;
import java.util.List;

public class IteratorExamples {
    

   public  void exaForEachMutable() {
      List<StringBuilder> lst = new ArrayList<StringBuilder>();
      lst.add(new StringBuilder("alpha"));
      lst.add(new StringBuilder("beta"));
      lst.add(new StringBuilder("charlie"));
      System.out.println(lst);   // [alpha, beta, charlie]
 
      for (StringBuilder sb : lst) {
         sb.append("88");   // can modify "mutable" objects
      }
      System.out.println(lst);  // [alpha88, beta88, charlie88]
   }
  

   public static void exaForEachImmutable() {
      List<String> lst = new ArrayList<String>();
      lst.add("alpha");
      lst.add("beta");
      lst.add("charlie");
      System.out.println(lst);   // [alpha, beta, charlie]
 
      for (String str : lst) {
         str += "change!";   // cannot modify "immutable" objects
      }
      System.out.println(lst);   // [alpha, beta, charlie]
   }
}

