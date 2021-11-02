package railways;

//final
import java.awt.Color;
import java.text.DecimalFormat;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import java.awt.Label;

public class TicketGenerator extends CSFrame implements ActionListener {
	
	JFrame jf = new JFrame("Computer Shop");
	
	private JTextField pName;
	private JTextField dob;
	private JTextField ticketCost;
	private JButton btnPrint = new JButton("PRINT");
	private JTextField grandTotal;
	private JComboBox<String> comboBoxFrom = new JComboBox<String>();
	private JRadioButton childB = new JRadioButton("Existing");
	private JRadioButton adultB = new JRadioButton("New");
	private JRadioButton seniorB = new JRadioButton("N/A");
	private JButton btnReset = new JButton("RESET");
	private JButton btnAdd = new JButton("ADD ITEM");

	private JTextArea input5 = new JTextArea();
	private JTextArea input4 = new JTextArea();
	private JTextArea input3 = new JTextArea();
	private JTextArea input2 = new JTextArea();
	private JTextArea input1 = new JTextArea();
	private JButton input3X = new JButton("X");
	private JButton input4X = new JButton("X");
	private JButton input1X = new JButton("X");
	private JButton input5X = new JButton("X");
	private JButton input2X = new JButton("X");
	private JLabel warning = new JLabel("");
	private JLabel lblNoTicketsTo = new JLabel("");
	private JTextArea journeySummary = new JTextArea();
	
	//flag Variables
	
	int input1a = 0;
	int input1c = 0;
	int input1s = 0;
	String input1n = null;
	String input1p = null;
	
	int input2a = 0;
	int input2c = 0;
	int input2s = 0;
	String input2n = null;
	String input2p = null;
	
	int input3a = 0;
	int input3c = 0;
	int input3s = 0;
	String input3n = null;
	String input3p = null;
	
	int input4a = 0;
	int input4c = 0;
	int input4s = 0;
	String input4n = null;
	String input4p = null;
	
	int input5a = 0;
	int input5c = 0;
	int input5s = 0;
	String input5n = null;
	String input5p = null;

	
	String youAre = null;
	String ticketType = "OneWay";
	
	String fileName = null;
	
	
	ButtonGroup you = new ButtonGroup();
	ButtonGroup type = new ButtonGroup();
	
	DecimalFormat df = new DecimalFormat("###.##");
	
	//Start and Finish Variables
	
	int start = 0;
	int stop = 0;

	
	
	
	String ToSelect = null;
	String FromSelect = null;
	
