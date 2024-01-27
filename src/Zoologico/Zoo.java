package Zoologico;

import java.util.ArrayList;
import java.util.Collections;
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
		this.cuidador = new Cuidador(null, null, null, this);
		this.veterinario = new Veterinario(null, null, null, null);
	}
	
	public void adicionarAnimal(Animal animal) {
	    try {
	        if (this.animais != null) {
	            this.animais.add(animal);
	        } else {
	            System.out.println("Erro ao adicionar animal: objeto animais não inicializado.");
	        }
	    } catch (NullPointerException e) {
	        System.out.println("Erro ao adicionar animal: ocorreu uma NullPointerException.");
	    }
	}

	public void removerAnimal(Animal animal) {
	    try {
	        if (this.animais != null) {
	            this.animais.remove(animal);
	        } else {
	            System.out.println("Erro ao remover animal: objeto animais não inicializado.");
	        }
	    } catch (NullPointerException e) {
	        System.out.println("Erro ao remover animal: ocorreu uma NullPointerException.");
	    }
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
		try {
			
			if(animais.size() == 0) {
				System.out.println("Não há animais no zoo.\n");
			}
			else {
				for(Animal animal : animais) {	
					animal.peso+=1;
				}
				System.out.println("Os animais foram alimentados e engordaram.\n");
			}
			
		} catch (Exception e) {
			System.out.println("Algo deu errado " + e.getMessage());
		}
	} 
	
	
	public void adicionarFuncionario(Funcionario funcionario) {
	    try {
	        this.funcionarios.add(funcionario);
	    } catch (NullPointerException e) {
	        System.out.println("Erro ao adicionar funcionário: funcionario não inicializado.");
	    }
	}

	public void removerFuncionario(Funcionario funcionario) {
	    try {
	        this.funcionarios.remove(funcionario);
	    } catch (NullPointerException e) {
	        System.out.println("Erro ao remover funcionário: funcionario não inicializado.");
	    }
	}
	
	public Cuidador getCuidador() {
		for (Funcionario funcionario : funcionarios) {
			if (funcionario instanceof Cuidador) {
				return (Cuidador) funcionario;
			}
		}
		return null;
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
	
	
	public int quantidadeDeAnimais() {
		return animais.size();
	}
	
	public int quantidadeDeFuncionarios() {
		return funcionarios.size();
	}
	
	
	public void animaisMaisJovens(int idade) {
		try {
			animais.stream().filter(animal -> animal.idade < idade)
			.forEach(animal -> System.out.println(animal));
		}catch (NullPointerException e) {
			System.out.println("Idade inválida.");
		}
	}
	
	public void animaisDoentes() {
		animais.stream().filter(animal -> animal.saudavel == false)
		.forEach(animal -> System.out.println(animal));
	}
	
	public List<Animal> getList() {
		return Collections.unmodifiableList(animais);
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
		System.out.println(" [10] Exercitar animais ");
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
			case 10:
				cuidador.exercitarAnimais();
				escolhaConsole();
				break;
			default:
				System.out.println(" Até a próxima ");
				break;
		}
	}
}
