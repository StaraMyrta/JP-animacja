package code;

import javax.swing.*;

/**
 * Klasa wywołująca działanie aplikacji
 */

public class ApplicationRunner extends JFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try{
                Canva canva = new Canva();
                Window window = new Window(canva);
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace(System.err);
            }
        });
    }
}