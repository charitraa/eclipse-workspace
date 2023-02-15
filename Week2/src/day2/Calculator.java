package day2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator {
	public static void main(String[] args) {

		JFrame frame = new JFrame("Calculator");
		frame.setSize(450, 500);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		JLabel l1 = new JLabel("Number 1: ");
		l1.setBounds(25, 100, 100, 25);
		frame.add(l1);
		JTextField t1 = new JTextField(20);
		t1.setBounds(100, 100, 200, 25);
		frame.add(t1);
		JLabel l2 = new JLabel("Number 2: ");
		l2.setBounds(25, 150, 100, 25);
		frame.add(l2);
		JTextField t2 = new JTextField(20);
		t2.setBounds(100, 150, 200, 25);
		frame.add(t2);
		JButton b1 = new JButton("+");
		b1.setBounds(25, 200, 50, 25);
		frame.add(b1);
		JButton b2 = new JButton("-");
		b2.setBounds(150, 200, 50, 25);
		frame.add(b2);
		JButton b3 = new JButton("*");
		b3.setBounds(275, 200, 50, 25);
		frame.add(b3);
		JButton b4 = new JButton("/");
		b4.setBounds(400, 200, 50, 25);
		frame.add(b4);
		JLabel r = new JLabel("RESULT:");
		r.setBounds(25, 160, 900, 200);
		frame.add(r);
		JTextField t3 = new JTextField(20);
		t3.setBounds(100, 250, 200, 25);
		frame.add(t3);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent cal) {
				int n1 = Integer.parseInt(t1.getText());
				int n2 = Integer.parseInt(t2.getText());
				int sum = n1 + n2;
				t3.setText("Sum:" + sum);
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent cal) {
				int n1 = Integer.parseInt(t1.getText());
				int n2 = Integer.parseInt(t2.getText());
				int s = n1 - n2;
				t3.setText("Subtract:" + s);
			}
		});
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent cal) {
				int n1 = Integer.parseInt(t1.getText());
				int n2 = Integer.parseInt(t2.getText());
				int m = n1 * n2;
				t3.setText("Multiplication: " + m);
			}
		});
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent cal) {
				double n1 = Integer.parseInt(t1.getText());
				double n2 = Integer.parseInt(t2.getText());
				double d = n1 / n2;
				t3.setText("Divide:" + d);
			}
		});
		JButton c1 = new JButton("CLEAR");
		c1.setBounds(75, 300, 100, 25);
		frame.add(c1);
		c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == c1) {
					t1.setText("");
					t2.setText("");
					t3.setText("");
				}
			}
		});
		JButton c2 = new JButton("CLOSE");
		c2.setBounds(325, 300, 100, 25);
		frame.add(c2);
		c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

}
