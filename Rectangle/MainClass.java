package rectangle;

public class MainClass {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        r1.length = 10;
        r1.width = 5;

        Rectangle r2 = new Rectangle();
        r2.length = 8;
        r2.width = 4;

        System.out.println("Rectangle 1 Details");
        r1.calculateArea();

        System.out.println();

        System.out.println("Rectangle 2 Details");
        r2.calculateArea();
    }
}
