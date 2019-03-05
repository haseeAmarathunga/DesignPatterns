package com.factory;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		
		ShapeFactory sp=new ShapeFactory();
		
		Shape shape1=sp.getShape("Circle");
		shape1.draw();
		
		Shape shape2=sp.getShape("Rectangle");
		shape2.draw();
		
		Shape shape3=sp.getShape("Square");
		shape3.draw();
	}
}
