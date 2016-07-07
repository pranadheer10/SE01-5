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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {
	JFrame frame;
	JPanel mainpanle;
	JButton login_B;
	JButton cancel;
	JLabel UserName;
	JLabel Password;
	JLabel LoginLable;

	JTextField text_userName;
	JPasswordField text_password;

	JButton signup;
	JLabel signup_lable;
	JButton forgetPassword;
	JLabel forgetPassword_lable;

	public Login() {
		frame = new JFrame();
		mainpanle = new JPanel();
		cancel = new JButton("Cacel");
		login_B = new JButton("Login");
		UserName = new JLabel("User Name");
		Password = new JLabel("Password");
		LoginLable = new JLabel("Login");
		text_userName = new JTextField("");
		text_password = new JPasswordField("");

		signup = new JButton("Sign up");
		signup_lable = new JLabel("For Create A New Account ");
		forgetPassword = new JButton("Click Here");
		forgetPassword_lable = new JLabel("Forget Password Or UserName");

		LoginLable.setHorizontalAlignment(JTextField.CENTER);
		text_password.setHorizontalAlignment(JTextField.CENTER);
		text_userName.setHorizontalAlignment(JTextField.CENTER);
		forgetPassword.setHorizontalAlignment(JTextField.CENTER);
		forgetPassword_lable.setVerticalAlignment(JTextField.TOP);
		signup.setHorizontalAlignment(JTextField.CENTER);
		signup_lable.setVerticalAlignment(JTextField.TOP);

		login_B.addActionListener(loginActionListener);
		mainpanle.setLayout(null);

		mainpanle.add(login_B);
		mainpanle.add(cancel);

		mainpanle.add(UserName);
		mainpanle.add(Password);
		mainpanle.add(LoginLable);
		mainpanle.add(text_password);
		mainpanle.add(text_userName);
		mainpanle.add(forgetPassword);
		mainpanle.add(forgetPassword_lable);
		mainpanle.add(signup);
		mainpanle.add(signup_lable);

		mainpanle.setBackground(new Color(255, 255, 255));
		LoginLable.setFont(new Font("Verdana", Font.BOLD, 25));
		LoginLable.setBounds(240, 30, 100, 30);
		Password.setBounds(150, 150, 100, 30);
		UserName.setBounds(150, 100, 100, 30);
		text_userName.setBounds(250, 100, 185, 30);
		text_password.setBounds(250, 150, 185, 30);

		login_B.setBounds(250, 200, 80, 30);
		cancel.setBounds(355, 200, 80, 30);

		signup.setBounds(220, 270, 99, 20);
		signup_lable.setBounds(325, 270, 180, 30);

		forgetPassword.setBounds(220, 320, 99, 20);
		forgetPassword_lable.setBounds(325, 320, 180, 30);

		frame.setLayout(null);
		frame.add(mainpanle);
		mainpanle.setBounds(0, 0, 550, 620);

		frame.setSize(550, 620);
		frame.setResizable(false);
		frame.setLocation(400, 70);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Login");
		frame.setVisible(true);

	}
	
	ActionListener loginActionListener  = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String username = text_userName.getText() ; 
			String pass = text_password.getText();
			if(username.equals("director")&& pass.equals("director")){
				frame.setVisible(false);
				new Directory_Home();
			}
			else {
				JOptionPane.showMessageDialog(null, "The Password Or UserName Are not Correct ");
			}
		}
	};

	public static void main(String[] args) {
		new Login();

	}
}