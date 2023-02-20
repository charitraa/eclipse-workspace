package saparsha;

//import java.awt.Color;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Minal {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setTitle("RAvi");
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setVisible(true);

        JLabel J = new JLabel();
        J.setText("RAvi");
        J.setBounds(100, 300, 100, 50);
        frame.add(J);
    }

}