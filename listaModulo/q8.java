package listaModulo;

import java.util.Scanner;

public class q8 {
	
	public static double equacao(int N) {
		double s = 0, parar = 1;
		
		while(parar <= N) {
			s += (parar * parar + 1) / (parar + 3);
			
			parar ++;
		}
		
		
		return s;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int N;
		
		System.out.println("Digite o valor de N: ");
		N = entrada.nextInt();
		
		System.out.println(equacao(N));

	}

}
