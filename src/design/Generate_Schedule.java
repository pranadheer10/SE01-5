package design;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.xml.ws.handler.MessageContext.Scope;

public class Generate_Schedule {

	JFrame frame;
	JPanel mainpanle;

	JLabel LoginLable;
	JTable table;
	JScrollPane jScrollPane;
	String columnsNames[] = { "Term", "Status", "Section Name / Titel",
			"Location", "Meeting Information", "Faculty", "Available capacity",
			"Credits", "CEUs", "Academy Level" };
	String DataContent[][];

	// = {
	// { "Term", "Status", "Selection Name / Titel", "Location",
	// "Meeting Information", "Faculty", "Available capacity",
	// "Credits", "CEUs", "Academy Level" },
	// { "Term", "Status", "Selection Name / Titel", "Location",
	// "Meeting Information", "Faculty", "Available capacity",
	// "Credits", "CEUs", "Academy Level" },
	// { "Term", "Status", "Selection Name / Titel", "Location",
	// "Meeting Information", "Faculty", "Available capacity",
	// "Credits", "CEUs", "Academy Level" } };

	public Generate_Schedule() {
		frame = new JFrame();
		mainpanle = new JPanel();
		DataContent = GenerateDataContent();

		table = new JTable(DataContent, columnsNames);
		LoginLable = new JLabel("Generate Schedule");

		table.setPreferredScrollableViewportSize(new Dimension(800, 500));
		table.setFillsViewportHeight(true);
		jScrollPane = new JScrollPane(table);
		LoginLable.setHorizontalAlignment(JTextField.CENTER);

		mainpanle.setLayout(null);

		mainpanle.add(LoginLable);
		mainpanle.add(jScrollPane);
		// jScrollPane.add(table);
		
		backButton = new JButton("Back");
		mainpanle.add(backButton);
		backButton.setBounds(10, 10, 80, 25);
		backButton.addActionListener(actionListenerBack);
		

		mainpanle.setBackground(new Color(255, 255, 255));
		LoginLable.setFont(new Font("Verdana", Font.BOLD, 25));
		LoginLable.setBounds(300, 10, 300, 30);

		frame.setLayout(null);
		frame.add(mainpanle);
		mainpanle.setBounds(0, 0, 900, 620);

		jScrollPane.setBounds(5, 50, 885, 535);

		frame.setSize(900, 620);
		frame.setResizable(false);
		frame.setLocation(300, 70);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Generate_Schedule");
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		new Generate_Schedule();

	}

