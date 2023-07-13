package uninter;

import java.util.Scanner;

public class Menu {
	Cofrinho c = new Cofrinho();
	Scanner teclado = new Scanner(System.in);
	
	public void menuVisual() {
		System.out.println("Bem-vindo ao Cofrinho!");
		System.out.println("1-Adicionar Moeda");
		System.out.println("2-Remover Moeda");
		System.out.println("3-Listar Moeda");
		System.out.println("4-Calcular total convertido para Real");
		System.out.println("0-Encerrar");
	}
	/*o método menuVisual() foi separado do menuOpcoes() para deixar uma melhor
	 compreenção da lógica utilizada no método menuOpcoes()*/
	
	public void menuEscolha() {
		System.out.println("Escolha o tipo de Moeda:");
		System.out.println("1-Real");
		System.out.println("2-Dolar");
		System.out.println("3-Euro");
	}
	/*o método menuEscolha() foi criado pois essa séries de prints com mensagens 
	 iriam repetir algumas vezes dificultando a compreenção do código
	 */
	
	public void menuOpcoes() {
		menuVisual();
		double opcao = teclado.nextDouble();
		if(opcao==1) {
			menuAdicionar();
		}else if(opcao==2) {
			menuRemover();
		/* tanto o primeiro if da linha 34 quanto o segundo else if da linha 36 optei
		 * por criar métodos para não deixar um código todo emaranhado*/
		}else if(opcao==3) {
			System.out.println("Este e o seu dinheiro: ");
			c.listagemMoedas();
			menuOpcoes();
		//recursão para o método executar novamente
		}else if(opcao==4) {
			double dinheiroConvertido = c.totalConvertido();	
			System.out.println("Total convertido para Real: "+dinheiroConvertido);
			menuOpcoes();
		}else if(opcao==0){
			return;
		//return para encerrar o método
		}else {
			System.out.println("Opcao invalida!");
			menuOpcoes();
		/*caso inserido algum valor que não seja 1,2,3,4 ou 0 dará na mensagem de opção inválida e 
		 * executando novamente o método para que seja inserido um valor válido*/
		}
	}

	public void menuAdicionar() {
		menuEscolha();
		double opcaoMoeda = teclado.nextDouble();
		if(opcaoMoeda==1) {
			System.out.println("Digite o valor que ira adicionar: ");
			Real r = new Real(teclado.nextDouble());
			c.adicionar(r);
			menuOpcoes();
		}else if(opcaoMoeda==2){
			System.out.println("Digite o valor que ira adicionar: ");
			Dolar d = new Dolar(teclado.nextDouble());
			c.adicionar(d);
			menuOpcoes();
		}else if(opcaoMoeda==3){
			System.out.println("Digite o valor que ira adicionar: ");
			Euro eu = new Euro(teclado.nextDouble());
			c.adicionar(eu);
			menuOpcoes();
		}else {
			System.out.println("Opcao invalida!");
			menuOpcoes();
		}
	}
	/*Se for inserido um valor válido no método menuAdicionar() cairá em um dos if criando uma nova
	 * instancia de uma classes das moedas(Real,Dolar e Euro), acionando o método adicionar() na
	 * classe Cofrinho e logo após voltando para o método menuOpcoes para ser realizadas novas operações*/
	
	public void menuRemover() {
		menuEscolha();
		double opcaoMoeda = teclado.nextDouble();
		if(opcaoMoeda==1) {
			System.out.println("Digite o valor que ira remover: ");
			Real r = new Real(teclado.nextDouble());
			c.remover(r);
			menuOpcoes();
		}else if(opcaoMoeda==2){
			System.out.println("Digite o valor que ira remover: ");
			Dolar d = new Dolar(teclado.nextDouble());
			c.remover(d);
			menuOpcoes();
		}else if(opcaoMoeda==3){
			System.out.println("Digite o valor que ira remover: ");
			Euro eu = new Euro(teclado.nextDouble());
			c.remover(eu);
			menuOpcoes();
		}else {
			System.out.println("Opcao invalida!");
			menuOpcoes();
		}
	}
	/*Método semelhante ao menuAdicionar porém com a alteração de que o método remover() na classe
	 * Cofrinho é acionado ao invés do método adicionar()*/
}

