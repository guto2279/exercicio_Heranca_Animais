package com.ex.heranca;

public class Cachorro extends Animal {

	private String raca;
	

	public Cachorro() {

	}

	public Cachorro(String nome, double peso, String raca) {
		super(nome, peso);
		this.raca = raca;
		
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raça) {
		this.raca = raça;
	}

	@Override
	public String toString() {
		return "Cachorro [raca=" + raca + ", nome=" + nome + ", Peso=" + Peso + "]";
	}
	
	
	
	
	
}
