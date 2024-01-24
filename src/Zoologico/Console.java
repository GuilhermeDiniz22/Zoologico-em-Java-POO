package Zoologico;

import java.util.Scanner;

public class Console {
	
	private Scanner scan;
	private Zoo zoo;
	private Cuidador cuidador;
	private Animal animal;

	public Console(Zoo zoo) {
		this.scan = new Scanner(System.in);
		this.zoo = zoo;
	}
	
	public void escolhaConsole() {
		System.out.println("======[1] Listar todos os animais======");
		System.out.println("======[2] Listar todos os funcionarios======");
		System.out.println("======[3] Alimentar animais======");
		System.out.println("======[4] Ouvir som dos animais======");
		System.out.println("======[4] Limpar jaulas======");
		int escolha = scan.nextInt();
		
		switch(escolha) {
			case 1:
				zoo.listarAnimais();
				escolhaConsole();
				break;
			case 2:
				zoo.listarFuncionarios();;
				escolhaConsole();
				break;
			case 3:
				zoo.alimentarAnimais();
				escolhaConsole();
				break;
			case 4:
				zoo.somAnimais();;
				escolhaConsole();
				break;
			case 5:
				cuidador.limparJaulas();
				escolhaConsole();
				break;
			default:
				System.out.println("======Até a próxima.======");
				break;
		}
	}
}

