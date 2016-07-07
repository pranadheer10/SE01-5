package design;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Create_Admin {
	JFrame frame;
	JPanel mainpanle;
	JButton Submit;
	JButton clear;
	JLabel signUpMainLable;

	JLabel firstName_Labple;
	JTextField firstName_Text;
	//
	JLabel lastName_Labple;
	JTextField lastName_Text;
	//
	JLabel UserName_Labple;
	JTextField userName_Text;
	//
	JLabel password_Labple;
	JPasswordField password_Text;
	//
	JLabel IDnumber_Labple;
	JTextField IDnumber_Text;
	//
	JLabel emailID_Labple;
	JTextField emailID_Text;
	//

	JLabel Department_Labple;
	JTextField Department_Text;
	//
	JLabel DepartmentID_Labple;
	JTextField DepartmentID_Text;

	//
	JLabel job_Labple;
	JTextField job_Text;

	//

	public Create_Admin() {

		frame = new JFrame();
		mainpanle = new JPanel();
		Submit = new JButton("Submit");
		clear = new JButton("Clear");
		signUpMainLable = new JLabel("Create Admin");
		signUpMainLable.setFont(new Font("Verdana", Font.BOLD, 25));

		firstName_Labple = new JLabel("First Name");
		firstName_Text = new JTextField();
		firstName_Text.setHorizontalAlignment(JTextField.CENTER);

		// //
		lastName_Labple = new JLabel("Last Name");
		lastName_Text = new JTextField();
		lastName_Text.setHorizontalAlignment(JTextField.CENTER);

		// //
		UserName_Labple = new JLabel("User Name");
		userName_Text = new JTextField();
		userName_Text.setHorizontalAlignment(JTextField.CENTER);

		// //
		password_Labple = new JLabel("Password");
		password_Text = new JPasswordField();
		password_Text.setHorizontalAlignment(JTextField.CENTER);

		// //
		IDnumber_Labple = new JLabel("ID Number");
		IDnumber_Text = new JTextField();
		IDnumber_Text.setHorizontalAlignment(JTextField.CENTER);

		// //
		emailID_Labple = new JLabel("Email ID");
		emailID_Text = new JTextField();
		emailID_Text.setHorizontalAlignment(JTextField.CENTER);

		// //
		Department_Labple = new JLabel("Department");
		Department_Text = new JTextField();
		Department_Text.setHorizontalAlignment(JTextField.CENTER);

		// //
		DepartmentID_Labple = new JLabel("Department ID");
		DepartmentID_Text = new JTextField();
		DepartmentID_Text.setHorizontalAlignment(JTextField.CENTER);

		// //
		job_Labple = new JLabel("Current Job");
		job_Text = new JTextField();
		job_Text.setHorizontalAlignment(JTextField.CENTER);

		// //

		mainpanle.setLayout(null);

		mainpanle.add(Submit);
		mainpanle.add(clear);
		mainpanle.add(signUpMainLable);

		mainpanle.setBackground(new Color(255, 255, 255));

		signUpMainLable.setBounds(200, 10, 200, 30);

		firstName_Labple.setBounds(100, 70, 100, 25);
		firstName_Text.setBounds(200, 70, 200, 25);

		mainpanle.add(firstName_Labple);
		mainpanle.add(firstName_Text);

		
		// //
		lastName_Labple.setBounds(100, 115, 100, 25);
		lastName_Text.setBounds(200, 115, 200, 25);

		mainpanle.add(lastName_Labple);
		mainpanle.add(lastName_Text);

		// //
		UserName_Labple.setBounds(100, 160, 100, 25);
		userName_Text.setBounds(200, 160, 200, 25);

		mainpanle.add(UserName_Labple);
		mainpanle.add(userName_Text);

		backButton = new JButton("Back");
		mainpanle.add(backButton);
		backButton.setBounds(10, 10, 80, 25);
		backButton.addActionListener(actionListenerBack);
		
		
		// //
		password_Labple.setBounds(100, 205, 100, 25);
		password_Text.setBounds(200, 205, 200, 25);

		mainpanle.add(password_Labple);
		mainpanle.add(password_Text);

		// //
		IDnumber_Labple.setBounds(100, 250, 100, 25);
		IDnumber_Text.setBounds(200, 250, 200, 25);

		mainpanle.add(IDnumber_Labple);
		mainpanle.add(IDnumber_Text);

		// //
		emailID_Labple.setBounds(100, 295, 100, 25);
		emailID_Text.setBounds(200, 295, 200, 25);

		mainpanle.add(emailID_Labple);
		mainpanle.add(emailID_Text);

		// //
		Department_Labple.setBounds(100, 340, 100, 25);
		Department_Text.setBounds(200, 340, 200, 25);

		mainpanle.add(Department_Labple);
		mainpanle.add(Department_Text);

		// //
		DepartmentID_Labple.setBounds(100, 395, 100, 25);
		DepartmentID_Text.setBounds(200, 395, 200, 25);

		mainpanle.add(DepartmentID_Labple);
		mainpanle.add(DepartmentID_Text);

		// //
		job_Labple.setBounds(100, 445, 100, 25);
		job_Text.setBounds(200, 445, 200, 25);

		mainpanle.add(job_Labple);
		mainpanle.add(job_Text);

		// //

		Submit.setBounds(200, 500, 90, 30);
		clear.setBounds(310, 500, 90, 30);

		frame.setLayout(null);
		frame.add(mainpanle);
		mainpanle.setBounds(0, 0, 550, 620);

		frame.setSize(550, 620);
		frame.setResizable(false);
		frame.setLocation(400, 70);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Create Admin");
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		new Create_Admin();

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
