package SAUDE;

public class Saude {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paciente paciente1 = new Cardiovascular("Miguel");
		Paciente paciente2 = new Diabetes("Pedro");
		Paciente paciente3 = new Respiratoria("Tobias");
	   
		paciente1.monitorar();
		paciente1.tratar();
	
		paciente2.monitorar();
		paciente2.tratar();
		
		paciente3.monitorar();
		paciente3.monitorar();
		
		System.out.println(paciente1);
		System.out.println(paciente2);
		System.out.println(paciente3);

	}

}
