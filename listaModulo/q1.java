package listaModulo;

import java.util.Scanner;

public class q1 {

	public static void aritimetrica(double nota1, double nota2, double nota3) {
		double media;
		
		media = (nota1 + nota2 + nota3) /3;
		
		System.out.println(media);
		
	}
	public static void pomderada(double nota1, double nota2, double nota3) {
		double media;
		
		media = ((nota1 * 5) + (nota2 * 3) + (nota3 * 2)) / (5 + 3 + 2);
		
		System.out.println(media);
		
	}
	

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double nota1, nota2, nota3;
		char letra;
		
		System.out.println("Digite as suas três notas: ");
		nota1 = entrada.nextDouble();
		nota2 = entrada.nextDouble();
		nota3= entrada.nextDouble();
		
		System.out.println("Digite: A se quiser fazer a média aritmética ou P se quiser fazer a média pomderada");
		letra = entrada.next().charAt(0);
		
		if(letra == 'a' || letra == 'A') {
			aritimetrica(nota1, nota2, nota3);
		}
		
		else if(letra =='p' || letra == 'P') {
			pomderada(nota1, nota2, nota3);
		}
		else {
			System.out.println("Valor não valido");
		}
		entrada.close();
		

	}

}
