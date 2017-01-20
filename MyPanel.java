package test;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyPanel extends JApplet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the applet.
	 */
	public MyPanel() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			String connectionURL = "jdbc:mysql://localhost:6666/mixanki_logismikou";
			String nameRoot ="root";
			String password = "6190";
			Connection conn = DriverManager.getConnection(connectionURL,getName(),password);
			Statement stmt=(Statement) conn.createStatement();
			ResultSet rs =  stmt.executeQuery("select * from users");
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		getContentPane().setLayout(null);
		
		JLabel lblCostumerName = new JLabel("Costumer name");
		lblCostumerName.setBounds(10, 44, 87, 14);
		getContentPane().add(lblCostumerName);
		
		textField = new JTextField();
		textField.setBounds(135, 47, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {//edw stin ousia einai i epilogh tou xristi
				String getConsert = textField_1.getText();
			}
		});
		textField_1.setBounds(135, 131, 86, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSelectConsert = new JLabel("Select Consert");
		lblSelectConsert.setBounds(153, 11, 109, 14);
		getContentPane().add(lblSelectConsert);
		
		JLabel lblConsert = new JLabel("Consert");
		lblConsert.setBounds(10, 134, 46, 14);
		getContentPane().add(lblConsert);
		
		JButton btnSelectConsert = new JButton("Select Consert");
		btnSelectConsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Statement stmt;
				ResultSet rs =  stmt.executeQuery("select * from consertlist");
				while(rs.next()){//ektipwnei tis tenies gia na dei o xristis kai na diale3i
					int idx=rs.getInt("id");
					String namex=rs.getString("name");
					System.out.println(idx + " " + namex);
					}
				
				System.out.println(" 1)BURZUM\n 2)MEGADEATH\n 3)SEX PISTOLS\n 4)THE KILLERS\n 5)DEAD KENNEDYS\n  ");
			}
		});
		btnSelectConsert.setBounds(8, 79, 109, 23);
		getContentPane().add(btnSelectConsert);
		
		JLabel lblSeats = new JLabel("Seats");
		lblSeats.setBounds(10, 186, 46, 14);
		getContentPane().add(lblSeats);
		
		textField_2 = new JTextField();
		textField_2.setBounds(135, 183, 86, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//getseat getname sto diagramma klasis
				String getSeats = textField_2.getText();//number of seats gia ton tamia
				String getName = textField.getText();//gia to onoma xristi
				String getConsert = textField_1.getText();
				System.out.println("Thank you my dear costumer :" );
				System.out.println(getName);
				System.out.println("The number of seats that u have choosed is:");
				System.out.println(getSeats);
				System.out.println("And Consert:");
				System.out.println(getConsert);
			}
		});
		btnAdd.setBounds(46, 249, 89, 23);
		getContentPane().add(btnAdd);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("bye bye");
			}
		});
		btnCancel.setBounds(284, 249, 89, 23);
		getContentPane().add(btnCancel);

	}

}
