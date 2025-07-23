//Create a base class Employee with a constructor that initializes common employee details(name and employeeId) then create two subclass. 
package demo1;
class Employee{
	int EmployeeId;
	String name;
	public Employee(String name,int id) {
		this.name=name;
		this.EmployeeId=id;
	}
}
class FullTimeEmp extends Employee{
	double salary;
	public FullTimeEmp(String name,int id,double sal) {
		super(name,id);
		salary=sal;
		System.out.println(name+" "+id+" "+sal);
	}	
}
class ParttimeEmp extends Employee{
	double hourlyRate;
	public ParttimeEmp(String name,int id,double hr) {
		super(name,id);
		hourlyRate=hr;
		System.out.println(name+" "+id+" "+hr);
	}
}
public class DemoConstr {
	public static void main(String[] args) {
	FullTimeEmp f=new FullTimeEmp("Raksha",3,128000);
	ParttimeEmp p=new ParttimeEmp("sss",4,1000);
	}
}
