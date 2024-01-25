package Zoologico;

import java.util.Scanner;

public class Cuidador extends Funcionario {
	
	private Animal animal;
	
	private Zoo zoo;
	
	private Scanner scan;
	
	public Cuidador(String nome, String sobrenome, String rg) {
		super(nome, sobrenome, rg);
		this.scan = new Scanner(System.in);
	}
	
	public void alimentar(Animal animal) {
		if(animal.peso > 200) {
			animal.saudavel = false;
			System.out.println("É necessário curar o animal, com um veterinário ou fazendo exercisios." + "\n");
		}
		
		System.out.println("O cuidador " + this.nome + " alimentou o animal " + animal.nome + "\n");
		animal.peso += 1;
	}
	
	public void exercitarAnimal(Animal animal) {
		System.out.println("O cuidador " + this.nome + " exercitou o animal " + animal.nome + "\n");
		animal.peso -= 1;
	}
	
	public void limparJaulas() {
		System.out.println("O cuidadores limparam as jaulas dos animais " + "\n");
	}
	
	public void mudarHabitat(Animal animal, String novoHabitat) {
		System.out.println("O cuidador " + this.nome + " mudou o habitat do animal " + animal.nome + "\n");
        animal.habitat = novoHabitat;
    }
	
	public Cuidador contratarCuidador() {
        System.out.println(" [1] Digite o nome do cuidador ");
        String nome = scan.nextLine();
        System.out.println(" [2] Digite o sobrenome do cuidador ");
        String sobrenome = scan.nextLine();
        System.out.println(" [3] Digite o rg do cuidador ");
        String rg = scan.nextLine();
        
        var novoCuidador = new Cuidador(nome, sobrenome, rg);
        return novoCuidador;
    }
	
}
