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

import modelDM.GradSchoolDM;
import modelDM.UniversityDM;

public class Edit_Data_GradSchool {

	JFrame frame;
	JPanel mainpanle;
	JButton save;

	JButton cancel;

	JTextField FacultyNameText;
	JPanel sub_view_panel;

	JLabel mainLable;

	// /
	JLabel AbbreviationLable;
	JTextField AbbreviationText;

	JLabel gradSchoolLable;
	JTextField gradSchoolText;

	public Edit_Data_GradSchool() {
		frame = new JFrame();
		mainpanle = new JPanel();
		FacultyNameText = new JTextField();
		sub_view_panel = new JPanel();
		cancel = new JButton("Cacel");

		save = new JButton("Save");

		mainLable = new JLabel("Grad School Data Edit");

		// /
		AbbreviationLable = new JLabel("Abbreviation");
		AbbreviationText = new JTextField();

		gradSchoolLable = new JLabel("grad School");
		gradSchoolText = new JTextField();

		mainLable.setHorizontalAlignment(JTextField.CENTER);

		sub_view_panel.setBackground(new Color(245, 245, 245));

		mainpanle.setLayout(null);

		sub_view_panel.setLayout(null);

		save.addActionListener(addAction);

		sub_view_panel.add(save);
		sub_view_panel.add(cancel);

		backButton = new JButton("Back");
		mainpanle.add(backButton);
		backButton.setBounds(10, 10, 80, 25);
		backButton.addActionListener(actionListenerBack);
		cancel.addActionListener(actionListenerCancel);

		// /
		sub_view_panel.add(gradSchoolLable);
		sub_view_panel.add(gradSchoolText);

		sub_view_panel.add(AbbreviationLable);
		sub_view_panel.add(AbbreviationText);

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
		AbbreviationLable.setBounds(10, 20, 90, 25);
		AbbreviationText.setBounds(100, 20, 200, 25);

		gradSchoolLable.setBounds(10, 50, 90, 25);
		gradSchoolText.setBounds(100, 50, 200, 25);

		frame.setLayout(null);
		frame.add(mainpanle);
		mainpanle.setBounds(0, 0, 550, 620);

		frame.setSize(550, 620);
		frame.setResizable(false);
		frame.setLocation(400, 70);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Grad School Data Edit");
		frame.setVisible(true);

	}

	public Edit_Data_GradSchool(GradSchoolDM gradSchoolDM) {
		frame = new JFrame();
		mainpanle = new JPanel();
		FacultyNameText = new JTextField();
		sub_view_panel = new JPanel();
		cancel = new JButton("Cacel");

		save = new JButton("Save");

		mainLable = new JLabel("Grad School Data Edit");

		// /
		AbbreviationLable = new JLabel("Abbreviation");
		AbbreviationText = new JTextField(gradSchoolDM.getAbbreviation());

		gradSchoolLable = new JLabel("grad School");
		gradSchoolText = new JTextField(gradSchoolDM.getGradSchool());

		// /

		mainLable.setHorizontalAlignment(JTextField.CENTER);

		sub_view_panel.setBackground(new Color(245, 245, 245));

		mainpanle.setLayout(null);

		sub_view_panel.setLayout(null);
		save.addActionListener(addAction);

		sub_view_panel.add(save);
		sub_view_panel.add(cancel);

		// /
		sub_view_panel.add(gradSchoolLable);
		sub_view_panel.add(gradSchoolText);

		sub_view_panel.add(AbbreviationLable);
		sub_view_panel.add(AbbreviationText);

		// /

		backButton = new JButton("Back");
		mainpanle.add(backButton);
		backButton.setBounds(10, 10, 80, 25);
		backButton.addActionListener(actionListenerBack);

		cancel.addActionListener(actionListenerCancel);

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
		AbbreviationLable.setBounds(10, 20, 90, 25);
		AbbreviationText.setBounds(100, 20, 200, 25);

		gradSchoolLable.setBounds(10, 50, 90, 25);
		gradSchoolText.setBounds(100, 50, 200, 25);

		//

		frame.setLayout(null);
		frame.add(mainpanle);
		mainpanle.setBounds(0, 0, 550, 620);

		frame.setSize(550, 620);
		frame.setResizable(false);
		frame.setLocation(400, 70);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Grad School  Data Edit");
		frame.setVisible(true);

	}

	ActionListener addAction = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			GradSchoolDM  gradSchoolDM = new GradSchoolDM();
			String Abbreviation = AbbreviationText.getText();
			String gradSchool = gradSchoolText.getText();

			gradSchoolDM.setAbbreviation(Abbreviation);
			gradSchoolDM.setGradSchool(gradSchool);

			String record = gradSchoolDM.getAbbreviation()+ ","
					+ gradSchoolDM.getGradSchool()+"\n";

			RandomAccessFile f;
			try {
				f = new RandomAccessFile(new File("TestGradSchools.txt"), "rw");

				f.seek(0); // to the beginning
				f.write(record.getBytes());
				f.close();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			AbbreviationText.setText("");
			gradSchoolText.setText("");

			frame.setVisible(false);
			new GradSchool_Data_Importing();

		}
	};

	public static void main(String[] args) {
		new Edit_Data_GradSchool();

	}

	JButton backButton;

	ActionListener actionListenerBack = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			new Directory_Home();
		}
	};
	ActionListener actionListenerCancel = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			UniversityDM universityDM = new UniversityDM();
			String gradSchool = gradSchoolText.getText();
			String abbreviation = AbbreviationText.getText();

			universityDM.setAbbreviation(abbreviation);
			universityDM.setName(gradSchool);

			String record = universityDM.getName() + ","
					+ universityDM.getAbbreviation();

			RandomAccessFile f;
			try {
				f = new RandomAccessFile(new File("TestUniversity.txt"), "rw");

				f.seek(0); // to the beginning
				f.write(record.getBytes());
				f.close();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			AbbreviationText.setText("");
			gradSchoolText.setText("");

			frame.setVisible(false);
			new GradSchool_Data_Importing();

		}
	};

}