package lvt;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

public class FirstWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLayeredPane layeredPane;
	private JPanel base;
	private JPanel toppings;
	private JPanel adress;
	private JPanel payment;
	private JPanel delivery;
	private JTextField city;
	private JLabel pizzaSize;
	private JPanel orderMenu;
	private JButton btnNewButton;
	private JTextField txtTopings;
	private JTextField txtAcilovsPizzeria;
	private JTextField txtBaseSize;
	private JTextField txtAdress;
	private JTextField street;
	private JTextField HouseNr;
	private JTextField txtCountry;
	private JTextField txtStreet;
	private JTextField txtHomeNr;
	private JButton btnNewButton_1_2;
	private JTextField Name;
	private JTextField surname;
	private JTextField CreditInfo;
	private JTextField PhoneNr;
	private JTextField CVC;
	private JTextField txtName;
	private JTextField txtSurname;
	private JTextField txtCreditCardNr;
	private JTextField txtPhoneNr;
	private JTextField txtCvc;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxNewCheckBox_2;
	private JCheckBox chckbxNewCheckBox_3;
	private JCheckBox chckbxNewCheckBox_4;
	private JCheckBox food1;
	private JCheckBox food2;
	private JCheckBox food3;
	private JCheckBox food4;
	private JCheckBox food5;
	private JCheckBox food6;
	private String foodStr="";

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
		
		chckbxNewCheckBox = new JCheckBox("shrimps");
		chckbxNewCheckBox.setBounds(45, 100, 97, 23);
		toppings.add(chckbxNewCheckBox);
		
		chckbxNewCheckBox_1 = new JCheckBox("olives");
		chckbxNewCheckBox_1.setBounds(45, 140, 97, 23);
		toppings.add(chckbxNewCheckBox_1);
		
		chckbxNewCheckBox_2 = new JCheckBox("salami");
		chckbxNewCheckBox_2.setBounds(45, 186, 97, 23);
		toppings.add(chckbxNewCheckBox_2);
		
		chckbxNewCheckBox_3 = new JCheckBox("shampinions");
		chckbxNewCheckBox_3.setBounds(45, 232, 97, 23);
		toppings.add(chckbxNewCheckBox_3);
		
		chckbxNewCheckBox_4 = new JCheckBox("pineapple");
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
				 String size = "";
                if (rdbtnSize1.isSelected()) {
                    size = "20 cm";
                } else if (rdbtnSize2.isSelected()) {
                    size = "25 cm";
                } else if (rdbtnSize3.isSelected()) {
                    size = "30 cm";
                }

                StringBuilder selectedToppings = new StringBuilder();
                if (chckbxNewCheckBox.isSelected()) {
                    selectedToppings.append("Shrimps, ");
                }
                if (chckbxNewCheckBox_1.isSelected()) {
                    selectedToppings.append("Olives, ");
                }
                if (chckbxNewCheckBox_2.isSelected()) {
                    selectedToppings.append("Salami, ");
                }
                if (chckbxNewCheckBox_3.isSelected()) {
                    selectedToppings.append("Shampinions, ");
                }
                if (chckbxNewCheckBox_4.isSelected()) {
                    selectedToppings.append("Pineapple, ");
                }
                String toppings = selectedToppings.toString();
                
                WriteOrderToJson(foodStr,size, toppings, city, street, HouseNr, Name, surname, CreditInfo, CVC);
                //String food, String size, String toppings, String city, String street, String HouseNr, String Name, String surname, String CreditInfo, String CVC

                switchPanels(adress);
		    }

			private void WriteOrderToJson(String foodStr, String size, String toppings, JTextField city,
					JTextField street, JTextField houseNr, JTextField name, JTextField surname, JTextField creditInfo,
					JTextField cVC) {
				// TODO Auto-generated method stub
				
			}
				
			}
		);
				
		
		
		btnNewButton_2_1.setBounds(40, 390, 89, 23);
		toppings.add(btnNewButton_2_1);
		
		adress = new JPanel();
		adress.setBackground(new Color(128, 0, 0));
		layeredPane.add(adress, "name_192904821809100");
		adress.setLayout(null);
		
		city = new JTextField();
		city.setBackground(new Color(128, 0, 0));
		city.setBounds(177, 68, 401, 20);
		adress.add(city);
		city.setColumns(10);
		
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
				street.getText();
				city.getText();
				HouseNr.getText();
				
			}
	});
		

		btnNewButton_2_2.setBounds(39, 389, 89, 23);
		adress.add(btnNewButton_2_2);
		
		street = new JTextField();
		street.setBackground(new Color(128, 0, 0));
		street.setColumns(10);
		street.setBounds(177, 116, 401, 20);
		adress.add(street);
		
		HouseNr = new JTextField();
		HouseNr.setBackground(new Color(128, 0, 0));
		HouseNr.setColumns(10);
		HouseNr.setBounds(177, 171, 401, 20);
		adress.add(HouseNr);
		
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
		txtHomeNr.setText("House nr. :");
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
		
		Name = new JTextField();
		Name.setBackground(new Color(128, 0, 0));
		Name.setBounds(147, 65, 133, 20);
		payment.add(Name);
		Name.setColumns(10);
		
		surname = new JTextField();
		surname.setBackground(new Color(128, 0, 0));
		surname.setColumns(10);
		surname.setBounds(147, 113, 133, 20);
		payment.add(surname);
		
		CreditInfo = new JTextField();
		CreditInfo.setBackground(new Color(128, 0, 0));
		CreditInfo.setColumns(10);
		CreditInfo.setBounds(147, 167, 202, 20);
		payment.add(CreditInfo);
		
		PhoneNr = new JTextField();
		PhoneNr.setBackground(new Color(128, 0, 0));
		PhoneNr.setColumns(10);
		PhoneNr.setBounds(147, 229, 152, 20);
		payment.add(PhoneNr);
		
		CVC = new JTextField();
		CVC.setBackground(new Color(128, 0, 0));
		CVC.setColumns(10);
		CVC.setBounds(147, 283, 73, 20);
		payment.add(CVC);
		
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
		
		food1 = new JCheckBox("lobster");
		food1.setBounds(52, 131, 97, 23);
		orderMenu.add(food1);
		
		food2 = new JCheckBox("sandwich");
		food2.setBounds(287, 131, 97, 23);
		orderMenu.add(food2);
		
		food3 = new JCheckBox("burger");
		food3.setBounds(519, 131, 97, 23);
		orderMenu.add(food3);
		
		food4 = new JCheckBox("lasagna");
		food4.setBounds(52, 304, 97, 23);
		orderMenu.add(food4);
		
		food5 = new JCheckBox("sushi");
		food5.setBounds(287, 304, 97, 23);
		orderMenu.add(food5);
		
		food6 = new JCheckBox("steak ");
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
	private void WriteOrderToJson(String foodStr, String size, String toppings, JTextField city,
			JTextField street, JTextField HouseNr, JTextField Name, JTextField surname, JTextField CreditInfo,
			JTextField CVC) {
		StringBuilder selectedfood = new StringBuilder();
        if (food1.isSelected()) {
        	selectedfood.append("lobster, ");
        }
        if (food2.isSelected()) {
        	selectedfood.append("sandwich, ");
        }
        if (food3.isSelected()) {
        	selectedfood.append("Burger, ");
        }
        if (food4.isSelected()) {
        	selectedfood.append("lasagna, ");
        }
        if (food5.isSelected()) {
        	selectedfood.append("sushi, ");
        }
        if (food6.isSelected()) {
        	selectedfood.append("steak, ");
        }
        foodStr = selectedfood.toString();
        
        String csvFile = "order.json";
        try (FileWriter writer = new FileWriter(csvFile)) {
            writer.append("Size");
            writer.append(", ");
            writer.append("Toppings");
            writer.append(", ");
            writer.append("City");
            writer.append(", ");
            writer.append("street");
            writer.append(", ");
            writer.append("House Nr.");
            writer.append(", ");
            writer.append("Name");
            writer.append(", ");
            writer.append("surname");
            writer.append(", ");
            writer.append("credit card Nr.");
            writer.append(", ");
            writer.append("phone Nr.");
            writer.append(", ");
            writer.append("CVC.");
            writer.append("\n");
            writer.append("order menu");
            
            writer.append(size);
            writer.append(",");
            writer.append(toppings);
            writer.append(", ");
            writer.append(city.getText());
            writer.append(",");
            writer.append(street.getText()); 
            writer.append(", ");
            writer.append(HouseNr.getText());
            writer.append(",");
            writer.append(Name.getText()); 
            writer.append(", ");
            writer.append(surname.getText()); 
            writer.append(",");
            writer.append(CreditInfo.getText()); 
            writer.append(", ");
            writer.append(CVC.getText()); 
            writer.append("\n");
            
            System.out.println("Order details written to json successfully!");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
}
    }



