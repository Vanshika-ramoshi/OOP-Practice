package rectangle;

public class Rectangle {

    double length;
    double width;

    void calculateArea() {
        double area = length * width;
        System.out.println("Length : " + length);
        System.out.println("Width : " + width);
        System.out.println("Area : " + area);
    }
}
