package gui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.ImageIcon;

public class gui_vip extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtASuitable;
	private JTextField txtPersonalizedCustomizationPlan;
	private JTextField txtBuildMusclesPlan;
	private JTextField txtLooseWightPlan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui_vip frame = new gui_vip();
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
	public gui_vip() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 436, 551);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Recommend");
		btnNewButton.setBounds(15, 15, 120, 23);
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("VIP");
		btnNewButton_1.setBounds(148, 15, 102, 23);
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		contentPane.add(btnNewButton_1);
		
		txtASuitable = new JTextField();
		txtASuitable.setBackground(Color.WHITE);
		txtASuitable.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtASuitable.setBounds(15, 44, 120, 21);
		txtASuitable.setText("A suitable plan for you");
		contentPane.add(txtASuitable);
		txtASuitable.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(15, 75, 390, 411);
		contentPane.add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setIcon(new ImageIcon(gui_vip.class.getResource("/gui/img_vip0.jpg")));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton_5, 0, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, btnNewButton_5, 195, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnNewButton_5, 137, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnNewButton_5, 390, SpringLayout.WEST, panel);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setIcon(new ImageIcon(gui_vip.class.getResource("/gui/img_vip1.jpg")));
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton_3, 137, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, btnNewButton_3, 0, SpringLayout.WEST, btnNewButton_5);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnNewButton_3, 274, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnNewButton_3, 390, SpringLayout.WEST, panel);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setIcon(new ImageIcon(gui_vip.class.getResource("/gui/img_vip2.jpg")));
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton_4, 274, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, btnNewButton_4, 0, SpringLayout.WEST, btnNewButton_5);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnNewButton_4, 411, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnNewButton_4, 390, SpringLayout.WEST, panel);
		panel.add(btnNewButton_4);
		
		txtPersonalizedCustomizationPlan = new JTextField();
		txtPersonalizedCustomizationPlan.setText("Personalized customization plan");
		sl_panel.putConstraint(SpringLayout.NORTH, txtPersonalizedCustomizationPlan, 0, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, txtPersonalizedCustomizationPlan, 0, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, txtPersonalizedCustomizationPlan, 0, SpringLayout.SOUTH, btnNewButton_5);
		sl_panel.putConstraint(SpringLayout.EAST, txtPersonalizedCustomizationPlan, 195, SpringLayout.WEST, panel);
		panel.add(txtPersonalizedCustomizationPlan);
		txtPersonalizedCustomizationPlan.setColumns(10);
		
		txtBuildMusclesPlan = new JTextField();
		txtBuildMusclesPlan.setText("Build muscles plan");
		sl_panel.putConstraint(SpringLayout.NORTH, txtBuildMusclesPlan, 0, SpringLayout.SOUTH, txtPersonalizedCustomizationPlan);
		sl_panel.putConstraint(SpringLayout.WEST, txtBuildMusclesPlan, 0, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, txtBuildMusclesPlan, 0, SpringLayout.SOUTH, btnNewButton_3);
		sl_panel.putConstraint(SpringLayout.EAST, txtBuildMusclesPlan, 0, SpringLayout.EAST, txtPersonalizedCustomizationPlan);
		txtBuildMusclesPlan.setColumns(10);
		panel.add(txtBuildMusclesPlan);
		
		txtLooseWightPlan = new JTextField();
		txtLooseWightPlan.setText("Loose wight plan");
		
		sl_panel.putConstraint(SpringLayout.NORTH, txtLooseWightPlan, 0, SpringLayout.SOUTH, txtBuildMusclesPlan);
		sl_panel.putConstraint(SpringLayout.WEST, txtLooseWightPlan, 0, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, txtLooseWightPlan, 0, SpringLayout.SOUTH, btnNewButton_4);
		sl_panel.putConstraint(SpringLayout.EAST, txtLooseWightPlan, 195, SpringLayout.WEST, panel);
		txtLooseWightPlan.setColumns(10);
		panel.add(txtLooseWightPlan);
		
		JButton btnNewButton_2 = new JButton("More");
		btnNewButton_2.setBounds(312, 43, 93, 23);
		contentPane.add(btnNewButton_2);
	}
}
