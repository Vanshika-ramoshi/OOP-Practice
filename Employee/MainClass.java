package employees;

public class MainClass {

	   public static void main(String[] args) {

	        Employee e1 = new Employee();
	        e1.name = "Vanshika";
	        e1.salary = 35000;

	        Employee e2 = new Employee();
	        e2.name = "Rahul";
	        e2.salary = 45000;

	        System.out.println("Employee 1 Details");
	        e1.showDetails();

	        System.out.println();

	        System.out.println("Employee 2 Details");
	        e2.showDetails();
	    }
	}
