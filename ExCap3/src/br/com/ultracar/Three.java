package br.com.ultracar;

//Exerc�cio 3:

public class Three {

	public static void main(String[] args) {

		int[] numero = new int[10];

		numero[0] = 1;
		numero[1] = 2;
		numero[2] = 3;
		numero[3] = 4;
		numero[4] = 5;
		numero[5] = 6;
		numero[6] = 7;
		numero[7] = 8;
		numero[8] = 9;
		numero[9] = 10;		

		int mult = 1;

		for(int i = 0; i < numero.length; i++) {
			mult = numero[i] * mult;
		}

		System.out.println("Resultado da multiplica��o:" + mult);

	}

}
