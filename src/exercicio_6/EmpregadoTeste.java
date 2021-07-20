package exercicio_6;

public class EmpregadoTeste {

	public static void main(String[] args) {

		String nome = null, sexo = null;
		int idade = 0;
		double altura = 0, salario = 0;

		Empregado e = new Empregado(nome, sexo, idade, altura, salario);

		e.Ler(nome, sexo, idade, altura, salario);
		e.informacoesEmpregado();
		e.obterLucros();

	}

}
