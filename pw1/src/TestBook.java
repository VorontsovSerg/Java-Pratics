public class TestBook
{
    public static void main(String[] args) {
        Book myBook = new Book("Над пропастью во ржи", "Дж.Д. Сэлинджер");
        System.out.println(myBook);
        myBook.setTitle("Убить пересмешника");
        myBook.setAuthor("Харпер Ли");

        System.out.println("Обновленная информация о книге:");
        System.out.println(myBook);
    }
}
