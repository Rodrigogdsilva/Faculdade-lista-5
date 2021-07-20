package exercicio_1;

import javax.swing.JOptionPane;

public class Faturar {

	int id, qtd;
	String descricao;
	float preco;

	public void setId(int id) {
		this.id = id;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public int getQtd() {
		return qtd;
	}

	public String getDescricao() {
		return descricao;
	}

	public float getPreco() {
		return preco;
	}

	public Faturar(int id, int qtd, String descricao, float preco) {

		this.id = id;
		if (this.qtd < 0) {
			this.qtd = 0;
		} else {
			this.qtd = qtd;
		}
		this.descricao = descricao;
		if (this.preco < 0) {
			this.preco = 0;
		} else {
			this.preco = preco;
		}
	}

	public float getFaturarTotal() {
		double fatura;
		fatura = this.preco * this.qtd;
		return (float) fatura;
	}

	public int Ler(int id, int qtd) {
		this.id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID do item"));
		this.qtd = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de itens"));
		return this.id + this.qtd;
	}

	public String Ler(String descricao) {
		this.descricao = (JOptionPane.showInputDialog(null, "Digite a descrição do item"));
		return this.descricao;
	}

	public float Ler(float preco) {
		this.preco = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o preço do item"));
		return this.preco;
	}

}
