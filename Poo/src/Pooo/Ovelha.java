package Pooo;

public class Ovelha extends AbstractAnimal {
	public Ovelha(String nome) {
		super(nome,4);
		
	}

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return "beehhh";
		
	}
	@Override
	public String getEspecie() {
		return "Ovelha";
	}

}
