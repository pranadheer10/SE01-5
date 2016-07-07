package ScheduleUI;

import javax.swing.JPanel;
import javax.swing.JTextField;

import SchedulePD.University;

import java.awt.Component;

import javax.swing.JLabel;
public class MainPanel extends JPanel {


	/**
	 * Create the panel.
	 */
	public MainPanel(University university) {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel(university.getName());
		lblNewLabel.setBounds(50, 32, 206, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(university.getAbbreviation());
		lblNewLabel_1.setBounds(322, 32, 46, 14);
		add(lblNewLabel_1);

	}
}
