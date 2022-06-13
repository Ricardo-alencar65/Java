package lista02;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double N,limite,e = 1, fat = 1,fat_atual= 0;
		
		System.out.println("Digite N");
		N = entrada.nextInt();
		
		for(limite= 1; limite<=N;limite++) {
			
			fat *= limite;
			fat_atual =fat;
			e += 1/fat_atual;			
		}
		System.out.println("O valor final é igual a:" + e);
		
		
		
	}

}
