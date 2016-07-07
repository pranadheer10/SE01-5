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

import modelDM.SemesterDM;
import modelDM.UniversityDM;

public class Edit_Data_Semester {
	JFrame frame;
	JPanel mainpanle;
	JButton save;

	JButton cancel;

	JTextField FacultyNameText;
	JPanel sub_view_panel;

	JLabel mainLable;

	// /
	JLabel SemeterNameLable;
	JTextField SemeterNameText;

	JLabel startDateLable;
	JTextField startDateText;

	JLabel endDateLable;
	JTextField endDateText;

	public Edit_Data_Semester() {
		frame = new JFrame();
		mainpanle = new JPanel();
		FacultyNameText = new JTextField();
		sub_view_panel = new JPanel();
		cancel = new JButton("Cacel");

		save = new JButton("Save");

		mainLable = new JLabel("Semester Data Edit");

		// /
		SemeterNameLable = new JLabel("SemeterName");
		SemeterNameText = new JTextField();

		startDateLable = new JLabel("Start Date");
		startDateText = new JTextField();
		endDateLable = new JLabel("end Date");
		endDateText = new JTextField();

		mainLable.setHorizontalAlignment(JTextField.CENTER);

		sub_view_panel.setBackground(new Color(245, 245, 245));

		mainpanle.setLayout(null);

		sub_view_panel.setLayout(null);

		save.addActionListener(addAction);

		sub_view_panel.add(save);
		sub_view_panel.add(cancel);

		// /
		sub_view_panel.add(startDateLable);
		sub_view_panel.add(startDateText);
		sub_view_panel.add(endDateLable);
		sub_view_panel.add(endDateText);

		sub_view_panel.add(SemeterNameLable);
		sub_view_panel.add(SemeterNameText);

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
		
		backButton = new JButton("Back");
		mainpanle.add(backButton);
		backButton.setBounds(10, 10, 80, 25);
		backButton.addActionListener(actionListenerBack);
		cancel.addActionListener(actionListenercancel);
		
		
		SemeterNameLable.setBounds(10, 20, 90, 25);
		SemeterNameText.setBounds(100, 20, 200, 25);

		startDateLable.setBounds(10, 50, 90, 25);
		startDateText.setBounds(100, 50, 200, 25);
		endDateLable.setBounds(10, 80, 90, 25);
		endDateText.setBounds(100, 80, 200, 25);

		frame.setLayout(null);
		frame.add(mainpanle);
		mainpanle.setBounds(0, 0, 550, 620);

		frame.setSize(550, 620);
		frame.setResizable(false);
		frame.setLocation(400, 70);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Semester Data Edit");
		frame.setVisible(true);

	}

	public Edit_Data_Semester(SemesterDM semesterDM) {
		frame = new JFrame();
		mainpanle = new JPanel();
		FacultyNameText = new JTextField();
		sub_view_panel = new JPanel();
		cancel = new JButton("Cacel");

		save = new JButton("Save");

		mainLable = new JLabel("Semester Data Edit");

		// /
		SemeterNameLable = new JLabel("Name Semester");
		SemeterNameText = new JTextField(semesterDM.getSemesterName());

		startDateLable = new JLabel("start Date");
		startDateText = new JTextField(semesterDM.getStart_Date());
		endDateLable = new JLabel("End Date");
		endDateText = new JTextField(semesterDM.getEnd_Date());

		// /

		mainLable.setHorizontalAlignment(JTextField.CENTER);

		sub_view_panel.setBackground(new Color(245, 245, 245));

		mainpanle.setLayout(null);

		sub_view_panel.setLayout(null);
		save.addActionListener(addAction);

		sub_view_panel.add(save);
		sub_view_panel.add(cancel);

		// /
		sub_view_panel.add(startDateLable);
		sub_view_panel.add(startDateText);
		sub_view_panel.add(endDateLable);
		sub_view_panel.add(endDateText);

		sub_view_panel.add(SemeterNameLable);
		sub_view_panel.add(SemeterNameText);

		// /

		mainpanle.add(mainLable);
		mainpanle.add(FacultyNameText);
		mainpanle.add(sub_view_panel);

		mainpanle.setBackground(new Color(255, 255, 255));

		mainLable.setFont(new Font("Verdana", Font.BOLD, 25));
		mainLable.setBounds(80, 30, 400, 30);

		FacultyNameText.setBounds(150, 100, 200, 30);

		sub_view_panel.setBounds(150, 140, 330, 400);

		backButton = new JButton("Back");
		mainpanle.add(backButton);
		backButton.setBounds(10, 10, 80, 25);
		backButton.addActionListener(actionListenerBack);
		cancel.addActionListener(actionListenercancel);
		
		
		save.setBounds(80, 330, 100, 30);
		cancel.setBounds(200, 330, 100, 30);

		//
		SemeterNameLable.setBounds(10, 20, 90, 25);
		SemeterNameText.setBounds(100, 20, 200, 25);

		startDateLable.setBounds(10, 50, 90, 25);
		startDateText.setBounds(100, 50, 200, 25);
		endDateLable.setBounds(10, 80, 90, 25);
		endDateText.setBounds(100, 80, 200, 25);

		//

		frame.setLayout(null);
		frame.add(mainpanle);
		mainpanle.setBounds(0, 0, 550, 620);

		frame.setSize(550, 620);
		frame.setResizable(false);
		frame.setLocation(400, 70);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Semester Data Edit");
		frame.setVisible(true);

	}

	ActionListener addAction = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			SemesterDM semesterDM = new SemesterDM();
			String SemesterName = SemeterNameText.getText();
			String startDate = startDateText.getText();
			String endDate = endDateText.getText();

			semesterDM.setSemesterName(SemesterName);
			semesterDM.setEnd_Date(endDate);
			semesterDM.setStart_Date(startDate);

			String record = semesterDM.getSemesterName() + ","
					+ semesterDM.getStart_Date() + ","
					+ semesterDM.getEnd_Date();

			RandomAccessFile f;
			try {
				f = new RandomAccessFile(new File("TestSemesters.txt"), "rw");

				f.seek(0); // to the beginning
				f.write(record.getBytes());
				f.close();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			endDateText.setText("");
			startDateText.setText("");
			SemeterNameText.setText("");

			frame.setVisible(false);
			new Semester_Data_Importing();

		}
	};

	public static void main(String[] args) {
		new Edit_Data_Semester();

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
			SemesterDM semesterDM = new SemesterDM();
			String SemesterName = SemeterNameText.getText();
			String startDate = startDateText.getText();
			String endDate = endDateText.getText();

			semesterDM.setSemesterName(SemesterName);
			semesterDM.setEnd_Date(endDate);
			semesterDM.setStart_Date(startDate);

			String record = semesterDM.getSemesterName() + ","
					+ semesterDM.getStart_Date() + ","
					+ semesterDM.getEnd_Date();

			RandomAccessFile f;
			try {
				f = new RandomAccessFile(new File("TestSemesters.txt"), "rw");

				f.seek(0); // to the beginning
				f.write(record.getBytes());
				f.close();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			endDateText.setText("");
			startDateText.setText("");
			SemeterNameText.setText("");

			frame.setVisible(false);
			new Semester_Data_Importing();
		}
	};

}
