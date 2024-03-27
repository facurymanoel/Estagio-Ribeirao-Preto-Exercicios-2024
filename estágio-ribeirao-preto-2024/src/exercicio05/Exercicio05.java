package exercicio05;

import java.util.Scanner;

/*
 5) Escreva um programa que inverta os caracteres de um string. 
   IMPORTANTE: 
        a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código; 
        b) Evite usar funções prontas, como, por exemplo, reverse; 
 */
public class Exercicio05 {

	static int i;
	static String saida = "";

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);

		System.out.print("Digite uma palavra: ");
		String entrada = ent.next();

		System.out.println(inverteString(entrada));
		
		ent.close();

	}

	public static String inverteString(String palavra) {

		for (i = palavra.length() - 1; i >= 0; i--) {

			saida += palavra.charAt(i);

		}

		return saida;

	}
}
