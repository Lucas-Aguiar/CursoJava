package br.com.ultracar;

//Exercício 2:

public class Two {

	public static void main(String[] args) {

		int[] valor = new int[4];

		valor[0] = 5;
		valor[1] = 10;
		valor[2] = 15;
		valor[3] = 20;
		
		double soma = 0;
		
		for(int i = 0; i < valor.length; i++) {
			soma = valor[i] + soma;
			
		}
		
		double media = soma/4;	
		System.out.println("A soma dos valores é: " + soma);
		System.out.println("A média é: " + media);

	}


}

