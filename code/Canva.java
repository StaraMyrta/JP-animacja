package code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static code.Settings.*;
import static code.Window.moveSpeed;

/**
 * Klasa zawierająca kanwę z animowanymi obiektami
 */

public class Canva extends JPanel implements KeyListener, ActionListener {

    private final Timer time = new Timer(10,this);

    private int moveX=2, moveY=2, chance, lastVerticalMove, lastHorizontalMove;
    private static int number;

    static Graphics2D buf;

    public Canva(){
        setBounds(50,90,canvaWidth,canvaHeight);
        setBackground(cbcColor);
        setLayout(null);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D shape = (Graphics2D) g;

        Rectangle rect = new Rectangle(xc,yc,40,40);
        shape.fill(rect);
    }
    void addFigure(){
    }

    void timeStart(){
        lastVerticalMove=moveSpeed;
        lastHorizontalMove=moveSpeed;
        if(!time.isRunning())
            time.start();
    }

    void timeStop(){
        if(time.isRunning())
            time.stop();
    }


    private void VerticalMove(){
        chance = (int) (Math.random() * (23));
        if(yc < 0 || yc > canvaHeight-graphicsHeight || chance == 22){
            lastVerticalMove = -lastVerticalMove;
            moveY=lastVerticalMove;
        }else {
            if (chance < 22) {
                moveY = lastVerticalMove;
            } else {
                if (chance == 23) {
                    moveY = 0;
                }
            }
        }
    }
    private void HorizontalMove(){
        chance = (int) (Math.random() * (23));
        if(xc < 0 || xc > canvaWidth-graphicsWidth || chance == 22){
            lastHorizontalMove = -lastHorizontalMove;
            moveX=lastHorizontalMove;
        }else {
            if (chance < 22) {
                moveX = lastHorizontalMove;
            }else {
                if (chance == 23) {
                    moveX = 0;
                }
            }
        }
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
        HorizontalMove();
        VerticalMove();
        xc+= moveX;
        yc+= moveY;
        repaint();
    }
}
