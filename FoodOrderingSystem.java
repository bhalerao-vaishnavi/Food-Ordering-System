import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class FoodOrderingSystem {

	private JFrame frame;
	private JTable Table;
	private JTextField jtxtTax;
	private JTextField jtxtSubTotal;
	private JTextField jtxtTotal;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FoodOrderingSystem window = new FoodOrderingSystem();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FoodOrderingSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	//==========================================================Functions======================================================================================
	public void ItemCost()
	{
	double sum = 0;
	double tax = 10;
		
	for ( int i = 0; i < Table.getRowCount(); i++)
	{
		sum = sum + Double.parseDouble(Table.getValueAt(i, 2).toString());
	}

	    jtxtSubTotal.setText(Double.toString(sum));
	    double cTotal = Double.parseDouble(jtxtSubTotal.getText());
	    
        double cTax = (cTotal *tax)	/100;
        String iTaxTotal = String.format("₹ %.2f", cTax);
        jtxtTax.setText(iTaxTotal);
	
        String iSubTotal = String.format("₹ %.2f", cTotal);
        jtxtSubTotal.setText(iSubTotal);
        
        String iTotal = String.format("₹ %.2f", cTotal + cTax);
        jtxtTotal.setText(iTotal);
	
	}

	
	//==========================================================Functions======================================================================================
	
	
	
	
	
	//==========================================================Functions======================================================================================
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1450, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(340, 10, 1015, 512);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton jbtnIdli = new JButton("");
		jbtnIdli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem= 60;
				DefaultTableModel model=(DefaultTableModel) Table.getModel();
				model.addRow(new Object[] {"Idli", "1",PriceOfItem});
				ItemCost();
			}
		});
		jbtnIdli.setIcon(new ImageIcon("C:\\FoodOrderingSystem\\veg\\Idli.jfif"));
		jbtnIdli.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnIdli.setBounds(10, 25, 140, 124);
		panel_1.add(jbtnIdli);
		
		JButton jbtnMedu = new JButton("");
		jbtnMedu.setIcon(new ImageIcon("C:\\FoodOrderingSystem\\veg\\Medu.jfif"));
		jbtnMedu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem= 70;
				DefaultTableModel model=(DefaultTableModel) Table.getModel();
				model.addRow(new Object[] {"Medu Vada", "1",PriceOfItem});
				ItemCost();
			}
		});
		jbtnMedu.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnMedu.setBounds(10, 185, 140, 124);
		panel_1.add(jbtnMedu);
		
		JButton jbtnDosa = new JButton("");
		jbtnDosa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem= 90;
				DefaultTableModel model=(DefaultTableModel) Table.getModel();
				model.addRow(new Object[] {"Dosa", "1",PriceOfItem});
				ItemCost();
			}
		});
		jbtnDosa.setIcon(new ImageIcon("C:\\FoodOrderingSystem\\veg\\dosa.jfif"));
		jbtnDosa.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnDosa.setBounds(10, 345, 140, 124);
		panel_1.add(jbtnDosa);
		
		JButton btnNewButton_1_1_6 = new JButton("");
		btnNewButton_1_1_6.setFont(new Font("Tahoma", Font.BOLD, 48));
		btnNewButton_1_1_6.setBounds(1108, 10, 141, 162);
		panel_1.add(btnNewButton_1_1_6);
		
		JButton btnNewButton_1_1_1_4 = new JButton("");
		btnNewButton_1_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 48));
		btnNewButton_1_1_1_4.setBounds(1108, 182, 141, 153);
		panel_1.add(btnNewButton_1_1_1_4);
		
		JButton btnNewButton_1_1_2_4 = new JButton("");
		btnNewButton_1_1_2_4.setFont(new Font("Tahoma", Font.BOLD, 48));
		btnNewButton_1_1_2_4.setBounds(1108, 345, 141, 157);
		panel_1.add(btnNewButton_1_1_2_4);
		
		JButton jbtnBurger = new JButton("");
		jbtnBurger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem= 120;
				DefaultTableModel model=(DefaultTableModel) Table.getModel();
				model.addRow(new Object[] {"Burger", "1",PriceOfItem});
				ItemCost();
			}
		});
		jbtnBurger.setIcon(new ImageIcon("C:\\FoodOrderingSystem\\veg\\Burger.jfif"));
		jbtnBurger.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnBurger.setBounds(175, 25, 140, 124);
		panel_1.add(jbtnBurger);
		
		JButton jbtnFrenchFries = new JButton("");
		jbtnFrenchFries.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				double PriceOfItem= 90;
				DefaultTableModel model=(DefaultTableModel) Table.getModel();
				model.addRow(new Object[] {"FrenchFries", "1",PriceOfItem});
				ItemCost();
				
			}
		});
		jbtnFrenchFries.setIcon(new ImageIcon("C:\\FoodOrderingSystem\\veg\\FrenchFries.jfif"));
		jbtnFrenchFries.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnFrenchFries.setBounds(175, 185, 140, 124);
		panel_1.add(jbtnFrenchFries);
		
		JButton jbtnParatha = new JButton("");
		jbtnParatha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem= 75;
				DefaultTableModel model=(DefaultTableModel) Table.getModel();
				model.addRow(new Object[] {"Paratha", "1",PriceOfItem});
				ItemCost();
				
			}
		});
		jbtnParatha.setIcon(new ImageIcon("C:\\FoodOrderingSystem\\veg\\Paratha.jfif"));
		jbtnParatha.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnParatha.setBounds(175, 345, 140, 124);
		panel_1.add(jbtnParatha);
		
		JButton jbtnMomosVeg = new JButton("");
		jbtnMomosVeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem= 80;
				DefaultTableModel model=(DefaultTableModel) Table.getModel();
				model.addRow(new Object[] {"Veg Momos", "1",PriceOfItem});
				ItemCost();
			}
		});
		jbtnMomosVeg.setIcon(new ImageIcon("C:\\FoodOrderingSystem\\veg\\MomosVeg.jfif"));
		jbtnMomosVeg.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnMomosVeg.setBounds(341, 25, 140, 124);
		panel_1.add(jbtnMomosVeg);
		
		JButton jbtnVadaPav = new JButton("");
		jbtnVadaPav.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem= 20;
				DefaultTableModel model=(DefaultTableModel) Table.getModel();
				model.addRow(new Object[] {"Vada Pav", "1",PriceOfItem});
				ItemCost();
			}
		});
		jbtnVadaPav.setIcon(new ImageIcon("C:\\FoodOrderingSystem\\veg\\VadaPav.jfif"));
		jbtnVadaPav.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnVadaPav.setBounds(341, 185, 140, 124);
		panel_1.add(jbtnVadaPav);
		
		JButton jbtnUpma = new JButton("");
		jbtnUpma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem= 40;
				DefaultTableModel model=(DefaultTableModel) Table.getModel();
				model.addRow(new Object[] {"Upma", "1",PriceOfItem});
				ItemCost();
			}
		});
		jbtnUpma.setIcon(new ImageIcon("C:\\FoodOrderingSystem\\veg\\Upma.jfif"));
		jbtnUpma.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnUpma.setBounds(341, 345, 140, 124);
		panel_1.add(jbtnUpma);
		
		JButton jbtnPizza = new JButton("");
		jbtnPizza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem= 135;
				DefaultTableModel model=(DefaultTableModel) Table.getModel();
				model.addRow(new Object[] {"Pizza", "1",PriceOfItem});
				ItemCost();
			}
		});
		jbtnPizza.setIcon(new ImageIcon("C:\\FoodOrderingSystem\\veg\\Pizza.jfif"));
		jbtnPizza.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnPizza.setBounds(508, 25, 140, 124);
		panel_1.add(jbtnPizza);
		
		JButton jbtnSamosa = new JButton("");
		jbtnSamosa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem= 20;
				DefaultTableModel model=(DefaultTableModel) Table.getModel();
				model.addRow(new Object[] {"Samosa", "1",PriceOfItem});
				ItemCost();
			}
		});
		jbtnSamosa.setIcon(new ImageIcon("C:\\FoodOrderingSystem\\veg\\Samosa.jfif"));
		jbtnSamosa.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnSamosa.setBounds(508, 185, 140, 124);
		panel_1.add(jbtnSamosa);
		
		JButton jbtnPaniPuri = new JButton("");
		jbtnPaniPuri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem= 40;
				DefaultTableModel model=(DefaultTableModel) Table.getModel();
				model.addRow(new Object[] {"PaniPuri", "1",PriceOfItem});
				ItemCost();
			}
		});
		jbtnPaniPuri.setIcon(new ImageIcon("C:\\FoodOrderingSystem\\veg\\PaniPuri.jfif"));
		jbtnPaniPuri.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnPaniPuri.setBounds(508, 345, 140, 124);
		panel_1.add(jbtnPaniPuri);
		
		JButton jbtnPulav = new JButton("");
		jbtnPulav.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem= 160;
				DefaultTableModel model=(DefaultTableModel) Table.getModel();
				model.addRow(new Object[] {"Pulav", "1",PriceOfItem});
				ItemCost();
			}
			
		});
		jbtnPulav.setIcon(new ImageIcon("C:\\FoodOrderingSystem\\veg\\Pulav.jfif"));
		jbtnPulav.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnPulav.setBounds(674, 25, 140, 124);
		panel_1.add(jbtnPulav);
		
		JButton jbtnDhokla = new JButton("");
		jbtnDhokla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem= 40;
				DefaultTableModel model=(DefaultTableModel) Table.getModel();
				model.addRow(new Object[] {"Dhokla", "1",PriceOfItem});
				ItemCost();
			}
		});
		jbtnDhokla.setIcon(new ImageIcon("C:\\FoodOrderingSystem\\veg\\Dhokla.jfif"));
		jbtnDhokla.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnDhokla.setBounds(674, 185, 140, 124);
		panel_1.add(jbtnDhokla);
		
		JButton jbtnPavBhaji = new JButton("");
		jbtnPavBhaji.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem= 125;
				DefaultTableModel model=(DefaultTableModel) Table.getModel();
				model.addRow(new Object[] {"Pav Bhaji", "1",PriceOfItem});
				ItemCost();
			}
		});
		jbtnPavBhaji.setIcon(new ImageIcon("C:\\FoodOrderingSystem\\veg\\PavBhaji.jfif"));
		jbtnPavBhaji.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnPavBhaji.setBounds(674, 345, 140, 124);
		panel_1.add(jbtnPavBhaji);
		
		JButton jbtnFrenkie = new JButton("");
		jbtnFrenkie.setIcon(new ImageIcon("C:\\FoodOrderingSystem\\veg\\Frenkie.jfif"));
		jbtnFrenkie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem= 40;
				DefaultTableModel model=(DefaultTableModel) Table.getModel();
				model.addRow(new Object[] {"Frankie", "1",PriceOfItem});
				ItemCost();
			}
		});
		jbtnFrenkie.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnFrenkie.setBounds(842, 25, 140, 124);
		panel_1.add(jbtnFrenkie);
		
		JButton jbtnFriedRice = new JButton("");
		jbtnFriedRice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem= 130;
				DefaultTableModel model=(DefaultTableModel) Table.getModel();
				model.addRow(new Object[] {"Fried Rice", "1",PriceOfItem});
				ItemCost();
			}
		});
		jbtnFriedRice.setIcon(new ImageIcon("C:\\FoodOrderingSystem\\veg\\FriedRice.jfif"));
		jbtnFriedRice.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnFriedRice.setBounds(842, 185, 140, 124);
		panel_1.add(jbtnFriedRice);
		
		JButton jbtnPaneerChilly = new JButton("");
		jbtnPaneerChilly.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem= 94;
				DefaultTableModel model=(DefaultTableModel) Table.getModel();
				model.addRow(new Object[] {"Paneer Chilly", "1",PriceOfItem});
				ItemCost();
			}
		});
		jbtnPaneerChilly.setIcon(new ImageIcon("C:\\FoodOrderingSystem\\veg\\PannerChilly.jfif"));
		jbtnPaneerChilly.setFont(new Font("Tahoma", Font.BOLD, 48));
		jbtnPaneerChilly.setBounds(842, 345, 140, 124);
		panel_1.add(jbtnPaneerChilly);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(10, 532, 1300, 221);
		frame.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(10, 10, 401, 201);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tax");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(23, 26, 82, 29);
		panel_3.add(lblNewLabel);
		
		jtxtTax = new JTextField();
		jtxtTax.setBounds(194, 26, 186, 29);
		panel_3.add(jtxtTax);
		jtxtTax.setColumns(10);
		
		JLabel lblSubtotal = new JLabel("SubTotal");
		lblSubtotal.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblSubtotal.setBounds(23, 79, 130, 29);
		panel_3.add(lblSubtotal);
		
		jtxtSubTotal = new JTextField();
		jtxtSubTotal.setColumns(10);
		jtxtSubTotal.setBounds(194, 79, 186, 29);
		panel_3.add(jtxtSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTotal.setBounds(23, 136, 82, 29);
		panel_3.add(lblTotal);
		
		jtxtTotal = new JTextField();
		jtxtTotal.setColumns(10);
		jtxtTotal.setBounds(194, 136, 186, 29);
		panel_3.add(jtxtTotal);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setLayout(null);
		panel_3_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3_2.setBounds(466, 10, 824, 201);
		panel_2.add(panel_3_2);
		
		JButton jbtnPay = new JButton("Pay");
		jbtnPay.setFont(new Font("Tahoma", Font.BOLD, 24));
		jbtnPay.setBounds(10, 10, 173, 86);
		panel_3_2.add(jbtnPay);
		
		JButton jbtnPrint = new JButton("Print");
		jbtnPrint.setFont(new Font("Tahoma", Font.BOLD, 24));
		jbtnPrint.setBounds(193, 10, 173, 86);
		panel_3_2.add(jbtnPrint);
		
		JButton jbtnReset = new JButton("Reset");
		jbtnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				jtxtTax.setText(null); 
				jtxtSubTotal.setText(null);
				jtxtTotal.setText(null);
				
				DefaultTableModel RecordTable = (DefaultTableModel) Table.getModel();
				RecordTable.setRowCount(0);
				
				
			}
		});
		jbtnReset.setFont(new Font("Tahoma", Font.BOLD, 24));
		jbtnReset.setBounds(384, 10, 173, 86);
		panel_3_2.add(jbtnReset);
		
		JButton jbtnRemove = new JButton("Remove Item");
		jbtnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				DefaultTableModel model = (DefaultTableModel) Table.getModel();
				
				int RemoveItem = Table.getSelectedRow();
				if(RemoveItem >= 0)
				{
					model.removeRow(RemoveItem);
					
				}
				
				ItemCost();
				
				
				
				
				
				
			}
		});
		jbtnRemove.setFont(new Font("Tahoma", Font.BOLD, 24));
		jbtnRemove.setBounds(32, 106, 269, 86);
		panel_3_2.add(jbtnRemove);
		
		JButton jbtnExit = new JButton("Exit");
		jbtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Thank You",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
				
				
				
			}
		});
		jbtnExit.setFont(new Font("Tahoma", Font.BOLD, 24));
		jbtnExit.setBounds(326, 105, 269, 86);
		panel_3_2.add(jbtnExit);
		
		JScrollPane JscrollPane = new JScrollPane();
		JscrollPane.setBounds(10, 10, 332, 512);
		frame.getContentPane().add(JscrollPane);
		
		Table = new JTable();
		Table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Items", "Qty", "Amount"
			}
		));
		Table.getColumnModel().getColumn(0).setPreferredWidth(125);
		Table.getColumnModel().getColumn(0).setMinWidth(125);
		Table.getColumnModel().getColumn(1).setPreferredWidth(60);
		JscrollPane.setViewportView(Table);
	}
}
