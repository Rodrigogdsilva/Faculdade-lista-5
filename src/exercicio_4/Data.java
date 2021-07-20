package exercicio_4;

import javax.swing.JOptionPane;

public class Data {

	int mes, ano, dia;

	public Data(int mes, int ano, int dia) {
		this.mes = mes;
		this.ano = ano;
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	public int getDia() {
		return dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int displayData() {
		JOptionPane.showMessageDialog(null, this.dia + "/" + this.mes + "/" + this.ano);
		return dia + mes + ano;
	}

	public int Ler(int dia, int mes, int ano) {

		this.dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o dia"));
		this.mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o mês"));
		this.ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano"));
		return this.dia + this.mes + this.ano;
	}

}
