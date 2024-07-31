package ESCOLA;

public class Aluno extends Membro{

	public Aluno(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void acao() {
		System.out.println(nome + " esta estudando");
	}
		
	
	@Override
	public String toString() {
		return "Aluno: " + nome;
	}
	

}
