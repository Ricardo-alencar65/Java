package lista04;

import java.util.Scanner;

public class q4 {

public static int restoSubtracao(int num1, int num2) {
		
		if(num1 < num2) {
			return num1;
		}
		else {
			return restoSubtracao(num1-num2, num2);
		}
		
		
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Digite dois números: ");
		num1 = entrada.nextInt();
		num2 = entrada.nextInt();
		
		
		System.out.println( restoSubtracao(num1, num2));

	}

}
