package _02_Generics_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Clothing extends NonFood{
	public Clothing() {
		if(new Random().nextBoolean()) {
			this.item = "clothing1.jpeg";
		}
		else {
			this.item = "clothing2.jpeg";
		}
	}

	@Override
	public JLabel getNonFood() {
		JLabel label = new JLabel(loadImage(this.item));
		label.setToolTipText("Cloths");
		return label;
	}

	@Override
	public JLabel getProduct() {
		JLabel label = new JLabel(loadImage(this.item));
		label.setToolTipText("Cloths");
		return label;
	}
}
