package SAUDE;

public class Respiratoria extends Paciente {

	public Respiratoria(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void monitorar() {
		System.out.println(nome + "esta monitorando a funcao pulmonar");
		
	}
	@Override
	public void tratar() {
		System.out.println(nome + "Esta utilizando um inalador");
		
	}
	@Override
	public String toString() {
		return "Paciente com Doenca respiratoria: " + nome;
	}
	

}
