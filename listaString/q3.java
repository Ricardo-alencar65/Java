package listaString;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int dia, mes, ano;
		
		System.out.println("Digite a sua data de nascimento (dd m aaaa)");
		dia = entrada.nextInt();
		mes = entrada.nextInt();
		ano = entrada.nextInt();
		
		if(mes == 01 || mes == 1) {
			System.out.println("Você nasceu em " + dia + " de Janeiro de " + ano);
		}
		if(mes == 02 || mes == 2) {
			System.out.println("Você nasceu em " + dia + " de Fevereiro de " + ano);
		}
		if(mes == 03 || mes == 3) {
			System.out.println("Você nasceu em " + dia + " de Março de " + ano);
		}
		if(mes == 04 || mes == 4) {
			System.out.println("Você nasceu em " + dia + " de Abril de " + ano);
		}
		if(mes == 05 || mes == 5) {
			System.out.println("Você nasceu em " + dia + " de Maio de " + ano);
		}
		if(mes == 06 || mes == 6) {
			System.out.println("Você nasceu em " + dia + " de Junho de " + ano);
		}
		if(mes == 07 || mes == 7) {
			System.out.println("Você nasceu em " + dia + " de Julho de " + ano);
		}
		if(mes == 8) {
			System.out.println("Você nasceu em " + dia + " de Agosto de " + ano);
		}
		if(mes == 9) {
			System.out.println("Você nasceu em " + dia + " de Setembro de " + ano);
		}
		if(mes == 10) {
			System.out.println("Você nasceu em " + dia + " de Outubro de " + ano);
		}
		if(mes == 11) {
			System.out.println("Você nasceu em " + dia + " de Novembro de " + ano);
		}
		if(mes == 12) {
			System.out.println("Você nasceu em " + dia + " de Dezembro de " + ano);
		}
		

	}

}
