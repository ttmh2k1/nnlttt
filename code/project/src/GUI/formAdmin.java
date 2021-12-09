package GUI;

import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;


public class formAdmin extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formAdmin frame = new formAdmin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	employee fEmployee = new employee();
	customer fCustomer = new customer();
	
	public formAdmin() {
		setBackground(new Color(173, 216, 230));
		setTitle("Admin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 255, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBorder(new LineBorder(new Color(25, 25, 112)));
		panel.setBackground(new Color(235, 255, 240));
		panel.setBounds(0, 0, 135, 460);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnEmp = new JButton("Employee");
		btnEmp.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		btnEmp.setOpaque(false);
		btnEmp.setBackground(new Color(176, 196, 222));
		btnEmp.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 16));
		btnEmp.setForeground(new Color(25, 25, 112));
		btnEmp.setBounds(10, 10, 115, 35);
		panel.add(btnEmp);
		
		JButton btnCus = new JButton("Customer");
		btnCus.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		btnCus.setOpaque(false);
		btnCus.setBackground(new Color(176, 196, 222));
		btnCus.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 16));
		btnCus.setForeground(new Color(25, 25, 112));
		btnCus.setBounds(10, 55, 115, 35);
		panel.add(btnCus);
		
		JButton btnPro = new JButton("Product");
		btnPro.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		btnPro.setOpaque(false);
		btnPro.setBackground(new Color(176, 196, 222));
		btnPro.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 16));
		btnPro.setForeground(new Color(25, 25, 112));
		btnPro.setBounds(10, 100, 115, 35);
		panel.add(btnPro);
		
		JButton btnBill = new JButton("Bill");
		btnBill.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		btnBill.setOpaque(false);
		btnBill.setBackground(new Color(176, 196, 222));
		btnBill.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 16));
		btnBill.setForeground(new Color(25, 25, 112));
		btnBill.setBounds(10, 145, 115, 35);
		panel.add(btnBill);
		
		JButton btnHistory = new JButton("Bill history");
		btnHistory.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		btnHistory.setOpaque(false);
		btnHistory.setBackground(new Color(176, 196, 222));
		btnHistory.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 16));
		btnHistory.setForeground(new Color(25, 25, 112));
		btnHistory.setBounds(10, 190, 115, 35);
		panel.add(btnHistory);
		
		JButton btnStatis = new JButton("Statistics");
		btnStatis.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		btnStatis.setOpaque(false);
		btnStatis.setBackground(new Color(176, 196, 222));
		btnStatis.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 16));
		btnStatis.setForeground(new Color(25, 25, 112));
		btnStatis.setBounds(10, 235, 115, 35);
		panel.add(btnStatis);
		
		JButton btnReport = new JButton("Report");
		btnReport.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		btnReport.setOpaque(false);
		btnReport.setBackground(new Color(176, 196, 222));
		btnReport.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 16));
		btnReport.setForeground(new Color(25, 25, 112));
		btnReport.setBounds(10, 280, 115, 35);
		panel.add(btnReport);
		
		JButton btnProfile = new JButton("Profile");
		btnProfile.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		btnProfile.setOpaque(false);
		btnProfile.setForeground(new Color(25, 25, 112));
		btnProfile.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 16));
		btnProfile.setBackground(new Color(176, 196, 222));
		btnProfile.setBounds(10, 325, 115, 35);
		panel.add(btnProfile);
		
		JButton btnLogOut = new JButton("Log out");
		btnLogOut.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		btnLogOut.setOpaque(false);
		btnLogOut.setForeground(new Color(25, 25, 112));
		btnLogOut.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 16));
		btnLogOut.setBackground(new Color(176, 196, 222));
		btnLogOut.setBounds(10, 415, 115, 35);
		panel.add(btnLogOut);
		
		fEmployee.setBorder(new LineBorder(new Color(25, 25, 112)));
		fEmployee.setVisible(false);
		fEmployee.setOpaque(false);
		fEmployee.setBounds(135, 0, 550, 460);
		fEmployee.setBackground(new Color(235, 255, 250));
		contentPane.add(fEmployee);
		
		fCustomer.setBorder(new LineBorder(new Color(25, 25, 112)));
		fCustomer.setVisible(false);
		fCustomer.setOpaque(false);
		fCustomer.setBounds(135, 0, 550, 460);
		fCustomer.setBackground(new Color(235, 255, 250));
		contentPane.add(fCustomer);
		
		JLabel bg =new JLabel();
		bg.setBounds(0,0,700,500);
		ImageIcon avtload =new ImageIcon(new ImageIcon(this.getClass().getResource("/background.png")).getImage().getScaledInstance(bg.getWidth(),bg.getHeight(), Image.SCALE_SMOOTH));
        bg.setIcon(avtload);
		getContentPane().add(bg);
		
		btnEmp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Hide();
				fEmployee.setVisible(true);
			}
		});
		
		btnCus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Hide();
				fCustomer.setVisible(true);
			}
		});

	}
	
	void Hide() {
		fEmployee.setVisible(false);
		fCustomer.setVisible(false);

	}
}
