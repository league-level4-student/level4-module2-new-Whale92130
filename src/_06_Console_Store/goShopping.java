package _06_Console_Store;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import _02_Generics_Store.Cart;
import _02_Generics_Store.Product;

public class goShopping implements ActionListener {
	Cart<Product> cart = new Cart<Product>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addItem = new JButton("Add Item");
	JButton removeItem = new JButton("Remove Item");
	JButton viewItems = new JButton("View Items");
	JButton checkOut = new JButton("Check Out");
	JLabel money = new JLabel();
	void shop() {
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(addItem);
		addItem.addActionListener(this);
		panel.add(removeItem);
		removeItem.addActionListener(this);
		panel.add(viewItems);
		viewItems.addActionListener(this);
		panel.add(checkOut);
		checkOut.addActionListener(this);
		panel.add(money);
		frame.setVisible(true);
		money.setText("|$69.00|");
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(addItem)) {
			JFrame frame2 = new JFrame();
			JPanel panel = new JPanel();
			JButton candy = new JButton("Add Candy");
			candy.addActionListener(this);
			JButton cereal = new JButton("Add Cereal");
			candy.addActionListener(this);
			JButton cloths = new JButton("Add Cloths");
			candy.addActionListener(this);
			JButton toy = new JButton("Add Toys");
			frame2.add(panel);
			panel.add(candy);
			panel.add(cereal);
			panel.add(cloths);
			panel.add(toy);
			frame2.pack();
			frame2.setVisible(true);
			}
	}
}
