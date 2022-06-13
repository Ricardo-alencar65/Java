package lista02;

import java.util.Scanner;

public class q6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double compra, venda, lucro, porcentagem, lucro10 = 0, lucro1020 = 0, lucro20 = 0, compratotal = 0, vendatotal=0, lucrototal;
		
		System.out.println("Digite o preço de compra e de venda da mercadoria respectivmente: ");
		compra = entrada.nextDouble();
		venda = entrada.nextDouble();
		
		while(compra != 0) {
			lucro = venda - compra;
			porcentagem = (lucro * 100) / compra;
			
			if(porcentagem < 10 ) {
				lucro10 ++;
			}
			else if(porcentagem >= 10 && porcentagem <=20) {
				lucro1020 ++;
			}
			else if(porcentagem > 20) {
				lucro20 ++;
			}
			else {
				System.out.println("Voce teve prejuizo neste produto");
			}
			
			compratotal += compra;
			vendatotal += venda;
			
			System.out.println("Digite 0 se quiser parar, ou digite o preço de compra e de venda da mercadoria respectivmente: ");
			compra = entrada.nextDouble();
			venda = entrada.nextDouble();
			
		}
		
		lucrototal = vendatotal - compratotal;
		
		System.out.println(lucro10 + " Produtos tiveram menos de 10% de lucro");
		System.out.println(lucro1020 + " Produtos tiveram entre 10% e 20% de lucro");
		System.out.println(lucro20 + " Produtos tiveram mais de 20% de lucro");
		
		System.out.println("O total gasto em compras foi de R$ " + compratotal);
		System.out.println("O total em vendas foi de R$ " + vendatotal);
		System.out.println("O lucro total foi de R$ " + lucrototal);
		

	}

}
