package design;

import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;

public class test {

	public static void main(String[] args) {

		JFileChooser fc = new JFileChooser();
		int result = fc.showOpenDialog(null);
		if (result == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			System.out.println(file.getAbsolutePath());
		}

	}

}

