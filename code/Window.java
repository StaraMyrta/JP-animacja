package code;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static code.Settings.*;

/**
 * Klasa przechowująca wszystkie ustawienia okna oraz elementy modyfikujące ustawienia gry
 */

public class Window extends JFrame implements ActionListener {

    JButton start=new JButton("Start"), stop=new JButton("Stop");
    JSlider difficultyLevel = new JSlider(JSlider.HORIZONTAL,1,10,10);
    JLabel dLInfo = new JLabel("Stopień trudności:");

    public Window(){
        setSize(windowWidth,windowHeight);
        getContentPane().setBackground(bcColor);
        setTitle("Catch Object");
        setLayout(null);

        start.setBackground(btnColor);
        start.setBounds(windowWidth/2-260,20,100,60);
        start.setFont(bFont);

        stop.setBackground(btnColor);
        stop.setBounds(windowWidth/2+160,20,100,60);
        stop.setFont(bFont);

        difficultyLevel.setBounds(windowWidth/2-100,35,200,55);
        difficultyLevel.setBackground(bcColor);
        difficultyLevel.setMajorTickSpacing(1);
        difficultyLevel.setMinorTickSpacing(1);
        difficultyLevel.setPaintTicks(true);
        difficultyLevel.setPaintLabels(true);
        difficultyLevel.setFont(sFont);

        dLInfo.setBounds(windowWidth/2-45,20,90,15);
        dLInfo.setFont(sFont);

        add(dLInfo);
        add(difficultyLevel);
        add(start);
        add(stop);


    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
