package exercicio_4;

public class DataTeste {

	public static void main(String[] args) {

		int dia = 0, mes = 0, ano = 0;

		Data d = new Data(dia, mes, ano);

		d.Ler(dia, mes, ano);

		d.displayData();
	}

}
