package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//ctrl+shift+o importa as coisas automatico
		System.out.println("Digite peso seguido de altura: ");
		Scanner teclado = new Scanner(System.in);
		int peso = teclado.nextInt();
		double altura = teclado.nextDouble();
		//double recebe informações usando PONTO como separador (ex: 1.5) 
		//mas na tela de receber informação ele usa o padrão do windows, se for BR é VÍRGULA(ex:1,5)
		double imc = peso / (altura * altura);
		
		System.out.printf("IMC: $.2f",imc);
		
		
	}

}
