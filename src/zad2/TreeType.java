package zad2;

import java.awt.*;

public class TreeType {
    private final String name;
    private final Color color;
    private final String texture;

    public TreeType(String name, Color color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(color);
        g.fillRect(x, y, 5, 10); // Simple representation of a tree
    }
}
