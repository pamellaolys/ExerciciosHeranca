package br.com.generation.heranca.exercicios.animal;

public class TestaAnimal extends Animal {
	

	public static void main(String[] args) {
		
		Cachorro cao1 = new Cachorro();
		Cavalo cavalo1 = new Cavalo();
		Preguica preguica1 = new Preguica();
		
		
		cao1.setNome("Rex");
		cao1.setIdade(2);
		cao1.setSom("auau");
		
		cavalo1.setNome("Silver");
		cavalo1.setIdade(15);
		cavalo1.setSom("iiirrrr�");
		
		preguica1.setNome("Soninho");
		preguica1.setIdade(20);
		preguica1.setSom("Zzzzzzzzzz");
		
		System.out.println("===Cachorro===");
		System.out.println("O nome do cachorro �: "+cao1.getNome());
		System.out.println("A idade do cachorro �: "+cao1.getIdade());
		cao1.deveCorrer();
		
		System.out.println();
		
		System.out.println("===Cavalo===");
		System.out.println("O nome do cavalo �: "+cavalo1.getNome());
		System.out.println("A idade do cavalo �: "+cavalo1.getIdade());
		cavalo1.deveCorrer();
		
		System.out.println();
		
		System.out.println("===Pegui�a===");
		System.out.println("O nome da pregui�a �: "+preguica1.getNome());
		System.out.println("A idade da pregui�a �: "+preguica1.getIdade());
		preguica1.subirEmArvores();
		
		
	}

}
