package empresa;

public class Desktop extends Computador{
	
	double acessorios;
	
	
	@Override
	double calculaValor() {
		double total = 200*gbMemoria + 400*numProcessadores;
		return total;
	}


	public Desktop(int gbMemoria, int numProcessadores, double acessorios) {
		super(gbMemoria, numProcessadores);
		this.acessorios = acessorios;
	}



}
