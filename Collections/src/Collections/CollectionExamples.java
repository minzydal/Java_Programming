package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class CollectionExamples {

	
	// Pre Java1.5 Unsaf Types
    public void exaNonGeneric() {
        List lst = new ArrayList();  // A List contains instances of Object. Upcast ArrayList to List
        lst.add("alpha");            // add() takes Object. String upcast to Object implicitly
        lst.add("beta");
        lst.add("charlie");
        System.out.println(lst);     // [alpha, beta, charlie]

        // Get a "iterator" instance from List to iterate thru all the elements of the List
        Iterator iter = lst.iterator();
        while (iter.hasNext()) {      // any more element
            // Retrieve the next element, explicitly downcast from Object back to String
            String str = (String) iter.next();
            System.out.println(str);
        }
    }

    public void exaGeneric() {
        List<String> lst = new ArrayList<String>();  // Inform compiler about the type
        lst.add("alpha");         // compiler checks if argument's type is String
        lst.add("beta");
        lst.add("charlie");
        System.out.println(lst);  // [alpha, beta, charlie]

        Iterator<String> iter = lst.iterator();   // Iterator of Strings
        while (iter.hasNext()) {
            String str = iter.next();  // compiler inserts downcast operator
            System.out.println(str);
        }

//      lst.add(new Integer(1234));   // ERROR: compiler can detect wrong type
//      Integer intObj = lst.get(0);  // ERROR: compiler can detect wrong type
        // Enhanced for-loop (JDK 1.5)
        for (String str : lst) {
            System.out.println(str);
        }
    }
    
       public  void exaNonAutoBox(){
      List lst = new ArrayList();
 
      // Add 10 random primitive int into the List
      Random random = new Random();
      for (int i = 1; i <= 10; ++i) {
         // Wrap the primitive int into Integer, upcast to Object
         lst.add(new Integer(random.nextInt(10)));
      }
      System.out.println(lst);
 
      Iterator iter = lst.iterator();
      while (iter.hasNext()) {
         // Explicit downcast to Integer, then unwrap to int
         int i = ((Integer)iter.next()).intValue();   // un-safe at runtime
         System.out.println(i);
      }
   }

    public void exaAutoBox() {
        List<Integer> lst = new ArrayList<Integer>();

        // Add 10 random primitive int into the List
        Random random = new Random();
        for (int i = 1; i <= 10; ++i) {
            lst.add(random.nextInt(10)); // autobox to Integer, upcast to Object, type-safe
        }
        System.out.println(lst);

        // Transverse via iterator
        Iterator<Integer> iter = lst.iterator();
        while (iter.hasNext()) {
            int i = iter.next();  // downcast to Integer, auto-unbox to int, type-safe
            System.out.println(i);
        }

        // Transverse via enhance for-loop
        for (int i : lst) {      // downcast to Integer, auto-unbox to int, type-safe
            System.out.println(i);
        }

        // Retrieve via for-loop with List's index
        for (int i = 0; i < lst.size(); ++i) {
            int j = lst.get(i);   // downcast to Integer, auto-unbox to int, type-safe
            System.out.println(j);
        }
    }
}
