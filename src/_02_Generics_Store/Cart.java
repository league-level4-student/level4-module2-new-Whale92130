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
		frame = new JFrame();
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
	public void showFinalCart() {
		frame = new JFrame("What you Bought");
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
	public int getPrice(Product pro) {
		
		if (pro.getClass().getTypeName().equals("_02_Generics_Store.Candy")) {
			return 5;
		}
		else if (pro.getClass().getTypeName().equals("_02_Generics_Store.Cereal")) {
			return 7;
		}
		else if (pro.getClass().getTypeName().equals("_02_Generics_Store.Clothing")) {
			return 15;
		}
		else if (pro.getClass().getTypeName().equals("_02_Generics_Store.Toy")) {
			return 10;
		}
		return -1;
	}

	public ArrayList<String> getItems() {
		ArrayList<String> items = new ArrayList<String>();
		for (int i = 0; i < cart.length; i++) {
			if (cart[i] != null) {
				if (cart[i].getProduct().getToolTipText().equals("Candy")) {
					
					items.add("Candy");
				} else if (cart[i].getProduct().getToolTipText().equals("Cereal")) {
					
					items.add("Cereal");
				} else if (cart[i].getProduct().getToolTipText().equals("Cloths")) {
					
					items.add("Cloths");
				} else if (cart[i].getProduct().getToolTipText().equals("Toy")) {
					
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
	public ArrayList<Product> getProductItems() {
		ArrayList<Product> items = new ArrayList<Product>();
		for (int i = 0; i <= cart.length - 1; i++) {
			if (cart[i] != null) {
				if (cart[i].getProduct().getToolTipText().equals("Candy")) {
					items.add(new Candy());
				} else if (cart[i].getProduct().getToolTipText().equals("Cereal")) {
					items.add(new Cereal());
				} else if (cart[i].getProduct().getToolTipText().equals("Cloths")) {
					items.add(new Clothing());
				} else if (cart[i].getProduct().getToolTipText().equals("Toy")) {
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

	public void removeItem(int index) {
		cart[index] = null;
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
