package ESPORTE;

public abstract class Atleta {
	String nome;
	public Atleta(String nome) {
		this.nome = nome;
		
	}
	public abstract void treinar();
	public abstract void competir();
	@Override
	public String toString() {
		return "Atleta: " + nome;
	}
	
	

}
