package exercicio01;

/*
1) Observe o trecho de código abaixo: 
   int INDICE = 13, SOMA = 0, K = 0; 
   enquanto K < INDICE faça 
 { 
    K = K + 1; 
    SOMA = SOMA + K; 
 } 
 
  imprimir(SOMA); 
*/
public class Exercicio01 {

	public static void main(String[] args) {

		int INDICE = 13;
		int SOMA = 0;
		int K = 0;

		while (K < INDICE) {

			K++;
			SOMA += K;
		}

		System.out.println("Soma: " + SOMA); // O resultado da soma é 91

	}

}
