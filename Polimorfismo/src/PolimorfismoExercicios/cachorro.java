package PolimorfismoExercicios;

	public class cachorro implements Animal {

	@Override
	public void nome() {
		System.out.println("O nome do cachorro e Edgar.");
		
	}

	@Override
	public void idade() {
		System.out.println("Edgar esta com 12 anos.");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("O cachorro late para o porteiro.");
		
	}

}

