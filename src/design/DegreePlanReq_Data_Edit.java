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

import modelDM.DegreePlanReqDM;
import modelDM.StudentDM;

public class DegreePlanReq_Data_Edit {
	// DegreeCode,Description,Hours,Type,Courses

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
	JLabel CoursesLable;
	JTextField CoursesText;

	// /
	JLabel DescriptionLable;
	JTextField DescriptionText;

	// /
	JLabel HoursLable;
	JTextField HoursText;

	// /
	JLabel TypeLable;
	JTextField TypeText;

	// /
	JLabel DegreeCodeLable;
	JTextField DegreeCodeText;

	public DegreePlanReq_Data_Edit() {
		frame = new JFrame();
		mainpanle = new JPanel();
		StudentNameText = new JTextField();
		sub_view_panel = new JPanel();
		cancel = new JButton("Cacel");

		save = new JButton("Save");

		mainLable = new JLabel("DegreePlanReq Data Edit");

		// /
		DegreeCodeLable = new JLabel("DegreeCode");
		DegreeCodeText = new JTextField();

		// /
		DescriptionLable = new JLabel("Description");
		DescriptionText = new JTextField();

		// /
		HoursLable = new JLabel("Hours");
		HoursText = new JTextField();

		// /
		TypeLable = new JLabel("Type");
		TypeText = new JTextField();

		// /
		CoursesLable = new JLabel("Grade");
		CoursesText = new JTextField();

		mainLable.setHorizontalAlignment(JTextField.CENTER);

		sub_view_panel.setBackground(new Color(245, 245, 245));

		mainpanle.setLayout(null);

		sub_view_panel.setLayout(null);

		sub_view_panel.add(save);
		sub_view_panel.add(cancel);

		// /
		sub_view_panel.add(DegreeCodeLable);
		sub_view_panel.add(DegreeCodeText);

		// /
		sub_view_panel.add(DescriptionLable);
		sub_view_panel.add(DescriptionText);

		// /
		sub_view_panel.add(HoursLable);
		sub_view_panel.add(HoursText);

		// /
		sub_view_panel.add(TypeLable);
		sub_view_panel.add(TypeText);

		// /
		sub_view_panel.add(CoursesLable);
		sub_view_panel.add(CoursesText);

		save.addActionListener(addAction);

		mainpanle.add(mainLable);
		mainpanle.add(StudentNameText);
		mainpanle.add(sub_view_panel);

		mainpanle.setBackground(new Color(255, 255, 255));

		mainLable.setFont(new Font("Verdana", Font.BOLD, 25));
		mainLable.setBounds(80, 30, 400, 30);

		StudentNameText.setBounds(150, 100, 200, 30);

		sub_view_panel.setBounds(150, 160, 330, 300);

		backButton = new JButton("Back");
		mainpanle.add(backButton);
		backButton.setBounds(10, 10, 80, 25);
		backButton.addActionListener(actionListenerBack);
		
		
		save.setBounds(80, 250, 100, 30);
		cancel.setBounds(200, 250, 100, 30);

		//
		DegreeCodeLable.setBounds(10, 20, 90, 25);
		DegreeCodeText.setBounds(100, 20, 200, 25);

		//
		DescriptionLable.setBounds(10, 55, 90, 25);
		DescriptionText.setBounds(100, 55, 200, 25);

		//
		HoursLable.setBounds(10, 90, 90, 25);
		HoursText.setBounds(100, 90, 200, 25);

		//
		TypeLable.setBounds(10, 125, 90, 25);
		TypeText.setBounds(100, 125, 200, 25);

		//
		CoursesLable.setBounds(10, 160, 90, 25);
		CoursesText.setBounds(100, 160, 200, 25);

		frame.setLayout(null);
		frame.add(mainpanle);
		mainpanle.setBounds(0, 0, 550, 620);

		frame.setSize(550, 620);
		frame.setResizable(false);
		frame.setLocation(400, 70);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("DegreePlanReq Data Edit");
		frame.setVisible(true);

	}

