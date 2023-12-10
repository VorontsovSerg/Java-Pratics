package task3;

public class MVCAuthorDemo {
    public static void main(String[] args) {
        Author author = new Author();
        AuthorView view = new AuthorView();
        AuthorController controller = new AuthorController(author, view);

        controller.setAuthorName("John Doe");
        controller.setAuthorAge(35);

        controller.updateView();
    }
}
