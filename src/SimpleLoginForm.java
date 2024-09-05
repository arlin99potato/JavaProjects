import java.awt.Component;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class SimpleLoginForm extends JFrame implements ActionListener {
	
	// Using private is good coding practice
	// Using static to allow main method to access this variables
	// These are global variables as other methods need to access these
	private static JLabel usernameLabel;
	private static JLabel passwordLabel;
	private static JTextField usernameInput;
	private static JPasswordField passwordInput;
	private static JButton button;
	private static JLabel success;
	
	// Using box layout
	public static void main(String[] args) {
		Dimension size = new Dimension(350,250);
		
		// Creating the frame
		JFrame frame = new JFrame("Login Form");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(size);
		frame.setMinimumSize(size);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		usernameLabel = new JLabel("Username");
		usernameLabel.setBounds(10, 20, 80, 25);
		panel.add(usernameLabel);
		
		usernameInput = new JTextField(25); // The parameter is the length of input
		usernameInput.setBounds(100, 20, 150, 25);
		panel.add(usernameInput);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		
		passwordInput = new JPasswordField(25);
		passwordInput.setBounds(100, 50, 150, 25);
		panel.add(passwordInput);
		
		button = new JButton("Login");
		button.setBounds(125,90,80,25);
		button.addActionListener(new SimpleLoginForm());
		panel.add(button);
		
		success = new JLabel("");
		success.setBounds(140,125,100,25);
		panel.add(success);
		
		panel.setBorder(BorderFactory.createTitledBorder("Login"));
		
		frame.add(panel);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String username = usernameInput.getText();
		String password = passwordInput.getText();
		
		System.out.print(password);
		
		if(username.equals("arlin") && password.equals("hehehe")) {
			success.setText("Login successful");
		}
	}
}
