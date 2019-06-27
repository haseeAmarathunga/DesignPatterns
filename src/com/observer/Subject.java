package com.observer;
import java.util.*;

public class Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	private int state;
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
		notifyAllObserver();
	}
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	private void notifyAllObserver() {
		for(Observer observer : observers) {
			observer.update();
		}	
	}
	
}
