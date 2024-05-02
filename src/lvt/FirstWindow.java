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
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JSpinner;

public class FirstWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLayeredPane layeredPane;
	private JPanel base;
	private JPanel toppings;
	private JPanel adress;
	private JPanel payment;
	private JPanel delivery;
	private JTextField textField;
	private JLabel pizzaSize;
	private JPanel orderMenu;
	private JButton btnNewButton;
	private JTextField txtTopings;
	private JTextField txtAcilovsPizzeria;
	private JTextField txtBaseSize;
	private JTextField txtAdress;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtCountry;
	private JTextField txtStreet;
	private JTextField txtHomeNr;
	private JButton btnNewButton_1_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField txtName;
	private JTextField txtSurname;
	private JTextField txtCreditCardNr;
	private JTextField txtPhoneNr;
	private JTextField txtCvc;

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
		layeredPane.setBounds(44, 58, 696, 437);
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
		
		btnNewButton_1_2 = new JButton("close");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(ABORT);
			}
		});
		btnNewButton_1_2.setBounds(287, 217, 137, 28);
		MainMenu.add(btnNewButton_1_2);
		
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
		
		JButton btnNewButton_2 = new JButton("Continue");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(toppings);
			}
		});
		btnNewButton_2.setBounds(38, 388, 89, 23);
		base.add(btnNewButton_2);
		
		txtBaseSize = new JTextField();
		txtBaseSize.setEditable(false);
		txtBaseSize.setHorizontalAlignment(SwingConstants.CENTER);
		txtBaseSize.setText("Base size");
		txtBaseSize.setBounds(281, 11, 86, 20);
		base.add(txtBaseSize);
		txtBaseSize.setColumns(10);
		
		toppings = new JPanel();
		toppings.setBackground(new Color(128, 0, 0));
		layeredPane.add(toppings, "name_192902037109000");
		toppings.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("shrimps");
		chckbxNewCheckBox.setBounds(45, 100, 97, 23);
		toppings.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("olives");
		chckbxNewCheckBox_1.setBounds(45, 140, 97, 23);
		toppings.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("salami");
		chckbxNewCheckBox_2.setBounds(45, 186, 97, 23);
		toppings.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("shampinions");
		chckbxNewCheckBox_3.setBounds(45, 232, 97, 23);
		toppings.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("pineapple");
		chckbxNewCheckBox_4.setBounds(45, 278, 97, 23);
		toppings.add(chckbxNewCheckBox_4);
		
		txtTopings = new JTextField();
		txtTopings.setEditable(false);
		txtTopings.setHorizontalAlignment(SwingConstants.CENTER);
		txtTopings.setText("Toppings");
		txtTopings.setBounds(281, 11, 86, 20);
		toppings.add(txtTopings);
		txtTopings.setColumns(10);
		
		JButton btnNewButton_2_1 = new JButton("Continue");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(adress);
			}
		});
		btnNewButton_2_1.setBounds(40, 390, 89, 23);
		toppings.add(btnNewButton_2_1);
		
		adress = new JPanel();
		adress.setBackground(new Color(128, 0, 0));
		layeredPane.add(adress, "name_192904821809100");
		adress.setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(128, 0, 0));
		textField.setBounds(177, 68, 401, 20);
		adress.add(textField);
		textField.setColumns(10);
		
		txtAdress = new JTextField();
		txtAdress.setHorizontalAlignment(SwingConstants.CENTER);
		txtAdress.setEditable(false);
		txtAdress.setText("Adress");
		txtAdress.setBounds(280, 11, 86, 20);
		adress.add(txtAdress);
		txtAdress.setColumns(10);
		
		JButton btnNewButton_2_2 = new JButton("Continue");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(payment);
			}
		});
		btnNewButton_2_2.setBounds(39, 389, 89, 23);
		adress.add(btnNewButton_2_2);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(128, 0, 0));
		textField_1.setColumns(10);
		textField_1.setBounds(177, 116, 401, 20);
		adress.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(128, 0, 0));
		textField_2.setColumns(10);
		textField_2.setBounds(177, 171, 401, 20);
		adress.add(textField_2);
		
		txtCountry = new JTextField();
		txtCountry.setBorder(null);
		txtCountry.setEditable(false);
		txtCountry.setForeground(new Color(0, 0, 0));
		txtCountry.setBackground(new Color(128, 0, 0));
		txtCountry.setText("City :");
		txtCountry.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCountry.setColumns(10);
		txtCountry.setBounds(81, 68, 86, 20);
		adress.add(txtCountry);
		
		txtStreet = new JTextField();
		txtStreet.setEditable(false);
		txtStreet.setBackground(new Color(128, 0, 0));
		txtStreet.setHorizontalAlignment(SwingConstants.RIGHT);
		txtStreet.setText("street :");
		txtStreet.setBorder(null);
		txtStreet.setColumns(10);
		txtStreet.setBounds(81, 116, 86, 20);
		adress.add(txtStreet);
		
		txtHomeNr = new JTextField();
		txtHomeNr.setEditable(false);
		txtHomeNr.setHorizontalAlignment(SwingConstants.RIGHT);
		txtHomeNr.setText("Home nr. :");
		txtHomeNr.setBackground(new Color(128, 0, 0));
		txtHomeNr.setBorder(null);
		txtHomeNr.setColumns(10);
		txtHomeNr.setBounds(81, 171, 86, 20);
		adress.add(txtHomeNr);
		
		payment = new JPanel();
		payment.setBackground(new Color(128, 0, 0));
		layeredPane.add(payment, "name_192907103259700");
		payment.setLayout(null);
		
		JButton btnNewButton_2_2_1 = new JButton("Continue");
		btnNewButton_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(delivery);
			}
		});
		btnNewButton_2_2_1.setBounds(40, 389, 89, 23);
		payment.add(btnNewButton_2_2_1);
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(128, 0, 0));
		textField_3.setBounds(147, 65, 133, 20);
		payment.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBackground(new Color(128, 0, 0));
		textField_4.setColumns(10);
		textField_4.setBounds(147, 113, 133, 20);
		payment.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBackground(new Color(128, 0, 0));
		textField_5.setColumns(10);
		textField_5.setBounds(147, 167, 202, 20);
		payment.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBackground(new Color(128, 0, 0));
		textField_6.setColumns(10);
		textField_6.setBounds(147, 229, 152, 20);
		payment.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setBackground(new Color(128, 0, 0));
		textField_7.setColumns(10);
		textField_7.setBounds(147, 283, 73, 20);
		payment.add(textField_7);
		
		txtName = new JTextField();
		txtName.setEditable(false);
		txtName.setBorder(null);
		txtName.setBackground(new Color(128, 0, 0));
		txtName.setHorizontalAlignment(SwingConstants.RIGHT);
		txtName.setText("Name :");
		txtName.setColumns(10);
		txtName.setBounds(52, 65, 86, 20);
		payment.add(txtName);
		
		txtSurname = new JTextField();
		txtSurname.setEditable(false);
		txtSurname.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSurname.setText("Surname :");
		txtSurname.setBackground(new Color(128, 0, 0));
		txtSurname.setBorder(null);
		txtSurname.setColumns(10);
		txtSurname.setBounds(51, 113, 86, 20);
		payment.add(txtSurname);
		
		txtCreditCardNr = new JTextField();
		txtCreditCardNr.setEditable(false);
		txtCreditCardNr.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCreditCardNr.setText("Credit card Nr. :");
		txtCreditCardNr.setBackground(new Color(128, 0, 0));
		txtCreditCardNr.setBorder(null);
		txtCreditCardNr.setColumns(10);
		txtCreditCardNr.setBounds(52, 167, 86, 20);
		payment.add(txtCreditCardNr);
		
		txtPhoneNr = new JTextField();
		txtPhoneNr.setEditable(false);
		txtPhoneNr.setBackground(new Color(128, 0, 0));
		txtPhoneNr.setText("Phone Nr. :");
		txtPhoneNr.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPhoneNr.setBorder(null);
		txtPhoneNr.setColumns(10);
		txtPhoneNr.setBounds(52, 229, 86, 20);
		payment.add(txtPhoneNr);
		
		txtCvc = new JTextField();
		txtCvc.setEditable(false);
		txtCvc.setBackground(new Color(128, 0, 0));
		txtCvc.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCvc.setText("CVC : ");
		txtCvc.setBorder(null);
		txtCvc.setColumns(10);
		txtCvc.setBounds(52, 283, 86, 20);
		payment.add(txtCvc);
		
		delivery = new JPanel();
		delivery.setBackground(new Color(128, 0, 0));
		layeredPane.add(delivery, "name_192915464996200");
		delivery.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(FirstWindow.class.getResource("/resources/end02.png")));
		lblNewLabel_6.setBounds(0, 0, 696, 398);
		delivery.add(lblNewLabel_6);
		
		JButton btnNewButton_1_2_1 = new JButton("Close");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(ABORT);
			}
		});
		btnNewButton_1_2_1.setBounds(270, 398, 137, 28);
		delivery.add(btnNewButton_1_2_1);
		
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
		
		JCheckBox food6 = new JCheckBox("steak ");
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
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(FirstWindow.class.getResource("/resources/sushi.png")));
		lblNewLabel_4.setBounds(267, 197, 117, 100);
		orderMenu.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(FirstWindow.class.getResource("/resources/steak.png")));
		lblNewLabel_5.setBounds(499, 194, 147, 100);
		orderMenu.add(lblNewLabel_5);
		
		btnNewButton = new JButton("check out");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(adress);
			}
		});
		btnNewButton.setBounds(287, 390, 97, 23);
		orderMenu.add(btnNewButton);
		
		txtAcilovsPizzeria = new JTextField();
		txtAcilovsPizzeria.setEnabled(false);
		txtAcilovsPizzeria.setEditable(false);
		txtAcilovsPizzeria.setBackground(new Color(128, 0, 0));
		txtAcilovsPizzeria.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 40));
		txtAcilovsPizzeria.setText("Acilovs pizzeria");
		txtAcilovsPizzeria.setHorizontalAlignment(SwingConstants.CENTER);
		txtAcilovsPizzeria.setBounds(44, 11, 696, 44);
		contentPane.add(txtAcilovsPizzeria);
		txtAcilovsPizzeria.setColumns(10);
	}
}
