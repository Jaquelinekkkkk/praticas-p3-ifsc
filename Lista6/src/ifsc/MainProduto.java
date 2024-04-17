package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {

		ArrayList<Desktop> desktops = new ArrayList<>();

		Desktop d1 = new Desktop();
		d1.setCodBarras(1235l);
		d1.setFabricante("Positivo");
		d1.setGamer(true);

		ArrayList<String> pecas = new ArrayList<>();
		pecas.add("Mouse");
		pecas.add("Teclado");
		pecas.add("Monitor");
		pecas.add("Gabinete");
		pecas.add("Som");

		d1.setPecas(pecas);

		Desktop d2 = new Desktop();
		d2.setCodBarras(3728l);
		d2.setFabricante("Dell");
		d2.setGamer(false);

		ArrayList<String> pecas2 = new ArrayList<>();
		pecas2.add("Mouse");
		pecas2.add("Teclado");
		pecas2.add("Monitor");
		pecas2.add("Gabinete");
		pecas2.add("Som");

		d2.setPecas(pecas2);

		Desktop d3 = new Desktop();
		d3.setCodBarras(3728l);
		d3.setFabricante("HP");
		d3.setGamer(false);

		ArrayList<String> pecas3 = new ArrayList<>();
		pecas3.add("Mouse");
		pecas3.add("Teclado");
		pecas3.add("Monitor");
		pecas3.add("Gabinete");
		pecas3.add("Som");

		d3.setPecas(pecas3);

		desktops.add(d1);
		desktops.add(d2);
		desktops.add(d3);

		for (Desktop desktop : desktops) {
			System.out.println(desktop.getFabricante());
			System.out.println(desktop.getGamer());
			System.out.println(desktop.getCodBarras());

			for (String pecaSalva : desktop.getPecas()) {
				System.out.println(pecaSalva);
			}
		}
		ArrayList<Smartphone> smartphones = new ArrayList<>();

		Smartphone s1 = new Smartphone();
		s1.setModelo("iPhone13");
		s1.setDimensoesTela("146,7x71,5x7,65mm");
		s1.setCodBarras(9344l);
		s1.setFabricante("Apple");

		smartphones.add(s1);

		Smartphone s2 = new Smartphone();
		s2.setModelo("MotoG8");
		s2.setDimensoesTela("16.1×7.5×0.9cm");
		s2.setCodBarras(2278l);
		s2.setFabricante("Motorola");

		smartphones.add(s2);

		Smartphone s3 = new Smartphone();
		s3.setModelo("Galaxy Pocket");
		s3.setDimensoesTela("104 x 58 x 12 mm");
		s3.setCodBarras(1199l);
		s3.setFabricante("Samsung");

		smartphones.add(s3);

		for (Smartphone smartExibe : smartphones) {
			System.out.println(smartExibe.getModelo());
			System.out.println(smartExibe.getDimensoesTela());
			System.out.println(smartExibe.getCodBarras());
			System.out.println(smartExibe.getFabricante());
		}
	}

}
