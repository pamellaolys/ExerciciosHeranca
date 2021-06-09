package br.com.generation.heranca.exercicios.animal;

public class Animal {

	
	//atributos
	private String nome;
	private int idade;
	private String som;
	
	
	//comportamentos
	void som() {
		System.out.println("aaaaaaaaaa");
	}
	void correr() {
	}
	void subir() {	
	}
	
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getSom() {
		return som;
	}


	public void setSom(String som) {
		this.som = som;
	}
	
	
}
