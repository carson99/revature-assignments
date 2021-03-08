package classWorkThree;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(361, "Juno", 40, "js@space.com");
		System.out.println(e1);
		
		Project p1 = new Project(23, "Globe Heist", "Carte Blanche");
		System.out.println(p1);
		
		EmployeeAddress a1 = new EmployeeAddress(66, "Vulcanis Way", "NYC", "NY", 12345, 100, "Nebula Drive", "Helena", "Montana", 54321);
		System.out.println(a1);
		

	}

}
