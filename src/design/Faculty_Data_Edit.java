package design;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.RandomAccessFile;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import modelDM.FacultyDM;
import modelDM.FacultyDMNew;
import modelDM.StudentDM;

public class Faculty_Data_Edit {

	JFrame frame;
	JPanel mainpanle;
	JButton save;

	JButton cancel;

	JTextField FacultyNameText;
	JPanel sub_view_panel;

	JLabel mainLable;

	// /
	JLabel MaxLoadFallLable;
	JTextField MaxLoadFallText;

	// /
	JLabel MaxLoadSpringLable;
	JTextField MaxLoadSpringText;

	// /
	JLabel MaxLoadSummerFallLable;
	JTextField MaxLoadSummerFallText;

	// /
	JLabel GradLable;
	JTextField GradText;

	// /
	JLabel DegreeLable;
	JTextField DegreeText;

	// /
	JLabel TitelLable;
	JTextField TitelText;

	// /
	JLabel SchoolLable;
	JTextField SchoolText;

	// /
	JLabel DaysToTeachLable;
	JTextField DaysToTeachText;

	// /
	JLabel lastNameLable;
	JTextField lastNameText;

	JLabel FirstNamLable;
	JTextField FirstNameText;

	public Faculty_Data_Edit() {
		frame = new JFrame();
		mainpanle = new JPanel();
		FacultyNameText = new JTextField();
		sub_view_panel = new JPanel();
		cancel = new JButton("Cacel");

		save = new JButton("Save");

		mainLable = new JLabel("Faculty Data Edit");

		// /
		lastNameLable = new JLabel("LastName");
		lastNameText = new JTextField();

		FirstNamLable = new JLabel("Firat Name");
		FirstNameText = new JTextField();

		// /
		GradLable = new JLabel("Grad");
		GradText = new JTextField();

		// /
		SchoolLable = new JLabel("School");
		SchoolText = new JTextField();

		// /
		DegreeLable = new JLabel("Degree");
		DegreeText = new JTextField();

		// /
		TitelLable = new JLabel("Titel");
		TitelText = new JTextField();

		// /
		DaysToTeachLable = new JLabel("DaysToTeach");
		DaysToTeachText = new JTextField();

		// /
		MaxLoadFallLable = new JLabel("MaxLoadFall");
		MaxLoadFallText = new JTextField();
		MaxLoadSpringLable = new JLabel("MaxLoadSpring");
		MaxLoadSpringText = new JTextField();
		MaxLoadSummerFallLable = new JLabel("MaxLoadSummer");
		MaxLoadSummerFallText = new JTextField();

		mainLable.setHorizontalAlignment(JTextField.CENTER);

		sub_view_panel.setBackground(new Color(245, 245, 245));

		mainpanle.setLayout(null);

		sub_view_panel.setLayout(null);

		save.addActionListener(addAction);

		sub_view_panel.add(save);
		sub_view_panel.add(cancel);

		// /
		sub_view_panel.add(FirstNamLable);
		sub_view_panel.add(FirstNameText);

		sub_view_panel.add(lastNameLable);
		sub_view_panel.add(lastNameText);

		backButton = new JButton("Back");
		mainpanle.add(backButton);
		backButton.setBounds(10, 10, 80, 25);
		backButton.addActionListener(actionListenerBack);
		cancel.addActionListener(actionListenercancel);
		
		
		// /
		sub_view_panel.add(GradLable);
		sub_view_panel.add(GradText);

		// /
		sub_view_panel.add(SchoolLable);
		sub_view_panel.add(SchoolText);

		// /
		sub_view_panel.add(DegreeLable);
		sub_view_panel.add(DegreeText);

		sub_view_panel.add(TitelLable);
		sub_view_panel.add(TitelText);

		// /
		sub_view_panel.add(DaysToTeachLable);
		sub_view_panel.add(DaysToTeachText);

		// /
		sub_view_panel.add(MaxLoadFallLable);
		sub_view_panel.add(MaxLoadFallText);
		sub_view_panel.add(MaxLoadSpringLable);
		sub_view_panel.add(MaxLoadSpringText);
		sub_view_panel.add(MaxLoadSummerFallLable);
		sub_view_panel.add(MaxLoadSummerFallText);

		mainpanle.add(mainLable);
		mainpanle.add(FacultyNameText);
		mainpanle.add(sub_view_panel);

		mainpanle.setBackground(new Color(255, 255, 255));

		mainLable.setFont(new Font("Verdana", Font.BOLD, 25));
		mainLable.setBounds(80, 30, 400, 30);

		FacultyNameText.setBounds(150, 100, 200, 30);

		sub_view_panel.setBounds(150, 140, 330, 400);

		save.setBounds(80, 330, 100, 30);
		cancel.setBounds(200, 330, 100, 30);

		//
		lastNameLable.setBounds(10, 20, 90, 25);
		lastNameText.setBounds(100, 20, 200, 25);

		FirstNamLable.setBounds(10, 50, 90, 25);
		FirstNameText.setBounds(100, 50, 200, 25);

		//
		GradLable.setBounds(10, 80, 90, 25);
		GradText.setBounds(100, 80, 200, 25);

		//
		SchoolLable.setBounds(10, 110, 90, 25);
		SchoolText.setBounds(100, 110, 200, 25);

		//
		DegreeLable.setBounds(10, 140, 90, 25);
		DegreeText.setBounds(100, 140, 200, 25);

		//
		TitelLable.setBounds(10, 170, 90, 25);
		TitelText.setBounds(100, 170, 200, 25);

		//
		DaysToTeachLable.setBounds(10, 200, 90, 25);
		DaysToTeachText.setBounds(100, 200, 200, 25);

		//
		MaxLoadFallLable.setBounds(10, 230, 90, 25);
		MaxLoadFallText.setBounds(100, 230, 200, 25);

		MaxLoadSpringLable.setBounds(10, 260, 90, 25);
		MaxLoadSpringText.setBounds(100, 260, 200, 25);

		MaxLoadSummerFallLable.setBounds(10, 290, 90, 25);
		MaxLoadSummerFallText.setBounds(100, 290, 200, 25);

		frame.setLayout(null);
		frame.add(mainpanle);
		mainpanle.setBounds(0, 0, 550, 620);

		frame.setSize(550, 620);
		frame.setResizable(false);
		frame.setLocation(400, 70);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Faculty Data Edit");
		frame.setVisible(true);

	}

