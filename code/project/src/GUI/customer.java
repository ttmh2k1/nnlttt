package GUI;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;

public class customer extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txfID;
	private JTextField txfName;
	private JTextField txfPhone;
	private JTextField txfAddress;
	private JTable tableCus;

	public customer() {
		setOpaque(false);
		setBorder(new LineBorder(new Color(25, 25, 112)));
		setBackground(new Color(235, 255, 250));
		setLayout(null);
		setVisible(true);
		JLabel lbCus = new JLabel("CUSTOMER");
		lbCus.setHorizontalAlignment(SwingConstants.CENTER);
		lbCus.setForeground(new Color(25, 25, 112));
		lbCus.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		lbCus.setBounds(198, 0, 163, 30);
		add(lbCus);
		
		JPanel panelCus = new JPanel();
		panelCus.setBorder(new LineBorder(new Color(25, 25, 112)));
		panelCus.setBackground(new Color(176, 196, 222));
		panelCus.setBounds(10, 30, 540, 210);
		add(panelCus);
		panelCus.setLayout(null);
		
		JLabel lbID = new JLabel("ID");
		lbID.setForeground(new Color(25, 25, 112));
		lbID.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		lbID.setBounds(20, 10, 100, 30);
		panelCus.add(lbID);
		
		JLabel lbName = new JLabel("Name");
		lbName.setForeground(new Color(25, 25, 112));
		lbName.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		lbName.setBounds(20, 50, 100, 30);
		panelCus.add(lbName);
		
		JLabel lbGender = new JLabel("Gender");
		lbGender.setForeground(new Color(25, 25, 112));
		lbGender.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		lbGender.setBounds(20, 90, 100, 30);
		panelCus.add(lbGender);
		
		JLabel lbPhone = new JLabel("Phone");
		lbPhone.setForeground(new Color(25, 25, 112));
		lbPhone.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		lbPhone.setBounds(20, 130, 100, 30);
		panelCus.add(lbPhone);
		
		JLabel lbDob = new JLabel("Date of birth");
		lbDob.setForeground(new Color(25, 25, 112));
		lbDob.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		lbDob.setBounds(200, 90, 100, 30);
		panelCus.add(lbDob);
		
		JLabel lbAddress = new JLabel("Address");
		lbAddress.setForeground(new Color(25, 25, 112));
		lbAddress.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		lbAddress.setBounds(20, 170, 100, 30);
		panelCus.add(lbAddress);
		
		txfID = new JTextField();
		txfID.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		txfID.setForeground(new Color(25, 25, 112));
		txfID.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		txfID.setBounds(90, 13, 320, 25);
		panelCus.add(txfID);
		txfID.setColumns(10);
		
		txfName = new JTextField();
		txfName.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		txfName.setForeground(new Color(25, 25, 112));
		txfName.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		txfName.setColumns(10);
		txfName.setBounds(90, 53, 320, 25);
		panelCus.add(txfName);
		
		JComboBox cbGender = new JComboBox();
		cbGender.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		cbGender.setBackground(new Color(245, 255, 250));
		cbGender.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		cbGender.setForeground(new Color(25, 25, 112));
		cbGender.setBounds(90, 93, 100, 25);
		panelCus.add(cbGender);
		
		JComboBox cbDob = new JComboBox();
		cbDob.setForeground(new Color(25, 25, 112));
		cbDob.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		cbDob.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		cbDob.setBackground(new Color(245, 255, 250));
		cbDob.setBounds(290, 93, 120, 25);
		panelCus.add(cbDob);
		
		txfPhone = new JTextField();
		txfPhone.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		txfPhone.setForeground(new Color(25, 25, 112));
		txfPhone.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		txfPhone.setColumns(10);
		txfPhone.setBounds(90, 133, 320, 25);
		panelCus.add(txfPhone);
		
		txfAddress = new JTextField();
		txfAddress.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		txfAddress.setForeground(new Color(25, 25, 112));
		txfAddress.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		txfAddress.setColumns(10);
		txfAddress.setBounds(90, 173, 320, 25);
		panelCus.add(txfAddress);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		btnAdd.setHorizontalTextPosition(SwingConstants.CENTER);
		btnAdd.setBackground(new Color(204, 204, 255));
		btnAdd.setForeground(new Color(25, 25, 112));
		btnAdd.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
		btnAdd.setBounds(440, 10, 90, 30);
		panelCus.add(btnAdd);
		
//		ImageIcon avtload =new ImageIcon(new ImageIcon(this.getClass().getResource("/background.png")).getImage().getScaledInstance(btnAdd.getWidth(),btnAdd.getHeight(), Image.SCALE_SMOOTH));
//        btnAdd.setIcon(avtload);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		btnEdit.setBackground(new Color(204, 204, 255));
		btnEdit.setForeground(new Color(25, 25, 112));
		btnEdit.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
		btnEdit.setBounds(440, 50, 90, 30);
		panelCus.add(btnEdit);
		
		JButton btnDisable = new JButton("Disable");
		btnDisable.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		btnDisable.setBackground(new Color(204, 204, 255));
		btnDisable.setForeground(new Color(25, 25, 112));
		btnDisable.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
		btnDisable.setBounds(440, 90, 90, 30);
		panelCus.add(btnDisable);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		btnCancel.setBackground(new Color(204, 204, 255));
		btnCancel.setForeground(new Color(25, 25, 112));
		btnCancel.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
		btnCancel.setBounds(440, 130, 90, 30);
		panelCus.add(btnCancel);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		btnSave.setBackground(new Color(204, 204, 255));
		btnSave.setForeground(new Color(25, 25, 112));
		btnSave.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
		btnSave.setBounds(440, 170, 90, 30);
		panelCus.add(btnSave);
		
		JPanel panelCusList = new JPanel();
		panelCusList.setOpaque(false);
		panelCusList.setBorder(new LineBorder(new Color(25, 25, 112)));
		panelCusList.setBackground(new Color(176, 196, 222));
		panelCusList.setBounds(10, 270, 540, 180);
		add(panelCusList);
		panelCusList.setLayout(null);
		
		tableCus = new JTable();
		tableCus.setBackground(new Color(176, 196, 222));
		tableCus.setBounds(0, 170, 530, -169);
		panelCusList.add(tableCus);
		
		JLabel lbCusList = new JLabel("CUSTOMER LIST");
		lbCusList.setHorizontalAlignment(SwingConstants.CENTER);
		lbCusList.setForeground(new Color(25, 25, 112));
		lbCusList.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		lbCusList.setBounds(178, 240, 204, 30);
		add(lbCusList);

	}
}
