package components;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FileWriter {
	private static LoginPanel loginPanel;
	private static final String name = loginPanel.getName();
	private static final String dot = loginPanel.getPassword();
	public static void main(String[] args) {
	PrintWriter writer = null;

		try {
			 writer = new PrintWriter(name + "." + dot, "UTF-8");
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	writer.close();

	}
}
