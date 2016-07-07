package design;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import Service.StudentService;
import modelDM.StudentDM;

public class Student_Data_Edit {

	JFrame frame;
	JPanel mainpanle;
	JButton save;
	// JButton continue_Buttom;
	JButton cancel;
	// JLabel liftLable;

	JTextField StudentNameText;
	JPanel sub_view_panel;

	JLabel mainLable;

	// /
	JLabel gradeLable;
	JTextField gradeText;

	// /
	JLabel idLable;
	JTextField idText;

	// /
	JLabel degreeLable;
	JTextField degreeText;

	// /
	JLabel courseLable;
	JTextField courseText;

	// /
	JLabel nameLable;
	JTextField nameText;

	public Student_Data_Edit() {
		frame = new JFrame();
		mainpanle = new JPanel();
		StudentNameText = new JTextField();
		sub_view_panel = new JPanel();
		cancel = new JButton("Cacel");

		save = new JButton("Save");

		mainLable = new JLabel("Student Data Edit");

		// /
		nameLable = new JLabel("Name");
		nameText = new JTextField();

		// /
		idLable = new JLabel("ID");
		idText = new JTextField();

		// /
		degreeLable = new JLabel("Degree Plan");
		degreeText = new JTextField();

		// /
		courseLable = new JLabel("Course");
		courseText = new JTextField();

		// /
		gradeLable = new JLabel("Grade");
		gradeText = new JTextField();

		mainLable.setHorizontalAlignment(JTextField.CENTER);

		sub_view_panel.setBackground(new Color(245, 245, 245));

		mainpanle.setLayout(null);

		sub_view_panel.setLayout(null);

		sub_view_panel.add(save);
		sub_view_panel.add(cancel);

		// /
		sub_view_panel.add(nameLable);
		sub_view_panel.add(nameText);

		// /
		sub_view_panel.add(idLable);
		sub_view_panel.add(idText);

		// /
		backButton = new JButton("Back");
		mainpanle.add(backButton);
		backButton.setBounds(10, 10, 80, 25);
		backButton.addActionListener(actionListenerBack);
		cancel.addActionListener(actionListenercancel);

		sub_view_panel.add(degreeLable);
		sub_view_panel.add(degreeText);

		// /
		sub_view_panel.add(courseLable);
		sub_view_panel.add(courseText);

		// /
		sub_view_panel.add(gradeLable);
		sub_view_panel.add(gradeText);

		save.addActionListener(addAction);

		mainpanle.add(mainLable);
		mainpanle.add(StudentNameText);
		mainpanle.add(sub_view_panel);

		mainpanle.setBackground(new Color(255, 255, 255));

		mainLable.setFont(new Font("Verdana", Font.BOLD, 25));
		mainLable.setBounds(80, 30, 400, 30);

		StudentNameText.setBounds(150, 100, 200, 30);

		sub_view_panel.setBounds(150, 160, 330, 300);

		save.setBounds(80, 250, 100, 30);
		cancel.setBounds(200, 250, 100, 30);

		//
		nameLable.setBounds(10, 20, 90, 25);
		nameText.setBounds(100, 20, 200, 25);

		//
		idLable.setBounds(10, 55, 90, 25);
		idText.setBounds(100, 55, 200, 25);

		//
		degreeLable.setBounds(10, 90, 90, 25);
		degreeText.setBounds(100, 90, 200, 25);
		backButton = new JButton("Back");
		mainpanle.add(backButton);
		backButton.setBounds(10, 10, 80, 25);

		backButton.addActionListener(actionListenerBack);

		cancel.addActionListener(actionListenercancel);
		//
		courseLable.setBounds(10, 125, 90, 25);
		courseText.setBounds(100, 125, 200, 25);

		//
		gradeLable.setBounds(10, 160, 90, 25);
		gradeText.setBounds(100, 160, 200, 25);

		frame.setLayout(null);
		frame.add(mainpanle);
		mainpanle.setBounds(0, 0, 550, 620);

		frame.setSize(550, 620);
		frame.setResizable(false);
		frame.setLocation(400, 70);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Student Data Edit");
		frame.setVisible(true);

	}

