package empresa;

public class Principal {

	public static void main(String[] args) {
		Cofrinho c = new Cofrinho();
		
		c.add(new Moeda("Euro",0.5));
		c.add(new Moeda("Euro",1));
		c.add(new Moeda("Euro",0.1));
		c.add(new Moeda("Euro",0.05));
		
		//desafio é fazer moedas de países diferentes e calcular tudo em real
		
		System.out.printf("O total no cofrinho e: %.2f",c.calcularTotal());
	}

}
