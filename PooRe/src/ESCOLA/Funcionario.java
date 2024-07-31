package ESCOLA;

public class Funcionario extends Membro {
	 public Funcionario(String nome) {
	        super(nome);
	    }

	    @Override
	    public void acao() {
	        System.out.println(nome + " esta na manutenaoo da escola.");
	    }

	    @Override
	    public String toString() {
	        return "Funcionario: " + nome;
	    }
	}