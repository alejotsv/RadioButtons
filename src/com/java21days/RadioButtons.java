package com.java21days;

import javax.swing.*;
import java.awt.*;

public class RadioButtons extends JFrame {
    Dimension dim = new Dimension(300, 200);

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
        pack();
    }

    void addButtons(String[] buttons, JPanel panel){
        ButtonGroup btnGroup = new ButtonGroup();

        for(int i=0; i<buttons.length; i++){
            JRadioButton btn = new JRadioButton(buttons[i]);
            btnGroup.add(btn);
            panel.add(btn);
        }

    }
}
