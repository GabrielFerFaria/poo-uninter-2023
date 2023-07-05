package empresa;

public class Principal {
	
	public static void main(String[] args) {
		LivroDigital ld= new LivroDigital("Senhor dos aneis",
				new Autor("Tolkien","Britanico","tolkien@email.com"),
				"Aventura",5,10000,35000);
		
		ld.info();
	}
}
