package com.ex.heranca;

public class Animal {
	
	protected String nome;
	protected double Peso;
	
	
	public Animal() {

	}
	
	public Animal(String nome, double peso) {
		super();
		this.nome = nome;
		Peso = peso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return Peso;
	}
	public void setPeso(double peso) {
		Peso = peso;
	}	

}
