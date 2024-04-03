package Ex2; 
 
import java.util.Scanner;

import Ex1.Pessoa; 

 
public class PessoaMainB { 
 
	public static void main(String[] args) { 
	 
              
		       Pessoa[] pessoas = new Pessoa[3]; 
		        
		       Scanner leitura = new Scanner(System.in); 
		       
		       for (int i = 0; i < pessoas.length; i++) { 
				//Instancia a classe pessoa 
		    	    
		    	Pessoa pessoa = new Pessoa(); 
		    	//preenche os valores nos atributos 
		    	 
		    	  System.out.println("Digite um nome.");	 
		  		 
				pessoa.nome = leitura.nextLine(); 
				//Armazena obj no vetor 
				 
				  System.out.println("Digite uma data de nascimento.");	 
					 
				 
				pessoa.dataNascimento = leitura.nextLine(); 
				 
				  System.out.println("Digite um CPF.");	 
					 
				pessoa.cpf = Long.valueOf(leitura.nextLine()); 
				pessoas[i] = pessoa; 
				System.out.println(pessoas[i]);
				 
			} 
		} 
}