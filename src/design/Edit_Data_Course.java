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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import modelDM.CourseDM;
import modelDM.StudentDM;

public class Edit_Data_Course {

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
	JLabel CourseCodeLable;
	JTextField CourseCodeText;

	// /
	JLabel CourseNameLable;
	JTextField CourseNameText;

	// /
	JLabel CourseDescriptionLable;
	JTextField CourseDescriptionText;

	// /
	JLabel CourseHoursLable;
	JTextField CourseHoursText;

	// /
	JLabel CourseCapLable;
	JTextField CourseCapText;

	JLabel OfferedFallLable;
	JTextField OfferedFallText;

	JLabel OfferedSpringLable;
	JTextField OfferedSpringText;

	JLabel OfferedSummerLable;
	JTextField OfferedSummerText;

	JLabel CoursePrereqsLable;
	JTextField CoursePrereqsText;

	JLabel TeachersLable;
	JTextField TeachersText;

	public Edit_Data_Course() {
		frame = new JFrame();
		mainpanle = new JPanel();
		StudentNameText = new JTextField();
		sub_view_panel = new JPanel();
		cancel = new JButton("Cacel");

		save = new JButton("Save");

		mainLable = new JLabel("Course Data Edit");

		// /
		CourseCapLable = new JLabel("CourseCap");
		CourseCapText = new JTextField();

		// /
		OfferedFallLable = new JLabel("OfferedFall");
		OfferedFallText = new JTextField();

		// /
		OfferedSpringLable = new JLabel("OfferedSpring");
		OfferedSpringText = new JTextField();

		// /
		OfferedSpringLable = new JLabel("OfferedSpring");
		OfferedSpringText = new JTextField();

		// /
		OfferedSummerLable = new JLabel("OfferedSummer");
		OfferedSummerText = new JTextField();

		// /
		CoursePrereqsLable = new JLabel("CoursePrereqs");
		CoursePrereqsText = new JTextField();

		// /
		TeachersLable = new JLabel("Teachers");
		TeachersText = new JTextField();

		// /
		CourseNameLable = new JLabel("CourseName");
		CourseNameText = new JTextField();

		// /
		CourseDescriptionLable = new JLabel("Course Description");
		CourseDescriptionText = new JTextField();

		// /
		CourseHoursLable = new JLabel("Course Hours");
		CourseHoursText = new JTextField();

		// /
		CourseCodeLable = new JLabel("CourseCode");
		CourseCodeText = new JTextField();

		mainLable.setHorizontalAlignment(JTextField.CENTER);

		sub_view_panel.setBackground(new Color(245, 245, 245));

		mainpanle.setLayout(null);

		sub_view_panel.setLayout(null);

		sub_view_panel.add(save);
		sub_view_panel.add(cancel);

		// /
		sub_view_panel.add(CourseCapLable);
		sub_view_panel.add(CourseCapText);
		// /
		sub_view_panel.add(OfferedFallLable);
		sub_view_panel.add(OfferedFallText);
		// /
		sub_view_panel.add(OfferedSpringLable);
		sub_view_panel.add(OfferedSpringText);
		// /
		sub_view_panel.add(OfferedSummerLable);
		sub_view_panel.add(OfferedSummerText);
		// /
		sub_view_panel.add(CoursePrereqsLable);
		sub_view_panel.add(CoursePrereqsText);
		// /
		sub_view_panel.add(TeachersLable);
		sub_view_panel.add(TeachersText);

		// /
		sub_view_panel.add(CourseNameLable);
		sub_view_panel.add(CourseNameText);

		// /
		sub_view_panel.add(CourseDescriptionLable);
		sub_view_panel.add(CourseDescriptionText);

		// /
		sub_view_panel.add(CourseHoursLable);
		sub_view_panel.add(CourseHoursText);

		// /
		sub_view_panel.add(CourseCodeLable);
		sub_view_panel.add(CourseCodeText);

		save.addActionListener(addAction);

		mainpanle.add(mainLable);
		mainpanle.add(StudentNameText);
		mainpanle.add(sub_view_panel);

		mainpanle.setBackground(new Color(255, 255, 255));

		mainLable.setFont(new Font("Verdana", Font.BOLD, 25));
		mainLable.setBounds(80, 30, 400, 30);

		StudentNameText.setBounds(150, 100, 200, 30);

		sub_view_panel.setBounds(150, 140, 330, 430);

		save.setBounds(80, 400, 100, 30);
		cancel.setBounds(200, 400, 100, 30);

		//
		backButton = new JButton("Back");
		mainpanle.add(backButton);
		backButton.setBounds(10, 10, 80, 25);
		backButton.addActionListener(actionListenerBack);
		cancel.addActionListener(actionListenercancel);
		
		
		CourseNameLable.setBounds(10, 55, 90, 25);
		CourseNameText.setBounds(100, 55, 200, 25);

		//
		CourseDescriptionLable.setBounds(10, 90, 90, 25);
		CourseDescriptionText.setBounds(100, 90, 200, 25);

		//
		CourseHoursLable.setBounds(10, 125, 90, 25);
		CourseHoursText.setBounds(100, 125, 200, 25);

		//
		CourseCodeLable.setBounds(10, 160, 90, 25);
		CourseCodeText.setBounds(100, 160, 200, 25);

		//
		CourseCapLable.setBounds(10, 195, 90, 25);
		CourseCapText.setBounds(100, 195, 200, 25);
		//
		OfferedFallLable.setBounds(10, 230, 90, 25);
		OfferedFallText.setBounds(100, 230, 200, 25);
		//
		OfferedSpringLable.setBounds(10, 265, 90, 25);
		OfferedSpringText.setBounds(100, 265, 200, 25);
		//
		OfferedSummerLable.setBounds(10, 300, 90, 25);
		OfferedSummerText.setBounds(100, 300, 200, 25);
		//
		CoursePrereqsLable.setBounds(10, 335, 90, 25);
		CoursePrereqsText.setBounds(100, 335, 200, 25);
		//
		TeachersLable.setBounds(10, 370, 90, 25);
		TeachersText.setBounds(100, 370, 200, 25);

		frame.setLayout(null);
		frame.add(mainpanle);
		mainpanle.setBounds(0, 0, 550, 620);

		frame.setSize(550, 620);
		frame.setResizable(false);
		frame.setLocation(400, 70);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Course Data Edit");
		frame.setVisible(true);

	}

