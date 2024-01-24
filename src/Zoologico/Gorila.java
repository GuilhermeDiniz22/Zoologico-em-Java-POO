package Zoologico;

public class Gorila extends Animal {
	

	public Gorila(String nome, int idade, double peso, double altura, String raca, String habitat, boolean saudavel) {
		super(nome, idade, peso, altura, raca, habitat, saudavel);
	}
	
	public void Som() {
		System.out.println("O gorila " + nome + "está grunhindo" + "\n");
	}
	
	public double calcularIMC() {
		return this.peso / this.altura * 2;
	}
	
	public void setIdade(int novaIdade) {
		this.idade = novaIdade;
	}
	
	
}
