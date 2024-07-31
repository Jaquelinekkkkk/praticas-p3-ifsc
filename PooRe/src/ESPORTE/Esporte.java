package ESPORTE;

public class Esporte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atleta atleta1 = new Futebol("Miguel");
		Atleta atleta2 = new Basquete("Jonas");
		Atleta atleta3 = new Natacao("Caim");
		
		atleta1.treinar();
		atleta1.competir();
		
		atleta2.treinar();
		atleta2.competir();
		
		atleta3.treinar();
		atleta3.competir();
		System.out.println(atleta1);
		System.out.println(atleta2);
		System.out.println(atleta3);

	}

}
