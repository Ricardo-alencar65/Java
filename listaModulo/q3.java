package listaModulo;

import java.util.Scanner;

public class q3 {
	
	public static void crescente(int n){
		Scanner entrada = new Scanner(System.in);
		int num1,  num2, num3, parada = 0; 
		
		
		
		while(parada < n){
			System.out.println("Digite 3 numeros inteiros: ");
			num1 = entrada.nextInt();
			num2 = entrada.nextInt();
			num3 = entrada.nextInt();
			
			if(num1 < num2 && num1 < num3 && num2 < num3) {
				System.out.println("A ordem crescente dos numeros que você digitou é: " + num1 + ", " + num2 + ", " + num3);
			}
			else if(num1 < num2 && num1 < num3 && num3 < num2) {
				System.out.println("A ordem crescente dos numeros que você digitou é: " + num1 + ", " + num3 + ", " + num2);
			}
			else if(num2 < num1 && num2 < num3 && num1 < num3) {
				System.out.println("A ordem crescente dos numeros que você digitou é: " + num2 + ", " + num1 + ", " + num3);
			}
			else if(num2 < num1 && num2 < num3 && num3 < num1) {
				System.out.println("A ordem crescente dos numeros que você digitou é: " + num2 + ", " + num3 + ", " + num1);
			}
			else if(num3 < num2 && num3 < num1 && num1 < num2) {
				System.out.println("A ordem crescente dos numeros que você digitou é: " + num3 + ", " + num1 + ", " + num2);
			}
			else if(num3 < num2 && num3 < num1 && num2 < num1) {
				System.out.println("A ordem crescente dos numeros que você digitou é: " + num3 + ", " + num2 + ", " + num1);
			}
			else {
				System.out.println("Digite valores validos");
			}
			parada++;
		}
		
		
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;
		
		System.out.println("Digite a quantidade de vez que você quer ordernar 3 numeros em ordem crescente: ");
		n = entrada.nextInt();
		
		crescente(n);

		
		entrada.close();

	}

}
