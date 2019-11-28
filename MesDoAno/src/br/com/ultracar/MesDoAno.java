package br.com.ultracar;

import java.util.Scanner;

public class MesDoAno {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite um número referente ao mês desejado: ");
		
		int Mes = s.nextInt();
		
		if (Mes == 1) {
			System.out.print("Janeiro.");
		}
		else if (Mes == 2) {
			System.out.print("Fevereiro.");
		}
		else if (Mes == 3) {
			System.out.print("Março.");
		}
		else if (Mes == 4) {
			System.out.print("Abril.");
		}
		else if (Mes == 5) {
			System.out.print("Maio.");
		}
		else if (Mes == 6) {
			System.out.print("Junho.");
		}
		else if (Mes == 7) {
			System.out.print("Julho.");
		}
		else if (Mes == 8) {
			System.out.print("Agosto.");
		}
		else if (Mes == 9) {
			System.out.print("Setembro.");
		}
		else if (Mes == 10) {
			System.out.print("Outubro.");
		}
		else if (Mes == 11) {
			System.out.print("Novembro.");
		}
		else if (Mes == 12) {
			System.out.print("Dezembro.");
		}
		else {
			System.out.print("Mês não encontrado! Escolha um número de 1 a 12.");
		}

	}

}