	public Edit_Data_Course(CourseDM courseDM) {
//		JOptionPane.showMessageDialog(null, courseDM.getCourseName() + "  --");
		frame = new JFrame();
		mainpanle = new JPanel();
		StudentNameText = new JTextField();
		sub_view_panel = new JPanel();
		cancel = new JButton("Cacel");

		save = new JButton("Save");

		mainLable = new JLabel("Course Data Edit");

		// /
		CourseCapLable = new JLabel("CourseCap");
		CourseCapText = new JTextField(courseDM.getCourseCap());

		// /
		OfferedFallLable = new JLabel("OfferedFall");
		OfferedFallText = new JTextField(courseDM.getOfferedFall());

		// /
		OfferedSpringLable = new JLabel("OfferedSpring");
		OfferedSpringText = new JTextField(courseDM.getOfferedSpring());

		// /
		OfferedSpringLable = new JLabel("OfferedSpring");
		OfferedSpringText = new JTextField(courseDM.getOfferedSpring());

		// /
		OfferedSummerLable = new JLabel("OfferedSummer");
		OfferedSummerText = new JTextField(courseDM.getOfferedSummer());

		// /
		CoursePrereqsLable = new JLabel("CoursePrereqs");
		CoursePrereqsText = new JTextField(courseDM.getCoursePrereqs());

		// /
		TeachersLable = new JLabel("Teachers");
		TeachersText = new JTextField(courseDM.getTeachers());

		// /
		CourseNameLable = new JLabel("CourseName");
		CourseNameText = new JTextField(courseDM.getCourseName());

		// /
		CourseDescriptionLable = new JLabel("Course Description");
		CourseDescriptionText = new JTextField(courseDM.getCourseDescription());

		// /
		CourseHoursLable = new JLabel("Course Hours");
		CourseHoursText = new JTextField(courseDM.getCourseHours());

		// /
		CourseCodeLable = new JLabel("CourseCode");
		CourseCodeText = new JTextField(courseDM.getCourseCode());

		mainLable.setHorizontalAlignment(JTextField.CENTER);

		sub_view_panel.setBackground(new Color(245, 245, 245));

		mainpanle.setLayout(null);

		sub_view_panel.setLayout(null);

		sub_view_panel.add(save);
		sub_view_panel.add(cancel);

		backButton = new JButton("Back");
		mainpanle.add(backButton);
		backButton.setBounds(10, 10, 80, 25);
		backButton.addActionListener(actionListenerBack);
		cancel.addActionListener(actionListenercancel);		
		
		// /
		sub_view_panel.add(CourseCapLable);
		sub_view_panel.add(CourseCapText);
		// /
		sub_view_panel.add(OfferedFallLable);
		sub_view_panel.add(OfferedFallText);
		// /
		sub_view_panel.add(OfferedSpringLable);
		sub_view_panel.add(OfferedSpringText);
		// /
		sub_view_panel.add(OfferedSummerLable);
		sub_view_panel.add(OfferedSummerText);
		// /
		sub_view_panel.add(CoursePrereqsLable);
		sub_view_panel.add(CoursePrereqsText);
		// /
		sub_view_panel.add(TeachersLable);
		sub_view_panel.add(TeachersText);

		// /
		sub_view_panel.add(CourseNameLable);
		sub_view_panel.add(CourseNameText);

		// /
		sub_view_panel.add(CourseDescriptionLable);
		sub_view_panel.add(CourseDescriptionText);

		// /
		sub_view_panel.add(CourseHoursLable);
		sub_view_panel.add(CourseHoursText);

		// /
		sub_view_panel.add(CourseCodeLable);
		sub_view_panel.add(CourseCodeText);

		save.addActionListener(addAction);

		mainpanle.add(mainLable);
		mainpanle.add(StudentNameText);
		mainpanle.add(sub_view_panel);

		mainpanle.setBackground(new Color(255, 255, 255));

		mainLable.setFont(new Font("Verdana", Font.BOLD, 25));
		mainLable.setBounds(80, 30, 400, 30);

		StudentNameText.setBounds(150, 100, 200, 30);

		sub_view_panel.setBounds(150, 140, 330, 430);

		save.setBounds(80, 400, 100, 30);
		cancel.setBounds(200, 400, 100, 30);

		//
		CourseNameLable.setBounds(10, 55, 90, 25);
		CourseNameText.setBounds(100, 55, 200, 25);

		//
		CourseDescriptionLable.setBounds(10, 90, 90, 25);
		CourseDescriptionText.setBounds(100, 90, 200, 25);

		//
		CourseHoursLable.setBounds(10, 125, 90, 25);
		CourseHoursText.setBounds(100, 125, 200, 25);

		//
		CourseCodeLable.setBounds(10, 160, 90, 25);
		CourseCodeText.setBounds(100, 160, 200, 25);

		//
		CourseCapLable.setBounds(10, 195, 90, 25);
		CourseCapText.setBounds(100, 195, 200, 25);
		//
		OfferedFallLable.setBounds(10, 230, 90, 25);
		OfferedFallText.setBounds(100, 230, 200, 25);
		//
		OfferedSpringLable.setBounds(10, 265, 90, 25);
		OfferedSpringText.setBounds(100, 265, 200, 25);
		//
		OfferedSummerLable.setBounds(10, 300, 90, 25);
		OfferedSummerText.setBounds(100, 300, 200, 25);
		//
		CoursePrereqsLable.setBounds(10, 335, 90, 25);
		CoursePrereqsText.setBounds(100, 335, 200, 25);
		//
		TeachersLable.setBounds(10, 370, 90, 25);
		TeachersText.setBounds(100, 370, 200, 25);

		frame.setLayout(null);
		frame.add(mainpanle);
		mainpanle.setBounds(0, 0, 550, 620);

		frame.setSize(550, 620);
		frame.setResizable(false);
		frame.setLocation(400, 70);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Course Data Edit");
		frame.setVisible(true);

	}

