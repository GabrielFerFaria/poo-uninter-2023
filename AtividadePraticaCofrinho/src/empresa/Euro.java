package empresa;

public class Euro extends Moeda {

	public Euro(double valor) {
		super(valor);
		
	}

	@Override
	public void info() {
		System.out.println("Euro - "+valor);
		
	}

	@Override
	public double converter() {
		this.valor=valor*5.40;
		//cotacao euro dia 17/07/2023
		return this.valor;
	}


}
