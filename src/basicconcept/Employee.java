package basicconcept;

public class Employee {
	int empId;
	String empName;
	double salary;
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	int grade;
	String company="UCSC";
	
	Email email;
	
	public Employee(int empId , String empName,Email email)
	{
		this.empId = empId;
		this.empName = empName;
		this.email=email;
	}
	
	public void notifyEmployee()
	{
		email.sendEmail();
	}
}
