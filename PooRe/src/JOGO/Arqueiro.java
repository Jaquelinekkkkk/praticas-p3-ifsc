package JOGO;

public class Arqueiro extends Personagem {

	public Arqueiro(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void atacar() {
		System.out.println(nome + "atira uma flecha!");
		
	}
	@Override 
	
   public String toString() {
	return "Arqueiro: " +  nome;
  } 
	
}