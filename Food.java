import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Food extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	// public void fullSupport(String[] args) {
    //     try {
    //         Food frame = new Food();
    //         frame.setVisible(true);
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
	// 	 EventQueue.invokeLater(new Runnable() {
	// 	 	public void run() {
	// 	 		try {
	// 				Food frame = new Food();
	// 				frame.setVisible(true);
	// 	 		} catch (Exception e) {
	// 	 			e.printStackTrace();
	// 	 		}
	// 	 	}
	// 	 });
	// }

	/**
	 * Create the frame.
	 */
	 Food() {
        setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 777, 565);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("VEG");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FoodOrderingSystem nw=new FoodOrderingSystem();
				nw.NewScreen();
							
			}
		});
		btnNewButton.setBounds(255, 70, 215, 78);
		contentPane.add(btnNewButton);
		
		JButton btnNonVeg = new JButton("NON VEG");
		btnNonVeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FoodOrderingSystemNew ni=new FoodOrderingSystemNew();
				ni.NewScreen2();			
			}
		});
		btnNonVeg.setBounds(255, 209, 215, 78);
		contentPane.add(btnNonVeg);
		
		JButton btnNewButton_1_1 = new JButton("SWEETS");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FoodOrderingSystemSweet no=new FoodOrderingSystemSweet();
				no.NewScreen3();
			}
		});
		btnNewButton_1_1.setBounds(255, 349, 215, 78);
		contentPane.add(btnNewButton_1_1);
		
		JLabel lblNewLabel = new JLabel("FOOD ITEMS");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setBounds(265, 10, 250, 30);
		contentPane.add(lblNewLabel);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
