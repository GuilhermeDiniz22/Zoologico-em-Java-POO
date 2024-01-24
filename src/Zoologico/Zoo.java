package Zoologico;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Zoo {
	
	private List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	private List<Animal> animais = new ArrayList<Animal>();

	public Zoo() {
		
	}
	
	public void adicionarAnimal(Animal animal) {
		this.animais.add(animal);
	}
	
	public void removerAnimal(Animal animal) {
		this.animais.remove(animal);
	}
	
	public void listarAnimais() {
		for (Animal animal : animais) {
			System.out.println(animal);
		}
	}
	
	public void alimentarAnimais() {
		for (Animal animal : animais) {
			animal.peso+=1;
		}
	}
	
	public void adicionarFuncionario(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}
	
	public void removerFuncionario(Funcionario funcionario) {
		this.funcionarios.remove(funcionario);
	}
	
	public void listarFuncionarios() {
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
		}
	}
	
	public void somAnimais() {
		for (Animal animal : animais) {
			animal.Som();
		}
	}
	
	public int quantidadeDeLeoes() {
		int quantidade = 0;
		for (Animal animal : animais) {
			if (animal instanceof Leao) {
				quantidade++;
			}
		}
		return quantidade;
	}
	
	public int quantidadeDeGorilas() {
		int quantidade = 0;
		for (Animal animal : animais) {
			if (animal instanceof Gorila) {
				quantidade++;
			}
		}
		return quantidade;
	}
	
	public int quantidadeDeVeterinarios() {
		int quantidade = 0;
		for (Funcionario funcionario : funcionarios) {
			if (funcionario instanceof Veterinario) {
				quantidade++;
			}
		}
		return quantidade;
	}
	
	public int quantidadeDeCuidadores() {
		int quantidade = 0;
		for (Funcionario funcionario : funcionarios) {
			if (funcionario instanceof Cuidador) {
				quantidade++;
			}
		}
		return quantidade;
	}
	
	public int quantidadeDeAnimais() {
		return animais.size();
	}
	
	public int quantidadeDeFuncionarios() {
		return funcionarios.size();
	}
	
	public List<Animal> get10Animais(){
		return animais.stream().limit(10).collect(Collectors.toList());
	}
	
	public void animaisMaisJovens(int idade) {
		animais.stream().filter(animal -> animal.idade < idade)
		.forEach(animal -> System.out.println(animal));
	}
	
	public void animaisDoentes() {
		animais.stream().filter(animal -> animal.saudavel == false)
		.forEach(animal -> System.out.println(animal));
	}

}
