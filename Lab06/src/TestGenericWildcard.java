
import java.util.ArrayList;
import java.util.List;

public class TestGenericWildcard {
	   
	   public static void printList(List<Object> lst) {  // accept List of Objects only, 
	                                                     // not List of subclasses of object
	      for (Object o : lst) System.out.println(o);
	   }
	   
	   public static void main(String[] args) {
	      List<Object> objLst = new ArrayList<Object>();
	      objLst.add(55);
	      printList(objLst);   // matches
	   
	      List<String> strLst = new ArrayList<String>();
	      strLst.add("one");
	    //  printList(strLst);  // compilation error
	   }
	}

