package uninter;

import java.util.ArrayList;

public class Cofrinho {
	private ArrayList<Moeda>listaMoedas = new ArrayList<Moeda>();
	
	public void adicionar(Moeda moeda) {
		this.listaMoedas.add(moeda);
	}
	
	public boolean remover(Moeda moeda) {
		for (Moeda dinheiro : listaMoedas) {
			if(dinheiro.getClass().equals(moeda.getClass())){
				double subtrair = dinheiro.valor - moeda.valor;
				if (subtrair>0) {
					dinheiro.valor=subtrair;
				}else {
					listaMoedas.remove(dinheiro);
				}
				return true;
				//caso moeda foi encontrada e subtraida e atualizada
			}
		}
		return false;
		//caso moeda não foi encontrada na lista
	}
	
	public void listagemMoedas() {
		if(listaMoedas.isEmpty()) {
			System.out.println("Cofrinho Vazio!");
			System.out.println("-------");
			return;
		//caso o array listaMoedas está vazio ele informa e encerra o método
		}
			for(int i = 0; i<listaMoedas.size();i++) {
				Moeda moeda = listaMoedas.get(i);
				moeda.info();			}
	}
	
	public double totalConvertido() {
		double total =0;
		for(Moeda moeda : listaMoedas) {
			total+=moeda.converter();
		}
		return total;
	}

}
