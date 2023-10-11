package ifsc;

import java.util.ArrayList;

public class MainProduto {
	public static void main(String[] args) {
		ArrayList<Produto> vetor = new ArrayList<>();
		Produto panela = new Produto();
		panela.setNome("panela");
		panela.setCodBarras(12234223L);
		panela.setPreco(60.0);
		panela.setFornecedor("seu josé");

		Produto truco = new Produto();
		truco.setNome("truco");
		truco.setCodBarras(94759563L);
		truco.setPreco(2.99);
		truco.setFornecedor("seu josé");

		Produto livro = new Produto();
		livro.setNome("Manifesto comunista");
		livro.setCodBarras(76569533L);
		livro.setPreco(0.0);
		livro.setFornecedor("seu josé");

		vetor.add(panela);
		vetor.add(truco);
		vetor.add(livro);
		
		for (Produto produto : vetor) {
			System.out.println(produto.getNome());
			System.out.println(produto.getCodBarras());
			System.out.println(produto.getPreco());
			System.out.println(produto.getFornecedor());
			System.out.println("");
		}
	}

}
