package ScheduleUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import SchedulePD.University;
import ScheduleUI.MainPanel;
import ScheduleUI.UniversityEdit;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import SchedulePD.University;

public class UniversityFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void startGUI(University university) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UniversityFrame frame = new UniversityFrame(university);
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
	public UniversityFrame(University university) {
		JFrame currentFrame = this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMaintain = new JMenu("Maintain");
		menuBar.add(mnMaintain);
		
		JMenuItem mntmUniversity = new JMenuItem("University");
		mntmUniversity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().removeAll();
				getContentPane().add(new UniversityEdit(university, currentFrame));
				getContentPane().revalidate();
				
			}
		});
		mnMaintain.add(mntmUniversity);
		
		JMenuItem mntmStudent = new JMenuItem("Student");
		mnMaintain.add(mntmStudent);
		
		JMenuItem mntmFaculty = new JMenuItem("Faculty");
		mnMaintain.add(mntmFaculty);
		
		JMenu mnSchedule = new JMenu("Schedule");
		menuBar.add(mnSchedule);
		
		JMenu mnReport = new JMenu("Report");
		menuBar.add(mnReport);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		getContentPane().removeAll();
		getContentPane().add(new MainPanel(university));
		getContentPane().revalidate();
	}

	

}
