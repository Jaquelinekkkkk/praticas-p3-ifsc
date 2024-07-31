package SAUDE;

public class Diabetes extends Paciente {

	public Diabetes(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void monitorar() {
		System.out.println(nome + "esta monitorando o seu nivel de glicose no sangue.");
		
	}
	@Override
	public void tratar() {
		System.out.println(nome + "esta tomando insulina.");
	}
	@Override
	public String toString() {
		return "Paciente com diabetes: " + nome;
	}
	

}
