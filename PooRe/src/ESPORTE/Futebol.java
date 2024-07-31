package ESPORTE;

public class Futebol extends Atleta {

	public Futebol(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void treinar() {
		System.out.println(nome + " esta treinando penaltis");
	}
	@Override
	public void competir() {
		System.out.println(nome + " esta em uma partida de futebol");
		
	}
	@Override
	public String toString() {
		return "Jogador de futebol: " + nome;
	}
	

}
