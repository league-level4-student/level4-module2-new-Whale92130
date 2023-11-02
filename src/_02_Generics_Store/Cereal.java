package _02_Generics_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Cereal extends Food{
	public Cereal() {
		if(new Random().nextBoolean()) {
			this.item = "cereal1.jpeg";
		}
		else {
			this.item = "cereal2.jpeg";
		}
	}

	@Override
	public JLabel getFood() {
		JLabel label = new JLabel(loadImage(this.item));
		label.setToolTipText("Cereal");
		return label;
	}

	@Override
	public JLabel getProduct() {
		JLabel label = new JLabel(loadImage(this.item));
		label.setToolTipText("Cereal");
		return label;
	}
	public int getPrice() {
		return 7;
	}
}
