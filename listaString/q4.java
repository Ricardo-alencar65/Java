package listaString;

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String texto = new String();
		String nova = new String();
		
		
		System.out.println("Digite um texto");
		texto = entrada.nextLine();
		char[] novoTexto = new char[texto.length() + 1];
		
		for(int i = 0, p = 1; i < texto.length(); i++) {
			int temporario = texto.length() - p;
			novoTexto[i] = texto.charAt(temporario);
			p++;
		}
		
		for(int i = 0; i < texto.length(); i++) {
			nova += nova.valueOf(novoTexto[i]);
		}
		
		
		if(texto.equalsIgnoreCase(nova)) {
			System.out.println("É um polimero");
		}
		else {
			System.out.println("Não é um polimero");
		}

	}

}
