package mobile;

public class MainClass {

    public static void main(String[] args) {

        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.ram = 8;
        m1.price = 35000;

        Mobile m2 = new Mobile();
        m2.brand = "OnePlus";
        m2.ram = 12;
        m2.price = 45000;

        System.out.println("Mobile 1 Details");
        m1.displaySpec();

        System.out.println();

        System.out.println("Mobile 2 Details");
        m2.displaySpec();
    }
}
