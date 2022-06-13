package lista02;

import java.util.Scanner;

public class q7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int voto = 1, candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0, nulo = 0, branco = 0;
		
		
		while(voto != 0){
			System.out.println("Digite 1 se vai votar no candidato 1, 2 se for votar no candidato 2, 3 se for votar no candidato 3, "
					+ "4 se for votar no candidato 4, 5 se for votar nulo, 6 se for votar branco ");
			voto = entrada.nextInt();
			
			if(voto == 1) {
				candidato1++;
			}
			if(voto == 2) {
				candidato2++;
			}
			if(voto == 3) {
				candidato3++;
			}
			if(voto == 4) {
				candidato4++;
			}
			if(voto == 5) {
				nulo++;
			}
			if(voto == 6) {
				branco++;
			}
			else {
				System.out.println("Voto invalido");
			}
			
			System.out.println("Digite 0 caso não queira mais fazer as pesquisas, "
					+ "ou qualquer numero diferente de 0 para começar uma nova pesquisa: ");
			voto = entrada.nextInt();
		}
		
		System.out.println("O total de pessoas com intenção de voto no candidato 1 é de: " + candidato1);
		System.out.println("O total de pessoas com intenção de voto no candidato 2 é de: " + candidato2);
		System.out.println("O total de pessoas com intenção de voto no candidato 3 é de: " + candidato3);
		System.out.println("O total de pessoas com intenção de voto no candidato 4 é de: " + candidato4);
		System.out.println("O total de pessoas com intenção de voto nulo é de: " + nulo);
		System.out.println("O total de pessoas com intenção de voto branco é de: " + branco);


		
	}

}
