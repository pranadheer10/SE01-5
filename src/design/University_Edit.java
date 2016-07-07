package design;

import java.awt.Color;
import java.awt.List;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class University_Edit {
	JFrame frame;
	JPanel mainpanle;
	JButton save;
	JButton cancel;
	JLabel editUniversity;
	MenuBar menuBar;
	Menu jMenuedit;

	JLabel nameLable;
	public static JTextField university_Name;
	JLabel abbre_Lable;
	public static JTextField Abbre_Name;

	public static JTextArea box1;
	public static JTextArea box2;

	JButton add1;
	JButton save1;
	JButton cancel1;

	JButton add2;
	JButton save2;
	JButton cancel2;
	
	static ArrayList<String> sttudents;
	static ArrayList<String> Facultys;
	
	MenuItem menuItem;

	public University_Edit() {
		frame = new JFrame();
		mainpanle = new JPanel();
		cancel = new JButton("Cancel");
		save = new JButton("Save");
		nameLable = new JLabel("Name");
		university_Name = new JTextField(
				"Welcome To Oklahoma Christian University");
		editUniversity = new JLabel("Edit University");

		add1 = new JButton("ADD");
		save1 = new JButton("SAVE");
		cancel1 = new JButton("CANCEL");

		add2 = new JButton("ADD");
		save2 = new JButton("SAVE");
		cancel2 = new JButton("CANCEL");

		box1 = new JTextArea();
		box2 = new JTextArea();
		Border border = BorderFactory.createLineBorder(Color.GRAY, 2);

		box1.setBorder(border);
		box2.setBorder(border);
		abbre_Lable = new JLabel("Abbreviation");
		Abbre_Name = new JTextField("");

		university_Name.setHorizontalAlignment(JTextField.CENTER);
		menuBar = new MenuBar();
		jMenuedit = new Menu("Back");

		backButton = new JButton("Back");
		mainpanle.add(backButton);
		backButton.setBounds(10, 10, 80, 25);
		backButton.addActionListener(actionListenerBack);
		
		menuItem = new MenuItem("Click Here");
		jMenuedit.add(menuItem);

		menuBar.add(jMenuedit);

		menuItem.addActionListener(actionEdit);
		save.addActionListener(actionSave);

		mainpanle.setLayout(null);

		mainpanle.add(save);
		mainpanle.add(cancel);

		mainpanle.add(editUniversity);
		mainpanle.add(nameLable);
		mainpanle.add(university_Name);

		mainpanle.add(Abbre_Name);
		mainpanle.add(abbre_Lable);

		mainpanle.add(add1);
		mainpanle.add(save1);
		mainpanle.add(cancel1);
		mainpanle.add(add2);
		mainpanle.add(save2);
		mainpanle.add(cancel2);
		mainpanle.add(box1);
		mainpanle.add(box2);

		mainpanle.setBackground(new Color(255, 255, 255));

		editUniversity.setBounds(240, 30, 100, 30);
		nameLable.setBounds(50, 100, 60, 30);
		university_Name.setBounds(150, 100, 285, 30);

		abbre_Lable.setBounds(50, 160, 60, 30);
		Abbre_Name.setBounds(150, 160, 285, 30);

		save.setBounds(150, 220, 100, 30);
		cancel.setBounds(330, 220, 100, 30);

		box1.setBounds(50, 270, 200, 200);
		box2.setBounds(300, 270, 200, 200);

		add2.setBounds(285, 490, 60, 30);
		save2.setBounds(350, 490, 70, 30);
		cancel2.setBounds(425, 490, 80, 30);

		add1.setBounds(40, 490, 60, 30);
		save1.setBounds(105, 490, 70, 30);
		cancel1.setBounds(180, 490, 80, 30);

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

	public University_Edit(ArrayList<String> students, ArrayList<String> faculty) {
		frame = new JFrame();
		mainpanle = new JPanel();
		cancel = new JButton("Cancel");
		save = new JButton("Save");
		nameLable = new JLabel("Name");
		university_Name = new JTextField(
				"Welcome To Oklahoma Christian University");
		editUniversity = new JLabel("Edit University");

		add1 = new JButton("ADD");
		save1 = new JButton("SAVE");
		cancel1 = new JButton("CANCEL");

		add2 = new JButton("ADD");
		save2 = new JButton("SAVE");
		cancel2 = new JButton("CANCEL");

		box1 = new JTextArea();
		box2 = new JTextArea();
		Border border = BorderFactory.createLineBorder(Color.GRAY, 2);

		box1.setBorder(border);
		box2.setBorder(border);
		abbre_Lable = new JLabel("Abbre..");
		Abbre_Name = new JTextField(" OC");
		university_Name.setHorizontalAlignment(JTextField.CENTER);
		menuBar = new MenuBar();
		jMenuedit = new Menu("Back");

		menuItem = new MenuItem("Click Here");
		jMenuedit.add(menuItem);

		backButton = new JButton("Back");
		mainpanle.add(backButton);
		backButton.setBounds(10, 10, 80, 25);
		backButton.addActionListener(actionListenerBack);
		
		
		menuBar.add(jMenuedit);
		String contentStudent = "";
		String contentFaculty = "";

		for (String item : students) {
			contentStudent = contentStudent + item + "\n";
		}
		for (String item : faculty) {
			contentFaculty = contentFaculty + item + "\n";
		}
		
		box1.setText(contentFaculty);

		box2.setText(contentStudent);

		menuItem.addActionListener(actionEdit);
		save.addActionListener(actionSave);

		mainpanle.setLayout(null);

		mainpanle.add(save);
		mainpanle.add(cancel);

		mainpanle.add(editUniversity);
		mainpanle.add(nameLable);
		mainpanle.add(university_Name);

		mainpanle.add(Abbre_Name);
		mainpanle.add(abbre_Lable);

		mainpanle.add(add1);
		mainpanle.add(save1);
		mainpanle.add(cancel1);
		mainpanle.add(add2);
		mainpanle.add(save2);
		mainpanle.add(cancel2);
		mainpanle.add(box1);
		mainpanle.add(box2);

		mainpanle.setBackground(new Color(255, 255, 255));

		editUniversity.setBounds(240, 30, 100, 30);
		nameLable.setBounds(50, 100, 60, 30);
		university_Name.setBounds(150, 100, 285, 30);

		abbre_Lable.setBounds(50, 160, 60, 30);
		Abbre_Name.setBounds(150, 160, 285, 30);

		save.setBounds(150, 220, 100, 30);
		cancel.setBounds(330, 220, 100, 30);

		box1.setBounds(50, 270, 200, 200);
		box2.setBounds(300, 270, 200, 200);

		add2.setBounds(285, 490, 60, 30);
		save2.setBounds(350, 490, 70, 30);
		cancel2.setBounds(425, 490, 80, 30);

		add1.setBounds(40, 490, 60, 30);
		save1.setBounds(105, 490, 70, 30);
		cancel1.setBounds(180, 490, 80, 30);

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
	
	public static ArrayList<String> getAllStudent() {
		File file = new File("TestSemesters.txt");
		ArrayList<String> mylist = new ArrayList<String>();

		BufferedReader br = null;

		try {

			String sCurrentLine;

			br = new BufferedReader(new FileReader(file));
			String text = "";
			while ((sCurrentLine = br.readLine()) != null) {
				mylist.add(sCurrentLine);
				// System.out.println(sCurrentLine);
			}

		} catch (Exception e2) {
			System.out.println(e2);
		}
		return mylist;
	}

	public static ArrayList<String> getAllFaculty() {
		File file = new File("TestGradSchools.txt");
		ArrayList<String> mylist = new ArrayList<String>();

		BufferedReader br = null;

		try {

			String sCurrentLine;

			br = new BufferedReader(new FileReader(file));
			String text = "";
			while ((sCurrentLine = br.readLine()) != null) {
				String ar[] = sCurrentLine.split(",");
				if (ar.length >= 2) {
					mylist.add(ar[1]);
					// System.out.println(ar[2]);
				} else

					mylist.add("null-");
			}

		} catch (Exception e2) {
			System.out.println(e2);
		}
		return mylist;
	}


	ActionListener actionEdit = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			new University_Home();

		}
	};
	ActionListener actionSave = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			new University_Home();

		}
	};
	

	public static void main(String[] args) {
		sttudents = getAllStudent();
		Facultys = getAllFaculty();

		new University_Edit(sttudents, Facultys);

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