	public String[][] GenerateDataContent() {
		String intentData[][] = new String[1101][10];
		// if (true) {
		// File file = new File("TestSemesters.txt");
		//
		// BufferedReader br = null;
		//
		// try {
		//
		// String sCurrentLine = "";
		//
		// br = new BufferedReader(new FileReader(file));
		// int couter = 0;
		// String meetingInfo;
		// while ((sCurrentLine = br.readLine()) != null) {
		// System.out.println(couter);
		// String data[] = sCurrentLine.split(",");
		// if (data.length >= 1)
		// intentData[couter][0] = (data[0]);
		// else
		// intentData[couter][0] = "";
		// meetingInfo = "";
		// if (data.length >= 2)
		// meetingInfo = data[1];
		// else
		// meetingInfo = "";
		//
		// if (data.length >= 3) {
		// meetingInfo = meetingInfo + "  -  " + data[2];
		// intentData[couter][4] = meetingInfo;
		// } else {
		// meetingInfo = meetingInfo + "  -";
		// intentData[couter][4] = meetingInfo;
		// }
		// intentData[couter][1] = "open";
		// intentData[couter][7] = "3";
		// intentData[couter][9] = "Graduate";
		// couter++;
		// if (couter == 1100) {
		// break;
		// }
		// }
		//
		// } catch (Exception ex) {
		// System.out.println(ex);
		// }
		//
		// }

		// /////

		if (true) {

			File file = new File("TestCourse.txt");

			BufferedReader br = null;

			try {

				String sCurrentLine = "";

				br = new BufferedReader(new FileReader(file));
				int couter = 0;
				String titelSection;
				String facultyName = "";
				while ((sCurrentLine = br.readLine()) != null) {
					System.out.println(couter);
					sCurrentLine = sCurrentLine.replace("\"", "");
				
					String data[] = sCurrentLine.split(",");
//					JOptionPane.showMessageDialog(null,data[data.length-1] );
//					intentData[0][5] = "Maher";
					if (data.length >= 1) {
						titelSection = data[0];
						facultyName = data[data.length - 1];
						if (facultyName.trim().equals("")) {
							facultyName = "Watson";
							intentData[0][5] = facultyName;
						}
					} else
						titelSection = "";

					if (data.length >= 2) {
						titelSection = titelSection + "  -  " + data[1];

						// JOptionPane.showMessageDialog(null, titelSection);
						intentData[couter][2] = titelSection;
					} else {
						titelSection = titelSection + "  -";
						intentData[couter][2] = titelSection;
					}

					//
					if (sCurrentLine.contains(",N,N,N,")) {
						// JOptionPane.showMessageDialog(null, "all is NNN ");
						continue;
					} else if (isitNNY(sCurrentLine)) {

						intentData[couter][1] = "open";
						intentData[couter][7] = "3";
						intentData[couter][9] = "Graduate";
						intentData[couter][2] = titelSection;
						intentData[couter][4] = "05-01-2016 - 8-27-2016";// SU
						intentData[couter][0] = "2016SU";//
						intentData[couter][5] = facultyName;
						couter++;
					} else if (isitNYN(sCurrentLine)) {

						intentData[couter][1] = "open";
						intentData[couter][7] = "3";
						intentData[couter][9] = "Graduate";
						intentData[couter][2] = titelSection;
						intentData[couter][4] = "01-10-2016 - 5-29-2016";// SP
						intentData[couter][0] = "2016SP";//
						intentData[couter][5] = facultyName;
						couter++;
					} else if (isitNYY(sCurrentLine)) {

						intentData[couter][1] = "open";
						intentData[couter][7] = "3";
						intentData[couter][9] = "Graduate";
						intentData[couter][2] = titelSection;
						intentData[couter][4] = "01-10-2016 - 5/29/2016";// SP
						intentData[couter][0] = "2016SP";//
						intentData[couter][5] = facultyName;
						couter++;

						intentData[couter][1] = "open";
						intentData[couter][7] = "3";
						intentData[couter][9] = "Graduate";
						intentData[couter][2] = titelSection;
						intentData[couter][4] = "05-01-2016 - 8-27-2016";// SU
						intentData[couter][0] = "2016SU";//
						intentData[couter][5] = facultyName;
						couter++;
					} else if (isitYNN(sCurrentLine)) {

						intentData[couter][1] = "open";
						intentData[couter][7] = "3";
						intentData[couter][9] = "Graduate";
						intentData[couter][2] = titelSection;
						intentData[couter][4] = "08-28-2016 - 12-16-2016";// FA
						intentData[couter][0] = "2016Fa";//
						intentData[couter][5] = facultyName;
						couter++;
					} else if (isitYNY(sCurrentLine)) {

						intentData[couter][1] = "open";
						intentData[couter][7] = "3";
						intentData[couter][9] = "Graduate";
						intentData[couter][2] = titelSection;
						intentData[couter][4] = "08-28-2016 - 12-16-2016";// FA
						intentData[couter][0] = "2016Fa";//
						intentData[couter][5] = facultyName;
						couter++;
						intentData[couter][1] = "open";
						intentData[couter][7] = "3";
						intentData[couter][9] = "Graduate";
						intentData[couter][2] = titelSection;
						intentData[couter][4] = "05-01-2016 - 8-27-2016";// SU
						intentData[couter][0] = "2016SU";//
						intentData[couter][5] = facultyName;
						couter++;

					} else if (isitYYN(sCurrentLine)) {

						intentData[couter][1] = "open";
						intentData[couter][7] = "3";
						intentData[couter][9] = "Graduate";
						intentData[couter][2] = titelSection;
						intentData[couter][4] = "08-28-2016 - 12-16-2016";// FA
						intentData[couter][0] = "2016Fa";//
						intentData[couter][5] = facultyName;
						couter++;

						intentData[couter][1] = "open";
						intentData[couter][7] = "3";
						intentData[couter][9] = "Graduate";
						intentData[couter][2] = titelSection;
						intentData[couter][4] = "01-10-2016 - 5/29/2016";// SP
						intentData[couter][0] = "2016SP";//
						intentData[couter][5] = facultyName;
						couter++;

					} else if (isitYYY(sCurrentLine)) {

						intentData[couter][1] = "open";
						intentData[couter][7] = "3";
						intentData[couter][9] = "Graduate";
						intentData[couter][2] = titelSection;
						intentData[couter][4] = "08-28-2016 - 12-16-2016";// FA
						intentData[couter][0] = "2016Fa";//
						intentData[couter][5] = facultyName;
						couter++;

						intentData[couter][1] = "open";
						intentData[couter][7] = "3";
						intentData[couter][9] = "Graduate";
						intentData[couter][2] = titelSection;
						intentData[couter][4] = "01-10-2016 - 5/29/2016";// SP
						intentData[couter][0] = "2016SP";//
						intentData[couter][5] = facultyName;
						couter++;
						intentData[couter][1] = "open";
						intentData[couter][7] = "3";
						intentData[couter][9] = "Graduate";
						intentData[couter][2] = titelSection;
						intentData[couter][4] = "08-28-2016 - 12-16-2016";// FA
						intentData[couter][0] = "2016Fa";//
						intentData[couter][5] = facultyName;
						couter++;

					}

					if (couter == 1100) {
						break;
					}
				}

			} catch (Exception ex) {
				System.out.println(ex);
			}

		}

		// if (true) {
		//
		// File file = new File("TestFaculty.txt");
		//
		// BufferedReader br = null;
		//
		// try {
		//
		// String sCurrentLine = "";
		//
		// br = new BufferedReader(new FileReader(file));
		// int couter = 0;
		// String facultyName;
		// while ((sCurrentLine = br.readLine()) != null) {
		// System.out.println(couter);
		// String data[] = sCurrentLine.split(",");
		// if (data.length >= 1)
		// facultyName = data[0];
		// else
		// facultyName = "";
		//
		// if (data.length >= 2) {
		// facultyName = facultyName + " - " + data[2];
		//
		// // JOptionPane.showMessageDialog(null, titelSection);
		// intentData[couter][5] = facultyName;
		// } else {
		// facultyName = facultyName + "  -";
		// intentData[couter][5] = facultyName;
		// }
		//
		// intentData[couter][1] = "open";
		// intentData[couter][7] = "3";
		// intentData[couter][9] = "Graduate";
		// couter++;
		// if (couter == 1100) {
		// break;
		// }
		// }
		//
		// } catch (Exception ex) {
		// System.out.println(ex);
		// }
		//
		// }

		for (int i = 0; i < intentData.length; i++) {
			for (int j = 0; j < intentData[0].length; j++) {
				if (intentData[i][j] == "" || intentData[i][j] == null) {
					intentData[i][j] = "";
				}

			}
		}

		for (int i = 0; i < 1100; i++) {

			if (intentData[i][2].length() <= 10) {
				System.out.println("---------- " + i);
				continue;

			} else {
				String data[] = intentData[i][2].split(" - ");
				String CourseName = data[1].trim();
				CourseName = CourseName.replace("\"", "");
				File file = new File("TestStudent.txt");

				BufferedReader br = null;

				try {

					String sCurrentLine = "";

					br = new BufferedReader(new FileReader(file));
					int couter = 0;
					String facultyName;
					int studentCount = 0;
					while ((sCurrentLine = br.readLine()) != null) {
						if (CourseName.length() >= 6) {
							if (sCurrentLine.contains(CourseName.substring(4,
									CourseName.length() - 6))
									|| sCurrentLine.contains(CourseName
											.substring(4, 15))) {
								studentCount++;
							}
						} else
							continue;

					}

					// JOptionPane
					// .showMessageDialog(null, CourseName);
					// JOptionPane
					// .showMessageDialog(null, studentCount + "    -#");
					System.out.println();
					intentData[i][6] = "" + studentCount + " / " + 25 + " / "
							+ 0;
					// couter++;
				} catch (Exception ex) {
					System.out.println(ex);
				}

			}

		}
		for (int i = 0; i < intentData.length; i++) {
			for (int j = 0; j < intentData[0].length; j++) {
				if (intentData[i][j] == "" || intentData[i][j] == null) {
					intentData[i][j] = "";
				}

			}
		}
		return intentData;
	}

	public boolean isitYYY(String s) {
		return s.contains("Y,Y,Y");
	}

	public boolean isitYYN(String s) {
		return s.contains("Y,Y,N");
	}

	public boolean isitYNY(String s) {
		return s.contains("Y,N,Y");
	}

	public boolean isitYNN(String s) {
		return s.contains("Y,N,N");
	}

	public boolean isitNYY(String s) {
		return s.contains("N,Y,Y");
	}

	public boolean isitNYN(String s) {
		return s.contains("N,Y,N");
	}

	public boolean isitNNY(String s) {
		return s.contains("N,N,Y");
	}

	public boolean isitNNN(String s) {
		return s.contains("N,N,N");
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