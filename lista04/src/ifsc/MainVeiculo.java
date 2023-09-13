package ifsc;

import java.util.ArrayList;

public class MainVeiculo {

	public static void main(String[] args) {
		
		ArrayList<Veiculo> veiculos = new ArrayList<>();
		
		Veiculo carro = new Veiculo();
		carro.setNome("Opala");
		carro.setAno(1992);
		carro.setNumrodas(4);
		carro.setFabricante("Chevrolet");
		carro.setCor("cinza");
		
		Veiculo caminhao = new Veiculo();
		caminhao.setNome("volvo fh16");
		caminhao.setAno(2016);
		caminhao.setNumrodas(4);
		caminhao.setFabricante("volvo");
		caminhao.setCor("preto");

		Veiculo aviao = new Veiculo();
		aviao.setNome("boeing 747");
		aviao.setAno(1969);
		aviao.setNumrodas(14);
		aviao.setFabricante("boeing");
		aviao.setCor("branco");

		
		veiculos.add(carro);
		veiculos.add(caminhao);
		veiculos.add(aviao);
		
		for (Veiculo veiculo : veiculos) {
			System.out.println(veiculo.getNome());
			System.out.println(veiculo.getAno());
			System.out.println(veiculo.getNumrodas());
			System.out.println(veiculo.getFabricante());
			System.out.println(veiculo.getCor());
			System.out.println("");
		}
		
		
	}
}
