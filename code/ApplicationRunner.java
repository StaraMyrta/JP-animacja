package code;

import javax.swing.*;

/**
 * Klasa wywołująca działanie aplikacji
 */

public class ApplicationRunner extends JFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try{
                Window window = new Window();
                window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                window.setVisible(true);

            } catch (Exception e) {
                e.printStackTrace(System.err);
            }
        });
    }
}