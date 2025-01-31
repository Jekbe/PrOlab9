package zad2;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Forest forest = new Forest();
        frame.add(forest);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        SwingUtilities.invokeLater(() -> {
            Random rand = new Random();
            for (int i = 0; i < 100_000; i++) {
                int x = rand.nextInt(800);
                int y = rand.nextInt(600);
                forest.plantTree(x, y, "Oak", Color.GREEN, "oak_texture");
            }

            frame.repaint();
        });
    }
}
