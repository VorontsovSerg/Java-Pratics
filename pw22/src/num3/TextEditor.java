package num3;

public class TextEditor {
    public static void main(String[] args) {
        ICreateDocument textDocumentFactory = new CreateTextDocument();
        EditorWindow textEditor = new EditorWindow(textDocumentFactory);

        textEditor.createNewDocument();
        textEditor.saveDocument();
        textEditor.closeDocument();
    }
}
