package zad3;

public interface Document {
    void display();
}

class FileDocument implements Document {
    private final String filename;

    public FileDocument(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Ładowanie dokumentu: " + filename);
    }

    @Override
    public void display() {
        System.out.println("Wyświetlanie dokumentu: " + filename);
    }
}