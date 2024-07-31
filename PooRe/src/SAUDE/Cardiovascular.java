package SAUDE;

public class Cardiovascular extends Paciente {

	public Cardiovascular(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void monitorar() {
		System.out.println(nome + "esta monitorando a pressão0 arterial.");
		
	}
	@Override 
	public void tratar() {
		System.out.println(nome + "estta tomando medicamento para o coracao.");
		
	}
	@Override
	public String toString() {
		return "Paciente com problemas no sistemas cardiovascular: " + nome;
	}

}
