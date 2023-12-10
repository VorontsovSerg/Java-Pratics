package Author;

public class Test_Author
{

    public static void main(String[] args)
    {
        Author a1 = new Author("Alexandr Pushkin", "mail", 'm');
        Author a2 = new Author("Agata kristi", "kristi189@gmail.com", 'f');
        a1.setEmail("alexpush@mail.ru");
        System.out.println(a1);
        System.out.println(a2);
    }
}
