package uninter;

public class Dolar extends Moeda {

	public Dolar(double valor) {
		super(valor);
	}

	@Override
	public void info() {
		System.out.println("Dolar - "+valor);
	}

	@Override
	public double converter() {
		this.valor=valor*4.90;
		//cotação dolar dia 10/07/2023
		return valor;
	}

}
