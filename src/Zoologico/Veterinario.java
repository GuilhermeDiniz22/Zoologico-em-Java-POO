package Zoologico;

public class Veterinario extends Funcionario {
	
	private String registroCRM;
	
	private Animal animal; //injeção da classe animal que serve de base para leao e gorila
	
	public Veterinario(String nome, String sobrenome, String rg, String cargo, String registroCRM) {
		super(nome, sobrenome, rg, cargo);
		this.registroCRM = registroCRM;
	}

	public String getRegistroCRM() {
		return registroCRM;
	}
	
	public void curar(Animal animal) {
		System.out.println("O veterinario " + this.nome + 
				"com registro de número: " +  this.getRegistroCRM() + "tratou do animal: " 
				+ animal.nome );
		animal.saudavel = true;
	}
	
}
