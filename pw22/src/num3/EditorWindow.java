package num3;

class EditorWindow {
    private ICreateDocument documentFactory;
    private IDocument document;

    public EditorWindow(ICreateDocument documentFactory) {
        this.documentFactory = documentFactory;
    }

    public void createNewDocument() {
        document = documentFactory.createNew();
        document.open();
    }

    public void openDocument() {
        document = documentFactory.createOpen();
        document.open();
    }

    public void saveDocument() {
        if (document != null) {
            document.save();
        }
    }

    public void closeDocument() {
        if (document != null) {
            document.close();
        }
    }
}
