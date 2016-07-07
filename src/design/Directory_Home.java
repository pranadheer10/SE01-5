package design;

import java.awt.Color;
import java.awt.Font;
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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Directory_Home {
	JFrame frame;
	JPanel mainpanle;

	MenuBar menuBar;
	Menu maintinace;
	Menu Reports;
	Menu Activity;
	Menu Schedule;

	Menu UniversitySelection;
	Menu SemesterSelection;
	Menu CourseSelection;
	Menu FacultySelection;
	Menu StudentSelection;
	Menu DegreeSelection;
	Menu GradSchoolSelection;

	MenuItem GenerateSchedule;
	MenuItem TestSchedule;

	MenuItem UniversityEdit;
	MenuItem UniversityHome;

	// MenuItem ClickHereToGenerat;
	MenuItem SemesterImport;
	MenuItem CourseHome;
	MenuItem StudentImport;
	MenuItem StudentImport1;
	MenuItem FacultyImport;
	MenuItem GradSchoolImport;
	MenuItem FacultyImportNew;
	MenuItem DegreeData;
	MenuItem DegreePlan;
	MenuItem DegreePlan1;

	ArrayList<String> sttudents;
	ArrayList<String> Facultys;

	public Directory_Home() {
		frame = new JFrame();
		mainpanle = new JPanel();

		menuBar = new MenuBar();
		maintinace = new Menu("Maintenance");
		Activity = new Menu("Activity");
		Schedule = new Menu("Schedule");
		Reports = new Menu("Reports");

		UniversitySelection = new Menu("University");
		SemesterSelection = new Menu("Semester Selection");
		CourseSelection = new Menu("Course Selection");
		FacultySelection = new Menu("Faculty Selection");
		StudentSelection = new Menu("Student Selection");
		DegreeSelection = new Menu("Degree Selection");
		GradSchoolSelection = new Menu("GradSchool Selection");

		UniversityEdit = new MenuItem("University Edit");
		GenerateSchedule = new MenuItem("Generate Schedule");
		TestSchedule = new MenuItem("Test Schedule");
		UniversityHome = new MenuItem("University Home");
		DegreeData = new MenuItem("Degree Data");
		DegreePlan = new MenuItem("Degree Plan and Req");
		DegreePlan1 = new MenuItem("Degree Plan and Req");
		SemesterImport = new MenuItem("Semester Import");
	
		CourseHome = new MenuItem("Course");

		StudentImport = new MenuItem("Student");
		StudentImport1 = new MenuItem("Student");

		FacultyImport = new MenuItem("Faculty");
		FacultyImportNew = new MenuItem("Faculty");
		GradSchoolImport = new MenuItem("GradSchool");

		// ClickHereToGenerat = new MenuItem("Click here");
		SemesterImport = new MenuItem("Semester");

		Schedule = new Menu("Schedule");

		sttudents = getAllStudent();
		Facultys = getAllFaculty();

		UniversityEdit.addActionListener(actionListenerUniversityEdit);
		GenerateSchedule.addActionListener(actionListenerGenerateSchedule);
		TestSchedule.addActionListener(actionListenerTestSchedule);
		UniversityHome.addActionListener(actionListenerUniversityHome);
		SemesterImport.addActionListener(actionListenersemesterImport);
		CourseHome.addActionListener(actionListenercourseAdd);
		StudentImport.addActionListener(actionListenerstudentImport);
		StudentImport1.addActionListener(actionListenerstudentImport);
		FacultyImport.addActionListener(actionListenerfacultyImport);
		FacultyImportNew.addActionListener(actionListenerfacultyImport);
		GradSchoolImport.addActionListener(actionListenergradSchoolImport);
		DegreeData.addActionListener(actionListenerdegreeData);
		DegreePlan.addActionListener(actionListenerdegreePlan);
		DegreePlan1.addActionListener(actionListenerdegreePlan);

		maintinace.add(UniversitySelection);
		maintinace.add(SemesterSelection);
		maintinace.add(CourseSelection);
		maintinace.add(GradSchoolSelection);
		maintinace.add(FacultySelection);
		maintinace.add(StudentSelection);
		maintinace.add(DegreeSelection);

		UniversitySelection.add(UniversityEdit);

		UniversitySelection.add(UniversityHome);

		SemesterSelection.add(SemesterImport);

		Schedule.add(GenerateSchedule);
		

		CourseSelection.add(CourseHome);

		StudentSelection.add(StudentImport);

		FacultySelection.add(FacultyImport);
		GradSchoolSelection.add(GradSchoolImport);
		DegreeSelection.add(DegreeData);
		DegreeSelection.add(DegreePlan);

		Activity = new Menu("Activity");
		Activity.add(TestSchedule);

//		backButton = new JButton("Back");
//		mainpanle.add(backButton);
//		backButton.setBounds(10, 10, 80, 25);
//		backButton.addActionListener(actionListenerBack);
//		
		
		Reports = new Menu("Reports");
		Reports.add(DegreePlan1);
		Reports.add(StudentImport1);
		Reports.add(FacultyImportNew);

		menuBar.add(maintinace);
		menuBar.add(Reports);
		menuBar.add(Activity);
		menuBar.add(Schedule);

		mainpanle.setLayout(null);

		mainpanle.setBackground(new Color(255, 255, 255));

		frame.setLayout(null);
		frame.add(mainpanle);
		mainpanle.setBounds(0, 0, 550, 620);
		frame.setMenuBar(menuBar);

		frame.setSize(550, 620);
		frame.setResizable(false);
		frame.setLocation(400, 70);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Directory Home Page");
		frame.setVisible(true);

	}

	public ArrayList<String> getAllStudent() {
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

	public ArrayList<String> getAllFaculty() {
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

	ActionListener actionListenerUniversityEdit = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			new University_Edit(sttudents, Facultys);

		}
	};
	ActionListener actionListenerUniversityHome = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			new University_Home();

		}
	};

	ActionListener actionListenercourseAdd = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			new Course_Data_Importing();

		}
	};

	ActionListener actionListenerfacultyEdit = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			new Faculty_Data_Edit();

		}
	};

	ActionListener actionListenerdirectoryHome = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			new Directory_Home();

		}
	};
	
	ActionListener actionListenerdegreeData = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			new Degree_Data_Importing();

		}
	};
	
	ActionListener actionListenerdegreePlan = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			new DegreePlanReq_Data_Importing();

		}
	};
	
	ActionListener actionListenersemesterImport = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			new Semester_Data_Importing();

		}
	};
	
	ActionListener actionListenerAdmin = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			new Create_Admin();

		}
	};
	
	ActionListener actionListenergradSchoolImport = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			new GradSchool_Data_Importing();

		}
	};

	ActionListener actionListenerfacultyImport = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			new Faculty_Data_Importing();

		}
	};
	
	ActionListener actionListenerfacultyImportNew = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			new Faculty_Data_New();

		}
	};

	ActionListener actionListenerstudentImport = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			new Student_Data_Importing();

		}
	};

	ActionListener actionListenerstudentEdit = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			new Student_Data_Edit();

		}
	};

	ActionListener actionListenerGenerateSchedule = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			new Generate_Schedule();

		}
	};
	
	ActionListener actionListenerTestSchedule = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			new Test_Schedule();

		}
	};

	public static void main(String[] args) {
		new Directory_Home();

	}	



}
