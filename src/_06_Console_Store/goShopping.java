package _06_Console_Store;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import _02_Generics_Store.Candy;
import _02_Generics_Store.Cart;
import _02_Generics_Store.Cereal;
import _02_Generics_Store.Clothing;
import _02_Generics_Store.Product;
import _02_Generics_Store.Toy;

public class goShopping implements ActionListener {
	Cart<Product> cart = new Cart<Product>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addItem = new JButton("Add Item");
	JButton removeItem = new JButton("Remove Item");
	JButton viewItems = new JButton("View Items");
	JButton checkOut = new JButton("Check Out");
	JLabel moneyLabel = new JLabel();
	int money = 69;
	JButton candy = new JButton("Add Candy ($5)");
	JButton cereal = new JButton("Add Cereal ($7)");
	JButton cloths = new JButton("Add Cloths ($15)");
	JButton toy = new JButton("Add Toys ($10)");
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
		panel.add(moneyLabel);
		frame.setVisible(true);
		moneyLabel.setText("|$69.00|");
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(addItem)) {
			JFrame frame2 = new JFrame();
			JPanel panel = new JPanel();
			
			candy.addActionListener(this);
			
			cereal.addActionListener(this);
			
			cloths.addActionListener(this);
			
			toy.addActionListener(this);
			
			frame2.add(panel);
			panel.add(candy);
			panel.add(cereal);
			panel.add(cloths);
			panel.add(toy);
			frame2.pack();
			frame2.setVisible(true);
			}
		if (e.getSource().equals(candy)) {
			cart.add(new Candy());
			money-=5;
		}
		if (e.getSource().equals(cereal)) {
			cart.add(new Cereal());
			money-=7;
		}
		if (e.getSource().equals(cloths)) {
			cart.add(new Clothing());
			money-=15;
		}
		if (e.getSource().equals(toy)) {
			cart.add(new Toy());
			money-=10;
		}
		if(e.getSource().equals(viewItems)) {
			cart.showCart();
			}
		if(e.getSource().equals(removeItem)) {
			String prompt = "";
			for(int i = 0; i < cart.getItems().size(); i++) {
				prompt += i+": " + cart.getItems().get(i).toString() + "\n";
			}
			String remove = JOptionPane.showInputDialog(prompt + "(give the number of the item you want to remove)");
		}
	moneyLabel.setText("|"+money+".00|");
	}
}
