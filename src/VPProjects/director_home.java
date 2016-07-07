package VPProjects;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;

public class director_home extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					director_home frame = new director_home();
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
	public director_home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMaintain = new JMenu("Maintain");
		menuBar.add(mnMaintain);
		
		JMenu mnUniversity = new JMenu("University");
		mnMaintain.add(mnUniversity);
		
		JMenuItem mntmUniversityhome = new JMenuItem("University_home");
		mntmUniversityhome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			University_Home univHome= new University_Home();
			univHome.setVisible(true);
		
			}
		});
		buttonGroup.add(mntmUniversityhome);
		mnUniversity.add(mntmUniversityhome);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("University_edit");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				University_edit univEdit= new University_edit();
				univEdit.setVisible(true);
				
			}
		});
		mnUniversity.add(mntmNewMenuItem);
		
		JMenu mnNewMenu = new JMenu("Users");
		mnMaintain.add(mnNewMenu);
		
		JMenuItem mntmDirectoredit = new JMenuItem("Director_edit");
		mnNewMenu.add(mntmDirectoredit);
		
		JMenuItem mntmAdminedit = new JMenuItem("Admin_edit");
		mnNewMenu.add(mntmAdminedit);
		
		JMenu mnStudent = new JMenu("Student");
		mnMaintain.add(mnStudent);
		
		JMenuItem mntmStudentimport = new JMenuItem("Student_import");
		mnStudent.add(mntmStudentimport);
		
		JMenuItem mntmStudentedit = new JMenuItem("Student_edit");
		mnStudent.add(mntmStudentedit);
		
		JMenu mnFaculty = new JMenu("Faculty");
		mnMaintain.add(mnFaculty);
		
		JMenuItem mntmFacultyImport = new JMenuItem("Faculty import");
		mnFaculty.add(mntmFacultyImport);
		
		JMenuItem mntmFacultyEdit = new JMenuItem("Faculty edit");
		mnFaculty.add(mntmFacultyEdit);
		
		JMenu mnDegreeplan = new JMenu("DegreePlan");
		mnMaintain.add(mnDegreeplan);
		
		JMenuItem mntmAddDegreePlan = new JMenuItem("Add Degree Plan");
		mnDegreeplan.add(mntmAddDegreePlan);
		
		JMenuItem mntmEditDegreePlan = new JMenuItem("Edit Degree Plan");
		mnDegreeplan.add(mntmEditDegreePlan);
		
		JMenu mnSchedule = new JMenu("Schedule");
		menuBar.add(mnSchedule);
		
		JMenu mnGenerateSchedule = new JMenu("Generate Schedule");
		mnSchedule.add(mnGenerateSchedule);
		
		JMenuItem mntmGenerateStudentSchedule = new JMenuItem("Generate student schedule");
		mnGenerateSchedule.add(mntmGenerateStudentSchedule);
		
		JMenuItem mntmGenerateFacultyDchedule = new JMenuItem("Generate Faculty dchedule");
		mnGenerateSchedule.add(mntmGenerateFacultyDchedule);
		
		JMenu mnEditSchedule = new JMenu("Edit schedule");
		mnSchedule.add(mnEditSchedule);
		
		JMenuItem mntmEditFacultySchedule = new JMenuItem("Edit Faculty schedule");
		mnEditSchedule.add(mntmEditFacultySchedule);
		
		JMenuItem mntmEditStudentShedule = new JMenuItem("Edit Student Shedule");
		mnEditSchedule.add(mntmEditStudentShedule);
		
		JMenu mnReports = new JMenu("Reports");
		menuBar.add(mnReports);
		
		JMenuItem mntmFacultyReport = new JMenuItem("Faculty Report");
		mnReports.add(mntmFacultyReport);
		
		JMenuItem mntmStudentreport = new JMenuItem("Student_report");
		mnReports.add(mntmStudentreport);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblWelcomeToDirector = new JLabel("welcome to director home page");
		lblWelcomeToDirector.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblWelcomeToDirector, BorderLayout.CENTER);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
