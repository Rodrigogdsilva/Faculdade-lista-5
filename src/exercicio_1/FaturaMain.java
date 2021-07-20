package exercicio_1;

import javax.swing.JOptionPane;

public class FaturaMain {

	public static void main(String[] args) {

		int id = 0, qtd = 0;

		String descricao = "";
		float preco = 0;

		Faturar f = new Faturar(id, qtd, descricao, preco);

		f.Ler(id, qtd);
		f.Ler(descricao);
		f.Ler(preco);

		JOptionPane.showMessageDialog(null, "Valor da fatura " + f.getFaturarTotal());
	}

}
