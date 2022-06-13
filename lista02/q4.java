package lista02;

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		
		int num, primeiro = 0, segundo = 1, proximo = 1, parada = 2;
		
		System.out.print("Digite até qual número gostaria de saber da sequência: ");
		num = entrada.nextInt();
		
		System.out.println(primeiro);
		
		while(num >= parada) {
			System.out.println(proximo);
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			parada++;
		}
		
	
	}

}
