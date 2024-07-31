package ESCOLA;

public class Escola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Membro professor = new Professor("Carlos");
	        Membro aluno = new Aluno("Mariana");
	        Membro funcionario = new Funcionario("Pedro");

	        professor.acao();
	        aluno.acao();
	        funcionario.acao();

	        System.out.println(professor);
	        System.out.println(aluno);
	        System.out.println(funcionario);
    }
}