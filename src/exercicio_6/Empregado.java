package exercicio_6;

import javax.swing.JOptionPane;

public class Empregado extends Pessoa {

	double salario;

	public Empregado(String nome, String sexo, int idade, double altura, double salario) {
		super(nome, sexo, idade, altura);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public String getNome() {
		return nome;
	}

	public String getSexo() {
		return sexo;
	}

	public int getIdade() {
		return idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void informacoesEmpregado() {

		JOptionPane.showMessageDialog(null, "Empregado: " + this.nome);
		JOptionPane.showMessageDialog(null, "Sexo: " + this.sexo);
		JOptionPane.showMessageDialog(null, "Idade: " + this.idade);
		JOptionPane.showMessageDialog(null, "Altura: " + this.altura);

	}

	public void obterLucros() {

		JOptionPane.showMessageDialog(null, "Salário: " + this.salario);

	}

	public String Ler(String nome, String sexo, int idade, double altura, double lucro) {

		this.nome = JOptionPane.showInputDialog(null, "Digite o nome do empregado");
		this.sexo = JOptionPane.showInputDialog(null, "Digite o sexo do empregado");
		this.idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do empregado"));
		this.altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura do empregado"));
		this.salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o salário do empregado"));

		return this.nome + this.sexo + this.idade + this.altura + this.salario;
	}

}
