package empresa;

public class Avaliacao {

	public static void main(String[] args) {
		
		Media mario = new Media(7,4,10);
		Media luigi = new Media();
		luigi.n1=8;
		luigi.n2=3;
		luigi.n3=7.5;
		
		System.out.println("Media Aritmetica do Mario: " + mario.mediaAritmetica());
		System.out.println("Media Ponderada do Mario: "+ mario.mediaPonderada());
		
		System.out.println("Media Aritmetica do Mario: " + luigi.mediaAritmetica());
		System.out.println("Media Ponderada do Mario: "+ luigi.mediaPonderada());
		
	}
}
