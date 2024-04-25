package lvt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.ScrollPane;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;
import java.awt.CardLayout;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class FirstWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(44, 41, 695, 454);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		layeredPane.add(panel, "name_192832522917900");
		
		JPanel panel_1 = new JPanel();
		layeredPane.add(panel_1, "name_192898624794400");
		
		JPanel panel_2 = new JPanel();
		layeredPane.add(panel_2, "name_192902037109000");
		
		JPanel panel_3 = new JPanel();
		layeredPane.add(panel_3, "name_192904821809100");
		
		JPanel panel_4 = new JPanel();
		layeredPane.add(panel_4, "name_192907103259700");
		
		JPanel panel_5 = new JPanel();
		layeredPane.add(panel_5, "name_192915464996200");
		
		JPanel panel_6 = new JPanel();
		layeredPane.add(panel_6, "name_192918410429800");
	}
}
