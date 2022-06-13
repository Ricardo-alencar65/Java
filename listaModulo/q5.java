package listaModulo;

import java.util.Scanner;

public class q5 {
	
	public static void AprovReprov(int n) {
		Scanner entrada = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite as três notas do aluno: ");
			nota1 = entrada.nextDouble();
			nota2 = entrada.nextDouble();
			nota3 = entrada.nextDouble();
			
			media = (nota1 + nota2 + nota3) / 3;
			
			if(media < 39) {
				System.out.println("A sua media foi F");
			}
			else if(media > 40 && media <= 59) {
				System.out.println("A sua media foi E");
			}
			else if(media >= 60 && media <= 69) {
				System.out.println("A sua media foi D");
			}
			else if(media >= 70 && media <= 79) {
				System.out.println("A sua media foi C");
			}
			else if(media >= 80 && media <= 89) {
				System.out.println("A sua media foi B");
			}
			else {
				System.out.println("A sua media foi A");
			}
		}
		
		
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;
		
		System.out.println("De quantos alunos você gostaria de saber a media final deles: ");
		n = entrada.nextInt();
		
		AprovReprov(n);
		
		entrada.close();
		
		

	}

}
