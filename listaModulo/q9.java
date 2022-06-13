package listaModulo;

import java.util.Scanner;

public class q9 {
	
	public static double media() {
		Scanner entrada = new Scanner(System.in);
		int numNotas = 0;
		double nota, numMedia = 0, media = 0;
		
		
		System.out.println("quantas notas você vai utilizar para fazer a média desse aluno? ");
		numNotas = entrada.nextInt();
		
		for(int i = 1; i <= numNotas; i++) {
			System.out.println("Digite a nota do aluno");
				nota = entrada.nextInt();
				
				numMedia = numMedia + nota;
			}
			media = numMedia / numNotas;
			
			
			
			if(media >= 6) {
				return media;
			}
			else {
				return -1;
			}
		
		
		
		
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numPessoas = 0;
		char pessoa = '1';
		
		while(pessoa == '1' || pessoa == '1'){
			System.out.println(media());
			numPessoas++;
			System.out.println("Deseja fazer a media de outro aluno? ");
			System.out.println("1 - Sim ");
			System.out.println("2 - Não");
			pessoa = entrada.next().charAt(0);
		}

		entrada.close();
	}

}
