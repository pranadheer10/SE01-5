package VPProjects;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class University_Home extends JFrame
{
	private JPanel contentPane;
 private University_edit universityedit;
 private JLabel lblWelcomeToOklahoma;
 
	/**
	 * Launch the application.
	 */
 public University_Home(JLabel label,String text)
 {

	    label.setText(text);
	    
	   }

		

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					University_Home frame = new University_Home();

					
	 				
			frame.setVisible(true);
							
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
					
	}

	/**
	 * Create the frame.
	 */
	public University_Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmEdit = new JMenuItem("Edit");
		
		mntmEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				University_edit univEdit= new University_edit();
				univEdit.setVisible(true);
			}
		});
		menuBar.add(mntmEdit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblWelcomeToOklahoma = new JLabel("WELCOME TO OKLAHOMA CHRISTIAN UNIVERSITY");
	
		lblWelcomeToOklahoma.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblWelcomeToOklahoma.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblWelcomeToOklahoma);
		
			
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnContinue.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnContinue.setBackground(Color.WHITE);
		contentPane.add(btnContinue);
		
	}

}
