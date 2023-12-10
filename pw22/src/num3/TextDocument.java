package num3;

class TextDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("Opening TextDocument");
    }

    @Override
    public void save() {
        System.out.println("Saving TextDocument");
    }

    @Override
    public void close() {
        System.out.println("Closing TextDocument");
    }
}
