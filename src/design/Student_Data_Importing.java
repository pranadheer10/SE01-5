package design;

import java.awt.Color;
import java.awt.Font;
import java.awt.JobAttributes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.security.AllPermission;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;

import modelDM.StudentDM;
import Service.StudentService;

public class Student_Data_Importing {

	JFrame frame;
	JPanel mainpanle;
	JButton submit;
	JButton cancel;
	JLabel liftLable;
	JLabel viewLable;
	JLabel importLable;
	JButton import_B;
	JPanel sub_import_panel;
	JScrollPane sub_view_panel;
	JList<String> dataArea;
	DefaultListModel<String> model;
	JLabel mainLable;
	JScrollPane scrollPane;

	JButton add1;
	JButton delete1;
	JButton update;

	public Student_Data_Importing() {
		frame = new JFrame();
		mainpanle = new JPanel();
		model = new DefaultListModel<>();
		scrollPane = new JScrollPane();

		sub_import_panel = new JPanel();
		sub_view_panel = new JScrollPane();
		cancel = new JButton("Cacel");
		submit = new JButton("Submit");
		liftLable = new JLabel("Import Student Information");
		viewLable = new JLabel("View");
		import_B = new JButton("Import");
		importLable = new JLabel("Click On Import To Add Student File");
		dataArea = new JList<String>(model);
		scrollPane.setViewportView(dataArea);
		dataArea.setVisibleRowCount(7);

		add1 = new JButton("ADD");
		update = new JButton("Update");
		delete1 = new JButton("Delete");

		mainLable = new JLabel("Student Data Importing");

		import_B.addActionListener(importAction);
		add1.addActionListener(addAction);
		update.addActionListener(updateAction);
		delete1.addActionListener(deleteAction);

		mainLable.setHorizontalAlignment(JTextField.CENTER);

		viewLable.setBackground(new Color(205, 205, 205));
		viewLable.setBorder(LineBorder.createGrayLineBorder());
		sub_view_panel.setBackground(new Color(245, 245, 245));

		mainpanle.setLayout(null);
		sub_import_panel.setLayout(null);
		// sub_view_panel.setLayout(null);

		backButton = new JButton("Back");
		mainpanle.add(backButton);
		backButton.setBounds(10, 10, 80, 25);
		backButton.addActionListener(actionListenerBack);

		mainpanle.add(submit);
		mainpanle.add(cancel);

		mainpanle.add(liftLable);

		mainpanle.add(add1);
		mainpanle.add(update);
		mainpanle.add(delete1);

		mainpanle.add(mainLable);
		mainpanle.add(sub_import_panel);
		mainpanle.add(sub_view_panel);

		sub_import_panel.add(import_B);
		sub_import_panel.add(importLable);

		mainpanle.add(viewLable);
		sub_view_panel.setViewportView(dataArea);

		// sub_view_panel.add(dataArea);
		mainpanle.setBackground(new Color(255, 255, 255));
		sub_import_panel.setBackground(new Color(205, 205, 205));
		mainLable.setFont(new Font("Verdana", Font.BOLD, 25));
		mainLable.setBounds(80, 30, 400, 30);

		add1.setBounds(90, 550, 100, 30);
		update.setBounds(220, 550, 100, 30);
		delete1.setBounds(350, 550, 100, 30);

		viewLable.setBounds(250, 220, 45, 20);
		import_B.setBounds(2, 5, 80, 30);
		importLable.setBounds(85, 5, 200, 30);

		liftLable.setBounds(30, 100, 200, 30);
		sub_import_panel.setBounds(200, 100, 300, 40);
		sub_view_panel.setBounds(30, 240, 480, 300);

		// dataArea.setBounds(2, 40, 475, 250);
		submit.setBounds(200, 180, 100, 30);
		cancel.setBounds(355, 180, 100, 30);

		frame.setLayout(null);
		frame.add(mainpanle);
		mainpanle.setBounds(0, 0, 550, 620);

		frame.setSize(550, 620);
		frame.setResizable(false);
		frame.setLocation(400, 70);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Student Data Importing");
		frame.setVisible(true);

		sub_view_panel
				.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		// dataArea.setv
		new StudentService().loadStudetIntoLists();
		String alldata = "";
		// JOptionPane.showMessageDialog(null,
		// StudentService.AllStdeuntsDM.size());
		for (StudentDM studentDM : StudentService.AllStdeuntsDM) {
			// System.out.println(studentDM.dataprint());
			alldata = alldata + studentDM.dataprint();

			model.addElement(studentDM.dataprint2());

		}
	}

	ActionListener importAction = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			new StudentService().loadStudetIntoLists();
			String alldata = "";
			// JOptionPane.showMessageDialog(null,
			// StudentService.AllStdeuntsDM.size());
			for (StudentDM studentDM : StudentService.AllStdeuntsDM) {
				// System.out.println(studentDM.dataprint());
				alldata = alldata + studentDM.dataprint();

				model.addElement(studentDM.dataprint2());

			}

