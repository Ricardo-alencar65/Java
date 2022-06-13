package lista04;

import java.util.Scanner;

public class q1 {
	
	public static int soma(int num, int somatotal) {
		
		if(num == 0) {
			return somatotal;
		}
		else {
			somatotal += (num % 10);
			return soma(num/10, somatotal);
		}
		
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um valor maior que 10: ");
		num = entrada.nextInt();
		
		
		System.out.println(soma(num, 0));
	

	}

}
