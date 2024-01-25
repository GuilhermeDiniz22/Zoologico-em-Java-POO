package Zoologico;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Zoo {
	
	private List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	private List<Animal> animais = new ArrayList<Animal>();
	
	private Scanner scan;
	
	private Cuidador cuidador;
	
	private Veterinario veterinario;
	
	private Leao leao;
	
	private Gorila gorila;

	public Zoo() {
		this.scan = new Scanner(System.in);
		this.leao = new Leao(null, 0, 0, 0, null, null, false);
		this.gorila = new Gorila(null, 0, 0, 0, null, null, false);
		this.cuidador = new Cuidador(null, null, null);
		this.veterinario = new Veterinario(null, null, null, null);
	}
	
	public void adicionarAnimal(Animal animal) {
		this.animais.add(animal);
	}
	
	public void removerAnimal(Animal animal) {
		this.animais.remove(animal);
	}
	
	public void listarAnimais() {
		if(this.animais.size() == 0) {
			System.out.println("Não há animais cadastrados.\n");
		}
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
		if(this.funcionarios.size() == 0) {
			System.out.println("Não há funcionarios cadastrados.\n");
		}
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
		}
	}
	
	public void somAnimais() {
		if(this.animais.size() == 0) {
			System.out.println("Não há animais cadastrados.\n");
		}
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
	
	public void escolhaConsole() {
		System.out.println(" [1] Listar todos os animais ");
		System.out.println(" [2] Listar todos os funcionarios ");
		System.out.println(" [3] Alimentar animais ");
		System.out.println(" [4] Ouvir som dos animais ");
		System.out.println(" [5] Limpar jaulas ");
		System.out.println(" [6] Adicionar Leão ");
		System.out.println(" [7] Adicionar Gorila ");
		System.out.println(" [8] Contratar Cuidador ");
		System.out.println(" [9] Contratar Veterinario ");
		int escolha = scan.nextInt();
		
		switch(escolha) {
			case 1:
				this.listarAnimais();
				escolhaConsole();
				break;
			case 2:
				this.listarFuncionarios();;
				escolhaConsole();
				break;
			case 3:
				this.alimentarAnimais();
				escolhaConsole();
				break;
			case 4:
				this.somAnimais();;
				escolhaConsole();
				break;
			case 5:
				cuidador.limparJaulas();
				escolhaConsole();
				break;
			case 6:
				Leao novoLeao = leao.criarLeao();
                this.adicionarAnimal(novoLeao);
                escolhaConsole();
				break;
			case 7:
				Gorila novoGorila = gorila.criarGorila();
                this.adicionarAnimal(novoGorila);
                escolhaConsole();
				break;
			case 8:
				Cuidador novoCuidador = cuidador.contratarCuidador();
                this.adicionarFuncionario(novoCuidador);
                escolhaConsole();
				break;
			case 9:
				Veterinario novoVet = veterinario.contratarVeterinario();
                this.adicionarFuncionario(novoVet);
                escolhaConsole();
				break;
			default:
				System.out.println(" Até a próxima ");
				break;
		}
	}
}
