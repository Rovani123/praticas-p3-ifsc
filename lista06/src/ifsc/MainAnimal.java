package ifsc;

public class MainAnimal {
	
	public static void main(String[] args) {
		
		Cachorro pintcher = new Cachorro();
		
		pintcher.setNome("pintcher");
		pintcher.setRaca("cachorro");
		pintcher.setComprimento(0.5f);
		pintcher.setNumpatas(5);
		pintcher.setCor("preto");
		pintcher.setEcossistema("Hell");
		
		Gato gato = new Gato();
		
		gato.setNome("The Cat");
		gato.setRaca("gato");
		gato.setComprimento(10f);
		gato.setNumpatas(4);
		gato.setCor("preto");
		gato.setEcossistema("rua");
		
		pintcher.caminha();
		pintcher.late();
		System.out.println(pintcher.getNome());
		System.out.println(pintcher.getRaca());
		System.out.println(pintcher.getComprimento());
		System.out.println(pintcher.getNumpatas());
		System.out.println(pintcher.getCor());
		System.out.println(pintcher.getEcossistema());
		
		System.out.println("");
		
		gato.caminha();
		gato.mia();
		System.out.println(gato.getNome());
		System.out.println(gato.getRaca());
		System.out.println(gato.getComprimento());
		System.out.println(gato.getNumpatas());
		System.out.println(gato.getCor());
		System.out.println(gato.getEcossistema());
		
	}

}
