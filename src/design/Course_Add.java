package design;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Course_Add {

	JFrame frame;
	JPanel mainpanle;
	JButton submit;
	JButton clear;
	JLabel CourseAddMainLable;
	JButton backButton ; 

	JLabel Name_Labple;
	JTextField Name_Text;

	//

	JLabel department_Labple;
	JTextField department_Text;

	//
	JLabel track_Labple;
	JTextField track_Text;

	//
	JLabel degreeCode_Labple;
	JTextField degreeCode_Text;

	//
	JLabel HoursRequired_Labple;
	JTextField HoursRequired_Text;

	//
	JLabel CoursesList_Labple;
	JComboBox CoursesList_Text;
	

	//
	//
	JLabel HoursRequired2_Labple;
	JTextField HoursRequired2_Text;

	//
	JLabel CoursesList2_Labple;
	JComboBox CoursesList2_Text;

	//

	public Course_Add() {
		frame = new JFrame();
		mainpanle = new JPanel();
		submit = new JButton("Submit");
		clear = new JButton("Clear");
		CourseAddMainLable = new JLabel("Adding Course");
		CourseAddMainLable.setFont(new Font("Verdana", Font.BOLD, 25));

		Name_Labple = new JLabel("Name");
		Name_Text = new JTextField();
		Name_Text.setHorizontalAlignment(JTextField.CENTER);

		// //
		department_Labple = new JLabel("Department");
		department_Text = new JTextField();
		department_Text.setHorizontalAlignment(JTextField.CENTER);

		// //
		track_Labple = new JLabel("Track");
		track_Text = new JTextField();
		track_Text.setHorizontalAlignment(JTextField.CENTER);

		// //
		degreeCode_Labple = new JLabel("Degree Code");
		degreeCode_Text = new JPasswordField();
		degreeCode_Text.setHorizontalAlignment(JTextField.CENTER);

		// //
		HoursRequired_Labple = new JLabel("Hours Required");
		HoursRequired_Text = new JPasswordField();
		HoursRequired_Text.setHorizontalAlignment(JTextField.CENTER);

		// //
		CoursesList_Labple = new JLabel("Courses List");
		CoursesList_Text = new JComboBox();

		// //

		// //
		HoursRequired2_Labple = new JLabel("Hours Required");
		HoursRequired2_Text = new JPasswordField();
		HoursRequired2_Text.setHorizontalAlignment(JTextField.CENTER);

		// //
		CoursesList2_Labple = new JLabel("Courses List");
		CoursesList2_Text = new JComboBox();

		// //

		CoursesList_Text.addItem("Course 1");
		CoursesList_Text.addItem("Course 2");
		CoursesList_Text.addItem("Course 3");

		CoursesList2_Text.addItem("Course 1");
		CoursesList2_Text.addItem("Course 2");
		CoursesList2_Text.addItem("Course 3");

		mainpanle.setLayout(null);

		mainpanle.add(submit);
		mainpanle.add(clear);
		mainpanle.add(CourseAddMainLable);

		mainpanle.setBackground(new Color(255, 255, 255));

		CourseAddMainLable.setBounds(200, 0, 220, 30);

		Name_Labple.setBounds(100, 70, 100, 25);
		Name_Text.setBounds(200, 70, 200, 25);


		backButton = new JButton("Back");
		mainpanle.add(backButton);
		backButton.setBounds(10, 10, 80, 25);
		backButton.addActionListener(actionListenerBack);
		
		
		mainpanle.add(Name_Labple);
		mainpanle.add(Name_Text);

		// //
		department_Labple.setBounds(100, 115, 100, 25);
		department_Text.setBounds(200, 115, 200, 25);

		mainpanle.add(department_Labple);
		mainpanle.add(department_Text);
		

		// //
		track_Labple.setBounds(100, 160, 100, 25);
		track_Text.setBounds(200, 160, 200, 25);

		mainpanle.add(track_Labple);
		mainpanle.add(track_Text);

		// //
		degreeCode_Labple.setBounds(100, 205, 100, 25);
		degreeCode_Text.setBounds(200, 205, 200, 25);

		mainpanle.add(degreeCode_Labple);
		mainpanle.add(degreeCode_Text);

		// //
		HoursRequired_Labple.setBounds(100, 250, 100, 25);
		HoursRequired_Text.setBounds(200, 250, 200, 25);

		mainpanle.add(HoursRequired_Labple);
		mainpanle.add(HoursRequired_Text);

		// //
		CoursesList_Labple.setBounds(100, 295, 100, 25);
		CoursesList_Text.setBounds(200, 295, 200, 25);

		mainpanle.add(CoursesList_Labple);
		mainpanle.add(CoursesList_Text);

		// // // //
		HoursRequired2_Labple.setBounds(100, 340, 100, 25);
		HoursRequired2_Text.setBounds(200, 340, 200, 25);

		mainpanle.add(HoursRequired2_Labple);
		mainpanle.add(HoursRequired2_Text);

		// //
		CoursesList2_Labple.setBounds(100, 385, 100, 25);
		CoursesList2_Text.setBounds(200, 385, 200, 25);

		mainpanle.add(CoursesList2_Labple);
		mainpanle.add(CoursesList2_Text);

		// //

		submit.setBounds(200, 450, 90, 30);
		clear.setBounds(310, 450, 90, 30);

		frame.setLayout(null);
		frame.add(mainpanle);
		mainpanle.setBounds(0, 0, 550, 620);

		frame.setSize(550, 620);
		frame.setResizable(false);
		frame.setLocation(400, 70);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Course Add");
		frame.setVisible(true);

	}


	
	ActionListener actionListenerBack = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			new Directory_Home() ;
		}
	};

	public static void main(String[] args) {
		new Course_Add();

	}

}
