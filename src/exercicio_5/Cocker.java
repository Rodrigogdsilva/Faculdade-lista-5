package exercicio_5;

import javax.swing.JOptionPane;

public class Cocker extends Cachorro {

	boolean tosa;

	public Cocker(String nome, String raca, String tipo, String cor) {
		super(nome, raca, tipo, cor);

	}

	public boolean setTosa(boolean tosa) {

		this.tosa = tosa;
		return tosa;

	}

	public boolean precisaTosa(boolean tosa) {

		if (tosa == true) {

			JOptionPane.showMessageDialog(null, "Sim");
		} else {

			JOptionPane.showMessageDialog(null, "Não");
		}

		return tosa;
	}

}
