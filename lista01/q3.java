package lista01;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double diaria, promo, arrecadado80, arrecadado50, diferenca;
		
		System.out.println("Valor da diaria: ");
		diaria = entrada.nextDouble();
		
		promo = diaria - diaria * 0.25;
		
		System.out.printf("O valor promocional da diaria é %.2f \n", promo);
		
		arrecadado80 = (75 * 0.8) * promo;
		System.out.printf("O valor arrecadado com 80 porcento de lotação e o valor peomocional é de %.2f \n", arrecadado80 );
		
		arrecadado50 = (75 * 0.5) * diaria;
		System.out.printf("O valor arrecadado com 50 porcento de lotação e o valor normal é de %.2f \n", arrecadado50 );
		
		diferenca = arrecadado80 - arrecadado50;
		System.out.printf("A diferença de arrecadação com 80 porcento de lotação e valor promocional para 50 porcento de lotação e valor normal é de: %.2f \n", diferenca );

		
		entrada.close();
	}
	

}
