package empresa;

import java.util.Scanner;

public class Menu {
	
	public void exibirMenu() {
		Scanner teclado = new Scanner(System.in);
		Cofrinho c = new Cofrinho();
		System.out.println("COFRINHO: ");
		System.out.println("1-Adicionar Moeda");
		System.out.println("2-Remover Moeda");
		System.out.println("3-Listar Moeda");
		System.out.println("4-Calcular total convertido para Real");
		System.out.println("0-Encerrar");		
		String opcao = teclado.next();
		switch (opcao) {
			case "0":
				System.out.println("Encerrando programa!");
				break;
			default:
				System.out.println("Opcao invalidada");
				System.out.println("-----");
				exibirMenu();
				break;
			case "1":
				exibirMenuMoeda();
				menuAddMoeda();
				exibirMenu();
				break;
			case "2":
				exibirMenuMoeda();
				menuRemoveMoeda();
				exibirMenu();
				break;
			case "3":
				c.listagemMoedas();
				exibirMenu();
			case "4":
				double totalConvertido = c.totalConvertido();
				System.out.println("O total converitdo para Real: "+totalConvertido);
				exibirMenu();
				break;
		}
		
	}
	public void exibirMenuMoeda() {
		System.out.println("Escolha a Moeda");
		System.out.println("1-Real");
		System.out.println("2-Dolar");
		System.out.println("3-Euro");
	}
	
	private void menuAddMoeda() {
		Moeda moeda=null;
		Scanner teclado = new Scanner(System.in);
		Cofrinho c = new Cofrinho();
		int opcaoDeMoeda = teclado.nextInt();
		if(opcaoDeMoeda == 1) {
			System.out.println("Digite valor da moeda: ");
			String valorMoedaString = teclado.next();
			valorMoedaString = valorMoedaString.replace(",", ".");
			double valorMoeda = Double.parseDouble(valorMoedaString);
			moeda = new Real(valorMoeda);
		}else if(opcaoDeMoeda == 2){
			System.out.println("Digite valor da moeda: ");
			String valorMoedaString = teclado.next();
			valorMoedaString = valorMoedaString.replace(",", ".");
			double valorMoeda = Double.parseDouble(valorMoedaString);
			moeda = new Dolar(valorMoeda);
		}else if(opcaoDeMoeda == 3) {
			System.out.println("Digite valor da moeda: ");
			String valorMoedaString = teclado.next();
			valorMoedaString = valorMoedaString.replace(",", ".");
			double valorMoeda = Double.parseDouble(valorMoedaString);
			moeda = new Euro(valorMoeda);	
		}else {
			System.out.println("Moeda invalida");
			exibirMenu();
		}
		c.adicionar(moeda);
	}
	
	private void menuRemoveMoeda() {
		Moeda moeda=null;
		Scanner teclado = new Scanner(System.in);
		Cofrinho c = new Cofrinho();
		int opcaoDeMoeda = teclado.nextInt();
		if(opcaoDeMoeda == 1) {
			System.out.println("Digite valor da moeda: ");
			String valorMoedaString = teclado.next();
			valorMoedaString = valorMoedaString.replace(",", ".");
			double valorMoeda = Double.parseDouble(valorMoedaString);
			moeda = new Real(valorMoeda);
		}else if(opcaoDeMoeda == 2){
			System.out.println("Digite valor da moeda: ");
			String valorMoedaString = teclado.next();
			valorMoedaString = valorMoedaString.replace(",", ".");
			double valorMoeda = Double.parseDouble(valorMoedaString);
			moeda = new Dolar(valorMoeda);
		}else if(opcaoDeMoeda == 3) {
			System.out.println("Digite valor da moeda: ");
			String valorMoedaString = teclado.next();
			valorMoedaString = valorMoedaString.replace(",", ".");
			double valorMoeda = Double.parseDouble(valorMoedaString);
			moeda = new Euro(valorMoeda);
		}else {
			System.out.println("Moeda invalida");
			exibirMenu();
		}
		c.adicionar(moeda);
	}
}
