package Zoologico;

public abstract class Funcionario {
	protected String nome;
	protected String sobrenome;
	protected String rg;
	protected String cargo;
	
	public Funcionario(String nome, String sobrenome, String rg) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.rg = rg;
	}
	
	public String toString() {
		return "Nome: " + this.nome + "\nSobrenome: " + this.sobrenome + 
				"\nRg: " + this.rg + "\n";
	}
}
