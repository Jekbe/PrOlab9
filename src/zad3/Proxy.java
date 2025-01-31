package zad3;

public class Proxy implements Document {
    private final String filename;
    private FileDocument realDocument;
    private final User user;

    public Proxy(String filename, User user) {
        this.filename = filename;
        this.user = user;
    }

    @Override
    public void display() {
        if (hasAccess()) {
            if (realDocument == null) {
                realDocument = new FileDocument(filename);
            }
            realDocument.display();
        } else {
            System.out.println("Brak dostępu do dokumentu: " + filename);
        }
    }

    private boolean hasAccess() {
        return user.role().equals("Admin") || !filename.contains("confidential");
    }
}
