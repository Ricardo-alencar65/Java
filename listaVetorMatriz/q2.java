package listaVetorMatriz;

import java.util.Scanner;

public class q2 {
	
	public static void preenche(double vetor[]) {
		Scanner entrada = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			System.out.println("Preencha o vetor na posição " + i + ": ");
			vetor[i] = entrada.nextDouble();
		}
	}
	
	public static double[] vetorNegativo(double vetor[]) {
		double [] negativo = new double [10];
		int contador = 0;
		for(int i = 0; i < 10; i++) {
			if(vetor[i] < 0) {
				negativo[contador] = vetor[i];
				contador++;
			}
		}
		return negativo;
	}
	
	public static void exibir(double negativo[]) {
		System.out.print("Os valores negativos digitados no vetor: ");
		for(int i = 0; i < negativo.length; i++) {
			System.out.print(negativo[i] + " ");
		}
	}

	public static void main(String[] args) {
		double [] vetor = new double [10];
		double [] retorno = new double[10];
	
		preenche(vetor);
		
		retorno = vetorNegativo(vetor);
		
		exibir(retorno);

	}

}
