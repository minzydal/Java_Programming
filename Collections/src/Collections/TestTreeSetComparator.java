
package Collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSetComparator {
   public static class PhoneBookComparator implements Comparator<PhoneBookEntry> {
      @Override
      public int compare(PhoneBookEntry p1, PhoneBookEntry p2) {
         return p2.name.compareToIgnoreCase(p1.name);  // descending name
      }
   }

}
