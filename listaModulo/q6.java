package listaModulo;

import java.util.Scanner;

public class q6 {
	
	public static double fatorial(int N) {
		double limite,S = 1, fat = 1,fat_atual= 0;
		
		for(limite= 1; limite<=N;limite++) {
			
			fat *= limite;
			fat_atual =fat;
			S += 1/fat_atual;			
		}
		return S;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int N;
		
		System.out.println("Digite o valor de N: ");
		N = entrada.nextInt();
		
		System.out.println(fatorial(N));

	}

}