	ActionListener addAction = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			String CourseCap = CourseCapText.getText();
			String OfferedFall = OfferedFallText.getText();
			String OfferedSpring = OfferedSpringText.getText();
			String OfferedSummer = OfferedSummerText.getText();
			String CoursePrereqs = CoursePrereqsText.getText();
			String Teachers = TeachersText.getText();
			String CourseName = CourseNameText.getText();
			String CourseDescription = CourseDescriptionText.getText();
			String CourseHours = CourseHoursText.getText();
			String CourseCode = CourseCodeText.getText();
			CourseDM courseDM = new CourseDM();

			courseDM.setCourseCap(CourseCap);
			courseDM.setCourseCode(CourseCode);
			courseDM.setCourseDescription(CourseDescription);
			courseDM.setCourseHours(CourseHours);
			courseDM.setCourseName(CourseName);
			courseDM.setCoursePrereqs(CoursePrereqs);
			courseDM.setOfferedFall(OfferedFall);
			courseDM.setOfferedSpring(OfferedSpring);
			courseDM.setOfferedSummer(OfferedSummer);
			courseDM.setTeachers(Teachers);

			String record = courseDM.getCourseCode() + ","
					+ courseDM.getCourseName() + ","
					+ courseDM.getCourseDescription() + ","
					+ courseDM.getCourseHours() + "," + courseDM.getCourseCap()
					+ "," + courseDM.getOfferedFall() + ","
					+ courseDM.getOfferedSpring() + "," + ","
					+ courseDM.getOfferedSummer() + ","
					+ courseDM.getCoursePrereqs() + courseDM.getTeachers();

			
			RandomAccessFile f;
			try {
				f = new RandomAccessFile(new File("TestCourse.txt"), "rw");

				f.seek(0); // to the beginning
				f.write(record.getBytes());
				f.close();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			CourseCapText.setText("");
			OfferedFallText.setText("");
			OfferedSpringText.setText("");
			OfferedSummerText.setText("");
			CoursePrereqsText.setText("");
			TeachersText.setText("");
			CourseNameText.setText("");
			CourseCodeText.setText("");
			CourseDescriptionText.setText("");
			CourseHoursText.setText("");
			frame.setVisible(false);
			new Course_Data_Importing();

		}
	};

	public static void main(String[] args) {
		new Edit_Data_Course();

	}	JButton backButton ; 
	
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
			String CourseCap = CourseCapText.getText();
			String OfferedFall = OfferedFallText.getText();
			String OfferedSpring = OfferedSpringText.getText();
			String OfferedSummer = OfferedSummerText.getText();
			String CoursePrereqs = CoursePrereqsText.getText();
			String Teachers = TeachersText.getText();
			String CourseName = CourseNameText.getText();
			String CourseDescription = CourseDescriptionText.getText();
			String CourseHours = CourseHoursText.getText();
			String CourseCode = CourseCodeText.getText();
			CourseDM courseDM = new CourseDM();

			courseDM.setCourseCap(CourseCap);
			courseDM.setCourseCode(CourseCode);
			courseDM.setCourseDescription(CourseDescription);
			courseDM.setCourseHours(CourseHours);
			courseDM.setCourseName(CourseName);
			courseDM.setCoursePrereqs(CoursePrereqs);
			courseDM.setOfferedFall(OfferedFall);
			courseDM.setOfferedSpring(OfferedSpring);
			courseDM.setOfferedSummer(OfferedSummer);
			courseDM.setTeachers(Teachers);

			String record = courseDM.getCourseCode() + ","
					+ courseDM.getCourseName() + ","
					+ courseDM.getCourseDescription() + ","
					+ courseDM.getCourseHours() + "," + courseDM.getCourseCap()
					+ "," + courseDM.getOfferedFall() + ","
					+ courseDM.getOfferedSpring() + "," + ","
					+ courseDM.getOfferedSummer() + ","
					+ courseDM.getCoursePrereqs() + courseDM.getTeachers();

			
			RandomAccessFile f;
			try {
				f = new RandomAccessFile(new File("TestCourse.txt"), "rw");

				f.seek(0); // to the beginning
				f.write(record.getBytes());
				f.close();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			CourseCapText.setText("");
			OfferedFallText.setText("");
			OfferedSpringText.setText("");
			OfferedSummerText.setText("");
			CoursePrereqsText.setText("");
			TeachersText.setText("");
			CourseNameText.setText("");
			CourseCodeText.setText("");
			CourseDescriptionText.setText("");
			CourseHoursText.setText("");
			frame.setVisible(false);
			new Course_Data_Importing();
		}
	};

}
