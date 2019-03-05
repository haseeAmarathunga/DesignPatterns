package com.factory;

public class ShapeFactory {
	
	public Shape getShape(String shp) {
		if(shp==null) {
			return null;
		}
		
		if(shp.equalsIgnoreCase("circle")) {
			return new Circle();
		}
		
		else if(shp.equalsIgnoreCase("square")) {
			return new Square();
		}
		
		else if(shp.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		}
		
		return null;
	}
}
