package com.ex.heranca;

public class Execultavel {
	
	public static void main(String[] args) {
		
		Peixe peixe1 = new Peixe();
		Peixe peixe2 = new Peixe("Dori", 0.5, "Agua doce");
		Cachorro dog1 = new Cachorro();
		Cachorro dog2 = new Cachorro("Bob", 15,"Vira-Lata");
		
		peixe1.setNome("Nemo");
		peixe1.setPeso(0.6);
		peixe1.setTipoHabitat("Agua Salgada");
		
		dog1.setNome("Laureen");
		dog1.setPeso(20);
		dog1.setRaca("Bulldog francês");
		
		System.out.println(peixe1);
		System.out.println(peixe2);
		System.out.println(dog1);
		System.out.println(dog2);
		
		
		
	}
	
	

}
