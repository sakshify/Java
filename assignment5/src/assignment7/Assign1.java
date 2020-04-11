package assignment7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.Checkbox;
import javax.swing.JSpinner;
import java.awt.List;

public class Assign1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Assign1 window = new Assign1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Assign1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Test Button");
		btnNewButton.setBounds(10, 42, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Test Label");
		lblNewLabel.setBounds(152, 44, 70, 19);
		frame.getContentPane().add(lblNewLabel);
		
		TextField textField = new TextField();
		textField.setText("Text_Field");
		textField.setBounds(266, 42, 89, 23);
		frame.getContentPane().add(textField);
		
		TextArea textArea = new TextArea();
		textArea.setText("Text_Area");
		textArea.setBounds(10, 78, 393, 77);
		frame.getContentPane().add(textArea);
		
		Checkbox checkbox = new Checkbox("Test Checkbox");
		checkbox.setBounds(10, 196, 95, 22);
		frame.getContentPane().add(checkbox);
		
		List list = new List();
		list.setBounds(245, 173, 122, 60);
		frame.getContentPane().add(list);
	}
}
