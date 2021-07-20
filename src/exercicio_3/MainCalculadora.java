package exercicio_3;

public class MainCalculadora {

	public static void main(String[] args) {
		int n1 = 0, n2 = 0;
		char operador = ' ';

		Calculadora cal = new Calculadora(n1, n2, operador);

		cal.Leitura(n1, n2);
		cal.LeituraOperador(operador);
	}

}
