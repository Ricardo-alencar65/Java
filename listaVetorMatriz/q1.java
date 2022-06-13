package listaVetorMatriz;

import java.util.Scanner;

public class q1 {
	public static void preenche(double notas[]) {
		Scanner entrada = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite a nota do aluno " + i + ": ");
			notas[i] = entrada.nextDouble();
		}
	}
	
	public static void calculaExibi(double notas[]) {
		double somanotas = 0, media;
		int maiorqMedia = 0;
		
		for(int i = 0; i < 10; i++) {
			somanotas += notas[i];
		}
		media = somanotas / 10;
		
		for(int i = 0; i < 10; i++) {
			if(notas[i] > media) {
				maiorqMedia ++;
			}
		}
		
		System.out.println("A média da nota da sala foi de: " + media + " e " + maiorqMedia + " Tiraram nota maior que a média");
	}

	public static void main(String[] args) {
		double [] notas = new double[10];
		
		preenche(notas);
		calculaExibi(notas);
	}

}
