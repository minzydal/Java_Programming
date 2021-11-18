
public class OverloadedMethods {
	

	   // method printArray to print Integer array
	   public static void printArray(Integer[] inputArray)
	   {
	      // display array elements
	      for (Integer element : inputArray)
	         System.out.printf("%s ", element);

	      System.out.println();
	   }

	   // method printArray to print Double array
	   public static void printArray(Double[] inputArray)
	   {
	      // display array elements
	      for (Double element : inputArray)
	         System.out.printf("%s ", element);

	      System.out.println();
	   }

	   // method printArray to print Character array
	   public static void printArray(Character[] inputArray)
	   {
	      // display array elements
	      for (Character element : inputArray)
	         System.out.printf("%s ", element);

	      System.out.println();
	   }
	   
	   // generic method printArray
	   public  <T> void printArrayG(T[] inputArray)
	   {
	      // display array elements
	      for (T element : inputArray)
	         System.out.print(" " + element);

	      System.out.println();
	   }

	} // end class OverloadedMethods

