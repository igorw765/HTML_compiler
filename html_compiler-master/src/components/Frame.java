package components;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame {
	public Frame() {
		super("HTML Compiler v1.0.0");
		JPanel htmlPanel = new HTMLPanel();
		add(htmlPanel);
//		LoginListener listener = new LoginListener(this);
//		JPanel loginPanel = new LoginPanel(listener);
//		add(loginPanel);

		setPreferredSize(new Dimension(600, 400));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
}