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

import modelDM.DegreeDM;
import modelDM.SemesterDM;

public class Edit_Data_Degree {
	JFrame frame;
	JPanel mainpanle;
	JButton save;

	JButton cancel;
	// ,Grad_School,DegreeName,Forecast

	JTextField FacultyNameText;
	JPanel sub_view_panel;

	JLabel mainLable;

	// /
	JLabel DegreeCodeLable;
	JTextField DegreeCodeText;

	JLabel Grad_SchoolLable;
	JTextField Grad_SchoolText;

	JLabel DegreeNameLable;
	JTextField DegreeNameText;

	JLabel ForecastLable;
	JTextField ForecastText;

	public Edit_Data_Degree() {
		frame = new JFrame();
		mainpanle = new JPanel();
		FacultyNameText = new JTextField();
		sub_view_panel = new JPanel();
		cancel = new JButton("Cacel");

		save = new JButton("Save");

		mainLable = new JLabel("Degress Data Edit");

		// /
		DegreeCodeLable = new JLabel("DegreeCode");
		DegreeCodeText = new JTextField();

		Grad_SchoolLable = new JLabel("Grad_School");
		Grad_SchoolText = new JTextField();
		DegreeNameLable = new JLabel("DegreeName");
		DegreeNameText = new JTextField();

		ForecastLable = new JLabel("Forecast");
		ForecastText = new JTextField();

		mainLable.setHorizontalAlignment(JTextField.CENTER);

		sub_view_panel.setBackground(new Color(245, 245, 245));

		mainpanle.setLayout(null);

		sub_view_panel.setLayout(null);

		save.addActionListener(addAction);

		sub_view_panel.add(save);
		sub_view_panel.add(cancel);

		// /
		sub_view_panel.add(Grad_SchoolLable);
		sub_view_panel.add(Grad_SchoolText);
		sub_view_panel.add(DegreeNameLable);
		sub_view_panel.add(DegreeNameText);
		sub_view_panel.add(ForecastLable);
		sub_view_panel.add(ForecastText);

		sub_view_panel.add(DegreeCodeLable);
		sub_view_panel.add(DegreeCodeText);

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
		backButton = new JButton("Back");
		mainpanle.add(backButton);
		backButton.setBounds(10, 10, 80, 25);
		backButton.addActionListener(actionListenerBack);
		cancel.addActionListener(actionListenercancel);
		

		//
		DegreeCodeLable.setBounds(10, 20, 90, 25);
		DegreeCodeText.setBounds(100, 20, 200, 25);

		Grad_SchoolLable.setBounds(10, 50, 90, 25);
		Grad_SchoolText.setBounds(100, 50, 200, 25);
		DegreeNameLable.setBounds(10, 80, 90, 25);
		DegreeNameText.setBounds(100, 80, 200, 25);
		ForecastLable.setBounds(10, 110, 90, 25);
		ForecastText.setBounds(100, 110, 200, 25);

		frame.setLayout(null);
		frame.add(mainpanle);
		mainpanle.setBounds(0, 0, 550, 620);

		frame.setSize(550, 620);
		frame.setResizable(false);
		frame.setLocation(400, 70);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Degress Data Edit");
		frame.setVisible(true);

	}

