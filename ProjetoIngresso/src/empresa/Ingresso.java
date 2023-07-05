package empresa;

public class Ingresso {
	String  nomeEvento;
	double valor;
	
	void info() {
		System.out.println("Nome Evento: "+ nomeEvento);
		System.out.println("Valor Ingresso: "+ valor);
	}

	public Ingresso(String nomeEvento, double valor) {
		this.nomeEvento = nomeEvento;
		this.valor = valor;
	}
	
}