	public Student_Data_Edit(StudentDM studentDM) {
		frame = new JFrame();
		mainpanle = new JPanel();
		StudentNameText = new JTextField();
		sub_view_panel = new JPanel();
		cancel = new JButton("Cacel");
		// continue_Buttom = new JButton("Continue");
		save = new JButton("Save");
		// liftLable = new JLabel("Enter Student Name");

		mainLable = new JLabel("Student Data Edit");

		// /
		nameLable = new JLabel("Name");
		nameText = new JTextField(studentDM.getCoursetaken());

		// /
		idLable = new JLabel("ID");
		idText = new JTextField(studentDM.getStudentID());

		// /
		degreeLable = new JLabel("Degree Plan");
		degreeText = new JTextField(studentDM.getCourseCode());

		// /
		courseLable = new JLabel("Course");
		courseText = new JTextField(studentDM.getCourseName());

		// /
		gradeLable = new JLabel("Grade");
		gradeText = new JTextField(studentDM.getGrade());

		mainLable.setHorizontalAlignment(JTextField.CENTER);

		sub_view_panel.setBackground(new Color(245, 245, 245));

		mainpanle.setLayout(null);

		sub_view_panel.setLayout(null);

		sub_view_panel.add(save);
		sub_view_panel.add(cancel);

		// /
		sub_view_panel.add(nameLable);
		sub_view_panel.add(nameText);

		// /
		sub_view_panel.add(idLable);
		sub_view_panel.add(idText);

		// /
		sub_view_panel.add(degreeLable);
		sub_view_panel.add(degreeText);

		// /
		sub_view_panel.add(courseLable);
		sub_view_panel.add(courseText);

		// /
		sub_view_panel.add(gradeLable);
		sub_view_panel.add(gradeText);

		save.addActionListener(addAction);

		mainpanle.add(mainLable);
		mainpanle.add(StudentNameText);
		mainpanle.add(sub_view_panel);

		mainpanle.setBackground(new Color(255, 255, 255));

		mainLable.setFont(new Font("Verdana", Font.BOLD, 25));
		mainLable.setBounds(80, 30, 400, 30);

		StudentNameText.setBounds(150, 100, 200, 30);

		sub_view_panel.setBounds(150, 160, 330, 300);

		save.setBounds(80, 250, 100, 30);
		cancel.setBounds(200, 250, 100, 30);

		//
		nameLable.setBounds(10, 20, 90, 25);
		nameText.setBounds(100, 20, 200, 25);

		//
		idLable.setBounds(10, 55, 90, 25);
		idText.setBounds(100, 55, 200, 25);

		//
		degreeLable.setBounds(10, 90, 90, 25);
		degreeText.setBounds(100, 90, 200, 25);

		degreeLable.setBounds(10, 90, 90, 25);
		degreeText.setBounds(100, 90, 200, 25);
		backButton = new JButton("Back");
		mainpanle.add(backButton);
		backButton.setBounds(10, 10, 80, 25);

		backButton.addActionListener(actionListenerBack);

		cancel.addActionListener(actionListenercancel);
		courseLable.setBounds(10, 125, 90, 25);
		courseText.setBounds(100, 125, 200, 25);

		//
		gradeLable.setBounds(10, 160, 90, 25);
		gradeText.setBounds(100, 160, 200, 25);

		frame.setLayout(null);
		frame.add(mainpanle);
		mainpanle.setBounds(0, 0, 550, 620);

		frame.setSize(550, 620);
		frame.setResizable(false);
		frame.setLocation(400, 70);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Student Data Edit");
		frame.setVisible(true);

	}

	ActionListener addAction = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			String name = nameText.getText();
			String id = idText.getText();
			String degrePlan = degreeText.getText();
			String course_Name = courseText.getText();
			String grade = gradeText.getText();
			StudentDM studentDM = new StudentDM();
			studentDM.setStudentID(id);
			studentDM.setGrade(grade);
			studentDM.setCourseName(course_Name);
			studentDM.setCourseCode(degrePlan);// ??
			studentDM.setCoursetaken(name);// ??
			String record = studentDM.getStudentID() + ","
					+ studentDM.getGrade() + "," + studentDM.getCourseName()
					+ "," + studentDM.getCourseCode() + ","
					+ studentDM.getCoursetaken();

			RandomAccessFile f;
			try {
				f = new RandomAccessFile(new File("TestStudent.txt"), "rw");

				f.seek(0); // to the beginning
				f.write(record.getBytes());
				f.close();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			nameText.setText("");
			idText.setText("");
			gradeText.setText("");
			degreeText.setText("");
			courseText.setText("");
			frame.setVisible(false);
			new Student_Data_Importing();

		}
	};

	public static void main(String[] args) {

//		StudentDM sDM= new StudentDM();
		new Student_Data_Edit();

	}

	JButton backButton;

	ActionListener actionListenerBack = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			new Directory_Home();
		}
	};
	ActionListener actionListenercancel = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
//			JOptionPane.showMessageDialog(null, "cancel");
			String name = nameText.getText();
			String id = idText.getText();
			String degrePlan = degreeText.getText();
			String course_Name = courseText.getText();
			String grade = gradeText.getText();
			StudentDM studentDM = new StudentDM();
			studentDM.setStudentID(id);
			studentDM.setGrade(grade);
			studentDM.setCourseName(course_Name);
			studentDM.setCourseCode(degrePlan);// ??
			studentDM.setCoursetaken(name);// ??
			String record = studentDM.getStudentID() + ","
					+ studentDM.getGrade() + "," + studentDM.getCourseName()
					+ "," + studentDM.getCourseCode() + ","
					+ studentDM.getCoursetaken();

			RandomAccessFile f;
			try {
				f = new RandomAccessFile(new File("TestStudent.txt"), "rw");

				f.seek(0); // to the beginning
				f.write(record.getBytes());
				f.close();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			nameText.setText("");
			idText.setText("");
			gradeText.setText("");
			degreeText.setText("");
			courseText.setText("");
			frame.setVisible(false);
			new Student_Data_Importing();
		}
	};

}
