package VPProjects;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Window;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class University_edit extends JFrame {

	private JPanel contentPane;
	public static JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					University_edit frame = new University_edit();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public University_edit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		textField.setBounds(144, 79, 262, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterUniversityName = new JLabel("Enter University Name");
		lblEnterUniversityName.setBounds(10, 82, 124, 14);
		contentPane.add(lblEnterUniversityName);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
						
				
				 String tex= textField.getText();
				 
				University_Home UnivHome = new University_Home();
				UnivHome.setVisible(true);
				
		
				
				
				
				
				

				
			}
		});
		btnSave.setBounds(63, 136, 89, 23);
		contentPane.add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(240, 136, 89, 23);
		contentPane.add(btnCancel);
	}
}
