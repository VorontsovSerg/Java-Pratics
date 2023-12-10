package task3;

public class AuthorController {
    private Author model;
    private AuthorView view;

    public AuthorController(Author model, AuthorView view) {
        this.model = model;
        this.view = view;
    }

    public void setAuthorName(String name) {
        model.setName(name);
    }

    public void setAuthorAge(int age) {
        model.setAge(age);
    }

    public void updateView() {
        view.setAuthorDetails(model.getName(), model.getAge());
    }
}
