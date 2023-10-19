package _02_Generics_Store;

import java.util.ArrayList;

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
public class Cart<T extends Product> {
	private T[] cart;

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
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);

		for (int i = 0; i < cart.length; i++) {
			if (cart[i] != null) {
				panel.add(cart[i].getProduct());
			}
		}
		frame.pack();

	}

	public int length() {
		return cart.length;

	}

	public ArrayList<Product> getItems() {
		ArrayList<Product> items = new ArrayList<Product>();
		for (int i = 0; i <= cart.length-1; i++) {
			if (cart[i] != null) {
				if (cart[i].getProduct().getText().equals("Candy")) {
					items.add(new Candy());
				}
				else if (cart[i].getProduct().getText().equals("Cereal")) {
					items.add(new Cereal());
				}
				else if (cart[i].getProduct().getText().equals("Cloths")) {
					items.add(new Clothing());
				}
				else if (cart[i].getProduct().getText().equals("Toys")) {
					items.add(new Toy());
				}
				
			}

		}
		if (items.size() == 0) {
		JOptionPane.showMessageDialog(null, "Thre are no items in the cart");
		return null;
		}
		return items;
	}
}