	public TicketGenerator() {
		
		jf.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 20));
		jf.setSize(1531, 822);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.getContentPane().setLayout(null);

		
		
		
		btnPrint.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnPrint.setBounds(1300, 718, 207, 57);
		jf.getContentPane().add(btnPrint);
		
		JLabel lblNewLabel_1_1_2_1_1_1 = new JLabel("Grand Total");
		lblNewLabel_1_1_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_1_2_1_1_1.setBounds(1056, 536, 317, 37);
		jf.getContentPane().add(lblNewLabel_1_1_2_1_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("System Cost (in $)");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_2.setBounds(382, 526, 174, 24);
		jf.getContentPane().add(lblNewLabel_2_2);
		
		
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnReset.setBounds(1048, 718, 232, 57);
		jf.getContentPane().add(btnReset);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(61, 23, 1390, 71);
		jf.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("You are ?");
		lblNewLabel_1_1_1.setBounds(90, 212, 557, 37);
		panel.add(lblNewLabel_1_1_1);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JLabel lblNewLabel = new JLabel("COMPUTER SHOP");
		lblNewLabel.setBounds(456, 10, 434, 55);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD, 50));
		
		JLabel lblNewLabel_1 = new JLabel("Book Your System");
		lblNewLabel_1.setBounds(61, 116, 272, 20);
		jf.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(61, 146, 557, 53);
		jf.getContentPane().add(panel_1);
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setLayout(null);
		
		
		comboBoxFrom.setBackground(Color.WHITE);
		comboBoxFrom.setForeground(new Color(0, 0, 0));
		comboBoxFrom.setBounds(10, 10, 248, 33);
		panel_1.add(comboBoxFrom);
		comboBoxFrom.setFont(new Font("Tahoma", Font.PLAIN, 25));
		comboBoxFrom.setModel(new DefaultComboBoxModel<String>(new String[] {"System", "Ryzen 9 5900HS", "Intel i9-9900K", "Intel Xeon W-10M", "Ryzen 7 PRO 4750U", "Intel i5-10500H", "Apple M1", "Intel Pentium Silver", "AMD 3020e", "AMD A4-9120e", "Ryzen 5 PRO 4650U"}));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(61, 209, 557, 7);
		jf.getContentPane().add(separator);
		separator.setForeground(Color.BLUE);
		
		JLabel lblNewLabel_1_1 = new JLabel("User Type*");
		lblNewLabel_1_1.setBounds(61, 209, 557, 37);
		jf.getContentPane().add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(61, 256, 557, 64);
		jf.getContentPane().add(panel_1_1);
		panel_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1_1.setLayout(null);
		
		
		seniorB.setBounds(388, 2, 138, 47);
		seniorB.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 25));
		panel_1_1.add(seniorB);
		you.add(seniorB);
		
		
		adultB.setBounds(45, 2, 138, 47);
		adultB.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 25));
		panel_1_1.add(adultB);
		
		
		childB.setHorizontalAlignment(SwingConstants.CENTER);
		childB.setBounds(168, 6, 200, 38);
		childB.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 25));
		panel_1_1.add(childB);
		
		you.add(adultB);
		you.add(childB);
		
		Label label = new Label("*5% Off");
		label.setForeground(Color.RED);
		label.setBounds(235, 41, 59, 21);
		panel_1_1.add(label);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(149, 330, 384, 7);
		jf.getContentPane().add(separator_1);
		separator_1.setForeground(Color.BLUE);
		

		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(61, 392, 557, 64);
		jf.getContentPane().add(panel_1_1_1);
		panel_1_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1_1_1.setLayout(null);
		
		JLabel warning_1 = new JLabel("");
		warning_1.setForeground(Color.RED);
		warning_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		warning_1.setBounds(28, 10, 495, 44);
		panel_1_1_1.add(warning_1);
		
		
		

		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(149, 466, 384, 20);
		jf.getContentPane().add(separator_1_1);
		separator_1_1.setForeground(Color.BLUE);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Customer Details");
		lblNewLabel_1_1_2_1.setBounds(61, 479, 557, 37);
		jf.getContentPane().add(lblNewLabel_1_1_2_1);
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JLabel lblNewLabel_2 = new JLabel("Name*");
		lblNewLabel_2.setBounds(61, 527, 93, 24);
		jf.getContentPane().add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_2_1 = new JLabel("Customer ID*");
		lblNewLabel_2_1.setBounds(61, 612, 137, 26);
		jf.getContentPane().add(lblNewLabel_2_1);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(628, 168, 8, 578);
		jf.getContentPane().add(separator_2);
		separator_2.setForeground(Color.BLUE);
		separator_2.setOrientation(SwingConstants.VERTICAL);
		
		pName = new JTextField();
		pName.setBounds(61, 557, 248, 45);
		jf.getContentPane().add(pName);
		pName.setFont(new Font("Tahoma", Font.PLAIN, 25));
		pName.setForeground(Color.BLACK);
		pName.setToolTipText("Name");
		pName.setColumns(10);
		
		dob = new JTextField();
		dob.setBounds(61, 648, 196, 45);
		jf.getContentPane().add(dob);
		dob.setToolTipText("DD/MM/YYYY");
		dob.setForeground(Color.BLACK);
		dob.setFont(new Font("Tahoma", Font.PLAIN, 25));
		dob.setColumns(10);
		
		ticketCost = new JTextField();
		ticketCost.setBounds(319, 581, 285, 83);
		jf.getContentPane().add(ticketCost);
		ticketCost.setFont(new Font("Tahoma", Font.PLAIN, 35));
		ticketCost.setHorizontalAlignment(SwingConstants.CENTER);
		ticketCost.setEditable(false);
		ticketCost.setColumns(10);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(1038, 168, 8, 578);
		jf.getContentPane().add(separator_2_1);
		separator_2_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_1.setForeground(Color.BLUE);
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("Order Summary");
		lblNewLabel_1_1_2_1_1.setBounds(1056, 146, 317, 37);
		jf.getContentPane().add(lblNewLabel_1_1_2_1_1);
		lblNewLabel_1_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		
		btnAdd.setBounds(61, 718, 557, 57);
		jf.getContentPane().add(btnAdd);
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(1138, 495, 239, 20);
		jf.getContentPane().add(separator_1_1_1);
		separator_1_1_1.setForeground(Color.BLUE);
		
		grandTotal = new JTextField();
		grandTotal.setBounds(1122, 593, 341, 64);
		jf.getContentPane().add(grandTotal);
		grandTotal.setText("0");
		grandTotal.setHorizontalAlignment(SwingConstants.CENTER);
		grandTotal.setFont(new Font("Tahoma", Font.BOLD, 40));
		grandTotal.setEditable(false);
		grandTotal.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("$");
		lblNewLabel_3.setBounds(1056, 592, 56, 64);
		jf.getContentPane().add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		input1.setEditable(false);
		input1.setBounds(635, 146, 341, 109);
		jf.getContentPane().add(input1);
		
		
		input1.setFont(new Font("Monospaced", Font.PLAIN, 20));
		input1.setForeground(Color.WHITE);
		input1.setBackground(Color.BLACK);
		input2.setEditable(false);
		input2.setBounds(635, 260, 341, 109);
		jf.getContentPane().add(input2);
		
		
		input2.setForeground(Color.WHITE);
		input2.setFont(new Font("Monospaced", Font.PLAIN, 20));
		input2.setBackground(Color.BLACK);
		input3.setEditable(false);
		input3.setBounds(635, 377, 341, 109);
		jf.getContentPane().add(input3);
		
		
		input3.setForeground(Color.WHITE);
		input3.setFont(new Font("Monospaced", Font.PLAIN, 20));
		input3.setBackground(Color.BLACK);
		input5.setEditable(false);
		input5.setBounds(635, 610, 341, 109);
		jf.getContentPane().add(input5);
		

		input5.setForeground(Color.WHITE);
		input5.setFont(new Font("Monospaced", Font.PLAIN, 20));
		input5.setBackground(Color.BLACK);
		input4.setEditable(false);
		input4.setBounds(635, 493, 341, 109);
		jf.getContentPane().add(input4);
		
	
		input4.setForeground(Color.WHITE);
		input4.setFont(new Font("Monospaced", Font.PLAIN, 20));
		input4.setBackground(Color.BLACK);
		
		
		input2X.setBounds(979, 275, 56, 78);
		jf.getContentPane().add(input2X);
		input2X.setForeground(Color.RED);
		input2X.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		
		input3X.setBounds(979, 392, 56, 78);
		jf.getContentPane().add(input3X);
		input3X.setForeground(Color.RED);
		input3X.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		
		input4X.setBounds(979, 510, 56, 78);
		jf.getContentPane().add(input4X);
		input4X.setForeground(Color.RED);
		input4X.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		
		input5X.setBounds(979, 626, 56, 78);
		jf.getContentPane().add(input5X);
		input5X.setForeground(Color.RED);
		input5X.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		
		input1X.setBounds(979, 163, 56, 78);
		jf.getContentPane().add(input1X);
		input1X.setFont(new Font("Tahoma", Font.BOLD, 25));
		input1X.setForeground(Color.RED);
		
		
		warning.setForeground(Color.RED);
		warning.setFont(new Font("Tahoma", Font.PLAIN, 15));
		warning.setBounds(61, 695, 316, 24);
		jf.getContentPane().add(warning);
		
		
		lblNoTicketsTo.setBounds(1300, 695, 130, 24);
		jf.getContentPane().add(lblNoTicketsTo);
		lblNoTicketsTo.setForeground(Color.RED);
		lblNoTicketsTo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		journeySummary.setBackground(SystemColor.menu);
		journeySummary.setEditable(false);
		journeySummary.setBounds(1056, 193, 395, 71);
		jf.getContentPane().add(journeySummary);
		
		
		journeySummary.setFont(new Font("Monospaced", Font.PLAIN, 20));
		journeySummary.setForeground(new Color(0, 128, 0));
		
		
		jf.setVisible(true);
		
		comboBoxFrom.addActionListener((ActionListener) this );
		adultB.addActionListener((ActionListener) this );
		childB.addActionListener((ActionListener) this );
		seniorB.addActionListener((ActionListener) this );

		btnAdd.addActionListener((ActionListener) this );
		btnReset.addActionListener((ActionListener) this );
		btnPrint.addActionListener((ActionListener) this );
		input1X.addActionListener((ActionListener) this );
		input2X.addActionListener((ActionListener) this );
		input3X.addActionListener((ActionListener) this );
		input4X.addActionListener((ActionListener) this );
		input5X.addActionListener((ActionListener) this );
		


		if (start == 0 || stop == 0) {
			seniorB.setEnabled(false);
			adultB.setEnabled(false);
			childB.setEnabled(false);

		}
		
}
public void actionPerformed(ActionEvent e) {
		
		Object source = e.getSource();
		
		//comboBoxFrom
		if ( source == comboBoxFrom ) {
			FromSelect = comboBoxFrom.getItemAt(comboBoxFrom.getSelectedIndex()).toString();
			
			for (int i = 1 ; i<=10; i++) {
				if ( FromSelect == comboBoxFrom.getItemAt(i)) {
					start = i;
					break;
				}
			}
			if (start != 0 ) {
				seniorB.setEnabled(true);
				adultB.setEnabled(true);
				childB.setEnabled(true);

			}
		}
		

		
		//adultB
		if ( source == childB) {
			youAre = "Existing User";
//			weeklyB.setEnabled(true);
			if (ticketType == "OneWay") {
				double temp = 0 ;
				if(start == 1) {
					temp = 1400;
				}
				else if(start == 2) {
					temp = 800;
				}
				else if(start == 3) {
					temp = 560;
				}
				else if(start == 4) {
					temp = 2340;
				}
				else if(start == 5) {
					temp = 334;
				}
				else if(start == 6) {
					temp = 400;
				}
				else if(start == 7) {
					temp = 1290;
				}
				else if(start == 8) {
					temp = 1100;
				}
				else if(start == 9) {
					temp = 1000;
				}
				else if(start == 10) {
					temp = 2345;
				}
				double part = 0.05 * temp;
				temp = temp - part;
				
				ticketCost.setText(df.format(temp));
			}

		}
		
		//childB
		if ( source == adultB) {
			youAre = "New User";
//			weeklyB.setEnabled(true);
			if (ticketType == "OneWay") {
				double temp = 0 ;
				if(start == 1) {
					temp = 1400;
				}
				else if(start == 2) {
					temp = 800;
				}
				else if(start == 3) {
					temp = 560;
				}
				else if(start == 4) {
					temp = 2340;
				}
				else if(start == 5) {
					temp = 334;
				}
				else if(start == 6) {
					temp = 400;
				}
				else if(start == 7) {
					temp = 1290;
				}
				else if(start == 8) {
					temp = 1100;
				}
				else if(start == 9) {
					temp = 1000;
				}
				else if(start == 10) {
					temp = 2345;
				}
				ticketCost.setText(df.format(temp));
			}

		}
		
		//seniorB
		if ( source == seniorB) {
			youAre = "N/A";
//			weeklyB.setEnabled(false);
			if (ticketType == "OneWay") {
				double temp = 0 ;
				if(start == 1) {
					temp = 1400;
				}
				else if(start == 2) {
					temp = 800;
				}
				else if(start == 3) {
					temp = 560;
				}
				else if(start == 4) {
					temp = 2340;
				}
				else if(start == 5) {
					temp = 334;
				}
				else if(start == 6) {
					temp = 400;
				}
				else if(start == 7) {
					temp = 1290;
				}
				else if(start == 8) {
					temp = 1100;
				}
				else if(start == 9) {
					temp = 1000;
				}
				else if(start == 10) {
					temp = 2345;
				}
				ticketCost.setText(df.format(temp));
			}

		}
		//btnReset
		if ( source == btnReset) {
			
			start = 0;
			stop = 0;
			youAre = "";
			ticketType = "";
			
			input1a = 0;
			input1c = 0;
			input1s = 0;
			input1p = null;
			
			input2a = 0;
			input2c = 0;
			input2s = 0;
			input2p = null;
			
			input3a = 0;
			input3c = 0;
			input3s = 0;
			input3p = null;
			
			input4a = 0;
			input4c = 0;
			input4s = 0;
			input4p = null;
			
			input5a = 0;
			input5c = 0;
			input5s = 0;
			input5p = null;
			
			comboBoxFrom.setSelectedIndex(0);

				
			seniorB.setEnabled(false);
			adultB.setEnabled(false);
			childB.setEnabled(false);

			
			ticketCost.setText(null);
			pName.setText(null);
			dob.setText(null);
			journeySummary.setText(null);
			input1.setText(null);
			input2.setText(null);
			input3.setText(null);
			input4.setText(null);
			input5.setText(null);
			

			grandTotal.setText("0");
		}
		
		//btnAdd
		if ( source == btnAdd) {
			if (start != 0 &&  youAre != null  && pName.getText().trim().length() != 0 && dob.getText().trim().length() != 0 && (input1.getText().trim().length() == 0 || input2.getText().trim().length() == 0 || input3.getText().trim().length() == 0 || input4.getText().trim().length() == 0 || input5.getText().trim().length() == 0)) {
				//&& ticketType != null
			warning.setText("");
			String tempName = readTF(pName); 
			String tempDOB = readTF(dob); 
			String tempCost = readTF(ticketCost);
			if( input1.getText().trim().length() == 0) {
				
				input1n = tempName;
				input1.setText(tempName + "    " + youAre + "\n" + tempDOB + "\n" + FromSelect+ " --> " + "\n" + "$" +tempCost + "            ") ;
				if (youAre == "Adult") {
					input1a = 1;
				}
				else if (youAre == "Children") {
					input1c = 1;
				}
				else if (youAre == "Senior") {
					input1s = 1;
				}
				input1p = df.format(Double.valueOf(tempCost)); 
				
				
			}
			else if( input2.getText().trim().length() == 0) {
				
				input2n = tempName;
				input2.setText(tempName + "    " + youAre + "\n" + tempDOB + "\n" + FromSelect+ " --> "+ "\n" + "$" +tempCost + "            ") ;
				if (youAre == "Adult") {
					input2a = 1;
				}
				else if (youAre == "Children") {
					input2c = 1;
				}
				else if (youAre == "Senior") {
					input2s = 1;
				}
				input2p = df.format(Double.valueOf(tempCost)); 
			}
			else if(  input3.getText().trim().length() == 0) {
				
				input3n = tempName;
				input3.setText(tempName + "    " + youAre + "\n" + tempDOB + "\n" + FromSelect+ " --> " +"\n" + "$" +tempCost + "            ") ;
				if (youAre == "Adult") {
					input3a = 1;
				}
				else if (youAre == "Children") {
					input3c = 1;
				}
				else if (youAre == "Senior") {
					input3s = 1;
				}
				input3p = df.format(Double.valueOf(tempCost)); 
			}
			else if( input4.getText().trim().length() == 0) {
				
				input4n = tempName;
				input4.setText(tempName + "    " + youAre + "\n" + tempDOB + "\n" + FromSelect+ " --> " +"\n" + "$" +tempCost + "            ") ;
				if (youAre == "Adult") {
					input4a = 1;
				}
				else if (youAre == "Children") {
					input4c = 1;
				}
				else if (youAre == "Senior") {
					input4s = 1;
				}
				input4p = df.format(Double.valueOf(tempCost)); 
				
			}
			else if( input5.getText().trim().length() == 0) {
				
				input5n = tempName;
				input5.setText(tempName + "    " + youAre + "\n" + tempDOB + "\n" + FromSelect+ " --> "+"\n" + "$" +tempCost + "            ") ;
				if (youAre == "Adult") {
					input5a = 1;
				}
				else if (youAre == "Children") {
					input5c = 1;
				}
				else if (youAre == "Senior") {
					input5s = 1;
				}
				input5p = df.format(Double.valueOf(tempCost)); 
			}

			pName.setText(null);
			dob.setText(null);
			grandTotal.setText(String.valueOf(df.format(Double.valueOf(readTF(grandTotal)) + Double.valueOf(tempCost))));
			lblNoTicketsTo.setText(null);
			
		} 
			else {
			warning.setText("You are missing some mandatory fields");
		}
			if (input1.getText().trim().length() != 0 && input2.getText().trim().length() != 0 && input3.getText().trim().length() != 0 && input4.getText().trim().length() != 0 && input5.getText().trim().length() != 0){
				warning.setText("Only 5 entries are allowed in a single receipt");
			}
			
		}
	
		//input1X
		if (source == input1X) {
			if(input1.getText().trim().length() != 0) {
				input1.setText(null);
				input1n = null;
				

				grandTotal.setText(String.valueOf(df.format(Double.valueOf(readTF(grandTotal)) - Double.valueOf(input1p))));	
			}
		}
		
		//input2X
		if (source == input2X) {
			if(input2.getText().trim().length() != 0) {
				input2.setText(null);
				input2n = null;
				

				grandTotal.setText(String.valueOf(Double.valueOf(readTF(grandTotal)) - Double.valueOf(input2p)));	
				}
		}
		
		//input3X
		if (source == input3X) {
			if(input3.getText().trim().length() != 0) {
				input3.setText(null);
				input3n = null;
				

				grandTotal.setText(String.valueOf(Double.valueOf(readTF(grandTotal)) - Double.valueOf(input3p)));		
				}
		}
		
		//input4X
		if (source == input4X) {
			if(input4.getText().trim().length() != 0) {
				input4.setText(null);
				input4n = null;
				

				grandTotal.setText(String.valueOf(Double.valueOf(readTF(grandTotal)) - Double.valueOf(input4p)));	
				}
		}
		
		//input5X
		if (source == input5X) {
			if(input5.getText().trim().length() != 0) {
				input5.setText(null);
				input5n = null;
				

				grandTotal.setText(String.valueOf(Double.valueOf(readTF(grandTotal)) - Double.valueOf(input5p)));	
				}
		}
		
		//btnPrint
		if(source == btnPrint) {
			String in1 = input1.getText();
			String in2 = input2.getText();
			String in3 = input3.getText();
			String in4 = input4.getText();
			String in5 = input5.getText();

			String tp = grandTotal.getText();
			
			if(input1n != null) {
				String temp2 = CreateAndWriteToFile(input1n, in1, in2, in3, in4, in5, tp);
				if(temp2 != "" ) {
					journeySummary.setText("Receipt Printed and Saved to\n"+ temp2);
				}
			}
			else if(input2n != null) {
				String temp2 = CreateAndWriteToFile(input2n, in1, in2, in3, in4, in5, tp);
				if(temp2 != "" ) {
					journeySummary.setText("Receipt Printed and Saved to\n"+ temp2 );
				}
			}
			else if(input3n != null) {
				String temp2 = CreateAndWriteToFile(input3n, in1, in2, in3, in4, in5,  tp);
				if(temp2 != "" ) {
					journeySummary.setText("Receipt Printed and Saved to\n"+ temp2  );
				}
			}
			else if(input4n != null) {
				String temp2 = CreateAndWriteToFile(input4n, in1, in2, in3, in4, in5,  tp);
				if(temp2 != "" ) {
					journeySummary.setText("Receipt Printed and Saved to\n" + temp2 );
				}
			}
			else if(input5n != null) {
				String temp2 = CreateAndWriteToFile(input5n, in1, in2, in3, in4, in5,  tp);
				if(temp2 != "" ) {
					journeySummary.setText("Receipt Printed and Saved to\n"+ temp2  );
				}
			}
			else {
				lblNoTicketsTo.setText("No Receipt to print");
			}
		}
	
	}
	

}
