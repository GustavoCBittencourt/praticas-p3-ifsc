package questao1;

import java.util.ArrayList;

public class ProdutoMain {

	public static void main(String[] args) {

		ArrayList<Desktop> desktops = new ArrayList<>();

		Desktop d1 = new Desktop();
		d1.setCodBarras(123l);
		d1.Fabricante("Dell");
		d1.setGamer(false);
		
		Desktop d2 = new Desktop();
		d2.setCodBarras1(123l);
		d2.Fabricante("Dell");
		d2.setGamer(false);

		ArrayList<String> pecas = new ArrayList<>();
		pecas.add("Mouse");
		pecas.add("monitor LG");

		d1.setPeças(pecas);

		desktops.add(d1);
		desktops.add(d2);
		
		Desktop d3 = new Desktop();
		
		for (Desktop objDaVez : desktops) {
			
			System.out.println(objDaVez.getFabricante());
			System.out.println(objDaVez.getCodBarras());
			System.out.println(objDaVez.isGamer());
			
			for(String peca : objDaVez.getPeças()) {
				System.out.println(peca);
			}
		}
		
		desktops.add(d3);

		ArrayList<smartphone> smartphones = new ArrayList<>();

		smartphone s1 = new smartphone();
		s1.setCodBarras(null);
		s1.setCor(null);
		s1.setDimensoesTela(null);
		s1.setFabricante(null);

		smartphone s2 = new smartphone();
		s2.setCodBarras(null);
		s2.setCor(null);
		s2.setDimensoesTela(null);
		s2.setFabricante(null);
		
		smartphones.add(s1);
		smartphones.add(s2);

	}

}
