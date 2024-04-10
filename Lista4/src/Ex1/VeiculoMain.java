package Ex1;

import java.util.ArrayList;

public class VeiculoMain {

	public static void main(String[] args) {

		Veiculo moto = new Veiculo();
		moto.setNome("Moto");
		moto.setAno(2013);
		moto.setCor("Vemelho");
		moto.setFabricante("Honda");
		moto.setRodas(2);

		
		Veiculo carro = new Veiculo();
		carro.setNome("Carro");
		carro.setAno(2014);
		carro.setCor("Preto");
		carro.setFabricante("Honda");
		carro.setRodas(4);
		
	
		 
		Veiculo caminhao = new Veiculo();
		caminhao.setNome("Caminhão");
		caminhao.setAno(2020);
		caminhao.setCor("Vemelho");
		caminhao.setFabricante("Honda");
		caminhao.setRodas(6);
		
		
		
		ArrayList<Veiculo> veiculos = new ArrayList<>();
		veiculos.add(moto);
		veiculos.add(carro);
		veiculos.add(caminhao);
		
		for (Veiculo veiculo : veiculos) {
			System.out.println(veiculo.getNome());
			System.out.println(veiculo.getAno());
			System.out.println(veiculo.getCor());
			System.out.println(veiculo.getFabricante());
			System.out.println(veiculo.getRodas());
		}
	}

}
