package Zoologico;

public class Leao extends Animal {

	public Leao(String nome, int idade, double peso, double altura, String raca, String habitat,  boolean saudavel) {
		super(nome, idade, peso, altura, raca, habitat, saudavel);
	}
	
	public void Som() {
		System.out.println("O leão " + nome + " está rugindo" + "\n");
	}
	
	public double calcularIMC() {
		return this.peso / this.altura * 2;
	}
	
	
	public void setIdade(int novaIdade) {
		this.idade = novaIdade;
	}
	
	public void getPeso() {
		System.out.println("O peso atual do " + this.nome + " é " + this.peso);
	}
	
	public void getAltura() {
		System.out.println("A altura do " + this.nome + " é " + this.altura);
	}
}
