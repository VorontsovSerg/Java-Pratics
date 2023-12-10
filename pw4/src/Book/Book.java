package Book;

public class Book
{
    private int pages, year;
    private String author, name;

    public Book()
    {
        author = "Война и Мир";
        name = "Толстой Л.Н.";
        pages = 1200;
        year = 1865;
    }
    public Book(String author, String name, int year, int pages)
    {
        this.author = author;
        this.name = name;
        this.year = year;
        this.pages = pages;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setYear(int year)
    {
        this.year = year;
    }
    public void setPages(int pages)
    {
        this.pages = pages;
    }

    public String getAuthor()
    {
        return author;
    }
    public String getName()
    {
        return name;
    }
    public int getPages()
    {
        return pages;
    }
    public int getYear()
    {
        return year;
    }

    public String toString()
    {
        return author + ", " + name + "', страниц " + pages;
    }
}
