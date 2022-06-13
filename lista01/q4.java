package lista01;

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double num_filhos, salario = 1, num_habitantes = 0, soma_filhos = 0, soma_salario = 0, maior_salario = -1, num_habitantes_porcentagem = 0;
		
		//Criei uma estrutura while para que quando a variavel salario for negativa, para de rodar o codigo a estrutura while
		while(salario >= 01 ) {
			System.out.println("Quantos filhos você tem? ");
			num_filhos = entrada.nextDouble();
			System.out.println("Qual seu salario ");
			salario = entrada.nextDouble();
			
			soma_filhos = soma_filhos + num_filhos;
			soma_salario = soma_salario + salario;
			
			num_habitantes++;
			//Fiz uma estrutura de if/else para testar os salarios e definir o maior
			if(salario > maior_salario) {
				maior_salario = salario;
			}
			else {}
			
			//Fiz outra estrutura de if/else para testar se o salario é menor que 100, e se for adiciona mais 1 na variavel num_habitantes_porcentagem
			if(salario <= 100) {
				num_habitantes_porcentagem ++;
			}
			else{}
			
			System.out.print("Se quiser continuar digite um numero positivo: ");
			salario = entrada.nextDouble(); 
		}
		
		System.out.println("foram feita a pesquisa com " + num_habitantes + " Pessoas");
		System.out.println("A media de filho dos entrevistados foi de " + soma_filhos / num_habitantes);
		System.out.println("A media dos salario dos habitantes foi de " + soma_salario / num_habitantes);
		System.out.println("O maior salario recebido foi: " + maior_salario);
		System.out.println("O percentual de pessoas com o salario de até 100 reias foi: " +(num_habitantes_porcentagem / num_habitantes * 100) + "%");
		
		entrada.close();
	}

}
