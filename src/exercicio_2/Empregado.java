package exercicio_2;

import javax.swing.JOptionPane;

public class Empregado {

	String nome, sobrenome;
	double salario;

	public Empregado(String nome, String sobrenome, double salario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		if (this.salario <= 0) {
			this.salario = 0;
		} else {
			this.salario = salario;
		}
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public double getSalario() {
		return salario;
	}

	public double Ler(double salario) {
		this.salario = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o salário do empregado"));
		return this.salario;
	}

	public String Ler(String nome, String sobrenome) {
		this.nome = (JOptionPane.showInputDialog(null, "Digite o nome do empregado"));
		this.sobrenome = (JOptionPane.showInputDialog(null, "Digite o sobrenome do empregado"));
		return this.nome + this.sobrenome;
	}

	public double getAumento() {
		double aumento = 0;
		aumento = (this.salario / 100 * 110) * 12;
		return aumento;
	}

	public double getSalarioAnual() {
		double salario = 0;
		salario = this.salario * 12;
		return salario;
	}

}
