package br.com.ultracar;

import java.util.Scanner;
	
public class DiaDaSemana {
			
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite o dia da semana: ");
		
		int Dia = s.nextInt();
		
		if (Dia == 1) {
			System.out.print("Domingo.");
		}
		else if (Dia == 2) {
			System.out.print("Segunda.");
		}
		else if (Dia == 3) {
			System.out.print("Ter�a.");
		}
		else if (Dia == 4) {
			System.out.print("Quarta.");
		}
		else if (Dia == 5) {
			System.out.print("Quinta.");
		}
		else if (Dia == 6) {
			System.out.print("Sexta.");
		}
		else if (Dia == 7) {
			System.out.print("S�bado.");
		}
		else {
			System.out.print("Dia n�o encontrado! Escolha um n�mero de 1 a 7.");
		}	
			
				
	}
	
}
