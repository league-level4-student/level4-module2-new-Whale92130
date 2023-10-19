package _02_Generics_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Candy extends Food{
	public Candy() {
		if(new Random().nextBoolean()) {
			this.item = "candy1.jpeg";
		}
		else {
			this.item = "candy2.jpeg";
		}
	}

	@Override
	public JLabel getFood() {
		// TODO Auto-generated method stub
		JLabel label = new JLabel(loadImage(this.item));
		label.setText("Candy");
		return label;
	}

	@Override
	public JLabel getProduct() {
		JLabel label = new JLabel(loadImage(this.item));
		label.setText("Candy");
		return label;
	}
}
