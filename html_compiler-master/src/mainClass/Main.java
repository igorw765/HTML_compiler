package mainClass;

import java.awt.EventQueue;

import components.Frame;
public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Frame();
			}
		});
	}
}