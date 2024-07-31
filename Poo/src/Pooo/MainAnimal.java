package Pooo;

public class MainAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractAnimal vaca = new Vaca("Mimosa");
		AbstractAnimal gato = new Gato("Tom");
		AbstractAnimal ovelha = new Ovelha("Dolly");
		//Classe anonima
		AbstractAnimal galinha = new AbstractAnimal("Mel",2) {
		@Override
		public String emitirSom() {
			return "pópópó";
		}
		@Override 
		public String getEspecie() {
			return "Galinha";
		}
	};
		vaca.falar();
		gato.falar();
		ovelha.falar();
		galinha.falar();

	}

}
