package PolimorfismoExercicios;

public class preguica implements Animal {
	
	@Override
	public void nome() {
		System.out.println("O nome da pregui�a � Dona Preguica.");
		
	}

	@Override
	public void idade() {
		System.out.println( " ela tem 10 anos de idade.");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("A pregui�a boceja e faz: UASHASJOAMAOXSAKIJSAIJS");
			
	}
}