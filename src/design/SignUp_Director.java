package design;

import java.awt.Color;
import java.awt.Font;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignUp_Director {

	JFrame frame;
	JPanel mainpanle;
	JButton signUP;
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
	JLabel re_Passwrod_Labple;
	JPasswordField re_password_Text;
	//
	JLabel emailID_Labple;
	JTextField emailID_Text;
	//

	JLabel phone_Labple;
	JTextField phone_Text;
	//
	JLabel collegeIDNumber_Labple;
	JTextField collegeIDNumbr_Text;

	//

	public SignUp_Director() {
		frame = new JFrame();
		mainpanle = new JPanel();
		signUP = new JButton("Sign UP");
		signUpMainLable = new JLabel("Sign UP");
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
		re_Passwrod_Labple = new JLabel("Re-Password");
		re_password_Text = new JPasswordField();
		re_password_Text.setHorizontalAlignment(JTextField.CENTER);

		// //
		emailID_Labple = new JLabel("Email ID");
		emailID_Text = new JTextField();
		emailID_Text.setHorizontalAlignment(JTextField.CENTER);

		// //
		phone_Labple = new JLabel("Phone Number");
		phone_Text = new JTextField();
		phone_Text.setHorizontalAlignment(JTextField.CENTER);

		// //
		collegeIDNumber_Labple = new JLabel("College ID");
		collegeIDNumbr_Text = new JTextField();
		collegeIDNumbr_Text.setHorizontalAlignment(JTextField.CENTER);

		// //

		mainpanle.setLayout(null);

		backButton = new JButton("Back");
		mainpanle.add(backButton);
		backButton.setBounds(10, 10, 80, 25);
		backButton.addActionListener(actionListenerBack);
		
		mainpanle.add(signUP);
		mainpanle.add(signUpMainLable);

		mainpanle.setBackground(new Color(255, 255, 255));

		signUpMainLable.setBounds(240, 0, 200, 30);

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

		// //
		password_Labple.setBounds(100, 205, 100, 25);
		password_Text.setBounds(200, 205, 200, 25);

		mainpanle.add(password_Labple);
		mainpanle.add(password_Text);

		// //
		re_Passwrod_Labple.setBounds(100, 250, 100, 25);
		re_password_Text.setBounds(200, 250, 200, 25);

		mainpanle.add(re_Passwrod_Labple);
		mainpanle.add(re_password_Text);

		// //
		emailID_Labple.setBounds(100, 295, 100, 25);
		emailID_Text.setBounds(200, 295, 200, 25);

		mainpanle.add(emailID_Labple);
		mainpanle.add(emailID_Text);

		// //
		phone_Labple.setBounds(100, 340, 100, 25);
		phone_Text.setBounds(200, 340, 200, 25);

		mainpanle.add(phone_Labple);
		mainpanle.add(phone_Text);

		// //
		collegeIDNumber_Labple.setBounds(100, 395, 100, 25);
		collegeIDNumbr_Text.setBounds(200, 395, 200, 25);

		mainpanle.add(collegeIDNumber_Labple);
		mainpanle.add(collegeIDNumbr_Text);

		// //

		signUP.setBounds(200, 450, 100, 30);

		frame.setLayout(null);
		frame.add(mainpanle);
		mainpanle.setBounds(0, 0, 550, 620);

		frame.setSize(550, 620);
		frame.setResizable(false);
		frame.setLocation(400, 70);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Sign Up");
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		new SignUp_Director();

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
