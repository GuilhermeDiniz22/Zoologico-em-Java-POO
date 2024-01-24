package Zoologico;

public class Cuidador extends Funcionario {
	
	private Animal animal;
	
	private Zoo zoo;
	
	public Cuidador(String nome, String sobrenome, String rg, String cargo) {
		super(nome, sobrenome, rg, cargo);
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
	
}
