package JOGO;

public class Jogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personagem guerreiro = new Guerreiro ("Hangrid");
		Personagem mago = new Mago("Potter");
		Personagem arqueiro = new Arqueiro("Green");
		
		guerreiro.atacar();
		mago.atacar();
		arqueiro.atacar();
		
		System.out.println(guerreiro);
		System.out.println(mago);
		System.out.println(arqueiro);

	}

}