	public Faculty_Data_Edit(FacultyDM facultyDM) {
		frame = new JFrame();
		mainpanle = new JPanel();
		FacultyNameText = new JTextField();
		sub_view_panel = new JPanel();
		cancel = new JButton("Cacel");

		save = new JButton("Save");

		mainLable = new JLabel("Faculty Data Edit");

		// /
		lastNameLable = new JLabel("LastName");
		lastNameText = new JTextField(facultyDM.getLastName());

		FirstNamLable = new JLabel("Firat Name");
		FirstNameText = new JTextField(facultyDM.getFirstName());

		// /
		GradLable = new JLabel("Grad");
		GradText = new JTextField(facultyDM.getGrad());

		// /
		SchoolLable = new JLabel("School");
		SchoolText = new JTextField(facultyDM.getSchool());

		// /
		DegreeLable = new JLabel("Degree");
		DegreeText = new JTextField(facultyDM.getDegree());

		// /
		TitelLable = new JLabel("Titel");
		TitelText = new JTextField(facultyDM.getTitle());

		// /
		DaysToTeachLable = new JLabel("DaysToTeach");
		DaysToTeachText = new JTextField(facultyDM.getDaysToTeach());

		// /
		MaxLoadFallLable = new JLabel("MaxLoadFall");
		MaxLoadFallText = new JTextField(facultyDM.getMaxLoadFall());
		MaxLoadSpringLable = new JLabel("MaxLoadSpring");
		MaxLoadSpringText = new JTextField(facultyDM.getMaxLoadSpring());
		MaxLoadSummerFallLable = new JLabel("MaxLoadSummer");
		MaxLoadSummerFallText = new JTextField(facultyDM.getMaxLoadSummer());

		mainLable.setHorizontalAlignment(JTextField.CENTER);

		sub_view_panel.setBackground(new Color(245, 245, 245));

		mainpanle.setLayout(null);

		sub_view_panel.setLayout(null);
		save.addActionListener(addAction);

		sub_view_panel.add(save);
		sub_view_panel.add(cancel);

		// /
		sub_view_panel.add(FirstNamLable);
		sub_view_panel.add(FirstNameText);

		sub_view_panel.add(lastNameLable);
		sub_view_panel.add(lastNameText);

		// /
		sub_view_panel.add(GradLable);
		sub_view_panel.add(GradText);

		// /
		sub_view_panel.add(SchoolLable);
		sub_view_panel.add(SchoolText);

		// /
		sub_view_panel.add(DegreeLable);
		sub_view_panel.add(DegreeText);

		sub_view_panel.add(TitelLable);
		sub_view_panel.add(TitelText);

		// /
		sub_view_panel.add(DaysToTeachLable);
		sub_view_panel.add(DaysToTeachText);

		// /
		sub_view_panel.add(MaxLoadFallLable);
		sub_view_panel.add(MaxLoadFallText);
		sub_view_panel.add(MaxLoadSpringLable);
		sub_view_panel.add(MaxLoadSpringText);
		sub_view_panel.add(MaxLoadSummerFallLable);
		sub_view_panel.add(MaxLoadSummerFallText);

		mainpanle.add(mainLable);
		mainpanle.add(FacultyNameText);
		mainpanle.add(sub_view_panel);

		mainpanle.setBackground(new Color(255, 255, 255));

		mainLable.setFont(new Font("Verdana", Font.BOLD, 25));
		mainLable.setBounds(80, 30, 400, 30);

		FacultyNameText.setBounds(150, 100, 200, 30);

		sub_view_panel.setBounds(150, 140, 330, 400);

		save.setBounds(80, 330, 100, 30);
		cancel.setBounds(200, 330, 100, 30);

		//
		lastNameLable.setBounds(10, 20, 90, 25);
		lastNameText.setBounds(100, 20, 200, 25);

		FirstNamLable.setBounds(10, 50, 90, 25);
		FirstNameText.setBounds(100, 50, 200, 25);

		//
		GradLable.setBounds(10, 80, 90, 25);
		GradText.setBounds(100, 80, 200, 25);

		//
		SchoolLable.setBounds(10, 110, 90, 25);
		SchoolText.setBounds(100, 110, 200, 25);

		//
		DegreeLable.setBounds(10, 140, 90, 25);
		DegreeText.setBounds(100, 140, 200, 25);
		backButton = new JButton("Back");
		mainpanle.add(backButton);
		backButton.setBounds(10, 10, 80, 25);
		backButton.addActionListener(actionListenerBack);
		cancel.addActionListener(actionListenercancel);
		//
		TitelLable.setBounds(10, 170, 90, 25);
		TitelText.setBounds(100, 170, 200, 25);

		//
		DaysToTeachLable.setBounds(10, 200, 90, 25);
		DaysToTeachText.setBounds(100, 200, 200, 25);

		//
		MaxLoadFallLable.setBounds(10, 230, 90, 25);
		MaxLoadFallText.setBounds(100, 230, 200, 25);

		MaxLoadSpringLable.setBounds(10, 260, 90, 25);
		MaxLoadSpringText.setBounds(100, 260, 200, 25);

		MaxLoadSummerFallLable.setBounds(10, 290, 90, 25);
		MaxLoadSummerFallText.setBounds(100, 290, 200, 25);

		frame.setLayout(null);
		frame.add(mainpanle);
		mainpanle.setBounds(0, 0, 550, 620);

		frame.setSize(550, 620);
		frame.setResizable(false);
		frame.setLocation(400, 70);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Faculty Data Edit");
		frame.setVisible(true);

	}
	
