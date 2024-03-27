package ifsc;

public class Main {

	public static void main(String[] args) {
		// instanciar a classe		
		Pessoa jaqueline = new Pessoa();
		jaqueline.cpf = "123456";
		jaqueline.primeiroNome = "Jaqueline";
		jaqueline.sobrenome = "Brandao";
		
		System.out.println(jaqueline.cpf);
		System.out.println(jaqueline.primeiroNome);
		System.out.println(jaqueline.sobrenome);

		
		Pessoa mariana = new Pessoa();
		mariana.cpf = "78956";
		mariana.primeiroNome = "Mariana";
		mariana.sobrenome = "Azevedo";
		System.out.println(mariana.cpf);
		System.out.println(mariana.primeiroNome);
		System.out.println(mariana.sobrenome);
		
		Pessoa[] pessoas = new Pessoa[2];
		pessoas[0] = jaqueline;
		pessoas[1] = mariana;
		
		
		
	}

}
