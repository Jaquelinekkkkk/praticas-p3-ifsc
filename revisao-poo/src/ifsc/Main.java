package ifsc;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tutor jaque = new Tutor();
		jaque.setNomeCompleto("Jaqueline");

		Gato sucata = new Gato();
		sucata.setApelido("Alumínio");
		sucata.setClasse("Canis");
		sucata.setNomeCientifico("Leao pequeno");
		sucata.setPedigree("Cachorro");
		jaque.setGato(sucata);
		
		Tutor paula = new Tutor();
		paula.setNomeCompleto("Maria Paula");

		Gato duque = new Gato();
		duque.setApelido("King");
		duque.setClasse("Nobreza");
		duque.setNomeCientifico("Sangue azul");
		duque.setPedigree("Com pelo");
		paula.setGato(duque);
		
		Tutor bruna = new Tutor();
		bruna.setNomeCompleto("Bruna Caroline");

		Gato terra = new Gato();
		terra.setApelido("Terráqueo");
		terra.setClasse("Terrestre");
		terra.setNomeCientifico("Marítimo");
		terra.setPedigree("Ave");
		bruna.setGato(terra);

ArrayList<Tutor> tutores = new ArrayList<>();
 tutores.add(jaque);
 tutores.add(paula);
 tutores.add(bruna);

for(Tutor tutor : tutores) {
System.out.println(tutor.getNomeCompleto());
Gato gato = tutor.getGato();
System.out.println("Apelido:");
System.out.println(gato.getApelido());
System.out.println("Nome cientifico:");
System.out.println(gato.getNomeCientifico());
System.out.println("Classe:");
System.out.println(gato.getClasse());
System.out.println("Pedigree:");
System.out.println(gato.getPedigree());
}

}

}