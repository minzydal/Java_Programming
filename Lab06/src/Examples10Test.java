
public class Examples10Test {
	public static void main(String[] args) 
	   {
		//testMaximumThree();
		//testOverloadedMethods();
		testStack();
	   } 
	
	public static void testMaximumThree() {
		MaximumThree mt= new MaximumThree();
	      System.out.printf("Maximum of %d, %d and %d is %d%n%n", 3, 4, 5, 
	    	         mt.maximum(3, 4, 5));
	    	      System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f%n%n", 
	    	         6.6, 8.8, 7.7, mt.maximum(6.6, 8.8, 7.7));
	    	      System.out.printf("Maximum of %s, %s and %s is %s%n", "pear", 
	    	         "apple", "orange", mt.maximum("pear", "apple", "orange"));
	    	   } 

	
	
	public static void testOverloadedMethods(){
		OverloadedMethods olm = new OverloadedMethods();
		  // create arrays of Integer, Double and Character
	      Integer[] integerArray = {1, 2, 3, 4, 5, 6};
	      Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
	      Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};
	      
	      System.out.println();
	      
	      System.out.printf("Array integerArray contains:%n");
	      olm.printArray(integerArray); // pass an Integer array
	      System.out.printf("%nArray doubleArray contains:%n");
	      olm.printArray(doubleArray); // pass a Double array
	      System.out.printf("%nArray characterArray contains:%n");
	      olm.printArray(characterArray); // pass a Character array
	      


	      System.out.print("Array integerArray contains ");
	      olm.printArrayG(integerArray); // pass an Integer array 
	      System.out.printf("Array doubleArray contains ");
	      olm.printArrayG(doubleArray); // pass a Double array
	      System.out.printf("Array characterArray contains ");
	      olm.printArrayG(characterArray); // pass a Character array
	}
	   public static void testStack() 
	   {
	      double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
	      int[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	      
	      // Create a Stack<Double> and a Stack<Integer>
	      Stack<Double> doubleStack = new Stack<>(5); 
	      Stack<Integer> integerStack = new Stack<>(); 

	      // push elements of doubleElements onto doubleStack
	      testPushDouble(doubleStack, doubleElements); 
	      testPopDouble(doubleStack); // pop from doubleStack

	      // push elements of integerElements onto integerStack
	      testPushInteger(integerStack, integerElements); 
	      testPopInteger(integerStack); // pop from integerStack
	   } 

	   // test push method with double stack
	   private static void testPushDouble(
	      Stack<Double> stack, double[] values)
	   {
	      System.out.printf("%nPushing elements onto doubleStack%n");

	      // push elements to Stack
	      for (double value : values)
	      {
	         System.out.printf("%.1f ", value);
	         stack.push(value); // push onto doubleStack
	      }
	   }

	   // test pop method with double stack
	   private static void testPopDouble(Stack<Double> stack)
	   {
	      // pop elements from stack
	      try
	      {
	         System.out.printf("%nPopping elements from doubleStack%n");
	         double popValue; // store element removed from stack

	         // remove all elements from Stack
	         while (true)
	         {
	            popValue = stack.pop(); // pop from doubleStack
	            System.out.printf("%.1f ", popValue); 
	         }
	      }
	      catch(EmptyStackException emptyStackException)
	      {
	         System.err.println();
	         emptyStackException.printStackTrace();
	      } 
	   } 

	   // test push method with integer stack
	   private static void testPushInteger(
	      Stack<Integer> stack, int[] values)
	   {
	      System.out.printf("%nPushing elements onto integerStack%n");

	      // push elements to Stack
	      for (int value : values)
	      {
	         System.out.printf("%d ", value);
	         stack.push(value); // push onto integerStack
	      } 
	   }

	   // test pop method with integer stack
	   private static void testPopInteger(Stack<Integer> stack)
	   {
	      // pop elements from stack
	      try
	      {
	         System.out.printf("%nPopping elements from integerStack%n");
	         int popValue; // store element removed from stack

	         // remove all elements from Stack
	         while (true)
	         {
	            popValue = stack.pop(); // pop from intStack
	            System.out.printf("%d ", popValue);
	         }
	      } 
	      catch(EmptyStackException emptyStackException)
	      {
	         System.err.println();
	         emptyStackException.printStackTrace();
	      } 
	   }

}
