package book;

public class MainClass {

    public static void main(String[] args) {

        Book b = new Book();

        b.title = "Java Programming";
        b.author = "James Gosling";
        b.price = 650;

        b.showBook();
    }
}
