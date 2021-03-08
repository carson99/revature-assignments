package classWorkThree;

public class Employee {
	
	private int id;
	private String name;
	private int age;
	private String email;
	
	public Employee(int id, String name, int age, String email) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + "]";
	}

}
