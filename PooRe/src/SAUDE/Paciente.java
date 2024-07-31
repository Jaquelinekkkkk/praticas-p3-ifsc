package SAUDE;

public abstract class Paciente {
	String nome;
	public Paciente (String nome) {
		this.nome = nome;
	}
	public abstract void monitorar();
	
	public abstract void tratar();
	
	@Override
	public String toString() {
		return "Paciente:" +nome;
		
	}
	
	

}
