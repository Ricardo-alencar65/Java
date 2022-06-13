package listaVetorMatriz;

import java.util.Scanner;

public class q4 {
	
	public static void preenche(int[][] mtz) {
		Scanner entrada = new Scanner(System.in);
		for(int l = 0; l < 5; l++) {
			for(int c = 0; c < 5; c++) {
				System.out.print("Preencha a matriz: ");
				mtz [l][c] = entrada.nextInt();
			}
			System.out.println();
		}
	}
	
	public static int calculal4(int[][] mtz) {
		int soma = 0;
		for(int c = 0; c < 5; c++) {
			soma += mtz[4][c];
		}
		return soma;
	}
	
	public static int calculac2(int[][] mtz) {
		int soma = 0;
		for(int l = 0; l < 5; l++) {
			soma += mtz[l][2];
		}
		return soma;
	}
	
	public static int calculadiagP(int[][] mtz) {
		int soma = 0;
		for(int i = 0; i < 5; i++) {
			soma += mtz[i][i];
		}
		return soma;
	}
	
	public static int calculadiagS(int[][] mtz) {
		int l = 0, c = 4;
		int soma = 0;
		while(l < 5 && c >= 0) {
			soma += mtz[l][c];
			
			l++;
			c--;
			
		}
		return soma;
	}
	
	public static int calculatodos(int[][] mtz) {
		int todos = 0;
		for(int l = 0; l < 5; l++) {
			for(int c = 0; c < 5; c++) {
				todos += mtz[l][c];
			}
		}
		return todos;
	}
	
	

	public static void main(String[] args) {
		int [][] mtz = new int[5][5];
		
		preenche(mtz);
		System.out.println(calculal4(mtz));
		System.out.println(calculac2(mtz));
		System.out.println(calculadiagP(mtz));
		System.out.println(calculadiagS(mtz));
		System.out.println(calculatodos(mtz));
	}

}
