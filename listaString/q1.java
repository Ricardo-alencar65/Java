package listaString;

import java.util.Scanner;

public class q1 {
	/*public static void maiusculo(string nome) {
		
	}*/

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome = new String();
		char primeira;
		
		System.out.println("Digite seu nome completo: ");
		nome = entrada.nextLine();
		char[] inicialSobrenome = new char[nome.length()];
		
		System.out.println(nome);
		
		primeira = nome.charAt(0);
		System.out.print(Character.toUpperCase(primeira));
		
		
		for(int i = 0; i < nome.length(); i++) {
			if(nome.charAt(i) == ' ') {
				inicialSobrenome[i] = nome.charAt(i+1);
				System.out.print(" " + Character.toUpperCase(inicialSobrenome[i]));
				
				
			}
		}

	}

}
