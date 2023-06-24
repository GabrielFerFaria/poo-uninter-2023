package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		int palpite = teclado.nextInt();
		int valorCorreto = 10000;
		String msg;
		
		
		/*int idade=10;
		if(!(idade >5))
		assim faz negação em java*/
		
		
		while(palpite != valorCorreto) {
			msg = palpite>valorCorreto?"Um pouco menos...":"Um pouco mais..."; //uma forma diferente de fazer
			System.out.println(msg);
			/*if(palpite>valorCorreto) {
				System.out.println("Um pouco menos...");
			}
			else {
				System.out.println("Um pouco mais...");
			}*/
			System.out.println("Digite outro palpite");
			palpite = teclado.nextInt();
		}
		
		System.out.println("Parabens, acertou!");
		
		/*
		 assim é um comentário em multiplas linhas
		 */

	}

}
