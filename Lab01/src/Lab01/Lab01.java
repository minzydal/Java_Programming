package Lab01;

public class Lab01 {

	/*
	 * Q1) The diameter, circumference and area of Circle
	 * */
	public int radius;
	final double PI = 3.14159;
	public double diameter;
	public double circumference;
	public double area;
	
	
	public double diameter(int radius){
		return 2 * radius;
	}
	
	public double circumference(int radius) {
		return 2 * PI * radius;
	}
	
	public double area(int radius) {
		return PI * radius * radius;
	}
	
	
	/*
	 * Q2) BMI Calculator
	 * */
	
	public double weight;
	public double height;
	
	public double bmiCalculator(double weight, double height){
		return weight / (height/100 * height/100);
	}
	

	/*
	 * Q3) World Population Growth Calculator
	 * */

	public double currentPop;		//current population
	public double growthRate;		//growth rate
	
	public double annualIncrease(double growthRate, double currentPop) {
		return (growthRate / 100) * currentPop;
	}
	
	public double estimatedPop(double currentPop, double growthRate) {
		return currentPop + (growthRate / 100) * currentPop;
	}
}

