package com.singleton;

public class Database {
	
	private static Database db;
	
	private Database() {}
	
	public static Database getInstance() {
		if(db == null) {
			db=new Database();
		}
		return db;
	}
}
