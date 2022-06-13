package listaModulo;

import java.util.Scanner;

public class q10 {
	
	public static char categoria(int idade) {
		char cat = 'f';
		
		if (idade > 5 && idade <=7) {
			cat = 'F';
		}
		else if (idade >=8 && idade <=10) {
			cat = 'E';
		}
		else if (idade >= 14 && idade <=15) {
			cat = 'C';
		}
		else if (idade >= 16 && idade <=17) {
			cat = 'B';
		}
		else if (idade > 18) {
			cat = 'A';
		}
		else {
			cat = '0';
		}
		
		return cat;
		
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int idade;
		
		System.out.println("Digite a sua idade: ");
		idade = entrada.nextInt();
		
		System.out.println("Está é a sua cateria é : " + categoria(idade));
		
		entrada.close();
		
	}

}
