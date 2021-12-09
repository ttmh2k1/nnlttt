package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

public class formLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formLogin frame = new formLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public formLogin() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel mainPanel = new JPanel();
		mainPanel.setOpaque(false);
		mainPanel.setBounds(0, 0, 384, 361);
		contentPane.add(mainPanel);
		mainPanel.setLayout(null);

		JLabel lbBrand = new JLabel("BLUE STORE");
		lbBrand.setHorizontalAlignment(SwingConstants.CENTER);
		lbBrand.setForeground(new Color(25, 25, 112));
		lbBrand.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 30));
		lbBrand.setBounds(71, 30, 241, 50);
		mainPanel.add(lbBrand);

		JCheckBox chbAd = new JCheckBox("Admin");
		chbAd.setOpaque(false);
		chbAd.setForeground(new Color(25, 25, 112));
		chbAd.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		chbAd.setBounds(70, 105, 110, 30);
		mainPanel.add(chbAd);

		JCheckBox chbEmp = new JCheckBox("Employee");
		chbEmp.setOpaque(false);
		chbEmp.setForeground(new Color(25, 25, 112));
		chbEmp.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		chbEmp.setBounds(200, 105, 110, 30);
		mainPanel.add(chbEmp);

		textField = new JTextField();
		textField.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setForeground(new Color(25, 25, 112));
		textField.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBounds(155, 160, 190, 25);
		mainPanel.add(textField);

		JLabel lbUser = new JLabel("Username");
		lbUser.setForeground(new Color(25, 25, 112));
		lbUser.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		lbUser.setBounds(45, 160, 90, 25);
		mainPanel.add(lbUser);

		JLabel lblPw = new JLabel("Password");
		lblPw.setForeground(new Color(25, 25, 112));
		lblPw.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 15));
		lblPw.setBounds(45, 215, 90, 25);
		mainPanel.add(lblPw);

		passwordField = new JPasswordField();
		passwordField.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		passwordField.setHorizontalAlignment(SwingConstants.LEFT);
		passwordField.setForeground(new Color(25, 25, 112));
		passwordField.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
		passwordField.setBounds(155, 215, 190, 25);
		mainPanel.add(passwordField);

		JButton btnLogIn = new JButton("LOG IN");
		btnLogIn.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		btnLogIn.setForeground(new Color(25, 25, 112));
		btnLogIn.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 16));
		btnLogIn.setBackground(new Color(176, 196, 222));
		btnLogIn.setBounds(142, 285, 100, 30);
		mainPanel.add(btnLogIn);

		// set background
		JLabel bg = new JLabel();
		bg.setBounds(0, 0, 384, 361);
		ImageIcon bgload = new ImageIcon(new ImageIcon(this.getClass().getResource("/background.png")).getImage()
				.getScaledInstance(bg.getWidth(), bg.getHeight(), Image.SCALE_SMOOTH));
		bg.setIcon(bgload);
		getContentPane().add(bg);
	}
}
