package com.observer;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		Subject subject=new Subject();
		
		new BinaryObserver(subject);
		new OctalObserver(subject);
		
		System.out.println("=======First Change======");
		subject.setState(15);
		System.out.println("=======Second Change======");
		subject.setState(25);

	}

}
