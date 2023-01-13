package code;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static code.Settings.*;

/**
 * Klasa przechowująca wszystkie ustawienia okna oraz elementy modyfikujące ustawienia gry
 */

public class Window extends JFrame implements ActionListener {

    public static int moveSpeed=2;

    JButton start = new JButton("Start"), stop = new JButton("Stop"), newObject = new JButton("New"), catchIt = new JButton("Catch"), removeIt = new JButton("Remove");
    JSlider difficultyLevel = new JSlider(JSlider.HORIZONTAL,1,10,10);
    JLabel dLInfo = new JLabel("Stopień trudności:"), catchedInfo = new JLabel("You have catched:"), howMany = new JLabel("0"+" objects") ;

    public Window(Canva canva){
        setSize(windowWidth,windowHeight);
        getContentPane().setBackground(bcColor);
        setTitle("Catch Object");
        setLayout(null);

        newObject.setBackground(btnColor);
        newObject.setBounds(xw-550,20,100,60);
        newObject.setFont(bFont);

        start.setBackground(btnColor);
        start.setBounds(xw-420,20,100,60);
        start.setFont(bFont);

        stop.setBackground(btnColor);
        stop.setBounds(xw-290,20,100,60);
        stop.setFont(bFont);

        dLInfo.setBounds(xw-45,20,90,15);
        dLInfo.setFont(sFont);

        difficultyLevel.setBounds(xw-100,35,200,55);
        difficultyLevel.setBackground(bcColor);
        difficultyLevel.setMajorTickSpacing(1);
        difficultyLevel.setMinorTickSpacing(1);
        difficultyLevel.setPaintTicks(true);
        difficultyLevel.setPaintLabels(true);
        difficultyLevel.setFont(sFont);

        catchIt.setBackground(btnColor);
        catchIt.setBounds(xw+190,20,100,60);
        catchIt.setFont(bFont);

        removeIt.setBackground(btnColor);
        removeIt.setBounds(xw+320,20,100,60);
        removeIt.setFont(bFont);

        catchedInfo.setBounds(xw+450,5,150,20);
        catchedInfo.setFont(sFont);
        howMany.setBounds(xw+450,25,150,20);
        howMany.setFont(sFont);

        add(newObject);
        add(start);
        add(stop);
        add(dLInfo);
        add(difficultyLevel);
        add(catchIt);
        add(removeIt);
        add(catchedInfo);
        add(howMany);

        add(canva);

        newObject.addActionListener(e -> canva.addFigure());
        start.addActionListener(e -> canva.timeStart());
        stop.addActionListener(e -> canva.timeStop());
        difficultyLevel.addChangeListener(e -> moveSpeed = difficultyLevel.getValue());
    }


    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
