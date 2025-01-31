package zad3;

public class Main {
    public static void main(String[] args) {
        User admin = new User("Jan", "Admin");
        User user = new User("Adam", "User");

        Document doc1 = new Proxy("public_report.pdf", user);
        Document doc2 = new Proxy("confidential_data.pdf", user);
        Document doc3 = new Proxy("confidential_data.pdf", admin);

        doc1.display();
        doc2.display();
        doc3.display();
    }
}
