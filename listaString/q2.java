package listaString;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String texto= new String();
		
		System.out.println("Digite um texto qualquer");
		texto = entrada.nextLine();
		
		System.out.print(texto.replace(" ", ""));	
	}

}
