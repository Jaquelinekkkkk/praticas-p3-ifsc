package ifsc;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Tutor jaque = new Tutor();
jaque.setNomeCompleto("Jaqueline");
Tutor paula = new Tutor();
paula.setNomeCompleto("Maria Paula");
Tutor bruna = new Tutor();
bruna.setNomeCompleto("Bruna Caroline");


Gato sucata = new Gato();
sucata.setApelido("su");
sucata.setClasse("Canis");
sucata.setNomeCientifico("Leao peqieno");
sucata.setPedigree("Cachorro");
Gato duque = new Gato();
duque
Gato terra = new Gato();

ArrayList<Tutor> tutores = new ArrayList<>();
tutores.add(jaque);
tutores.add(paula);
tutores.add(bruna);

for(Tutor tutor : tutores);
System.err.println(tutor.getNomeCompleto());
Gato gato = tutor.getGato();
	}

}
