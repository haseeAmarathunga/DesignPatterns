package basicconcept;

public class TestEmployee {

	public static void main(String args[])
	{
		Email email =new OutlookEmail();
		Employee obj1 = new Employee(100, "Hasee",email);
		obj1.notifyEmployee();
		
		email=new WebserviceEmail();
		Employee obj2=new Employee(101,"Sam",email);
		obj2.notifyEmployee();
	
	}
}
