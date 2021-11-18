package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import Collections.TestTreeSetComparator.PhoneBookComparator;

public class CollectionsTest {

	public static void main(String[] args) {
		
	test o1 = new test();
	test o2 = new test();
	
	if(o1 > o2)
		System.out.println("point i1 is greater than o2");
	
	
	CollectionExamples ce = new CollectionExamples();
	       // ce.exaGeneric();
	        //ce.exaNonGeneric();
	        
	  exaTreeSetComparator();
	        
	       //ListExamples le= new ListExamples();
	       
	       //le.exaToArray();
	      // le.ArrayAsList ();
	      //le.exaLinkedList();
	      //le.examPriorityQueue();
	     // SetExamples se = new SetExamples();
	     // System.out.println(se.exaHashSet02("ss aa dd vv vv  aa gg aa aa bgg"));
	     // se.exaLinkedHashSet();
	    //  System.out.println();
	     // se.exaHashSet01();
	     //   System.out.println();
	     //   se.exaTreeSetComparable();
	      //  testComprator();
	}

	
	public static void testComprator() {
	      // Use a customized Comparator for Strings
	      Comparator<String> compStr = new StringComparator();
	 
	      // Sort and search an "array" of Strings
	      String[] array = {"Hello", "Hi", "HI", "hello"};
	      Arrays.sort(array, compStr);
	      System.out.println(Arrays.toString(array));  // [Hello, hello, Hi, HI]
	      System.out.println(Arrays.binarySearch(array, "Hello", compStr)); // 1
	      System.out.println(Arrays.binarySearch(array, "HELLO", compStr)); // 1 (case-insensitive)
	 
	      // Use a customized Comparator for Integers
	      Comparator<Integer> compInt = new IntegerComparator();
	 
	      // Sort and search a "List" of Integers
	      List<Integer> lst = new ArrayList<Integer>();
	      lst.add(42);  // auto-box
	      lst.add(21);
	      lst.add(34);
	      lst.add(13);
	      Collections.sort(lst, compInt);
	      System.out.println(lst);  // [21, 42, 13, 34]
	   }
	
	 
	   public static void exaTreeSetComparator() {
	      PhoneBookEntry addr1 = new PhoneBookEntry("peter");
	      PhoneBookEntry addr2 = new PhoneBookEntry("PAUL");
	      PhoneBookEntry addr3 = new PhoneBookEntry("Patrick");
	 
	      Comparator<PhoneBookEntry> comp = new PhoneBookComparator();
	      TreeSet<PhoneBookEntry> set = new TreeSet<PhoneBookEntry>(comp);
	      set.add(addr1);
	      set.add(addr2);
	      set.add(addr3);
	      System.out.println(set);    // [peter, PAUL, Patrick]
	 
	      Set<PhoneBookEntry> newSet = set.descendingSet();  // Reverse the order
	      System.out.println(newSet); // [Patrick, PAUL, peter]
	   }
}
