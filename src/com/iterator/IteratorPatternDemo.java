package com.iterator;

public class IteratorPatternDemo {

	public static void main(String[] args) {
		NameRepository nr=new NameRepository();
		
		for(Iterator iter=nr.getIterator();iter.hasNext();) {
			String name=(String) iter.next();
			System.out.println("Name : "+name);
		}

	}

}
