package zad2;

public class User {
    private String name;
    private short status;
    private Proxy proxy;

    public User() {
        name = "admin";
        status = 0;
        proxy = new Proxy();
    }
}
