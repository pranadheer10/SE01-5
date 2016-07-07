package design;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class University_Home {
	JFrame frame;
	JPanel mainpanle;
	JButton continue_buttom;
	JLabel universityLogo;
	MenuBar menuBar;
	Menu jMenuedit;
	MenuItem menuItem;

	public University_Home() {

		frame = new JFrame();
		mainpanle = new JPanel();
		continue_buttom = new JButton("Continue");
		universityLogo = new JLabel();
		menuBar = new MenuBar();
		jMenuedit = new Menu("Edit");
		menuItem = new MenuItem("Click Here");

		jMenuedit.add(menuItem);
		menuBar.add(jMenuedit);

		universityLogo.setHorizontalAlignment(JTextField.CENTER);
		universityLogo.setFont((new Font("Verdana", Font.BOLD, 14)));

		menuItem.addActionListener(actionEdit);
		continue_buttom.addActionListener(actionContinue);
		mainpanle.setLayout(null);

		mainpanle.add(continue_buttom);
		mainpanle.add(universityLogo);
		mainpanle.setBackground(new Color(255, 255, 255));
		ImageIcon icon = new ImageIcon("icons/logo.png");

		continue_buttom.setBounds(230, 320, 100, 30);
		if (University_Edit.university_Name == null) {
			universityLogo.setText("Welcome To Oklahoma Christian University");
			System.out.println("Welcome To Oklahoma Christian University");
			String contentStudent = "";
			String contentFaculty = "";

			for (String item : getAllStudent()) {
				contentStudent = contentStudent + item + "\n";
			}
			for (String item : getAllFaculty()) {
				contentFaculty = contentFaculty + item + "\n";
			}
			
			System.out.println("Student data /n" +contentStudent);
			System.out.println("Faculty data /n" +contentFaculty);
			
		} else {
			universityLogo.setText(University_Edit.university_Name.getText());
			System.out.println("University Name is :- "
					+ University_Edit.university_Name.getText());
			System.out.println("Abbreviation Name is :- "
					+ University_Edit.Abbre_Name.getText());
			System.out.println("Schole Grade :- \n"
					+ University_Edit.box1.getText());
			System.out.println("Student data :- \n"
					+ University_Edit.box2.getText());
		}
		backButton = new JButton("Back");
		mainpanle.add(backButton);
		backButton.setBounds(10, 10, 80, 25);
		backButton.addActionListener(actionListenerBack);
		
		
		universityLogo.setBounds(10, 50, 420, 320);
		frame.setLayout(null);
		frame.add(mainpanle);
		mainpanle.setBounds(0, 0, 550, 620);
		frame.setMenuBar(menuBar);

		frame.setSize(550, 620);
		frame.setResizable(false);
		frame.setLocation(400, 70);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("University_Home");
		frame.setVisible(true);

	}

	ActionListener actionEdit = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			new University_Edit();

		}
	};

	ActionListener actionContinue = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			new Login();

		}
	};
	
	public ArrayList<String> getAllStudent() {
		File file = new File("TestStudent.txt");
		ArrayList<String> mylist = new ArrayList<String>();

		BufferedReader br = null;

		try {

			String sCurrentLine;

			br = new BufferedReader(new FileReader(file));
			String text = "";
			while ((sCurrentLine = br.readLine()) != null) {
				mylist.add(sCurrentLine);
//				System.out.println(sCurrentLine);
			}

		} catch (Exception e2) {
			System.out.println(e2);
		}
		return mylist;
	}

	public ArrayList<String> getAllFaculty() {
		File file = new File("TestFaculty.txt");
		ArrayList<String> mylist = new ArrayList<String>();

		BufferedReader br = null;

		try {

			String sCurrentLine;

			br = new BufferedReader(new FileReader(file));
			String text = "";
			while ((sCurrentLine = br.readLine()) != null) {
				String ar[] = sCurrentLine.split(",");
				if (ar.length >= 2) {
					mylist.add(ar[2]);
//					System.out.println(ar[2]);
				} else

					mylist.add("null-");
			}

		} catch (Exception e2) {
			System.out.println(e2);
		}
		return mylist;
	}

	public static void main(String[] args) {
		new University_Home();

	}
	JButton backButton ; 
	
	ActionListener actionListenerBack = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			new Directory_Home() ;
		}
	};

}
