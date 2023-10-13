package ifsc;

import java.util.ArrayList;

public class MainProduto {
	public static void main(String[] args) {
		ArrayList<Desktop> vetor = new ArrayList<>();
		ArrayList<Smartphone> vetor2 = new ArrayList<>();
		ArrayList<String> pecas1 = new ArrayList<>();
		ArrayList<String> pecas2 = new ArrayList<>();
		ArrayList<String> pecas3 = new ArrayList<>();
		Desktop positivo = new Desktop();
		positivo.setFabricante("positivo");
		positivo.setCodBarras(92037622L);
		positivo.setGamer(false);
		pecas1.add("gabinete");
		pecas1.add("placa-mãe");
		pecas1.add("processador");
		pecas1.add("memoria ram");
		pecas1.add("fonte");
		pecas1.add("HD");
		positivo.setPecas(pecas1);

		Desktop pcgamer = new Desktop();
		pcgamer.setFabricante("Dell");
		pcgamer.setCodBarras(90887342L);
		pcgamer.setGamer(true);
		pecas2.add("gabinete");
		pecas2.add("placa-mãe");
		pecas2.add("processador");
		pecas2.add("memoria ram");
		pecas2.add("fonte");
		pecas2.add("SSD");
		pcgamer.setPecas(pecas2);

		Desktop pc = new Desktop();
		pc.setFabricante("Dell");
		pc.setCodBarras(11234576L);
		pc.setGamer(true);
		pecas3.add("gabinete");
		pecas3.add("placa-mãe");
		pecas3.add("processador");
		pecas3.add("memoria ram");
		pecas3.add("fonte");
		pecas3.add("SSD");
		pc.setPecas(pecas3);

		vetor.add(positivo);
		vetor.add(pcgamer);
		vetor.add(pc);

		Smartphone m23 = new Smartphone();
		m23.setFabricante("Samsung");
		m23.setCodBarras(67899976L);
		m23.setDimensoestela("6,57 polegadas");
		m23.setNumCameras(3);

		Smartphone redimi = new Smartphone();
		redimi.setFabricante("xiomi");
		redimi.setCodBarras(62894956L);
		redimi.setDimensoestela("6,55 polegadas");
		redimi.setNumCameras(3);

		Smartphone iphone = new Smartphone();
		iphone.setFabricante("apple");
		iphone.setCodBarras(90094945L);
		iphone.setDimensoestela("20 polegadas");
		iphone.setNumCameras(15);

		vetor2.add(m23);
		vetor2.add(redimi);
		vetor2.add(iphone);

		for (Desktop desktop : vetor) {
			System.out.println(desktop.getFabricante());
			System.out.println(desktop.getCodBarras());
			System.out.println(desktop.getGamer());
			for (String item : desktop.getPecas()) {
				System.out.println(item);
			}
			System.out.println("");
		}

		for (Smartphone smartphone : vetor2) {
			System.out.println(smartphone.getFabricante());
			System.out.println(smartphone.getCodBarras());
			System.out.println(smartphone.getDimensoestela());
			System.out.println(smartphone.getNumCameras());
			System.out.println("");
		}
	}

}
