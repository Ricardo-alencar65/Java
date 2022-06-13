package listaVetorMatriz;

import java.util.Scanner;

public class q3 {
	
	public static void preenche(int[] mtz1, int[] mtz2) {
		Scanner entrada = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			System.out.println("Preencha o primeiro vetor: ");
			mtz1[i] = entrada.nextInt();
			System.out.println("Preencha o segundo vetor: ");
			mtz2[i] = entrada.nextInt();
		}
	}
	
	public static void parImpar(int[] mtz1, int[] mtz2, int[] intercalado) {
		for(int i = 0; i < 10; i++) {
			if(mtz1[i] % 2 != 0) {
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
