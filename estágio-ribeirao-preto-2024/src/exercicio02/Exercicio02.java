package exercicio02;

import java.util.Scanner;

/*
 2) Dado a sequ�ncia de Fibonacci, onde se inicia por 0 e 1 e o pr�ximo valor sempre ser� a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um n�mero, ele calcule a sequ�ncia de Fibonacci e retorne uma mensagem avisando se o n�mero informado pertence ou n�o a sequ�ncia. 
   IMPORTANTE: Esse n�mero pode ser informado atrav�s de qualquer entrada de sua prefer�ncia ou pode ser previamente definido no c�digo; 
  */

public class Exercicio02 {

	static int numAnterior, numAtual, numNovo, numero, i;
	static boolean achou;
	static String concat;

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);

		System.out.print("Digite um n�mero e veja se pertence a sequ�ncia de Fibonacci: ");
		numero = ent.nextInt();

		mostrarFibonacci(numero);

		ent.close();
	}

	public static void mostrarFibonacci(int numero) {

		numAnterior = 0;
		numAtual = 1;
		numNovo = 0;
		achou = false;
		concat = "Sequ�ncia Fibonacci: ";

		for (i = 1; i <= numero; i++) {

			concat += numNovo + " ";
			numNovo = numAnterior + numAtual;
			numAnterior = numAtual;
			numAtual = numNovo;

			if (numNovo == numero) {
				achou = true;

			}

		}

		System.out.println("\n" + concat);

		if (achou) {
			System.out.println("\nN�mero " + numero + " pertence a sequ�ncia de Fibonacci");
		} else {
			System.out.println("\nN�mero " + numero + " n�o pertence a sequ�ncia de Fibonacci");
		}

	}
}
