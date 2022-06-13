package listaModulo;

import java.util.Scanner;

public class q7 {
	
	public static boolean PositivoNegativo(double num) {
		boolean retorna = true;
		if(num % 2 == 0) {
			retorna = true;
			return retorna;
		}
		else {
			retorna = false;
			return retorna;
		}
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double num = 0;
		char parar = 's';
		boolean VerdadeiroFalso;
		
		VerdadeiroFalso = PositivoNegativo(num);
		System.out.println(VerdadeiroFalso);
		
		
		
		while(parar == 's' || parar == 'S' ){
			System.out.println("Digite um número que você quer saber se é par ou impar: ");
			num = entrada.nextDouble();
			
			PositivoNegativo(num);
			
			if(VerdadeiroFalso == true) {
				System.out.println("O número digitado é par");
			}
			else {
				System.out.println("O número digitado é impar");
			}
			
			System.out.println("Digite S se quiser digitar outro número ou qualquer outra tecla para sair do programa");
			parar = entrada.next().charAt(0);
		}

	}

}
