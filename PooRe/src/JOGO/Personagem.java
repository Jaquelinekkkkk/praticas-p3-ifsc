package JOGO;

public abstract class Personagem {

	String nome;
	public Personagem(String nome) {
		this.nome = nome;
	
		
	}
	public abstract void atacar();
	
	@Override
	public String toString() {
		return "Personagem: " + nome;
	}

}