	public Faculty_Data_Edit(FacultyDMNew facultyDM) {
		frame = new JFrame();
		mainpanle = new JPanel();
		FacultyNameText = new JTextField();
		sub_view_panel = new JPanel();
		cancel = new JButton("Cacel");

		save = new JButton("Save");

		mainLable = new JLabel("Faculty Data Edit");

		// /
		lastNameLable = new JLabel("LastName");
		lastNameText = new JTextField(facultyDM.getLastName());

		FirstNamLable = new JLabel("Firat Name");
		FirstNameText = new JTextField(facultyDM.getFirstName());

		// /
		DaysToTeachLable = new JLabel("DaysToTeach");
		DaysToTeachText = new JTextField(facultyDM.getDaysToTeach());

		// /
		MaxLoadFallLable = new JLabel("MaxLoadFall");
		MaxLoadFallText = new JTextField(facultyDM.getMaxLoadFall());
		MaxLoadSpringLable = new JLabel("MaxLoadSpring");
		MaxLoadSpringText = new JTextField(facultyDM.getMaxLoadSpring());
		MaxLoadSummerFallLable = new JLabel("MaxLoadSummer");
		MaxLoadSummerFallText = new JTextField(facultyDM.getMaxLoadSummer());

		mainLable.setHorizontalAlignment(JTextField.CENTER);

		sub_view_panel.setBackground(new Color(245, 245, 245));

		mainpanle.setLayout(null);

		sub_view_panel.setLayout(null);
		save.addActionListener(addAction);

		sub_view_panel.add(save);
		sub_view_panel.add(cancel);

		// /
		sub_view_panel.add(FirstNamLable);
		sub_view_panel.add(FirstNameText);

		sub_view_panel.add(lastNameLable);
		sub_view_panel.add(lastNameText);

		// /
		sub_view_panel.add(DaysToTeachLable);
		sub_view_panel.add(DaysToTeachText);

		// /
		sub_view_panel.add(MaxLoadFallLable);
		sub_view_panel.add(MaxLoadFallText);
		sub_view_panel.add(MaxLoadSpringLable);
		sub_view_panel.add(MaxLoadSpringText);
		sub_view_panel.add(MaxLoadSummerFallLable);
		sub_view_panel.add(MaxLoadSummerFallText);

		mainpanle.add(mainLable);
		mainpanle.add(FacultyNameText);
		mainpanle.add(sub_view_panel);

		mainpanle.setBackground(new Color(255, 255, 255));

		mainLable.setFont(new Font("Verdana", Font.BOLD, 25));
		mainLable.setBounds(80, 30, 400, 30);

		FacultyNameText.setBounds(150, 100, 200, 30);

		sub_view_panel.setBounds(150, 140, 330, 400);

		save.setBounds(80, 330, 100, 30);
		cancel.setBounds(200, 330, 100, 30);

		//
		lastNameLable.setBounds(10, 20, 90, 25);
		lastNameText.setBounds(100, 20, 200, 25);

		FirstNamLable.setBounds(10, 50, 90, 25);
		FirstNameText.setBounds(100, 50, 200, 25);

		//
		DaysToTeachLable.setBounds(10, 200, 90, 25);
		DaysToTeachText.setBounds(100, 200, 200, 25);

		//
		MaxLoadFallLable.setBounds(10, 230, 90, 25);
		MaxLoadFallText.setBounds(100, 230, 200, 25);

		MaxLoadSpringLable.setBounds(10, 260, 90, 25);
		MaxLoadSpringText.setBounds(100, 260, 200, 25);

		MaxLoadSummerFallLable.setBounds(10, 290, 90, 25);
		MaxLoadSummerFallText.setBounds(100, 290, 200, 25);

		frame.setLayout(null);
		frame.add(mainpanle);
		mainpanle.setBounds(0, 0, 550, 620);

		frame.setSize(550, 620);
		frame.setResizable(false);
		frame.setLocation(400, 70);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Faculty Data Edit");
		frame.setVisible(true);

	}

