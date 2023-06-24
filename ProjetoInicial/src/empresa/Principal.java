 package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//System.out.println("Alo mamae!");
		//System.out.println("Alo papai!");
		
		int idade = 10;
		String nome = "Mario";
		idade = idade +2;
		double peso = 72.5;
		//float peso2 = 80.6f;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite idade, peso e nome: ");
		idade = teclado.nextInt();
		peso = teclado.nextDouble();
		nome = teclado.next();
		
		System.out.println();
		
		//ctrl+alt+seta para baixo copia a linha para baixo
		//sysout ctrl+espaco = comando system out
		System.out.println("Nome: "+ nome);
		System.out.println("Idade: " + idade);
		System.out.printf("Idade: %d\n",idade);
		System.out.printf("Peso: %.2f\n",peso);

		if(idade <18) {
			System.out.println("Acesso bloqueado");
		}
		else if(idade <65) {
			System.out.println("Adulto");
		}
		else {
			System.out.println("Adulto idoso");
		}
		for(int i=0;i<10;i++) {
			System.out.println("Valor: " + i);
		}
		
		//array
		//lista
		//existe uma classe no java chamada ArrayList que trabalha melhor os arrays
		int megaSena[] = {11,14,21,30,37,56};
		int numeros[] = new int[200];
		
		megaSena[0] = 10;
		numeros[60] = 50;
		
		
		
	}

}
