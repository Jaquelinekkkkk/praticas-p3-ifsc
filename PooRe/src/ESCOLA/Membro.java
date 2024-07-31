package ESCOLA;

public abstract class Membro {
	String nome;
	public Membro(String nome) {
		this.nome = nome;
	}
	public abstract void acao();
	public String toString(){
		return "Membro: " + nome;
	}
}
