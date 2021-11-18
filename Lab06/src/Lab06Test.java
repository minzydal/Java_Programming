import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Lab06Test {

	public static void main(String[] args) {
		testEmployee();
		System.out.println("\n Maze Stack : ");
		testMazest();
		System.out.println("Maze Queue : ");
		testMazeq();	
		System.out.println("List : ");
		testList();
		System.out.println("Polynomial : ");
		testPolynomial();
		testConcate();
		System.out.print("Copy : \n");
		testCopy();
		System.out.println("Reverse : \n");
		testReverse();
		
	}
	
	public static void testMazest() {
		MazeStack ms = new MazeStack();
		ms.runMaze();
	}
	
	public static void testMazeq() {
		MazeQueue mq = new MazeQueue();
		mq.runMaze();
	}
	
	public static void testEmployee() {
		LinkedList<Employee> list = new LinkedList<Employee>();
		list.add(new Employee("John", 30));
		list.add(new Employee("Raynolds", 27));
		list.add(new Employee("Bob", 40));
		list.add(new Employee("Steven", 35));
		list.add(new Employee("Amy", 20));
		list.add(new Employee("Emma", 25));
		
		// First way : using a standalone class
		Collections.sort(list, new EComparator());
		System.out.println("< In the order of age > ");
		System.out.println(list);
		}

	
	public static void testConcate() {
		List<Integer> list1 = new List<Integer>();
		System.out.println("\n List1 :");
		//insert numbers to list1
		list1.insertAtFront(12);
		list1.insertAtFront(1);		
		list1.insertAtFront(6);
		list1.insertAtBack(32);
		//print datas of list1
		list1.print();
		
		List<Integer> list2 = new List<Integer>();
		System.out.println("\n List2 :");
		//insert numbers to list2
		list2.insertAtBack(42);
		list2.insertAtBack(52);
		list2.insertAtBack(42);
		list2.insertAtBack(52);
		list2.insertAtBack(42);
		list2.insertAtBack(52);
		//print datas of list2
		list2.print();
		System.out.println();
		System.out.println("Concate : ");
		List<Integer> list = new List<Integer>();
		//execute concate function
		list = list.concate(list1, list2);
		list.print();
		
		System.out.println();
	}
	
	public static void testPolynomial() {
		List<Term> p1 = new List<Term>();
	
		//insert datas to Polynomial List
		p1.insertAtBack(new Term(3.0, 0));
		p1.insertAtBack(new Term(2.0, 1));
		p1.insertAtBack(new Term(4.5, 2));
		p1.insertAtBack(new Term(3.1, 3));
		p1.print();
		
		//to print the coeff.
		
		ListNode<Term> temp = p1.getFirstNode();
		
		while(temp!=null) {
			System.out.println(temp.getData().getCoeff() + " ");
			temp = temp.getNext();
		}
		System.out.println();
		
		//insert datas to LinkedList
		LinkedList<Term> p2 = new LinkedList<Term>();
		p2.add(new Term(3.0, 0));
		p2.add(new Term(2.0, 1));
		p2.add(new Term(4.5, 2));
		p2.add(new Term(3.1, 3));
		System.out.println(p2);
		
		Iterator<Term> itr = p2.iterator();
		
		while(itr.hasNext()) {
			Term tm = itr.next();
			System.out.println(tm.getCoeff() + " ");	
		}
		for(Term tm: p2) {
			System.out.println(tm.getCoeff() + " ");
		}
	}
	
	
	public static void testList() {
		List<Integer> list1 = new List<Integer>();
		//insert datas to list1
		list1.insertAtFront(12);
		list1.insertAtFront(1);		
		list1.insertAtFront(6);
		list1.insertAtBack(32);
		list1.insertAtBack(42);
		list1.insertAtBack(52);
		list1.print();
		//remove data of firstnode
		list1.removeFromFront();
		System.out.println("Remove from front : ");
		list1.print();
		//remove data of lastnode
		System.out.println("Remove from back : ");
		list1.removeFromBack();
		list1.print();
		//list1.reverse(list1);
		//List<Integer> copy = new List<integer>();
		//list1.copy.copying(list1);
		
		System.out.println("\nDouble list : ");
		List<Double> list2 = new List<Double>();
		//insert double value datas to list2
		list2.insertAtFront(12.8);
		list2.insertAtFront(3.1);
		list2.insertAtFront(4.6);
		list2.insertAtBack(3.32);
		list2.insertAtBack(6.42);
		list2.insertAtBack(5.2);
		list2.print();
		System.out.println("Remove from front : ");
		list2.removeFromFront();
		list2.print();
		System.out.println("Remove from back : ");
		list2.removeFromBack();
		list2.print();
		
		System.out.println("\nName list : ");
		List<String> list3 = new List<String>();
		list3.insertAtFront("Minzy");
		list3.insertAtFront("Kim");
		list3.insertAtFront("Daisy");
		list3.print();
		System.out.println();
	}
	
	public static void testReverse() {
		
		List<Integer> list1 = new List<Integer>();
		list1.insertAtFront(5);
		list1.insertAtFront(4);		
		list1.insertAtFront(3);
		list1.insertAtBack(2);
		list1.insertAtBack(1);
		System.out.println("List1 :");
		list1.print();
		
		List<Integer> list = new List<Integer>();
		list.reverse(list1);
}
	
	
	public static void testCopy() {
		List<Integer> list1 = new List<Integer>();
		list1.insertAtFront(12);
		list1.insertAtFront(1);		
		list1.insertAtFront(6);
		list1.insertAtBack(32);
		list1.insertAtBack(42);
		list1.insertAtBack(52);
		System.out.println("List1 :");
		list1.print();
		
		System.out.println("copied List : ");
		
		List<Integer> list = new List<Integer>();
		list.copy(list1);
		list.print();

		
	}
};