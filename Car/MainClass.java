package car;

public class MainClass {

	   public static void main(String[] args) {

      	  Car c1 = new Car();
	        c1.brand = "Toyota";
	        c1.model = "Fortuner";
	        c1.price = 4500000;

	        Car c2 = new Car();
	        c2.brand = "Hyundai";
	        c2.model = "Creta";
	        c2.price = 1800000;

	        System.out.println("Car 1 Details");
	        c1.showCar();

	        System.out.println();

	        System.out.println("Car 2 Details");
	        c2.showCar();
	    }
}