			// JFileChooser fc = new JFileChooser();
			// int result = fc.showOpenDialog(null);
			// if (result == JFileChooser.APPROVE_OPTION) {
			// File file = fc.getSelectedFile();
			//
			// dataArea.setText("");
			// BufferedReader br = null;
			//
			// try {
			//
			// String sCurrentLine;
			//
			// br = new BufferedReader(new FileReader(file));
			// String text = "";
			// while ((sCurrentLine = br.readLine()) != null) {
			// text = text + sCurrentLine + "\n"
			// + "_____________________" + "\n";
			// }
			// dataArea.setText(text);
			// } catch (Exception e2) {
			// System.out.println(e2);
			// }
			// } else {
			// JOptionPane.showMessageDialog(null, "select the File First");
			// }
		}

	};

	ActionListener addAction = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			new Student_Data_Edit();
		}
	};

	ActionListener deleteAction = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (dataArea.getSelectedValue() != null) {
				try {
					removeanStuden(dataArea.getSelectedValue());
				} catch (IOException e1) {

					e1.printStackTrace();
				}
				model.removeAllElements();
				StudentService.AllStdeuntsDM = null;
				new StudentService().loadStudetIntoLists();
				String alldata = "";
				// JOptionPane.showMessageDialog(null,
				// StudentService.AllStdeuntsDM.size());
				for (StudentDM studentDM : StudentService.AllStdeuntsDM) {
					// System.out.println(studentDM.dataprint());
					alldata = alldata + studentDM.dataprint();

					model.addElement(studentDM.dataprint2());

				}

			} else
				JOptionPane.showMessageDialog(null,
						"Please Select item First !! ");

		}
	};
	ActionListener updateAction = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (dataArea.getSelectedValue() != null) {
				try {
					System.out.println("------------------ @1");
					removeantempStuden(dataArea.getSelectedValue());
					System.out.println("------------------ @2");
					frame.setVisible(false);
					StudentDM sDM= findStudentRecord(dataArea.getSelectedValue()) ;
//					StudentDM sss = new StudentDM();

					System.out.println("------------------ @3");
					new Student_Data_Edit(sDM);

					System.out.println("------------------ @4");
				} catch (IOException e1) {

					System.out.println(e1);
				}

			} else
				JOptionPane.showMessageDialog(null,
						"Please Select item First !! ");
		}
	};

	public static void main(String[] args) {
		new Student_Data_Importing();

	}

	public StudentDM findStudentRecord(String s) {
		for (StudentDM StudentDM : StudentService.AllStdeuntsDM) {
			String selecteddata[] = s.split(" - ");
			if (StudentDM.getStudentID().equals(selecteddata[0])
					&& StudentDM.getCourseName().equals(selecteddata[2])) {
//				JOptionPane.showMessageDialog(null, StudentDM.dataprint2());
				return StudentDM;
			}
		}
		return null;
	}

	public int getIndexOFstudent(StudentDM studentDM) {
		int x = 0;
		for (StudentDM Student : StudentService.AllStdeuntsDM) {
			x++;
			if (studentDM == Student) {
				return x;
			}
		}
		return -1;
	}

	public void removeanStuden(String lineToRemove) throws IOException {
		lineToRemove = lineToRemove.replace(" - ", ",");
		// JOptionPane.showMessageDialog(null, lineToRemove);
		File inputFile = new File("TestStudent.txt");
		File tempFile = new File("Temp.txt");

		boolean flage = false;
		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

		String currentLine;

		while ((currentLine = reader.readLine()) != null) {
			// trim newline when comparing with lineToRemove
			String trimmedLine = currentLine.trim();
			if (trimmedLine.contains(lineToRemove)) {
				JOptionPane.showMessageDialog(null,
						"Item Is Deleted Successfully !! ");
				flage = true;
				continue;
			}
			writer.write(currentLine + System.getProperty("line.separator"));
		}
		writer.close();
		reader.close();
		boolean successful = tempFile.renameTo(inputFile);
		if (flage) {
			FileChannel src = new FileInputStream(tempFile).getChannel();
			FileChannel dest = new FileOutputStream(inputFile).getChannel();
			dest.transferFrom(src, 0, src.size());
			// JOptionPane.showMessageDialog(null, );
		}
	}

	public void removeantempStuden(String lineToRemove) throws IOException {
		lineToRemove = lineToRemove.replace(" - ", ",");
		// JOptionPane.showMessageDialog(null, lineToRemove);
		File inputFile = new File("TestStudent.txt");
		File tempFile = new File("Temp.txt");

		boolean flage = false;
		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

		String currentLine;

		while ((currentLine = reader.readLine()) != null) {
			// trim newline when comparing with lineToRemove
			String trimmedLine = currentLine.trim();
			if (trimmedLine.contains(lineToRemove)) {
				// JOptionPane.showMessageDialog(null,
				// "Item Is Deleted Successfully !! ");
				flage = true;
				continue;
			}
			writer.write(currentLine + System.getProperty("line.separator"));
		}
		writer.close();
		reader.close();
		boolean successful = tempFile.renameTo(inputFile);
		if (flage) {
			FileChannel src = new FileInputStream(tempFile).getChannel();
			FileChannel dest = new FileOutputStream(inputFile).getChannel();
			dest.transferFrom(src, 0, src.size());
			// JOptionPane.showMessageDialog(null, );
		}
	}

	JButton backButton;

	ActionListener actionListenerBack = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			new Directory_Home();
		}
	};

}
