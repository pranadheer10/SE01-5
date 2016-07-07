package design;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Test_Schedule {
	JFrame frame;
	JPanel mainpanle;

	JLabel LoginLable;
	JTable table;
	JScrollPane jScrollPane;
	String columnsNames[] = { "Section Name", "Enrollment" };
	String DataContent[][] = { { "Section Name", "Enrollment" },
			{ "Section Name", "Enrollment" },
			{ "Section Name", "Enrollment" } };

	public Test_Schedule() {
		frame = new JFrame();
		mainpanle = new JPanel();
		DataContent = GenerateDataContent();
		table = new JTable(DataContent, columnsNames);
		LoginLable = new JLabel("Test Schedule");

		table.setPreferredScrollableViewportSize(new Dimension(800, 500));
		table.setFillsViewportHeight(true);
		jScrollPane = new JScrollPane(table);
		LoginLable.setHorizontalAlignment(JTextField.CENTER);

		mainpanle.setLayout(null);

		mainpanle.add(LoginLable);
		mainpanle.add(jScrollPane);
		// jScrollPane.add(table);

		mainpanle.setBackground(new Color(255, 255, 255));
		LoginLable.setFont(new Font("Verdana", Font.BOLD, 25));
		LoginLable.setBounds(300, 10, 300, 30);

		frame.setLayout(null);
		frame.add(mainpanle);
		mainpanle.setBounds(0, 0, 900, 620);
		backButton = new JButton("Back");
		mainpanle.add(backButton);
		backButton.setBounds(10, 10, 80, 25);
		backButton.addActionListener(actionListenerBack);
		
		jScrollPane.setBounds(5, 50, 885, 535);

		frame.setSize(900, 620);
		frame.setResizable(false);
		frame.setLocation(300, 70);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Test_Schedule");
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		System.out.println(new Test_Schedule().gitallStudentUElements().size());

	}

	public String[][] GenerateDataContent() {
		ArrayList<String> dataCountentElemetn = gitallStudentUElements();
		NumberFormat formatter = new DecimalFormat("#0.00");
		String intentData[][] = new String[dataCountentElemetn.size()][2];
		if (true) {
			File file = new File("TestStudent.txt");

			BufferedReader br = null;

			try {

				String sCurrentLine = "";

				int couter = 0;
				int counter2 = 0;
				double numberdec = 0;

				for (String item : dataCountentElemetn) {
					String data[] = null;
					br = new BufferedReader(new FileReader(file));
					while ((sCurrentLine = br.readLine()) != null) {

						data = sCurrentLine.split(",");
						if (data.length >= 3) {
							if (sCurrentLine.contains(item)) {
								System.out.println(item);
								couter++;
							}
						} else
							JOptionPane.showMessageDialog(null, "--");

					}
					// JOptionPane.showMessageDialog(null, couter + "   " +
					// item);
					numberdec = (couter * 100 / 180);
					

					intentData[counter2][0] = item;
					intentData[counter2][1] = formatter.format(numberdec)
							+ " %";
					counter2++;
					couter = 0;

				}

			} catch (Exception ex) {
				System.out.println(ex);
			}

		}

		return intentData;
	}

	public ArrayList<String> gitallStudentUElements() {
		ArrayList<String> allElemtents = new ArrayList<String>();
		File file = new File("TestStudent.txt");
		BufferedReader br = null;
		try {
			String sCurrentLine = "";
			br = new BufferedReader(new FileReader(file));

			String meetingInfo;
			while ((sCurrentLine = br.readLine()) != null) {

				String data[] = sCurrentLine.split(",");
				if (data.length >= 3) {
					if (!allElemtents.contains(data[1] + "," + data[2])) {
						allElemtents.add(data[1] + "," + data[2]);
					}
				}
			}

		} catch (Exception ex) {
			System.out.println(ex);
		}
		System.out.println(allElemtents);
		return allElemtents;
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