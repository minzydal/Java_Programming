
package Collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class SetExamples {
 
    // example for test hashSet
   public void exaHashSet01() {
      Book book1 = new Book(1, "Java for Dummies");
      Book book1Dup = new Book(1, "Java for the Dummies"); // same id as above
      Book book2 = new Book(2, "Java for more Dummies");
      Book book3 = new Book(3, "more Java for more Dummies");
 
      Set<Book> set1 = new HashSet<Book>();
      set1.add(book1);
      set1.add(book1Dup); // duplicate id, not added
      set1.add(book1);    // added twice, not added
      set1.add(book3);
      set1.add(null);     // Set can contain a null
      set1.add(null);     // but no duplicate
      set1.add(book2);
      System.out.println(set1); // [null, 1: Java for Dummies,
                                //  2: Java for more Dummies, 3: more Java for more Dummies]
 
      set1.remove(book1);
      set1.remove(book3);
      System.out.println(set1); // [null, 2: Java for more Dummies]
 
      Set<Book> set2 = new HashSet<Book>();
      set2.add(book3);
      System.out.println(set2); // [3: more Java for more Dummies]
      set2.addAll(set1);        // "union" with set1
      System.out.println(set2); // [null, 2: Java for more Dummies, 3: more Java for more Dummies]
 
      set2.remove(null);
      System.out.println(set2); // [2: Java for more Dummies, 3: more Java for more Dummies]
      set2.retainAll(set1);     // "intersection" with set1
      System.out.println(set2); // [2: Java for more Dummies]
   }
   
   public void exaLinkedHashSet() {
      Book book1 = new Book(1, "Java for Dummies");
      Book book1Dup = new Book(1, "Java for the Dummies"); // same id as above
      Book book2 = new Book(2, "Java for more Dummies");
      Book book3 = new Book(3, "more Java for more Dummies");
 
      Set<Book> set = new LinkedHashSet<Book>();
      set.add(book1);
      set.add(book1Dup); // duplicate id, not added
      set.add(book1); // added twice, not added
      set.add(book3);
      set.add(null);  // Set can contain a null
      set.add(null);  // but no duplicate
      set.add(book2);
      System.out.println(set);  // [1: Java for Dummies, 3: more Java for more Dummies,
                                //  null, 2: Java for more Dummies]
   }


   public void exaTreeSetComparable() {
      AddressBookEntry addr1 = new AddressBookEntry("peter");
      AddressBookEntry addr2 = new AddressBookEntry("PAUL");
      AddressBookEntry addr3 = new AddressBookEntry("Patrick");
 
      TreeSet<AddressBookEntry> set = new TreeSet<AddressBookEntry>();
      set.add(addr1);
      set.add(addr2);
      set.add(addr3);
      System.out.println(set); // [Patrick, PAUL, peter]
 
      System.out.println(set.floor(addr2));   // PAUL
      System.out.println(set.lower(addr2));   // Patrick
      System.out.println(set.headSet(addr2)); // [Patrick]
      System.out.println(set.tailSet(addr2)); // [PAUL, peter]
   }
   
   
    // counting words in a sentence
  public int exaHashSet02( String sentence )   {
      HashSet< String > set = new HashSet< String >();
      int duplicates = 0;

      // count duplicates
      for ( String word : sentence.split( "\\s+" ) )
      {
         // remove punctuation and convert to lowercase
         word = word.toLowerCase().replaceAll( "\\W", "" );

         // see if item is already in set
         if ( set.contains( word ) )
            ++duplicates; // increment duplicate count
         else // not already there; add it to the set
            set.add( word );
      } // end while

      return duplicates;
   } 
  
  // sorting words
  
   public void exaTreeSet() {
      Scanner scanner = new Scanner( System.in ); // create scanner

      System.out.println( "Please enter a line of text:" );
      String input = scanner.nextLine(); // get input text

      TreeSet< String > tree = new TreeSet< String >();
      StringTokenizer tokenizer = new StringTokenizer( input );

      // process input text
      while ( tokenizer.hasMoreTokens() )
         tree.add( tokenizer.nextToken() ); // add text to tree

      // print tree elements
      System.out.println( "Elements in tree: " + tree );
   } // end main

  
} 
