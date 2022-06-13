package lista01;

import java.util.Scanner;

public class lista01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*Primeiro eu declarei as variáveis num1, num2 e resuldado*/
		int num1, num2, resultado;
		
		/* Aqui eu pedi para o usuario digitar 2 numeros inteiros, e atribui esses dois numeros a num1 e num2 respectivamente*/
		System.out.println("Digite 2 números inteiros: ");
		num1 = entrada.nextInt();
		num2 = entrada.nextInt();
		/*Somei esses numeros como manda no exercicio*/
		resultado = num1 + num2;
		
		/*Usei uma estrutura condicional, para se a soma desses numeros for maior ou igual a 10 ele soma 5 a esse resultado, caso não seja, ele soma 7 ao resultado, e no final imprime esse numero para o usuario*/
		if(resultado >= 10) {
			resultado+=5;
			System.out.println(resultado);
		}
		else {
			resultado+=7;
			System.out.println(resultado);
		}
		entrada.close();

	}

}
