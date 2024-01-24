package Zoologico;

public class Cuidador extends Funcionario {
	
	private Animal animal;
	
	public Cuidador(String nome, String sobrenome, String rg) {
		super(nome, sobrenome, rg);
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
	
	public void limparJaula(Animal animal) {
		System.out.println("O cuidador " + this.nome + " limpou a jaula do animal " + animal.nome + "\n");
	}
	
	public void mudarHabitat(Animal animal, String novoHabitat) {
		System.out.println("O cuidador " + this.nome + " mudou o habitat do animal " + animal.nome + "\n");
        animal.habitat = novoHabitat;
    }
	
}
