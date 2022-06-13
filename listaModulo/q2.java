package listaModulo;

import java.util.Scanner;

public class q2 {

	public static void pesquisa(char acionador) {
		Scanner entrada = new Scanner(System.in);
		
		double salario, filhos, habitantes = 0, salario_soma = 0;
		while(acionador == 'n' || acionador == 'N') {
			System.out.println("Digite o seu salario: ");
			salario = entrada.nextDouble();
			
			System.out.println("Digite o número de filhos que você tem: ");
			filhos = entrada.nextDouble();
			
			salario_soma += salario;
			
			habitantes++;
			
			System.out.println("Digite N caso queira fazer outra pesquisa ou qualquer outra tecla caso deseje parar: ");
			acionador = entrada.next().charAt(0);
			
			
		}
		System.out.println("A média salarial da população foi de: " + salario_soma / habitantes);
		

	}
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		char acionador;
		
		System.out.println("Digite N caso queira fazer outra pesquisa ou qualquer outra tecla caso deseje parar: ");
		acionador = entrada.next().charAt(0);
		
		pesquisa(acionador);
		
		
		
		
		entrada.close();

	}

}
