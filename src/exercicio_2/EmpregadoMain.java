package exercicio_2;

import javax.swing.JOptionPane;

public class EmpregadoMain {

	public static void main(String[] args) {

		String nome = "", sobrenome = "";
		double salario = 0;

		Empregado e = new Empregado(nome, sobrenome, salario);

		e.Ler(nome, sobrenome);
		e.Ler(salario);

		JOptionPane.showMessageDialog(null, "O sal�rio anual do empregado sem aumento �: " + e.getSalarioAnual());
		JOptionPane.showMessageDialog(null, "O sal�rio anual do empregado com aumento �: " + e.getAumento());

	}

}
