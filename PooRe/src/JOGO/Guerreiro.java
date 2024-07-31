package JOGO;

public class Guerreiro extends Personagem {

	public Guerreiro(String nome) {
		super(nome);
	}
	@Override
	public void atacar() {
		System.out.println(nome + "ataca com uma espada!");
		
	}
	@Override
	public String toString() {
		return "Guerreiiro: " + nome;
		
	}

}
