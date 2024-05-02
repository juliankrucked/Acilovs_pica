package lvt;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;
import javax.swing.border.*;

public class FirstWindow extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLayeredPane layeredPane;
    private JPanel base;
    private JPanel toppings;
    private JPanel address;
    private JPanel payment;
    private JPanel delivery;
    private JTextField textField;
    private JLabel pizzaSize;
    private JPanel orderMenu;
    private JButton btnNewButton;
    private JTextField txtToppings;
    private JTextField txtAcilovsPizzeria;
    private JTextField txtBaseSize;
    private JTextField txtAddress;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField txtCity;
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
    private JCheckBox chckbxNewCheckBox;
    private JCheckBox chckbxNewCheckBox_1;
    private JCheckBox chckbxNewCheckBox_2;
    private JCheckBox chckbxNewCheckBox_3;
    private JCheckBox chckbxNewCheckBox_4;

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

    public void switchPanels(JPanel panel) {
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

        JButton btnNewButton_1 = new JButton("Order a pizza");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPanels(base);
            }
        });
        btnNewButton_1.setBounds(287, 144, 137, 28);
        MainMenu.add(btnNewButton_1);

        JButton btnNewButton_1_1 = new JButton("Order menu");
        btnNewButton_1_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPanels(orderMenu);
            }
        });
        btnNewButton_1_1.setBounds(287, 183, 137, 23);
        MainMenu.add(btnNewButton_1_1);

        btnNewButton_1_2 = new JButton("Close");
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
                if (rdbtnSize1.isSelected()) {
                    pizzaSize.setIcon(new ImageIcon(FirstWindow.class.getResource("/resources/smallpizza.png")));
                }
            }
        });
        rdbtnSize1.setBounds(62, 70, 109, 23);
        base.add(rdbtnSize1);

        JRadioButton rdbtnSize2 = new JRadioButton("25 cm");
        rdbtnSize2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (rdbtnSize2.isSelected()) {
                    pizzaSize.setIcon(new ImageIcon(FirstWindow.class.getResource("/resources/midpizza.png")));
                }
            }
        });
        rdbtnSize2.setBounds(62, 108, 109, 23);
        base.add(rdbtnSize2);

        JRadioButton rdbtnSize3 = new JRadioButton("30 cm");
        rdbtnSize3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (rdbtnSize3.isSelected()) {
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

        chckbxNewCheckBox = new JCheckBox("Shrimps");
        chckbxNewCheckBox.setBounds(45, 100, 97, 23);
        toppings.add(chckbxNewCheckBox);

        chckbxNewCheckBox_1 = new JCheckBox("Olives");
        chckbxNewCheckBox_1.setBounds(45, 140, 97, 23);
        toppings.add(chckbxNewCheckBox_1);

        chckbxNewCheckBox_2 = new JCheckBox("Salami");
        chckbxNewCheckBox_2.setBounds(45, 180, 97, 23);
        toppings.add(chckbxNewCheckBox_2);

        chckbxNewCheckBox_3 = new JCheckBox("Shampinions");
        chckbxNewCheckBox_3.setBounds(45, 220, 97, 23);
        toppings.add(chckbxNewCheckBox_3);

        chckbxNewCheckBox_4 = new JCheckBox("Pineapple");
        chckbxNewCheckBox_4.setBounds(45, 260, 97, 23);
        toppings.add(chckbxNewCheckBox_4);

        txtToppings = new JTextField();
        txtToppings.setEditable(false);
        txtToppings.setHorizontalAlignment(SwingConstants.CENTER);
        txtToppings.setText("Toppings");
        txtToppings.setBounds(292, 11, 86, 20);
        toppings.add(txtToppings);
        txtToppings.setColumns(10);

        JButton btnNewButton_2_1 = new JButton("Continue");
        btnNewButton_2_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get selected size
                String size = "";
                if (rdbtnSize1.isSelected()) {
                    size = "20 cm";
                } else if (rdbtnSize2.isSelected()) {
                    size = "25 cm";
                } else if (rdbtnSize3.isSelected()) {
                    size = "30 cm";
                }

                // Get selected toppings
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

                // Write order details to CSV
                writeOrderToCSV(size, toppings);

                switchPanels(address);
            }
        });
        btnNewButton_2_1.setBounds(38, 388, 89, 23);
        toppings.add(btnNewButton_2_1);

        address = new JPanel();
        address.setBackground(new Color(128, 0, 0));
        layeredPane.add(address, "name_192963529625100");
        address.setLayout(null);

        txtAddress = new JTextField();
        txtAddress.setEditable(false);
        txtAddress.setHorizontalAlignment(SwingConstants.CENTER);
        txtAddress.setText("Address");
        txtAddress.setBounds(287, 11, 86, 20);
        address.add(txtAddress);
        txtAddress.setColumns(10);

        txtCity = new JTextField();
        txtCity.setText("City");
        txtCity.setBounds(45, 97, 86, 20);
        address.add(txtCity);
        txtCity.setColumns(10);

        txtStreet = new JTextField();
        txtStreet.setText("Street");
        txtStreet.setBounds(45, 138, 86, 20);
        address.add(txtStreet);
        txtStreet.setColumns(10);

        txtHomeNr = new JTextField();
        txtHomeNr.setText("Home Nr");
        txtHomeNr.setBounds(45, 179, 86, 20);
        address.add(txtHomeNr);
        txtHomeNr.setColumns(10);

        JButton btnNewButton_1_2_1 = new JButton("Continue");
        btnNewButton_1_2_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPanels(payment);
            }
        });
        btnNewButton_1_2_1.setBounds(33, 384, 89, 23);
        address.add(btnNewButton_1_2_1);

        payment = new JPanel();
        payment.setBackground(new Color(128, 0, 0));
        layeredPane.add(payment, "name_194062920578500");
        payment.setLayout(null);

        JButton btnNewButton_1_2_2 = new JButton("Continue");
        btnNewButton_1_2_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPanels(delivery);
            }
        });
        btnNewButton_1_2_2.setBounds(33, 384, 89, 23);
        payment.add(btnNewButton_1_2_2);

        delivery = new JPanel();
        delivery.setBackground(new Color(128, 0, 0));
        layeredPane.add(delivery, "name_194226052478200");
        delivery.setLayout(null);

        JButton btnNewButton_1_2_3 = new JButton("Back to main menu");
        btnNewButton_1_2_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPanels(MainMenu);
            }
        });
        btnNewButton_1_2_3.setBounds(33, 384, 155, 23);
        delivery.add(btnNewButton_1_2_3);

        JButton btnNewButton_1_2_4 = new JButton("Exit");
        btnNewButton_1_2_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(ABORT);
            }
        });
        btnNewButton_1_2_4.setBounds(286, 384, 155, 23);
        delivery.add(btnNewButton_1_2_4);

        orderMenu = new JPanel();
        orderMenu.setBackground(new Color(128, 0, 0));
        layeredPane.add(orderMenu, "name_194393843972600");
        orderMenu.setLayout(null);

        btnNewButton = new JButton("Return");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPanels(MainMenu);
            }
        });
        btnNewButton.setBounds(313, 387, 89, 23);
        orderMenu.add(btnNewButton);

        txtAcilovsPizzeria = new JTextField();
        txtAcilovsPizzeria.setEditable(false);
        txtAcilovsPizzeria.setHorizontalAlignment(SwingConstants.CENTER);
        txtAcilovsPizzeria.setText("Acilov's Pizzeria");
        txtAcilovsPizzeria.setBounds(240, 28, 220, 20);
        orderMenu.add(txtAcilovsPizzeria);
        txtAcilovsPizzeria.setColumns(10);

        JButton btnNewButton_1_3 = new JButton("Order a pizza");
        btnNewButton_1_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPanels(base);
            }
        });
        btnNewButton_1_3.setBounds(300, 141, 121, 28);
        orderMenu.add(btnNewButton_1_3);

        JButton btnNewButton_1_1_1 = new JButton("Exit");
        btnNewButton_1_1_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(ABORT);
            }
        });
        btnNewButton_1_1_1.setBounds(300, 177, 121, 23);
        orderMenu.add(btnNewButton_1_1_1);

        textField = new JTextField();
        textField.setBounds(192, 290, 269, 33);
        orderMenu.add(textField);
        textField.setColumns(10);

        txtName = new JTextField();
        txtName.setEditable(false);
        txtName.setHorizontalAlignment(SwingConstants.CENTER);
        txtName.setText("Name");
        txtName.setBounds(126, 290, 56, 20);
        orderMenu.add(txtName);
        txtName.setColumns(10);

        txtSurname = new JTextField();
        txtSurname.setHorizontalAlignment(SwingConstants.CENTER);
        txtSurname.setText("Surname");
        txtSurname.setBounds(471, 290, 63, 20);
        orderMenu.add(txtSurname);
        txtSurname.setColumns(10);

        txtCreditCardNr = new JTextField();
        txtCreditCardNr.setHorizontalAlignment(SwingConstants.CENTER);
        txtCreditCardNr.setText("Credit Card Nr");
        txtCreditCardNr.setBounds(126, 334, 112, 20);
        orderMenu.add(txtCreditCardNr);
        txtCreditCardNr.setColumns(10);

        txtPhoneNr = new JTextField();
        txtPhoneNr.setHorizontalAlignment(SwingConstants.CENTER);
        txtPhoneNr.setText("Phone Nr");
        txtPhoneNr.setBounds(330, 334, 131, 20);
        orderMenu.add(txtPhoneNr);
        txtPhoneNr.setColumns(10);

        txtCvc = new JTextField();
        txtCvc.setHorizontalAlignment(SwingConstants.CENTER);
        txtCvc.setText("CVC");
        txtCvc.setBounds(471, 334, 63, 20);
        orderMenu.add(txtCvc);
        txtCvc.setColumns(10);

        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon(FirstWindow.class.getResource("/resources/pizzalogo.png")));
        lblNewLabel.setBounds(0, 0, 696, 437);
        orderMenu.add(lblNewLabel);
    }

    // Method to write order details to CSV
    private void writeOrderToCSV(String size, String toppings) {
        String csvFile = "order.csv";
        try (FileWriter writer = new FileWriter(csvFile)) {
            writer.append("Size");
            writer.append(",");
            writer.append("Toppings");
            writer.append("\n");

            writer.append(size);
            writer.append(",");
            writer.append(toppings);
            writer.append("\n");

            System.out.println("Order details written to CSV successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
