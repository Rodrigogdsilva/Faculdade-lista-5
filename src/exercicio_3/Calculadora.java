package exercicio_3;

import javax.swing.JOptionPane;

public class Calculadora {

	double n1, n2;
	char operador;

	public Calculadora(double n1, double n2, char operador) {
		this.n1 = n1;
		this.n2 = n2;
		this.operador = operador;
	}

	public double getN1() {
		return n1;
	}

	public double getN2() {
		return n2;
	}

	public char getOperador() {
		return operador;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public void setOperador(char operador) {
		this.operador = operador;
	}

	public double Leitura(double n1, double n2) {
		this.n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro valor"));
		this.n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo valor"));
		return this.n1 + this.n2;
	}

	public char LeituraOperador(char operador) {
		int x = 0;
		double resultado = 0;
		x = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Digite um numero que corresponde com operador \n 1 = + \n 2 = - \n 3 = * \n 4 = / "));
		switch (x) {
		case 1:
			operador = '+';
			resultado = this.n1 + this.n2;
			JOptionPane.showMessageDialog(null, "O resultado é : " + resultado);
			break;
		case 2:
			operador = '-';
			resultado = this.n1 - this.n2;
			JOptionPane.showMessageDialog(null, "O resultado é : " + resultado);
			break;
		case 3:
			operador = '*';
			resultado = this.n1 * this.n2;
			JOptionPane.showMessageDialog(null, "O resultado é : " + resultado);
			break;
		case 4:
			operador = '/';
			resultado = this.n1 / this.n2;
			JOptionPane.showMessageDialog(null, "O resultado é : " + resultado);
			break;
		}
		return operador;

	}
}
