package PolimorfismoExercicios;

public class TesteAnimal {

	
	public static void infoAnimal (Animal animal) {
		animal.nome();
		animal.idade();
		animal.emitirSom();			
	}
	
	public static void main(String[] args) {
							
		infoAnimal(new cachorro());
		infoAnimal(new cavalo());
		infoAnimal(new preguica());
		
	}
}
	
