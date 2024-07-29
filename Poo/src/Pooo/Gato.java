package Pooo;

public class Gato extends AbstractAnimal{
	public Gato(String nome){
		super(nome,4);
		
	}

	@Override
	public String emitirSom() {
		return "miau";

	}
	@Override
	public String getEspecie() {
		return "Gato";
	}

}
