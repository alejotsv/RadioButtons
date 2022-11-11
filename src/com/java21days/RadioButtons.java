package com.java21days;

import javax.swing.*;
import java.awt.*;

public class RadioButtons extends JFrame {
    Dimension dim = new Dimension(300, 200);

    RadioButtons(String title){
        super(title);
        setSize(dim);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
