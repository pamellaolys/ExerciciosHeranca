package br.com.generation.heranca.exercicios.animal;

public class TestaSomAnimal extends Animal {

	public static void main(String[] args) {
		

		Cachorro cao1 = new Cachorro();
		Cavalo cavalo1 = new Cavalo();
		Preguica preguica1 = new Preguica();

		
		
		System.out.println("===Cachorro===");
		cao1.som();
		System.out.println();
		System.out.println("===Cavalo===");
		cavalo1.som();
		System.out.println();
		System.out.println("===Preguiça===");
		preguica1.som();
	}

}
