package ESCOLA;

public class Professor extends Membro {

	public Professor(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	public void acao() {
		System.out.println(nome + "  esta lecionando uma aula");
		
	}
	@Override
	public String toString() {
		return "Professor: " + nome;
	}

}
