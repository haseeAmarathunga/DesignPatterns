package basicconcept;

public class Test {

	public static void main(String[] args) {
		
//		A o1 = new A();
		B o2 = new B();
		//superclass o3 = new subclass 
		A o3 = new B();
		
		//A object can call only method A
//		o1.methodA();
		
		//B Object can also call both method A and B
		o2.methodA();
		o2.methodB();
		
		//o3 can only call methodA
		o3.methodA();
	}
}
