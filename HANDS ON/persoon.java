package oops;

public class persoon {
	public String name;
	public int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
class employee extends persoon
{
	public int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
class manager extends employee {
	public String department;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
}
class maiiin {

public static void main (String [] args)
{
	manager m= new manager ();
	
	m.setName("pratik");
	m.setAge(45);
	m.setSalary(45);
	m.setDepartment("EXTC");
	
	System.out.println("nameis"+m.getName());
	System.out.println("age is"+m.getAge());
	System.out.println("salary is"+m.getSalary());
	System.out.println("departmentis"+m.getDepartment());

	




}
}

