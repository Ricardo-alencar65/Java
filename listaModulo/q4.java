package listaModulo;

import java.util.Scanner;

public class q4 {
	
	public static void triangulo(double num1, double num2, double num3) {
		if(num1 < num2 + num3 && num2 < num1 + num3 && num3 < num1 + num2) {
			if(num1 == num2 && num1 == num3 && num2 == num3){
				System.out.println("Os números " + num1 + " " + num2 + " " + num3 + " formam um triângulo equilátero");
			}
			else if(num1 == num2 || num1 == num3 || num2 == num3){
				System.out.println("Os números " + num1 + " " + num2 + " " + num3 + " formam um triângulo isósceles");
			}
			else if(num1 != num2 && num1 != num3 && num2 != num3){
				System.out.println("Os números " + num1 + " " + num2 + " " + num3 + " formam um triângulo Escaleno");
			}
			else {
				System.out.println("Erro desconhecido");
			}
		}
		else {
			System.out.println("Os valores não formam triângulo");
		}
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double X, Y, Z;
		
		System.out.println("Digite 3 valores para saber se ele formam triângulo: ");
		X = entrada.nextDouble();
		Y = entrada.nextDouble();
		Z = entrada.nextDouble();
		
		triangulo(X,Y,Z);

	}

}
