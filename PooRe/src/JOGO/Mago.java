package JOGO;

public class Mago extends Personagem{

	public Mago(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
		
	}
	@Override
	
	public void atacar() {
		System.out.println(nome + "lanca uma bola de fogo!");
		
	}
	@Override 
	public String toString() {
		return "Mago: " + nome;
	}

}
