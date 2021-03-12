package assignments;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager m1 = new Manager();
		
		m1.nationality();
		m1.organization();
		m1.subordinates();
		m1.place();

	}

}


class Person{
	public void nationality() {
		System.out.println("Person Nationality");
	}
	
	public void place() {
		System.out.println("Person Place");
	}
}

class Emp extends Person{
	public void organization() {
		System.out.println("Emp organization");
	}
	
	public void place() {
		super.place();
		System.out.println("Emp Place");
	}
}

class Manager extends Emp{
	public void subordinates() {
		System.out.println("Manager Subordinates");
	}
	
	public void place() {
		super.place();
		System.out.println("Manager Place");
	}
}

