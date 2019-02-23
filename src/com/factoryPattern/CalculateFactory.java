package com.factoryPattern;

public class CalculateFactory {
	public Calculate getCalculation(String type)
	{
		Calculate obj=null;
		
		if(type.toLowerCase().equals("add"))
		{
			obj=new Add();
		}
		
		else if(type.toLowerCase().equals("subtract"))
		{
			obj=new Subtract();
		}
		
		else if(type.toLowerCase().equals("devide"))
		{
			obj=new Divide();
		}
		else {
			System.out.println("We don't do that!");
		}
		return obj;
	}
}
