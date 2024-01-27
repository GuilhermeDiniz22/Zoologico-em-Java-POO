package Zoologico;

import java.util.Scanner;

public class Veterinario extends Funcionario {
	
	private String registroCRM;
	
	private Animal animal; //injeção da classe animal que serve de base para leao e gorila
	
	private Scanner scan;
	
	public Veterinario(String nome, String sobrenome, String rg, String registroCRM) {
		super(nome, sobrenome, rg);
		this.registroCRM = registroCRM;
		this.scan = new Scanner(System.in);
	}

	public String getRegistroCRM() {
		return registroCRM;
	}
	
	public void curar(Animal animal) {
		System.out.println("O veterinario " + this.nome + 
				"com registro de número: " +  this.getRegistroCRM() + " tratou do animal: " 
				+ animal.nome );
		animal.saudavel = true;
	}
	
	public Veterinario contratarVeterinario() {
        System.out.println(" [1] Digite o nome do veterinario ");
        String nome = scan.nextLine();
        System.out.println(" [2] Digite o sobrenome do veterinario ");
        String sobrenome = scan.nextLine();
        System.out.println(" [3] Digite o rg do veterinario ");
        String rg = scan.nextLine();
        System.out.println(" [4] Digite o registro do veterinario ");
        String registro = scan.nextLine();
        
        var novoVeterinario = new Veterinario(nome, sobrenome, rg, registro);
        return novoVeterinario;
    }
}
