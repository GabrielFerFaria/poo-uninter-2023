package empresa;

import java.util.ArrayList;


public class Cofrinho {
	private ArrayList<Moeda> listaMoedas = new ArrayList<>();
	
	public void adicionar(Moeda moeda) {
		this.listaMoedas.add(moeda);
	}
	
	public void remover(Moeda moeda) {
		this.listaMoedas.remove(moeda);
		
	}
	public void listagemMoedas(){
		if(listaMoedas.isEmpty()) {
			System.out.println("Cofrinho vazio");
			System.out.println("-------");
			return;
		}
		for(Moeda moeda: this.listaMoedas) {
			moeda.info();
		}
	}
	public double totalConvertido(){
		double total=0;
		if(listaMoedas.isEmpty()) {
			return 0;
		}
		for(Moeda moeda: this.listaMoedas) {
		total += moeda.converter();
		}
		return total;
		
	}
	
}
