package ESPORTE;

public class Basquete extends Atleta {

	public Basquete(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	@Override 
	public void  treinar() {
		System.out.println(nome + " esta treinando arremessos");
		
	}
	@Override
	public void competir() {
		System.out.println(nome + " esta em uma competicao");
		
	}
	@Override
	public String toString() {
		return "Jogador de Basquete: " + nome;
	}
	

}
