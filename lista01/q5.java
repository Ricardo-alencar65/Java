package lista01;

import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n  ;
		double s, x, soma = 0;
		
		System.out.println("Digite o valor de n: ");
		n = entrada.nextInt();
		
		//Fiz uma estrutura de if para saber se o valor de n ia da positivo.
		if(n > 0) {
			// ai se for positivo ele vai ter uma estrutura for, que enquanto s for menor ou igual a n, vai somar 1/s + 1/2s + 1/3s...
			for(s = 1; s <= n; s++) {
				x = 1/s;
				soma += x;
			} 
		}
		else {
			System.out.println("Digite um numero maior que 0");
		}
			
			System.out.println(soma);
			
		}
	}


