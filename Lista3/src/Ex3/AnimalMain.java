package Ex3;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal pato = new Animal();
		pato.popular = new String[5];
		pato.popular[0] = "Patinho";
		pato.popular[1] = "Patinha";
		pato.popular[2] = "Pata";
		pato.popular[3] = "Pato";
		pato.popular[4] = "Patos";
		
		nomeCientifico = "Nome científico: Anas platyrhynchos";
		familia = "Familia: Anatidae";
		reino = "Reino: Animalia";
		
		
		System.out.println(pato.popular[0]);
		System.out.println(pato.popular[1]);
		System.out.println(pato.popular[2]);
		System.out.println(pato.popular[3]);
		System.out.println(pato.popular[4]);
		
		System.out.println(pato.nomeCientifico);
		System.out.println(pato.familia);
		System.out.println(pato.reino);
		
		Animal cachorro = new Animal();
		cachorro.popular = new String[5];
		cachorro.popular = "Cachorro";
		cachorro.popular = "Cachorra";
		cachorro.popular = "Dog";
		cachorro.popular = "Cachorrinha";
		cachorro.popular = "Cachorrinho";
		
		nomeCientifico = "Nome científico: Canis lupus familiaris";
		familia = "Familia: Canídeos";
		reino = "Reino: Animalia";
		
		System.out.println(cachorro.popular[0]);
		System.out.println(cachorro.popular[1]);
		System.out.println(cachorro.popular[2]);
		System.out.println(cachorro.popular[3]);
		System.out.println(cachorro.popular[4]);
		
	    System.out.println(cachorro.nomeCientifico);
	    System.out.println(cachorro.familia);
	    System.out.println(cachorro.reino);
	}

}
