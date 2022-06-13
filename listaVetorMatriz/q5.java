package listaVetorMatriz;

import java.util.Scanner;

public class q5 {
	
	public static void preenche(int[][] mtz1, int[][] mtz2){
		Scanner entrada = new Scanner(System.in);
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
				System.out.print("Preencha a matriz1: ");
				mtz1 [l][c] = entrada.nextInt();
			}
			System.out.println();
		}
		
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
				System.out.print("Preencha a matriz2: ");
				mtz2 [l][c] = entrada.nextInt();
			}
			System.out.println();
		}
		
	}
	
	public static int[][] soma(int[][] mtz1, int[][] mtz2){
		int[][] mtzSoma = new int[4][6];
		
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
				mtzSoma[l][c] = mtz1[l][c] + mtz2[l][c];
			}
		}
		
		return mtzSoma;
	}
	
	public static int[][] subtracao(int[][] mtz1, int[][] mtz2){
		int[][] mtzSubtracao = new int[4][6];
		
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
				mtzSubtracao[l][c] = mtz1[l][c] - mtz2[l][c];
			}
		}
		
		return mtzSubtracao;
	}

	public static void main(String[] args) {
		int[][] mtz1 = new int[4][6];
		int[][] mtz2 = new int[4][6];
		
		
		preenche(mtz1,mtz2);
		int[][] retorno1 = soma(mtz1,mtz2);
		int[][] retorno2 = subtracao(mtz1,mtz2);
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
				System.out.print(retorno1[l][c] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Subtração: " );
		
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
				System.out.print(retorno2[l][c] + " ");
			}
			System.out.println();
		}

	}

}
