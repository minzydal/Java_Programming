package Lab02;
import java.util.Scanner;

public class Lab02Test {

	public static void main(String[] args) {
		testTask1();
		testAccount();
		testMyTime();
		testMyPoint();
	}
	

	public static void testTask1() {
		Task1 t1 = new Task1();
		t1.printTable();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();
		
		System.out.println("Pattern A :\n");
		t1.patternA(size);
		System.out.println("");
		System.out.println("Pattern B :\n");
		t1.patternB(size);
		System.out.println("");
		System.out.println("Pattern C :\n");
		t1.patternC(size);
		System.out.println("");
		System.out.println("Pattern D :\n");
		t1.patternD(size);
		System.out.println("");
		
		sc.close();
	}
	
	public static void testAccount() {
		Account a1 = new Account();
		a1.credit(1000000);
		a1.debit(5000000);
		a1.transferTo(a1, 1000000);
		System.out.println(a1);
	}
	
	public static void testMyPoint() {
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(4, 7);
		MyPoint p3 = new MyPoint(p2);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		System.out.println(p1.distance(p3));
	}
	
	public static void testMyTime() {
		
		MyTime t1 = new MyTime();
		MyTime t2 = new MyTime(10);
		MyTime t3 = new MyTime(10, 23);
		MyTime t4 = new MyTime(1, 1, 1);
		MyTime t5 = new MyTime(t4);
	
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4.standardTime());
		System.out.println(t5);
	}
	
}