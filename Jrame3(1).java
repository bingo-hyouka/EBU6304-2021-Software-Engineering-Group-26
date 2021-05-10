package Test1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Jrame3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final JLabel lblNewLabel = new JLabel("Find class");
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jrame3 frame = new Jrame3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param b 
	 */
	public Jrame3() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\lsy712\\Desktop\\\u5FAE\u4FE1\u56FE\u7247_20210407203155.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 823, 780);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Recommend");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(0, 0, 145, 50);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("VIP");
		btnNewButton_1.setBounds(242, 0, 122, 50);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField("Search video here");
		textField.setBounds(156, 143, 394, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		lblNewLabel.setBounds(0, 340, 135, 36);
		contentPane.add(lblNewLabel);
		
		
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Run");
		lblNewLabel_1.setBounds(205, 345, 98, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Practice action");
		lblNewLabel_2.setBounds(427, 344, 98, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Youga");
		lblNewLabel_3.setBounds(0, 465, 63, 29);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Walk");
		lblNewLabel_4.setBounds(205, 472, 58, 15);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Ride");
		lblNewLabel_5.setBounds(426, 472, 58, 15);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Live class");
		lblNewLabel_6.setBounds(628, 351, 89, 15);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("More");
		lblNewLabel_7.setBounds(628, 472, 89, 15);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\lsy712\\Desktop\\Find1.png"));
		lblNewLabel_8.setBounds(0, 275, 76, 66);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\lsy712\\Desktop\\Ride.png"));
		lblNewLabel_11.setBounds(426, 374, 89, 88);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setIcon(new ImageIcon("C:\\Users\\lsy712\\Desktop\\Live.png"));
		lblNewLabel_12.setBounds(618, 264, 98, 88);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setIcon(new ImageIcon("C:\\Users\\lsy712\\Desktop\\Practice.png"));
		lblNewLabel_13.setBounds(427, 275, 83, 66);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("New label");
		lblNewLabel_14.setIcon(new ImageIcon("C:\\Users\\lsy712\\Desktop\\More.png"));
		lblNewLabel_14.setBounds(628, 388, 76, 74);
		contentPane.add(lblNewLabel_14);
		
		textField_1 = new JTextField("Fat loss");
		textField_1.setBounds(0, 513, 206, 36);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField("abdominal muscle");
		textField_2.setBounds(205, 513, 181, 36);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField("build muscle");
		textField_3.setBounds(385, 513, 181, 36);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField("silm down calves");
		textField_4.setBounds(563, 513, 181, 36);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Recommended classes");
		lblNewLabel_15.setBounds(0, 559, 169, 29);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("New label");
		lblNewLabel_16.setIcon(new ImageIcon("C:\\Users\\lsy712\\Desktop\\123.png"));
		lblNewLabel_16.setBounds(0, 585, 291, 158);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Run class");
		lblNewLabel_17.setBounds(328, 585, 98, 29);
		contentPane.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("35min");
		lblNewLabel_18.setBounds(328, 611, 58, 29);
		contentPane.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("By:run office");
		lblNewLabel_19.setBounds(328, 670, 83, 15);
		contentPane.add(lblNewLabel_19);
		
		textField_5 = new JTextField("All classes");
		textField_5.setBounds(595, 585, 98, 21);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\lsy712\\Desktop\\walk12.png"));
		lblNewLabel_10.setBounds(205, 259, 76, 88);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\lsy712\\Desktop\\yuga2.png"));
		lblNewLabel_9.setBounds(0, 386, 63, 79);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_20 = new JLabel("");
		lblNewLabel_20.setIcon(new ImageIcon("C:\\Users\\lsy712\\Desktop\\12323.png"));
		lblNewLabel_20.setBounds(0, 0, 815, 260);
		contentPane.add(lblNewLabel_20);
		
		String listBox[]= {"a","b","c","d"};
		JComboBox<String> comboBox = new JComboBox<String>(listBox);
		comboBox.setBounds(518, 146, 34, 23);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_21 = new JLabel("New label");
		lblNewLabel_21.setIcon(new ImageIcon("C:\\Users\\lsy712\\Desktop\\1221.png"));
		lblNewLabel_21.setBounds(205, 381, 63, 73);
		contentPane.add(lblNewLabel_21);
		
		
		
		
	}
}
