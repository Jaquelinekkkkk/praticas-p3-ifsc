package Pooo;

public class Paciente extends AbstractPessoa{
	String nome;
	String codigo;
	public Paciente(String nome,
		        	String cpf, 
			        String codigo) {
		super(nome,cpf);
		super.nome = nome;
		this.nome = nome + "#";
		this.codigo = codigo;
		System.out.println("Criando paciente: " + nome);
		System.out.println("Codigo: " + codigo);
		
	}
	public Paciente(String nome, String cpf) {
	this (nome, cpf, "1");

   }
	@Override
	public void print() {
		System.out.println("===");
		super.print();
		System.out.println("Codigo: " + codigo);
		System.out.println("===");
	}
	@Override// opcional
	public String toString() {
		String res = "Nome: " + nome;
		res+="\n";
		res+="CPF: " + cpf;
		res+="\n";
		res+="Codigo: + codigo";
		System.out.println(super.toString());
		return res;
				
	}
}