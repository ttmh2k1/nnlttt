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
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class product extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txfID;
	private JTextField txfName;
	private JTextField txfPrice;
	private JTextField txfQuantity;
	private JTextField textField;

	public product() {
		setOpaque(false);
		setBorder(new LineBorder(new Color(25, 25, 112)));
		setBackground(new Color(235, 255, 250));
		setLayout(null);
		setVisible(true);
		JLabel lbPro = new JLabel("PRODUCT");
		lbPro.setHorizontalAlignment(SwingConstants.CENTER);
		lbPro.setForeground(new Color(25, 25, 112));
		lbPro.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		lbPro.setBounds(198, 0, 163, 30);
		add(lbPro);
		
		JPanel panelCus = new JPanel();
		panelCus.setBorder(new LineBorder(new Color(25, 25, 112)));
		panelCus.setBackground(new Color(176, 196, 222));
		panelCus.setBounds(10, 30, 540, 214);
		add(panelCus);
		panelCus.setLayout(null);
		
		JLabel lbID = new JLabel("ID");
		lbID.setForeground(new Color(25, 25, 112));
		lbID.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		lbID.setBounds(20, 10, 100, 30);
		panelCus.add(lbID);
		
		txfID = new JTextField();
		txfID.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		txfID.setForeground(new Color(25, 25, 112));
		txfID.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		txfID.setBounds(90, 13, 320, 25);
		panelCus.add(txfID);
		txfID.setColumns(10);
		
		JLabel lbName = new JLabel("Name");
		lbName.setForeground(new Color(25, 25, 112));
		lbName.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		lbName.setBounds(20, 50, 100, 30);
		panelCus.add(lbName);
		
		txfName = new JTextField();
		txfName.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		txfName.setForeground(new Color(25, 25, 112));
		txfName.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		txfName.setColumns(10);
		txfName.setBounds(90, 53, 320, 25);
		panelCus.add(txfName);
		
		JLabel lbPrice = new JLabel("Price");
		lbPrice.setForeground(new Color(25, 25, 112));
		lbPrice.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		lbPrice.setBounds(20, 90, 100, 30);
		panelCus.add(lbPrice);
		
		txfPrice = new JTextField();
		txfPrice.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		txfPrice.setForeground(new Color(25, 25, 112));
		txfPrice.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		txfPrice.setColumns(10);
		txfPrice.setBounds(90, 133, 320, 25);
		panelCus.add(txfPrice);
		
		JLabel lbQuantity = new JLabel("Quantity");
		lbQuantity.setForeground(new Color(25, 25, 112));
		lbQuantity.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		lbQuantity.setBounds(20, 130, 100, 30);
		panelCus.add(lbQuantity);
		
		txfQuantity = new JTextField();
		txfQuantity.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		txfQuantity.setForeground(new Color(25, 25, 112));
		txfQuantity.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		txfQuantity.setColumns(10);
		txfQuantity.setBounds(90, 93, 320, 25);
		panelCus.add(txfQuantity);
		
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
		btnDisable.setForeground(new Color(25, 25, 112));
		btnDisable.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
		btnDisable.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		btnDisable.setBackground(new Color(204, 204, 255));
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
		
		JLabel lbStatus = new JLabel("Status");
		lbStatus.setForeground(new Color(25, 25, 112));
		lbStatus.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		lbStatus.setBounds(20, 170, 100, 30);
		panelCus.add(lbStatus);
		
		JComboBox cbID_1 = new JComboBox();
		cbID_1.setForeground(new Color(25, 25, 112));
		cbID_1.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));
		cbID_1.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		cbID_1.setBackground(new Color(245, 255, 250));
		cbID_1.setBounds(89, 173, 321, 25);
		panelCus.add(cbID_1);
		
		JLabel lbProList = new JLabel("PRODUCT LIST");
		lbProList.setHorizontalAlignment(SwingConstants.CENTER);
		lbProList.setForeground(new Color(25, 25, 112));
		lbProList.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		lbProList.setBounds(10, 250, 163, 30);
		add(lbProList);
		
		JComboBox cbFilter = new JComboBox();
		cbFilter.setForeground(new Color(25, 25, 112));
		cbFilter.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 13));
		cbFilter.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		cbFilter.setBackground(new Color(245, 255, 250));
		cbFilter.setBounds(265, 255, 80, 20);
		add(cbFilter);
		
		textField = new JTextField();
		textField.setForeground(new Color(25, 25, 112));
		textField.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 13));
		textField.setColumns(10);
		textField.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		textField.setBounds(350, 255, 130, 20);
		add(textField);
		
		JButton btnFind = new JButton("Find");
		btnFind.setForeground(new Color(25, 25, 112));
		btnFind.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		btnFind.setBorder(new LineBorder(new Color(25, 25, 112), 1, true));
		btnFind.setBackground(new Color(204, 204, 255));
		btnFind.setBounds(490, 255, 60, 20);
		add(btnFind);
		
		JPanel panelProList = new JPanel();
		panelProList.setOpaque(false);
		panelProList.setBorder(new LineBorder(new Color(25, 25, 112)));
		panelProList.setBackground(new Color(176, 196, 222));
		panelProList.setBounds(10, 280, 540, 207);
		add(panelProList);
		panelProList.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 540, 207);
		panelProList.add(scrollPane);

	}
}
