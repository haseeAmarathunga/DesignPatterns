package com.factoryPattern;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter Num1 : ");
		double num1=input.nextDouble();
		
		System.out.println("Enter Num2 : ");
		double num2=input.nextDouble();
		
		System.out.println("Enter Add or Subtract or Divide");
		CalculateFactory factory=new CalculateFactory();
		Calculate obj = factory.getCalculation(input.next());
		
		try {
			obj.calculate(num1, num2);
		}catch(NullPointerException e) {
			
		}
		

	}

}
