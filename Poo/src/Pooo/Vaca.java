package Pooo;

public class Vaca extends AbstractAnimal {
	public Vaca(String nome){
	super(nome,4);

}

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return "muu";

	}
	@Override
	public String getEspecie() {
		return "Vaca";
	}
}