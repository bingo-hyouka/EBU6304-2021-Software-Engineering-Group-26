package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Panel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class gui_video extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui_video frame = new gui_video();
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
	public gui_video() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1142, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Video Name");
		lblNewLabel.setBounds(5, 5, 1114, 37);
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 30));
		contentPane.add(lblNewLabel);
		
		Panel panel = new Panel();
		panel.setBounds(5, 42, 729, 434);
		panel.setBackground(new Color(127, 255, 212));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\13942\\Desktop\\\u8F6F\u5DE5\\UI images\\cfe84a2f10d3f612d6723492b8f9d9a.jpg"));
		lblNewLabel_6.setBounds(0, 0, 510, 429);
		panel.add(lblNewLabel_6);
		
		Panel panel_1 = new Panel();
		panel_1.setBounds(817, 42, 224, 434);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(4, 2, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Recommendation");
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		panel_1.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Video 1");
		btnNewButton.setSelectedIcon(new ImageIcon("C:\\Users\\13942\\Desktop\\\u8F6F\u5DE5\\UI images\\cfe84a2f10d3f612d6723492b8f9d9a.jpg"));
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Description");
		panel_1.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Video 2");
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("Description");
		panel_1.add(lblNewLabel_4);
		
		JButton btnNewButton_2 = new JButton("Video 3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnNewButton_2);
		
		JLabel lblNewLabel_5 = new JLabel("Description");
		panel_1.add(lblNewLabel_5);
		
		JTextPane txtpnComments = new JTextPane();
		txtpnComments.setBounds(5, 476, 1114, 41);
		txtpnComments.setFont(new Font("����", Font.PLAIN, 30));
		txtpnComments.setText("Comments");
		contentPane.add(txtpnComments);
	}

}