package PolimorfismoExercicios;

public class preguica implements Animal {
	
	@Override
	public void nome() {
		System.out.println("O nome da preguiça é Dona Preguica.");
		
	}

	@Override
	public void idade() {
		System.out.println( " ela tem 10 anos de idade.");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("A preguiça boceja e faz: UASHASJOAMAOXSAKIJSAIJS");
			
	}
}