	public Edit_Data_Degree(DegreeDM degreeDM) {
		frame = new JFrame();
		mainpanle = new JPanel();
		FacultyNameText = new JTextField();
		sub_view_panel = new JPanel();
		cancel = new JButton("Cacel");

		save = new JButton("Save");

		mainLable = new JLabel("Degress Data Edit");

		// /
		DegreeCodeLable = new JLabel("DegreeCode");
		DegreeCodeText = new JTextField(degreeDM.getDegreeCode());

		Grad_SchoolLable = new JLabel("Grad_School");
		Grad_SchoolText = new JTextField(degreeDM.getGrad_school());
		DegreeNameLable = new JLabel("DegreeName");
		DegreeNameText = new JTextField(degreeDM.getDegreeName());
		ForecastLable = new JLabel("Forecast");
		ForecastText = new JTextField(degreeDM.getForecast());

		// /

		mainLable.setHorizontalAlignment(JTextField.CENTER);

		sub_view_panel.setBackground(new Color(245, 245, 245));

		mainpanle.setLayout(null);

		sub_view_panel.setLayout(null);
		save.addActionListener(addAction);

		sub_view_panel.add(save);
		sub_view_panel.add(cancel);

		// /
		sub_view_panel.add(Grad_SchoolLable);
		sub_view_panel.add(Grad_SchoolText);
		sub_view_panel.add(DegreeNameLable);
		sub_view_panel.add(DegreeNameText);
		sub_view_panel.add(ForecastLable);
		sub_view_panel.add(ForecastText);

		sub_view_panel.add(DegreeCodeLable);
		sub_view_panel.add(DegreeCodeText);

		backButton = new JButton("Back");
		mainpanle.add(backButton);
		backButton.setBounds(10, 10, 80, 25);
		backButton.addActionListener(actionListenerBack);

		cancel.addActionListener(actionListenercancel);
		
		// /

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
		DegreeCodeLable.setBounds(10, 20, 90, 25);
		DegreeCodeText.setBounds(100, 20, 200, 25);

		Grad_SchoolLable.setBounds(10, 50, 90, 25);
		Grad_SchoolText.setBounds(100, 50, 200, 25);
		DegreeNameLable.setBounds(10, 80, 90, 25);
		DegreeNameText.setBounds(100, 80, 200, 25);
		ForecastLable.setBounds(10, 110, 90, 25);
		ForecastText.setBounds(100, 110, 200, 25);

		//

		frame.setLayout(null);
		frame.add(mainpanle);
		mainpanle.setBounds(0, 0, 550, 620);

		frame.setSize(550, 620);
		frame.setResizable(false);
		frame.setLocation(400, 70);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Degress Data Edit");
		frame.setVisible(true);

	}

	ActionListener addAction = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			DegreeDM degreeDM = new DegreeDM();
			String degreeCodeText = DegreeCodeText.getText();
			String grad_school = Grad_SchoolText.getText();
			String degreeName = DegreeNameText.getText();
			String forecast = ForecastText.getText();

			degreeDM.setDegreeCode(degreeCodeText);
			degreeDM.setGrad_school(grad_school);
			degreeDM.setDegreeName(degreeName);
			degreeDM.setForecast(forecast);

			String record = degreeDM.getDegreeCode() + ","
					+ degreeDM.getGrad_school() + ","
					+ degreeDM.getDegreeName() + "," + degreeDM.getForecast();

			RandomAccessFile f;
			try {
				f = new RandomAccessFile(new File("TestDegree.txt"), "rw");

				f.seek(0); // to the beginning
				f.write(record.getBytes());
				f.close();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			DegreeNameText.setText("");
			ForecastText.setText("");
			Grad_SchoolText.setText("");
			DegreeCodeText.setText("");

			frame.setVisible(false);
			new Degree_Data_Importing();

		}
	};

	public static void main(String[] args) {
		new Edit_Data_Degree();

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
			DegreeDM degreeDM = new DegreeDM();
			String degreeCodeText = DegreeCodeText.getText();
			String grad_school = Grad_SchoolText.getText();
			String degreeName = DegreeNameText.getText();
			String forecast = ForecastText.getText();

			degreeDM.setDegreeCode(degreeCodeText);
			degreeDM.setGrad_school(grad_school);
			degreeDM.setDegreeName(degreeName);
			degreeDM.setForecast(forecast);

			String record = degreeDM.getDegreeCode() + ","
					+ degreeDM.getGrad_school() + ","
					+ degreeDM.getDegreeName() + "," + degreeDM.getForecast();

			RandomAccessFile f;
			try {
				f = new RandomAccessFile(new File("TestDegree.txt"), "rw");

				f.seek(0); // to the beginning
				f.write(record.getBytes());
				f.close();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			DegreeNameText.setText("");
			ForecastText.setText("");
			Grad_SchoolText.setText("");
			DegreeCodeText.setText("");

			frame.setVisible(false);
			new Degree_Data_Importing();
		}
	};

}
