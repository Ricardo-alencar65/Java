package lista04;

import java.util.Scanner;

public class q2 {
	public static int divisao(int numerador, int denominador, int i) {
		if(numerador < denominador) {
			return i;
		}
		else {
			i++;
			return divisao(numerador - denominador, denominador, i);
		}
	}
	

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Digite dois números: ");
		num1 = entrada.nextInt();
		num2 = entrada.nextInt();
		
		
		System.out.println(divisao(num1,num2, 0));

	}

}
