package lista01;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double nota;
		/* Aqui eu pedi para o usuario digitar a sua nota */
		System.out.println("Digite a sua nota: ");
		nota = entrada.nextDouble();
		/* E fiz uma estrutura de if, else if e else, para realizar os comandos pedido na questão*/
		if(nota >= 8 && nota <=10) {
			System.out.println("Ótimo");
		}
		else if(nota >=7 && nota < 8){
			System.out.println("Bom");
		}
		else if(nota >=5 && nota < 7){
			System.out.println("Regular");
		}
		else if(nota < 5){
			System.out.println("Insatisfatório");
		}
		else {
			System.out.println("Digite uma nota valida (Menor que 10)");
		}
		entrada.close();
	}

}
