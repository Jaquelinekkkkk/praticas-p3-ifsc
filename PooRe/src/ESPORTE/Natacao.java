package ESPORTE;

public class Natacao extends Atleta {

	public Natacao(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void treinar() {
		System.out.println(nome + " esta treinando estilo livro");
	}
	@Override
	public void competir() {
		System.out.println(nome + "esta competindo em uma semifinal" );
	}
	@Override
	public String toString() {
		return "Nadador: " + nome;
	}

}
