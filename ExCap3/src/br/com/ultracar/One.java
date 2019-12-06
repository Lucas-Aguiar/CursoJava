package br.com.ultracar;

// Exercício 1:

public class One {

	public static void main(String[] args) {

		int[] posicoes = new int[10];

		posicoes[0] = 1;
		posicoes[1] = 2;
		posicoes[2] = 3;
		posicoes[3] = 4;
		posicoes[4] = 5;
		posicoes[5] = 6;
		posicoes[6] = 7;
		posicoes[7] = 8;
		posicoes[8] = 9;
		posicoes[9] = 10;		

		for(int i = 0; i < posicoes.length; i++){
			System.out.println("Conteúdo: " + posicoes[i]+ ".");
		}


	}

}

