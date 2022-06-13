package q_prova;

import java.util.Scanner;

public class substituir_prova {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double preco, desconto, opcao;
		
		System.out.println("Digite o preço do produto que está na etiqueta: ");
		preco = entrada.nextDouble();
		
		System.out.println("Digite 1 se vai pagar a vista no dinheiro ou cheque, 2 se vai pagar a vista no cartão, 3 se for em duas vezes, e 4 se for pagar em duas vezes com juros");
		opcao = entrada.nextDouble();
		
		if(opcao == 1) {
			preco = preco - (preco * 0.10);
			System.out.println("o produto fica por " + preco);
		}
		else if (opcao == 2) {
			preco = preco - (preco * 0.15);
			System.out.println("o produto fica por " + preco);
		}
		else if(opcao == 3) {
			System.out.println("Você pagará em duas vezes que dará no total " + preco);
		}
		else if(opcao == 4) {
			preco = preco + (preco * 0.10);

			System.out.println("Você pagará em duas vezes com juros que dará no total " + preco);
		}
		else {
			System.out.println("Comando invalido");
		}
		
	}

}
