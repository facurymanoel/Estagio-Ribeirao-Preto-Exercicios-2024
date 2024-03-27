package exercicio02;

import java.util.Scanner;

/*
 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência. 
   IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código; 
  */

public class Exercicio02 {

	static int numAnterior, numAtual, numNovo, numero, i;
	static boolean achou;
	static String concat;

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);

		System.out.print("Digite um número e veja se pertence a sequência de Fibonacci: ");
		numero = ent.nextInt();

		mostrarFibonacci(numero);

		ent.close();
	}

	public static void mostrarFibonacci(int numero) {

		numAnterior = 0;
		numAtual = 1;
		numNovo = 0;
		achou = false;
		concat = "Sequência Fibonacci: ";

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
			System.out.println("\nNúmero " + numero + " pertence a sequência de Fibonacci");
		} else {
			System.out.println("\nNúmero " + numero + " não pertence a sequência de Fibonacci");
		}

	}
}
