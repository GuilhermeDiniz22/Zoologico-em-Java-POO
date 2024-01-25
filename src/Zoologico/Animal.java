package Zoologico;

import java.util.Scanner;

public abstract class Animal {
	protected String nome;
	protected int idade;
	protected double peso;
	protected double altura;
	protected String raca;
	protected String habitat;
	protected boolean saudavel;
	private Scanner scan;


	public Animal(String nome, int idade, double peso, double altura, String raca, String habitat, boolean saudavel) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		this.raca = raca;
		this.habitat = habitat;
		this.saudavel = saudavel;
		
	}
	
	public abstract void Som();
	
	public String toString() {
		String saudavelString = this.saudavel ? "sim" : "não";
	    
	    return "Raça: " + this.raca + "\nNome: " 
	    + this.nome + "\nIdade: " 
	    + this.idade + "\nPeso: "
	    + this.peso + "\nAltura: "
	    + this.altura + "\né saudável? "
	    + saudavelString + "\n";
	    
	}

	
}