	ActionListener addAction = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			FacultyDM facultyDM = new FacultyDM();
			String lastName = lastNameText.getText();
			String FirstName = FirstNameText.getText();
			String Grad = GradText.getText();
			String School = SchoolText.getText();
			String Degree = DegreeText.getText();
			String Title = TitelText.getText();
			String DaysToTeach = DaysToTeachText.getText();
			String MaxLoadFall = MaxLoadFallText.getText();
			String MaxLoadSpring = MaxLoadSpringText.getText();
			String MaxLoadSummer = MaxLoadSummerFallText.getText();

			facultyDM.setDaysToTeach(DaysToTeach);
			facultyDM.setDegree(Degree);
			facultyDM.setFirstName(FirstName);
			facultyDM.setGrad(Grad);
			facultyDM.setLastName(lastName);
			facultyDM.setMaxLoadFall(MaxLoadFall);
			facultyDM.setMaxLoadSpring(MaxLoadSpring);
			facultyDM.setMaxLoadSummer(MaxLoadSummer);
			facultyDM.setSchool(School);
			facultyDM.setTitle(Title);

			String record = facultyDM.getLastName() + ","
					+ facultyDM.getFirstName() + "," + facultyDM.getGrad()
					+ "," + facultyDM.getSchool() + "," + facultyDM.getDegree()
					+ "," + facultyDM.getTitle() + ","
					+ facultyDM.getDaysToTeach() + ","
					+ facultyDM.getMaxLoadFall() + ","
					+ facultyDM.getMaxLoadSpring() + ","
					+ facultyDM.getMaxLoadSummer();

