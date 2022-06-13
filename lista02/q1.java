package lista02;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero, positivo = 0, negativo = 0, zero = 0;
		char parada = '+';
		
		while(parada == '+') {
			System.out.println("Digite o primeiro numero da sua sequencia:");
			numero = entrada.nextInt();
			
			if(numero > 0) {
				positivo ++;
			}
			else if(numero < 0){
				negativo ++;
			}
			else {
				zero++;
			}
			
			System.out.println("Caso queira digitar mais um numero digite +, se quer parar e saber os resultados digite qualquer outra tecla");
			parada = entrada.next().charAt(0);
							
		}
		
		System.out.println("A quantidade de mumeros positivos foi de: " + positivo);
		System.out.println("A quantidade de mumeros negativos foi de: " + negativo);
		System.out.println("A quantidade de mumeros zeros foi de: " + zero);

	}

}
