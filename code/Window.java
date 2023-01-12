package code;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static code.Settings.*;

/**
 * Klasa przechowująca wszystkie ustawienia okna oraz elementy modyfikujące ustawienia gry
 */

public class Window extends JFrame implements ActionListener {

    JButton start = new JButton("Start"), stop = new JButton("Stop"), newObject = new JButton("New"), catchIt = new JButton("Catch"), removeIt = new JButton("Remove");
    JSlider difficultyLevel = new JSlider(JSlider.HORIZONTAL,1,10,10);
    JLabel dLInfo = new JLabel("Stopień trudności:"), catchedInfo = new JLabel("You have catched:"), howMany = new JLabel("0"+" objects") ;

    public Window(Canva canva){
        setSize(windowWidth,windowHeight);
        getContentPane().setBackground(bcColor);
        setTitle("Catch Object");
        setLayout(null);

        newObject.setBackground(btnColor);
        newObject.setBounds(x-550,20,100,60);
        newObject.setFont(bFont);

        start.setBackground(btnColor);
        start.setBounds(x-420,20,100,60);
        start.setFont(bFont);

        stop.setBackground(btnColor);
        stop.setBounds(x-290,20,100,60);
        stop.setFont(bFont);

        dLInfo.setBounds(x-45,20,90,15);
        dLInfo.setFont(sFont);

        difficultyLevel.setBounds(x-100,35,200,55);
        difficultyLevel.setBackground(bcColor);
        difficultyLevel.setMajorTickSpacing(1);
        difficultyLevel.setMinorTickSpacing(1);
        difficultyLevel.setPaintTicks(true);
        difficultyLevel.setPaintLabels(true);
        difficultyLevel.setFont(sFont);

        catchIt.setBackground(btnColor);
        catchIt.setBounds(x+190,20,100,60);
        catchIt.setFont(bFont);

        removeIt.setBackground(btnColor);
        removeIt.setBounds(x+320,20,100,60);
        removeIt.setFont(bFont);

        catchedInfo.setBounds(x+450,5,150,20);
        catchedInfo.setFont(sFont);
        howMany.setBounds(x+450,25,150,20);
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
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