			RandomAccessFile f;
			try {
				f = new RandomAccessFile(new File("TestFaculty.txt"), "rw");

				f.seek(0); // to the beginning
				f.write(record.getBytes());
				f.close();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			FirstNameText.setText("");
			lastNameText.setText("");
			GradText.setText("");
			SchoolText.setText("");
			DegreeText.setText("");
			TitelText.setText("");
			DaysToTeachText.setText("");
			MaxLoadFallText.setText("");
			MaxLoadSpringText.setText("");
			MaxLoadSummerFallText.setText("");

			frame.setVisible(false);
			new Faculty_Data_Importing();

		}
	};

	public static void main(String[] args) {
		new Faculty_Data_Edit();

	}
	JButton backButton ; 

	ActionListener actionListenerBack = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			new Directory_Home() ;
		}
	};
	

	ActionListener actionListenercancel = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {

			FacultyDM facultyDM = new FacultyDM();
			String lastName = lastNameText.getText();
			String FirstName = FirstNameText.getText();
			String Grad = GradText.getText();
			String School = SchoolText.getText();
			String Degree = DegreeText.getText();
			String Title = TitelText.getText();
			String DaysToTeach = DaysToTeachText.getText();
			String MaxLoadFall = MaxLoadFallText.getText();
			String MaxLoadSpring = MaxLoadSpringText.getText();
			String MaxLoadSummer = MaxLoadSummerFallText.getText();

			facultyDM.setDaysToTeach(DaysToTeach);
			facultyDM.setDegree(Degree);
			facultyDM.setFirstName(FirstName);
			facultyDM.setGrad(Grad);
			facultyDM.setLastName(lastName);
			facultyDM.setMaxLoadFall(MaxLoadFall);
			facultyDM.setMaxLoadSpring(MaxLoadSpring);
			facultyDM.setMaxLoadSummer(MaxLoadSummer);
			facultyDM.setSchool(School);
			facultyDM.setTitle(Title);

			String record = facultyDM.getLastName() + ","
					+ facultyDM.getFirstName() + "," + facultyDM.getGrad()
					+ "," + facultyDM.getSchool() + "," + facultyDM.getDegree()
					+ "," + facultyDM.getTitle() + ","
					+ facultyDM.getDaysToTeach() + ","
					+ facultyDM.getMaxLoadFall() + ","
					+ facultyDM.getMaxLoadSpring() + ","
					+ facultyDM.getMaxLoadSummer();

			RandomAccessFile f;
			try {
				f = new RandomAccessFile(new File("TestFaculty.txt"), "rw");

				f.seek(0); // to the beginning
				f.write(record.getBytes());
				f.close();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			FirstNameText.setText("");
			lastNameText.setText("");
			GradText.setText("");
			SchoolText.setText("");
			DegreeText.setText("");
			TitelText.setText("");
			DaysToTeachText.setText("");
			MaxLoadFallText.setText("");
			MaxLoadSpringText.setText("");
			MaxLoadSummerFallText.setText("");

			frame.setVisible(false);
			new Faculty_Data_Importing();
		}
	};

}
