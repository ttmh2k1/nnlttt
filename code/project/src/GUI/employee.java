package GUI;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import java.awt.Canvas;

public class employee extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txfID;
	private JTextField txfName;
	private JTextField txfPhone;
	private JTextField txfAddress;
	private JTable tableCus;
	private JTextField textField;
	private JTextField textField_1;

	public employee() {
		setOpaque(false);
		setBorder(new LineBorder(new Color(25, 25, 112)));
		setBackground(new Color(235, 255, 250));
		setLayout(null);
		setVisible(true);
		JLabel lbEmp = new JLabel("EMPLOYEE");
		lbEmp.setHorizontalAlignment(SwingConstants.CENTER);
		lbEmp.setForeground(new Color(25, 25, 112));
		lbEmp.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		lbEmp.setBounds(198, 0, 163, 30);
		add(lbEmp);
		
		JPanel panelCus = new JPanel();
		panelCus.setBorder(new LineBorder(new Color(25, 25, 112)));
		panelCus.setBackground(new Color(176, 196, 222));
		panelCus.setBounds(10, 30, 540, 250);
		add(panelCus);
		panelCus.setLayout(null);
		
		JLabel lbID = new JLabel("ID");
		lbID.setForeground(new Color(25, 25, 112));
		lbID.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		lbID.setBounds(10, 10, 100, 30);
		panelCus.add(lbID);
		
		JLabel lbRole = new JLabel("Role");
		lbRole.setBounds(180, 10, 57, 30);
		panelCus.add(lbRole);
		lbRole.setForeground(new Color(25, 25, 112));
		lbRole.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		
		JLabel lbName = new JLabel("Name");
		lbName.setForeground(new Color(25, 25, 112));
		lbName.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		lbName.setBounds(10, 50, 100, 30);
		panelCus.add(lbName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(180, 170, 100, 30);
		panelCus.add(lblPassword);
		lblPassword.setForeground(new Color(25, 25, 112));
		lblPassword.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		
		JLabel lbEmail = new JLabel("Email");
		lbEmail.setForeground(new Color(25, 25, 112));
		lbEmail.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		lbEmail.setBounds(10, 130, 100, 30);
		panelCus.add(lbEmail);
		
		JLabel lbAddress = new JLabel("Address");
		lbAddress.setBounds(10, 210, 100, 30);
		panelCus.add(lbAddress);
		lbAddress.setForeground(new Color(25, 25, 112));
		lbAddress.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		
		JLabel lbGender = new JLabel("Gender");
		lbGender.setBounds(180, 90, 100, 30);
		panelCus.add(lbGender);
		lbGender.setForeground(new Color(25, 25, 112));
		lbGender.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		
		JLabel lbPhone = new JLabel("Phone");
		lbPhone.setBounds(10, 170, 100, 30);
		panelCus.add(lbPhone);
		lbPhone.setForeground(new Color(25, 25, 112));
		lbPhone.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		
		txfID = new JTextField();
		txfID.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		txfID.setForeground(new Color(25, 25, 112));
		txfID.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		txfID.setBounds(70, 13, 100, 25);
		panelCus.add(txfID);
		txfID.setColumns(10);
		
		txfName = new JTextField();
		txfName.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		txfName.setForeground(new Color(25, 25, 112));
		txfName.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		txfName.setColumns(10);
		txfName.setBounds(70, 53, 265, 25);
		panelCus.add(txfName);
		
		textField = new JTextField();
		textField.setForeground(new Color(25, 25, 112));
		textField.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		textField.setBounds(70, 133, 265, 25);
		panelCus.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(260, 173, 170, 25);
		panelCus.add(textField_1);
		textField_1.setForeground(new Color(25, 25, 112));
		textField_1.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		
		txfAddress = new JTextField();
		txfAddress.setBounds(70, 213, 360, 25);
		panelCus.add(txfAddress);
		txfAddress.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		txfAddress.setForeground(new Color(25, 25, 112));
		txfAddress.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		txfAddress.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(440, 10, 90, 30);
		panelCus.add(btnAdd);
		btnAdd.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		btnAdd.setHorizontalTextPosition(SwingConstants.CENTER);
		btnAdd.setBackground(new Color(204, 204, 255));
		btnAdd.setForeground(new Color(25, 25, 112));
		btnAdd.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
		
//		ImageIcon avtload =new ImageIcon(new ImageIcon(this.getClass().getResource("/background.png")).getImage().getScaledInstance(btnAdd.getWidth(),btnAdd.getHeight(), Image.SCALE_SMOOTH));
//        btnAdd.setIcon(avtload);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(440, 50, 90, 30);
		panelCus.add(btnEdit);
		btnEdit.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		btnEdit.setBackground(new Color(204, 204, 255));
		btnEdit.setForeground(new Color(25, 25, 112));
		btnEdit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
		
		JButton btnDisable = new JButton("Disable");
		btnDisable.setBounds(440, 90, 90, 30);
		panelCus.add(btnDisable);
		btnDisable.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		btnDisable.setBackground(new Color(204, 204, 255));
		btnDisable.setForeground(new Color(25, 25, 112));
		btnDisable.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(440, 172, 90, 30);
		panelCus.add(btnCancel);
		btnCancel.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		btnCancel.setBackground(new Color(204, 204, 255));
		btnCancel.setForeground(new Color(25, 25, 112));
		btnCancel.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(440, 209, 90, 30);
		panelCus.add(btnSave);
		btnSave.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		btnSave.setBackground(new Color(204, 204, 255));
		btnSave.setForeground(new Color(25, 25, 112));
		btnSave.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.setBounds(344, 130, 90, 30);
		panelCus.add(btnUpload);
		btnUpload.setHorizontalTextPosition(SwingConstants.CENTER);
		btnUpload.setForeground(new Color(25, 25, 112));
		btnUpload.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
		btnUpload.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		btnUpload.setBackground(new Color(204, 204, 255));
		
		Canvas canvas = new Canvas();
		canvas.setBounds(344, 10, 90, 116);
		panelCus.add(canvas);
		canvas.setBackground(new Color(245, 255, 250));
		
		JComboBox cbRole = new JComboBox();
		cbRole.setBounds(235, 13, 100, 25);
		panelCus.add(cbRole);
		cbRole.setForeground(new Color(25, 25, 112));
		cbRole.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		cbRole.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		cbRole.setBackground(new Color(245, 255, 250));
		
		JComboBox cbGender = new JComboBox();
		cbGender.setBounds(235, 93, 100, 25);
		panelCus.add(cbGender);
		cbGender.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		cbGender.setBackground(new Color(245, 255, 250));
		cbGender.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		cbGender.setForeground(new Color(25, 25, 112));
		
		txfPhone = new JTextField();
		txfPhone.setBounds(70, 173, 100, 25);
		panelCus.add(txfPhone);
		txfPhone.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		txfPhone.setForeground(new Color(25, 25, 112));
		txfPhone.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		txfPhone.setColumns(10);
		
		JComboBox cbDob = new JComboBox();
		cbDob.setBounds(70, 93, 100, 25);
		panelCus.add(cbDob);
		cbDob.setForeground(new Color(25, 25, 112));
		cbDob.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		cbDob.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		cbDob.setBackground(new Color(245, 255, 250));
		
		JLabel lbDob = new JLabel("DOB");
		lbDob.setBounds(10, 90, 62, 30);
		panelCus.add(lbDob);
		lbDob.setForeground(new Color(25, 25, 112));
		lbDob.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		
		JPanel panelCusList = new JPanel();
		panelCusList.setOpaque(false);
		panelCusList.setBorder(new LineBorder(new Color(25, 25, 112)));
		panelCusList.setBackground(new Color(176, 196, 222));
		panelCusList.setBounds(10, 309, 540, 180);
		add(panelCusList);
		panelCusList.setLayout(null);
		
		tableCus = new JTable();
		tableCus.setBackground(new Color(176, 196, 222));
		tableCus.setBounds(0, 170, 530, -169);
		panelCusList.add(tableCus);
		
		JLabel lbCusList = new JLabel("EMPLOYEE LIST");
		lbCusList.setHorizontalAlignment(SwingConstants.CENTER);
		lbCusList.setForeground(new Color(25, 25, 112));
		lbCusList.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		lbCusList.setBounds(178, 280, 204, 30);
		add(lbCusList);

	}
}
