package _02_Generics_Store;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * The Cart class is a Bounded Type Generic class
 * 
 * <T extends Food> means we can only create a Cart with objects part of the 
 * Food class
 */

@SuppressWarnings("unchecked")
public class Cart<T extends Product> implements ActionListener {
	private T[] cart;
	JButton button = new JButton("Go Back");
	JFrame frame = new JFrame();

	public Cart() {
		cart = (T[]) new Product[8];
	}

	// Adds an item to the cart
	public void add(T item) {
		for (int i = 0; i < cart.length; i++) {
			if (cart[i] == null) {
				cart[i] = item;
				return;
			}
		}
		JOptionPane.showMessageDialog(null, "Your cart is full!\nNo more than 8 items");
	}

	// Displays everything currently in the cart
	public void showCart() {

		JPanel panel = new JPanel();
		button.addActionListener(this);
		frame.add(panel);
		frame.setVisible(true);

		for (int i = 0; i < cart.length; i++) {
			if (cart[i] != null) {
				panel.add(cart[i].getProduct());
			}
		}
		panel.add(button);
		frame.pack();

	}

	public int length() {
		return cart.length;

	}

	public ArrayList<String> getItems() {
		ArrayList<String> items = new ArrayList<String>();
		for (int i = 0; i <= cart.length - 1; i++) {
			if (cart[i] != null) {
				if (cart[i].getProduct().getToolTipText().equals("Candy")) {
					items.add("Candy");
				} else if (cart[i].getProduct().getToolTipText().equals("Cereal")) {
					items.add("Cereal");
				} else if (cart[i].getProduct().getToolTipText().equals("Cloths")) {
					items.add("Cloths");
				} else if (cart[i].getProduct().getToolTipText().equals("Toys")) {
					items.add("Toy");
				}

			}

		}
		if (items.size() == 0) {
			JOptionPane.showMessageDialog(null, "Thre are no items in the cart");
			return null;
		}
		return items;
	}

	public void removeItem(int index) {
		cart[index-1] = null;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(button)) {
			frame.setVisible(false);
			frame.dispose();
		}
	}
}
