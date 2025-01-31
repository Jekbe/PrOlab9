package zad2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class Forest extends JPanel {
    private final java.util.List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String texture) {
        TreeType type = TreeFactory.getTreeType(name, color, texture);
        trees.add(new Tree(x, y, type));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Tree tree : trees) {
            tree.draw(g);
        }
    }
}