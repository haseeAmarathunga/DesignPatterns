package com.singleton;

public class TestDB{

	public static void main(String[] args) {
		
		Database db=Database.getInstance();
		Database db2=Database.getInstance();
		
		System.out.println(db.hashCode());
		System.out.println(db2.hashCode());
		
		// Non sigleton
		TestDB tb=new TestDB();
		TestDB tb2=new TestDB();

		System.out.println(tb.hashCode());
		System.out.println(tb2.hashCode());

	}

}
