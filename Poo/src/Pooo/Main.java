package Pooo;

public class Main {

	public static void main(String[] args) {
		//Paciente p = new Paciente("Renato", "123", "1");

		AbstractPessoa p = new Paciente("Renato", "123", "1");
		//System.out.println(p.nome);
		//System.out.println(p.cpf);
				
		p.print();
		System.out.println(p);
		System.out.println();
		
		//formas de casting
		System.out.println(((Paciente)p).codigo);//casting de conversao
		Paciente paciente = (Paciente)p;
		System.out.println(paciente.codigo);
		
		float i = (float)5/2f;//casting de conversao
		System.out.println(i);

	}

}
