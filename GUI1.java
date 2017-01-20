package test;

import javax.swing.JApplet;
import javax.swing.JLabel;

import java.awt.BorderLayout;

import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class GUI1 extends JApplet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the applet.
	 */
	public GUI1() {
		getContentPane().setLayout(null);
		
		JLabel lblMovieConsertJava = new JLabel("Movie Consert Java Project");
		lblMovieConsertJava.setBounds(120, 11, 160, 14);
		getContentPane().add(lblMovieConsertJava);
		
		JLabel lblAdminLogIn = new JLabel("Admin Log in");
		lblAdminLogIn.setBounds(10, 33, 67, 14);
		getContentPane().add(lblAdminLogIn);
		
		JLabel lblTLogIn = new JLabel("T\u03B1\u03BC\u03AF\u03B1\u03C2 Log in");
		lblTLogIn.setBounds(279, 36, 76, 14);
		getContentPane().add(lblTLogIn);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(10, 58, 67, 14);
		getContentPane().add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(78, 55, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 83, 46, 14);
		getContentPane().add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(78, 80, 86, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(10, 120, 46, 23);
		getContentPane().add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(78, 120, 65, 23);
		getContentPane().add(btnCancel);
		
		JLabel lblUsername_1 = new JLabel("Username");
		lblUsername_1.setBounds(234, 58, 55, 14);
		getContentPane().add(lblUsername_1);
		
		JLabel lblPassword_1 = new JLabel("Password");
		lblPassword_1.setBounds(234, 86, 55, 14);
		getContentPane().add(lblPassword_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(310, 55, 86, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(310, 80, 86, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnOk_1 = new JButton("OK");
		btnOk_1.addComponentListener(new ComponentAdapter() {
			
			String name = textField_2.getText();
			String pass = textField_3.getText();
			ResultSet rs =  stmt.executeQuery("select * from users where display_name='" + name + "' and password='" + pass + "'" );
			if (rs.next()){
				System.out.println("welcome");
				System.out.println(name);
			} else {
				System.out.print("Wrong password or username,please try again");
				
			}
			
			@Override
			public void componentMoved ( ComponentEvent arg0 ) {
	            JFrame frame = new JFrame ("GUI1");
	            frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	            frame.getContentPane().add (new MyPanel());
	            frame.pack();
	            frame.setVisible (true);
			}
	;
		btnOk_1.setBounds(226, 120, 46, 23);
		getContentPane().add(btnOk_1);
		
		JButton btnCancel_1 = new JButton("Cancel");
		btnCancel_1.setBounds(307, 120, 65, 23);
		getContentPane().add(btnCancel_1);

	}
}
