package objects;

public class MainClass {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Vanshika";
        s1.rollNo = 101;
        s1.marks = 89.5;

        Student s2 = new Student();
        s2.name = "Riya";
        s2.rollNo = 102;
        s2.marks = 92.0;

        s1.display();
        System.out.println();

        s2.display();
    }
}
