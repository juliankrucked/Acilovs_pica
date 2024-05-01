package lvt;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

public class FirstWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLayeredPane layeredPane;
	private JPanel base;
	private JPanel topings;
	private JPanel adress;
	private JPanel payment;
	private JPanel delivery;
	private JTextField textField;
	private JLabel pizzaSize;
	private JPanel orderMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstWindow frame = new FirstWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void switchPanels(JPanel panel)
	{
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}

	/**
	 * Create the frame.
	 */
	public FirstWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 830, 574);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(44, 39, 696, 456);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel MainMenu = new JPanel();
		MainMenu.setBackground(new Color(128, 0, 0));
		layeredPane.add(MainMenu, "name_192832522917900");
		MainMenu.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("order a pizza");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(base);
			}
		});
		btnNewButton_1.setBounds(287, 144, 137, 28);
		MainMenu.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("order menu");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(orderMenu);
			}
		});
		btnNewButton_1_1.setBounds(287, 183, 137, 23);
		MainMenu.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_3 = new JButton("close");
		btnNewButton_1_3.setBounds(287, 217, 137, 28);
		MainMenu.add(btnNewButton_1_3);
		
		base = new JPanel();
		base.setBackground(new Color(128, 0, 0));
		layeredPane.add(base, "base");
		base.setLayout(null);
		
		JRadioButton rdbtnSize1 = new JRadioButton("20 cm");
		rdbtnSize1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnSize1.isSelected()) {
					pizzaSize.setIcon(new ImageIcon(FirstWindow.class.getResource("/resources/smallpizza.png")));
				}
			}
		});
		rdbtnSize1.setBounds(62, 70, 109, 23);
		base.add(rdbtnSize1);
		
		JRadioButton rdbtnSize2 = new JRadioButton("25 cm");
		rdbtnSize2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnSize2.isSelected()) {
					pizzaSize.setIcon(new ImageIcon(FirstWindow.class.getResource("/resources/midpizza.png")));
				}
			}
		});
		rdbtnSize2.setBounds(62, 108, 109, 23);
		base.add(rdbtnSize2);
		
		JRadioButton rdbtnSize3 = new JRadioButton("30 cm");
		rdbtnSize3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnSize3.isSelected()) {
					pizzaSize.setIcon(new ImageIcon(FirstWindow.class.getResource("/resources/bigpizza.png")));
				}
			}
		});
		rdbtnSize3.setSelected(true);
		rdbtnSize3.setBounds(62, 146, 109, 23);
		base.add(rdbtnSize3);
		
		ButtonGroup sizes = new ButtonGroup();
		sizes.add(rdbtnSize1);
		sizes.add(rdbtnSize2);
		sizes.add(rdbtnSize3);
		
		pizzaSize = new JLabel("");
		pizzaSize.setIcon(new ImageIcon(FirstWindow.class.getResource("/resources/bigpizza.png")));
		
		pizzaSize.setBounds(377, 11, 250, 412);
		base.add(pizzaSize);
		
		topings = new JPanel();
		topings.setBackground(new Color(128, 0, 0));
		layeredPane.add(topings, "name_192902037109000");
		topings.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(45, 40, 97, 23);
		topings.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1.setBounds(45, 88, 97, 23);
		topings.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("New check box");
		chckbxNewCheckBox_2.setBounds(45, 135, 97, 23);
		topings.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("New check box");
		chckbxNewCheckBox_3.setBounds(45, 183, 97, 23);
		topings.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("New check box");
		chckbxNewCheckBox_4.setBounds(45, 235, 97, 23);
		topings.add(chckbxNewCheckBox_4);
		
		adress = new JPanel();
		adress.setBackground(new Color(128, 0, 0));
		layeredPane.add(adress, "name_192904821809100");
		adress.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(39, 40, 86, 20);
		adress.add(textField);
		textField.setColumns(10);
		
		payment = new JPanel();
		payment.setBackground(new Color(128, 0, 0));
		layeredPane.add(payment, "name_192907103259700");
		payment.setLayout(null);
		
		delivery = new JPanel();
		delivery.setBackground(new Color(128, 0, 0));
		layeredPane.add(delivery, "name_192915464996200");
		delivery.setLayout(null);
		
		orderMenu = new JPanel();
		orderMenu.setBackground(new Color(128, 0, 0));
		layeredPane.add(orderMenu, "name_86941943583000");
		orderMenu.setLayout(null);
		
		JCheckBox food1 = new JCheckBox("lobster");
		food1.setBounds(52, 131, 97, 23);
		orderMenu.add(food1);
		
		JCheckBox food2 = new JCheckBox("sandwich");
		food2.setBounds(287, 131, 97, 23);
		orderMenu.add(food2);
		
		JCheckBox food3 = new JCheckBox("burger");
		food3.setBounds(519, 131, 97, 23);
		orderMenu.add(food3);
		
		JCheckBox food4 = new JCheckBox("lasagna");
		food4.setBounds(52, 304, 97, 23);
		orderMenu.add(food4);
		
		JCheckBox food5 = new JCheckBox("sushi");
		food5.setBounds(287, 304, 97, 23);
		orderMenu.add(food5);
		
		JCheckBox food6 = new JCheckBox("New check box");
		food6.setBounds(519, 304, 97, 23);
		orderMenu.add(food6);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(FirstWindow.class.getResource("/resources/sandwich.png")));
		lblNewLabel.setBounds(287, 25, 104, 100);
		orderMenu.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(FirstWindow.class.getResource("/resources/lobster.png")));
		lblNewLabel_1.setBounds(10, 11, 164, 119);
		orderMenu.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(FirstWindow.class.getResource("/resources/burger.png")));
		lblNewLabel_2.setBounds(499, 25, 117, 99);
		orderMenu.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(FirstWindow.class.getResource("/resources/lasagna.png")));
		lblNewLabel_3.setBounds(52, 194, 104, 100);
		orderMenu.add(lblNewLabel_3);
	}
}
