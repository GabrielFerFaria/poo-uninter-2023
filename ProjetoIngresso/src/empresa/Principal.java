package empresa;

public class Principal {

	public static void main(String[] args) {
		IngressoVip iv = new IngressoVip("Rock in Rio",200,100);
		iv.info();
		
		System.out.println();
		
		Ingresso i = new Ingresso("Rock in Rio",50);
		i.info();
	}

}
