package Ex1; 
 
public class PessoaMainA1 { 
 
	public static void main(String[] args) { 
 
		Pessoa jaqueline = new Pessoa(); 
		 
		jaqueline.nome = "Jaqueline"; 
		jaqueline.cpf = (long) 678506555; 
		jaqueline.dataNascimento = "13/04/2004"; 
 
		System.out.println(jaqueline.nome); 
		System.out.println(jaqueline.cpf); 
		System.out.println(jaqueline.dataNascimento); 
		 
	Pessoa tei = new Pessoa(); 
		 
		tei.nome = "Tei"; 
		tei.cpf = (long) 976570124; 
		tei.dataNascimento = "15/03/1985"; 
 
		System.out.println(tei.nome); 
		System.out.println(tei.cpf); 
		System.out.println(tei.dataNascimento); 
		 
	Pessoa maria= new Pessoa(); 
		 
		maria.nome = "Maria"; 
		maria.cpf = (long) 976547633; 
		maria.dataNascimento = "24/09/2008"; 
 
		System.out.println(maria.nome); 
		System.out.println(maria.cpf); 
		System.out.println(maria.dataNascimento); 
 
	} 
 
} 