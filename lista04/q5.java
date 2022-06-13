package lista04;

import java.util.Scanner;

public class q5 {

	public static double fatorial(int n) {
		double S = 0;
		if(n == 1) {
			return 1;
		}
		else {
			for( int limite = 1; limite < n; limite++) {
				S += 1 / (n * fatorial(n-1));
			}
				
			
			return S;
		}
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int N;
		
		System.out.println("Digite o valor de N (Maior que 10): ");
		N = entrada.nextInt();
		
		if(N > 0) {
			System.out.println(fatorial(N));
		}
		else {
			System.out.println("Digite um valor valido");
		}
		
		

	}

}
