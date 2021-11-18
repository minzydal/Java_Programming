package Lab01;
import java.util.Scanner;	// i'm using the scanner to accept input

public class Lab01Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the number you want to operate(1. Circle 2. BMI 3. Population) : ");
		int selection = sc.nextInt();
		
		switch(selection) {	// you can choose what you want to operate
	
		case 1 :
			Scanner input = new Scanner(System.in);
			
			System.out.println("Please enter the radius number : ");
			int c = input.nextInt();

			Lab01 L = new Lab01();
			
			System.out.println("The diameter of Circle is " + L.diameter(c));
			System.out.println("The circumference of Circle is " + L.circumference(c));
			System.out.println("The area of Circle is " + L.area(c));
			
			input.close();	// you have to close the scanner once you use it
			break;
			
		case 2 :
			Scanner weight1 = new Scanner(System.in);
			Scanner height1 = new Scanner(System.in);
			
			System.out.println("Please enter your weight : ");
			double w = weight1.nextDouble();
			System.out.println("Please enter your height : ");
			double h = height1.nextDouble();

			Lab01 L1 = new Lab01();
			
			System.out.println("BMI : " + L1.bmiCalculator(w, h));
			
			weight1.close();
			height1.close();
			
			break;
			
		case 3 :
			Scanner CurrentP = new Scanner(System.in);
			Scanner GrowthR = new Scanner(System.in);
			
			System.out.println("Enter current Population : ");
			double cp = CurrentP.nextDouble();		//current population to accept input
			System.out.println("Enter annual Population growth rate : ");
			double gr = GrowthR.nextDouble();			//growth rate to accept input

			Lab01 L2 = new Lab01();
			
			for(int i = 1; i <= 5; i ++) {	// i'm using the repetitive statement to shorten the sentence 
				System.out.println("Estimated population after " + i + "year: " + L2.estimatedPop(cp, gr));
		        cp = L2.estimatedPop(cp, gr);	// put the current value to current population to calculate estimated population exactly 
			}
			
		    CurrentP.close();
		    GrowthR.close();
		    break;
		    
		    default :	// if you choose the number which is not included in the condition,
		    			// this below sentence might be displayed
		    	System.out.println("You put the wrong number. Please try again. ");
		 }
		sc.close();
	}
}
