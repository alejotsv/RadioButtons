package com.java21days;

import javax.swing.*;
import java.awt.*;

public class RadioButtons extends JFrame {
    Dimension dim = new Dimension(320, 120);

    RadioButtons(String title, String[] buttons, String message){
        super(title);
        setSize(dim);
        JPanel panel = new JPanel();
        JLabel messageLabel = new JLabel(message);
        panel.add(messageLabel);
        addButtons(buttons, panel);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(panel);
        setVisible(true);
    }

    void addButtons(String[] buttons, JPanel panel){
        ButtonGroup btnGroup = new ButtonGroup();
        boolean selected;

        for(int i=0; i<buttons.length; i++){
            if(i==0){
                selected = true;
            } else {
                selected = false;
            }
            JRadioButton btn = new JRadioButton(buttons[i], selected);
            btnGroup.add(btn);
            panel.add(btn);
        }

    }
}
