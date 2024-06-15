import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEmail;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setUndecorated(true);
		
		setLocationRelativeTo(null); // Centraliza a tela
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setBounds(1117, 156, 100, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email:");
		lblNewLabel_1.setBounds(1002, 251, 46, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_1);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(1002, 287, 320, 20);
		txtEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password:");
		lblNewLabel_2.setBounds(1002, 345, 74, 14);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_2);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(1002, 380, 320, 20);
		txtPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(txtPassword);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(1002, 429, 320, 23);
		btnNewButton.setIcon(new ImageIcon(Login.class.getResource("/images/login.png")));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Close");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Janela de confirmação ao clicar em "close"
				int a = JOptionPane.showConfirmDialog(null, "Do you want to close the application?", "Select", JOptionPane.YES_NO_OPTION);
				
				if (a == 0) { // Ao selecionar "YES""
					System.exit(a); // A janela é encerrada
				}
			}
		});
		btnNewButton_1.setBounds(1002, 463, 320, 23);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setIcon(new ImageIcon(Login.class.getResource("/images/close.png")));
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(Login.class.getResource("/images/login-background.PNG")));
		lblNewLabel_3.setBounds(0, 0, 1366, 768);
		contentPane.add(lblNewLabel_3);
	}
}
