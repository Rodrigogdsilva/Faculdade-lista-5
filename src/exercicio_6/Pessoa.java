package exercicio_6;

public class Pessoa {

	String nome, sexo;
	int idade;
	double altura;

	public Pessoa(String nome, String sexo, int idade, double altura) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.altura = altura;
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

}
