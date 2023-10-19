package _02_Generics_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Toy extends NonFood {
	public Toy() {
		if(new Random().nextBoolean()) {
			this.item = "toy1.jpeg";
		}
		else {
			this.item = "toy2.jpeg";
		}
	}

	@Override
	public JLabel getNonFood() {
		JLabel label = new JLabel(loadImage(this.item));
		label.setText("Toy");
		return label;
	}

	@Override
	public JLabel getProduct() {
		JLabel label = new JLabel(loadImage(this.item));
		label.setText("Toy");
		return label;
	}
}
