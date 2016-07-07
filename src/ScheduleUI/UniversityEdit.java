package ScheduleUI;

import javax.swing.JPanel;
import javax.swing.JFrame;
import SchedulePD.University;
import ScheduleUI.MainPanel;

import SchedulePD.Course;
import SchedulePD.GradSchools;
import SchedulePD.Semester;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;


public class UniversityEdit extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public UniversityEdit(University university,JFrame currentFrame) {
		setLayout(null);
		
		JLabel lblUniversityedit = new JLabel("UniversityEdit");
		lblUniversityedit.setBounds(202, 11, 93, 14);
		add(lblUniversityedit);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(96, 40, 46, 14);
		add(lblName);
		
		textField = new JTextField(university.getName());
		textField.setBounds(173, 37, 167, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblAbbreviation = new JLabel("Abbreviation");
		lblAbbreviation.setBounds(96, 77, 73, 14);
		add(lblAbbreviation);
		
		textField_1 = new JTextField(university.getAbbreviation());
		textField_1.setBounds(173, 74, 167, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				university.setName(textField.getText());
				university.setAbbreviation(textField_1.getText());
						currentFrame.getContentPane().removeAll();
						currentFrame.getContentPane().add(new MainPanel(university));
						currentFrame.getContentPane().revalidate();
						
					
			}
		});
		btnSave.setBounds(128, 102, 89, 23);
		add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(239, 102, 89, 23);
		add(btnCancel);
	
		
		DefaultListModel listModel= new DefaultListModel();
		for(GradSchools gradSchool:university.getGradSchools())
			listModel.addElement(gradSchool);
		JList list = new JList(listModel);
		list.setBounds(40, 136, 197, 158);
		add(list);
	
		
		
		
		
		DefaultListModel listModel1= new DefaultListModel();
		for(Semester semester:university.getSemester())
		listModel1.addElement(semester);
		JList list_1 = new JList(listModel1);
		list_1.setBounds(265, 136, 175, 158);
		add(list_1);

		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	
			}
		});
		btnAdd.setBounds(10, 308, 66, 23);
		add(btnAdd);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(86, 308, 72, 23);
		add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(158, 308, 66, 23);
		add(btnDelete);
		
		JButton btnAdd_1 = new JButton("Add");
		btnAdd_1.setBounds(234, 308, 59, 23);
		add(btnAdd_1);
		
		JButton btnUpdate_1 = new JButton("Update");
		btnUpdate_1.setBounds(298, 308, 73, 23);
		add(btnUpdate_1);
		
		JButton btnDelete_1 = new JButton("Delete");
		btnDelete_1.setBounds(374, 308, 66, 23);
		add(btnDelete_1);
		
		

	}
}
