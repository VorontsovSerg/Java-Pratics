package Book;

public class TestBook
{
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Пушкин А.С.", "Евгений Онегин", 1833, 244);
        System.out.println(b1);
        System.out.println(b2);
        b1.setPages(1300);
        System.out.println(b1);

    }
}