	public DegreePlanReq_Data_Edit(DegreePlanReqDM degreePlanReqDM) {
		frame = new JFrame();
		mainpanle = new JPanel();
		StudentNameText = new JTextField();
		sub_view_panel = new JPanel();
		cancel = new JButton("Cacel");
		// continue_Buttom = new JButton("Continue");
		save = new JButton("Save");
		// liftLable = new JLabel("Enter Student Name");

		mainLable = new JLabel("DegreePlanReq Data Edit");

		// /
		DegreeCodeLable = new JLabel("DegreeCode");
		DegreeCodeText = new JTextField(degreePlanReqDM.getDegreeCode());

		// /
		DescriptionLable = new JLabel("Description");
		DescriptionText = new JTextField(degreePlanReqDM.getDescription());

		// /
		HoursLable = new JLabel("Hours");
		HoursText = new JTextField(degreePlanReqDM.getHours());

		// /
		TypeLable = new JLabel("Type");
		TypeText = new JTextField(degreePlanReqDM.getType());

		// /
		CoursesLable = new JLabel("Grade");
		CoursesText = new JTextField(degreePlanReqDM.getCourses());

		mainLable.setHorizontalAlignment(JTextField.CENTER);

		sub_view_panel.setBackground(new Color(245, 245, 245));

		mainpanle.setLayout(null);

		sub_view_panel.setLayout(null);

		sub_view_panel.add(save);
		sub_view_panel.add(cancel);

		// /
		sub_view_panel.add(DegreeCodeLable);
		sub_view_panel.add(DegreeCodeText);

		// /
		sub_view_panel.add(DescriptionLable);
		sub_view_panel.add(DescriptionText);

		// /
		sub_view_panel.add(HoursLable);
		sub_view_panel.add(HoursText);

		// /
		sub_view_panel.add(TypeLable);
		sub_view_panel.add(TypeText);

		// /
		sub_view_panel.add(CoursesLable);
		sub_view_panel.add(CoursesText);

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
		DegreeCodeLable.setBounds(10, 20, 90, 25);
		DegreeCodeText.setBounds(100, 20, 200, 25);

		//
		DescriptionLable.setBounds(10, 55, 90, 25);
		DescriptionText.setBounds(100, 55, 200, 25);

		//
		HoursLable.setBounds(10, 90, 90, 25);
		HoursText.setBounds(100, 90, 200, 25);

		//
		TypeLable.setBounds(10, 125, 90, 25);
		TypeText.setBounds(100, 125, 200, 25);

		//
		CoursesLable.setBounds(10, 160, 90, 25);
		CoursesText.setBounds(100, 160, 200, 25);

		frame.setLayout(null);
		frame.add(mainpanle);
		mainpanle.setBounds(0, 0, 550, 620);

		frame.setSize(550, 620);
		frame.setResizable(false);
		frame.setLocation(400, 70);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("DegreePlanReq Data Edit");
		frame.setVisible(true);

	}

	ActionListener addAction = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			String DegreeCode = DegreeCodeText.getText();
			String id = DescriptionText.getText();
			String degrePlan = HoursText.getText();
			String course_Name = TypeText.getText();
			String grade = CoursesText.getText();
			DegreePlanReqDM degreePlanReqDM = new DegreePlanReqDM();
			degreePlanReqDM.setDegreeCode(DegreeCode);
			degreePlanReqDM.setDescription(grade);
			degreePlanReqDM.setHours(course_Name);
			degreePlanReqDM.setType(degrePlan);// ??
			degreePlanReqDM.setCourses(DegreeCode);// ??
			String record = degreePlanReqDM.getDegreeCode() + ","
					+ degreePlanReqDM.getDescription() + ","
					+ degreePlanReqDM.getHours() + ","
					+ degreePlanReqDM.getType() + ","
					+ degreePlanReqDM.getCourses();

			RandomAccessFile f;
			try {
				f = new RandomAccessFile(new File("TestDataDegreePlanReq.txt"), "rw");

				f.seek(0); // to the beginning
				f.write(record.getBytes());
				f.close();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			DegreeCodeText.setText("");
			DescriptionText.setText("");
			CoursesText.setText("");
			HoursText.setText("");
			TypeText.setText("");
			frame.setVisible(false);
			new DegreePlanReq_Data_Importing();

		}
	};

	public static void main(String[] args) {
		new DegreePlanReq_Data_Edit();

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
