package code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;

import static code.Settings.*;

/**
 * Klasa zawierająca kanwę z animowanymi obiektami
 */

public class Canva extends JPanel implements KeyListener, ActionListener {

    private final Timer time = new Timer(10,this);

    public Canva(){
        setBounds(50,90,canvaWidth,canvaHeight);
        setBackground(cbcColor);
        setLayout(null);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D shape = (Graphics2D) g;
        Ellipse2D circle = new Ellipse2D.Double(x,y,40,40);
        shape.fill(circle);
        time.start();
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e){
        x++;
        y++;
        repaint();
    }
}
