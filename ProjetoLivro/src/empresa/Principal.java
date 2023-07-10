package empresa;

public class Principal {
	
	public static void main(String[] args) {
		LivroDigital livroA= new LivroDigital("Senhor dos aneis",
				new Autor("Tolkien","Britanico","tolkien@email.com"),
				"Aventura",5,10000,35000);
		
		livroA.info();
		
		LivroFisico livroB = new LivroFisico("Sherlock Holmes",
				new Autor("Sir Arthur Conan Doyle","Britanico","arthur@email.com"),
				"Aventura",2,50000,2500);
		livroB.info();
		System.out.println();
		Livro livro;
		
		livro = livroA;
		livro.info();
		System.out.println();
		livro=livroB;
		livro.info();
	}
}
